grammar XPath;

doc
    :   'doc' '(' filename ')'
    |   'document' '(' filename ')'
    ;

ap
    :  doc '/' rp       # ap_descendant
    |  doc '//' rp      # ap_all
    ;

rp
    :  NAME             #rp_tagName
    |  '*'              #rp_star
    |  '.'              #rp_dot
    |  '..'             #rp_dotdot
    |  TEXT             #rp_text
    |  '@' NAME         #rp_attName
    |  '(' rp ')'       #rp_paren
    |  rp '/' rp        #rp_descendant
    |  rp '//' rp       #rp_all
    |  rp '[' filter ']'#rp_filter
    |  rp ',' rp        #rp_combine
    ;

filter
    :   rp                  #filter_rp
    |   rp '=' rp           #filter_equal
    |   rp 'eq' rp          #filter_equal
    |   rp '==' rp          #filter_is
    |   rp 'is' rp          #filter_is
    |   '(' filter ')'      #filter_paren
    |   filter 'and' filter #filter_and
    |   filter 'or' filter  #filter_or
    |   'not' filter        #filter_not
    ;

xq
    :   var                 #xq_var
    |   stringConstant      #xq_strConstant
    |   ap                  #xq_ap
    |   '(' xq ')'          #xq_paren
    |   xq ',' xq           #xq_combine
    |   xq '/' rp           #xq_descendant
    |   xq '//' rp          #xq_all
    |   '<' NAME '>' '{' xq '}' '<''/' NAME '>'  #xq_tag
    |   '<' NAME '>'  xq  '<''/' NAME '>'  #xq_tag
    |   forClause letClause? whereClause? returnClause  #xq_FLWR
    |   letClause xq        #xq_let
    |   joinClause          #xq_join
    ;

cond
    :   xq '=' xq           #cond_equal
    |   xq 'eq' xq          #cond_equal
    |   xq '==' xq          #cond_is
    |   xq 'is' xq          #cond_is
    |   'empty' '(' xq ')'  #cond_empty
    |   'some' var 'in' xq (',' var 'in' xq)* 'satisfies' cond  #cond_satisfy
    |   '(' cond ')'        #cond_paren
    |   cond 'and' cond     #cond_and
    |   cond 'or' cond      #cond_or
    |   'not' cond          #cond_not
    ;

filename
    :   STRING
    ;

var
    : '$' NAME
    ;

stringConstant
    :   STRING
    ;


forClause
    : 'for' (var 'in' xq ',' )* var 'in' xq
    ;

letClause
    :'let' (var ':=' xq ',' )* var ':=' xq
    ;

whereClause
    : 'where' cond
    ;

returnClause
    : 'return' xq
    ;

joinClause
    :  'join' '(' xq ',' xq ',' attribute ',' attribute')'
    ;

attribute
    : '[' NAME ? (',' NAME )* ']'
    ;

/*
 * ===========================
 * String/Integers Primitives
 * ===========================
 */

NAME
    : [a-zA-Z0-9_-]+
    ;


WHITESPACE
    : [ \t\n\r] + -> skip
    ;

TEXT
    : 'text()'
    ;

STRING
    :   '"' +[a-zA-Z0-9,.!?; _'"-]+ '"'
    ;

PATH
    :  '"' [A-Za-z0-9./_]* '"'
    ;