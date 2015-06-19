grammar Gramatica;

//declaracao programa

//teste: (println ';'| escopoclasse | expressao | metoddecl)+;

teste: (programDecl)+;

programDecl: statement #comandoNormal
            | metoddecl #metodoDecl
            ;
statement: println ';' 
        | escopoclasse 
        | expressao;
println: 'println(' argument=expressao ')';

//programa: classe+;

//estrutura da declaracao da classe
classe: declclasse classe?;

//declaracao da classe
declclasse: CLASS IDENT LBRACE escopoclasse* RBRACE;

//declaracoes dentro da classe (metodos e variaveis)
escopoclasse: vardecl SEMICOLON
            | vardeclatrib SEMICOLON
            | atrib SEMICOLON
            | inicializarArranjo SEMICOLON                        
            ;

/*Declaracoes*/ 
vardecl:tipo=tipoDeclarar ( LBRACKET RBRACKET )* nomeVariavel=IDENT #DeclaracaoVariaveis;
tipoDeclarar: INT | DOUBLE | STRING | BOOLEAN;

/*Declaracao seguida de atribuicao*/
vardeclatrib:tipo=tipoDeclarar variavel=IDENT operacao=ASSIGN valor=term #DeclararEAtribuir;//para o caso de int a = bola[2];

/*Atribuicao*/
atrib: variavel=IDENT (LBRACKET expressao RBRACKET)*  operacao=ASSIGN expr=expressao #Atribuicao;//ident[2*i] = x;

lvalue: identificador=IDENT (LBRACKET expressao RBRACKET)* #CarregarValor;//ident[2*i];

inicializarArranjo:tipo=tipoDeclarar (LBRACKET RBRACKET)+ ASSIGN NEW tipoInstanciado=tipoDeclarar (LBRACKET expressao RBRACKET)+;//double[][] notas = new double[2][5];

/*Declaracao Metodos*/
//metoddecl:type=(INT | DOUBLE | STRING | BOOLEAN | VOID) ( LBRACKET RBRACKET )* nomeMetodo=IDENT ' (' ')' '{''return ' expressao ';''}';
metoddecl:type='int' nomeMetodo=IDENT ' (' parametros=paramlist ')' '{' com=comandos 'return ' expressao ';''}';

paramlist: decl+=vardecl (',' decl+=vardecl)* | ;
metodcall: nomeMetodo=IDENT '('args=listaargumento')';

/*comando1 nao tem o return como producao! */
comandos: (comando1)* | ;
comando1: ifstatement
    | forstatement    
    | BREAK SEMICOLON
    | SEMICOLON
    | vardecl SEMICOLON
    | atrib SEMICOLON
    | vardeclatrib SEMICOLON
    | inicializarArranjo SEMICOLON
    | whilestatement;

escopometodo:LPAREN parametro? RPAREN '{'comando'}';

parametro:((INT | DOUBLE | STRING | BOOLEAN ) (LBRACKET RBRACKET)* IDENT//unico parametro
                      (COMMA (INT | DOUBLE | STRING | BOOLEAN) (LBRACKET RBRACKET)* IDENT)*);//varios parametros

//deve existir uma producao vazia para o caso em que não existe parametro.
listaargumento:exp+=expressao ( COMMA exp+=expressao )* | ;

comando:retorno SEMICOLON |
     ifstatement
    | forstatement
    | LBRACE listacomandos RBRACE
    | BREAK SEMICOLON
    | SEMICOLON
    | vardecl SEMICOLON
    | atrib SEMICOLON
    | vardeclatrib SEMICOLON
    | inicializarArranjo SEMICOLON
    | whilestatement
    ;


expressao: term #Numexpr
         | esquerda=term operacao=LT direita=term #Menor
         | esquerda=term operacao=GT direita=term #Maior
         | esquerda=term operacao=LE direita=term #MenorOuEquivalente
         | esquerda=term operacao=GE direita=term #MaiorOuEquivalente
         | esquerda=term operacao=EQ direita=term #Equivalente
         | esquerda=term operacao=NEQ direita=term #Diferente
         | metodcall #ChamarMetodo
         ;

term: esquerda=term operacao=SLASH direita=term #Divisao
    | esquerda=term operacao=STAR direita=term #Multiplicacao
    | esquerda=term operacao=REM direita=term #Modulo
    | esquerda=term operacao=MINUS direita=term #Subtracao
    | esquerda=term operacao=PLUS direita=term #Soma
    | factor #Fator
    ;

factor: numero=INT_CONSTANT #NumeroInteiro
      | numero=DOUBLE_CONSTANT #NumeroReal
      //| STRING_CONSTANT #String
      | NULL_CONSTANT #Null
      | lvalue #ChamarLvalue
      | LPAREN term RPAREN #Parentesis
      ;

retorno:RETURN expressao;

ifstatement:IF LPAREN expressao RPAREN comando (ELSE comando)?;

forstatement:FOR LPAREN INT atrib SEMICOLON expressao SEMICOLON atrib RPAREN comando;

whilestatement: WHILE LPAREN expressao RPAREN comando;

listacomandos:comando listacomandos?;

/* Constantes */
INT_CONSTANT: [0-9]+;
//<STRING_CONSTANT: "\""( ~["\"","\n","\r"])* "\"" >
NULL_CONSTANT: 'null';
DOUBLE_CONSTANT: [0-9]+ DOT [0-9]+;

/* Palavras reservadas */
CLASS: 'class';
VOID: 'void';
TRUE: 'true';
FALSE: 'false';
BREAK: 'break';
IF: 'if';
ELSE: 'else';
FOR: 'for';
RETURN: 'return';
NEW: 'new';//usado so para instanciar arranjos
STRING: 'string';
INT: 'int';
DOUBLE: 'double';
WHILE: 'while';
BOOLEAN: 'boolean';

/* Identificadores */
IDENT: [a-zA-Z][a-zA-Z0-9]*;

/* Simbolos especiais */
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
LBRACKET: '[';
RBRACKET: ']';
SEMICOLON: ';';
COMMA: ',';
DOT: '.';

/* Operadores */
ASSIGN: '=';
GT: '>';
LT: '<';
EQ: '==';
LE: '<=';
GE: '>=';
NEQ: '!=';
PLUS: '+';
MINUS: '-';
STAR: '*';
SLASH: '/';
REM: '%';

WHITESPACE: [ \t\n\r]+ -> skip;