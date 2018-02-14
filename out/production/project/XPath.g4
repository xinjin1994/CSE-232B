grammar XPath;


doc
    :
       DOC '(' filename ')'
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
    |   '(' filter ')'      #filter_parent
    |   filter 'and' filter #filter_and
    |   filter 'or' filter  #filter_or
    |   'not' filter        #filter_not
    ;

filename
    :   PATH
    ;

/*
 * ===========================
 * String/Integers Primitives
 * ===========================
 */

DOC
    : 'doc'
    ;

NAME
    : [a-zA-Z0-9_-]+
    ;

INTEGER
    : '0'
	| [1-9] [0-9]*
    ;

PATH
    :  '"' [A-Za-z0-9./_]+ '"'
    ;

WHITESPACE
    : [ \t\n\r]+ -> skip
    ;

TEXT
    : 'text()'
    ;