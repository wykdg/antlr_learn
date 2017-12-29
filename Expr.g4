grammar Expr;

prog : stat+;

stat: expr ';'
    | assign ';'
    |ifStatement
    |forStatment
    |whileStatment
    |blockStatement
    |printExpr
    |functionDefExpr
    |functionCallExpr ';'
 ;

 printExpr:
 'print' expr ';';

 assign:
 ID '=' expr ;

ifStatement:
 'if' '(' expr ')' stat ('else' stat)? ;

forStatment:
'for' '(' assign ';' expr ';' assign ')' stat ;

whileStatment:
'while' '(' expr ')' stat ;

blockStatement: '{' stat* '}';

scopeStatment:blockStatement;

functionDefExpr:
'def' ID '(' ((ID  ',')*  ID)? ')' scopeStatment;

functionCallExpr:
ID '(' expr (',' expr)* ')'
;

expr :expr op=('*'|'/') expr    # MulDiv
| expr op=('+'|'-') expr        # AddSub
| expr op=('<'|'>'|'==') expr      #Cmp
| INT                           # int
| ID                            # id
| '(' expr ')'                  # parens
;

SMALLER: '<';
BIGGER:'>';
EQUAL:'==';
MUL : '*' ; // assigns token name to '*' used above in grammar
DIV : '/' ;
ADD : '+' ;
SUB : '-' ;
ID : [a-zA-Z]+ ;
INT : [0-9]+ ;
NEWLINE:'\r'? '\n' ;
WS : [ \t]+ -> skip;