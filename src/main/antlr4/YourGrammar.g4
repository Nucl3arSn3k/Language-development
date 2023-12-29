grammar YourGrammar;

/*
 * Lexer Rules
 */
// Define tokens for keywords (start with uppercase letters)
WINDMILL    : 'WINDMILL';
DISPLAY     : 'DISPLAY';
BREEZE      : 'BREEZE';
ZEPHYR      : 'ZEPHYR';
MATCHES     : 'MATCHES';
TWIRL       : 'TWIRL';
SWIRL       : 'SWIRL';

// Define tokens for other patterns
IDENTIFIER  : [a-zA-Z_] [a-zA-Z0-9_]*;
INTEGER     : [0-9]+;
WHITESPACE  : [ \t\r\n]+ -> skip; // Skip whitespace

// Define character tokens
EQ          : '=';
LPAREN      : '(';
RPAREN      : ')';
LBRACE      : '{';
RBRACE      : '}';

/*
 * Parser Rules
 */
program             : windmill_statement*;

windmill_statement  : WINDMILL identifier LBRACE block_statements RBRACE;

block_statements    : statement*;

statement           : assignment_statement
                    | equivalence_statement
                    | print_statement
                    | function_call;

assignment_statement : identifier EQ gust_expression;

equivalence_statement: gust_expression MATCHES gust_expression;

print_statement      : DISPLAY gust_expression;

function_call        : identifier LPAREN gust_expression* RPAREN;

gust_expression      : whirl_term (BREEZE whirl_term | ZEPHYR whirl_term | equivalence_statement)*;

whirl_term          : whirl_factor (TWIRL whirl_factor | SWIRL whirl_factor)*;

whirl_factor         : INTEGER | identifier | LPAREN gust_expression RPAREN;

identifier           : IDENTIFIER;
