grammar Gramatica;

//declaracao programa

//teste: (println ';'| escopoclasse | expressao | metoddecl)+;

teste: programDecl+;

programDecl: statement #comandoNormal
            | metoddecl #metodoDecl
            ;

statement: println ';' 
        | escopoclasse 
        | expressao
        | ifstatement;
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
            ;

/*Declaracoes*/ 
vardecl:tipo=tipoDeclarar nomeVariavel=IDENT #DeclaracaoVariaveis;
tipoDeclarar: INT | DOUBLE | STRING | BOOLEAN;

/*Declaracao seguida de atribuicao*/
vardeclatrib:tipo=tipoDeclarar variavel=IDENT operacao=ASSIGN valor=term #DeclararEAtribuir;//para o caso de int a = bola[2];

/*Atribuicao*/
atrib: variavel=IDENT operacao=ASSIGN expr=expressao #Atribuicao;//ident[2*i] = x;

lvalue: identificador=IDENT #CarregarValor;//ident[2*i];

/*Declaracao Metodos*/
//metoddecl:type=(INT | DOUBLE | STRING | BOOLEAN | VOID) nomeMetodo=IDENT ' (' ')' '{''return ' expressao ';''}';
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
    | whilestatement;

escopometodo:LPAREN parametro? RPAREN '{'comando'}';

parametro:((INT | DOUBLE | STRING | BOOLEAN ) IDENT//unico parametro
                      (COMMA (INT | DOUBLE | STRING | BOOLEAN) IDENT)*);//varios parametros

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
      | lvalue #ChamarLvalue
      | LPAREN expressao RPAREN #Parentesis
      ;

retorno:RETURN expressao;

ifstatement: IF LPAREN expressao RPAREN LBRACE statement RBRACE #IfIncompleto
            | IF LPAREN expressao RPAREN LBRACE comand1=statement RBRACE ELSE LBRACE comand2=statement RBRACE #IfCompleto
            ;

forstatement:FOR LPAREN INT atrib SEMICOLON expressao SEMICOLON atrib RPAREN comando;

whilestatement: WHILE LPAREN expressao RPAREN comando;

listacomandos:comando listacomandos?;

/* Constantes */
INT_CONSTANT: [0-9]+;
//<STRING_CONSTANT: "\""( ~["\"","\n","\r"])* "\"" >
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
STRING: 'string';
INT: 'int';
DOUBLE: 'DOUBLE';
WHILE: 'while';
BOOLEAN: 'boolean';

/* Identificadores */
IDENT: [a-zA-Z][a-zA-Z0-9]*;

/* Simbolos especiais */
LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
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