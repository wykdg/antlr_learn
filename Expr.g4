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
    |returnStatment
    |classDef
 ;



array:
'['(expr (',' expr)*)? ']'#arrayInit
|'new' '[' expr ']'      #newArray
|'new' ID                 #newClass
;



 printExpr:
 'print' expr ';';

 assign:
 ID '=' expr #assignExpr
 | ID '=' array #assignArray
 | ID '['expr ']' '=' expr #assignArrayIndex
 ;

ifStatement:
 'if' '(' expr ')' stat ('else' stat)? ;

forStatment:
'for' '(' assign ';' expr ';' assign ')' stat ;

whileStatment:
'while' '(' expr ')' stat ;

blockStatement: '{' stat* '}';

scopeStatment:blockStatement;

functionDefExpr:
'def' ID '('functionDefParams')' scopeStatment;

//functionBody:
//'{' stat*   '}'
//;

returnStatment:
'return' expr ';';

functionDefParams:
 (ID (','ID)*)? ;

functionCallExpr:
ID '(' functionCallParams ')'
;
functionCallParams:
 (expr (','expr)*)? ;


classDef:
'class' ID '{' classInnerDef*'}'
;
classInnerDef:
functionDefExpr
|assign ';'
;


classCal:
ID '.'expr #classvar
|ID'.'assign #classassign
|ID '.' functionCallExpr #classfuncall
;











expr :    functionCallExpr #f
| '-' expr #negative
|ID '[' expr ']'               #ArrayNum
| '(' expr ')'                  # parens
|expr op=('*'|'/') expr    # MulDiv
| expr op=('+'|'-') expr        # AddSub
| expr op=('<'|'>'|'==') expr      #Cmp
| INT                           # int
| ID                            # id

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