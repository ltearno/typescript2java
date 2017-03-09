package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\parser.d.ts
  * Package ng.core
  * Name _ParseAST
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class _ParseAST  {
    public String input;
    public Object location;
    public JsArray<Token> tokens;
    public int inputLength;
    public boolean parseAction;
    public Object errors;
    public Object offset;
    public Object rparensExpected;
    public Object rbracketsExpected;
    public Object rbracesExpected;
    public int index;
    @JsConstructor
    public _ParseAST(String input,Object location,JsArray<Token> tokens,int inputLength,boolean parseAction,JsArray<ParserError> errors,int offset) {}
    public native  Token peek(int offset);
    public Token next;
    public int inputIndex;
    public native  ParseSpan span(int start);
    public native  void advance();
    public native  boolean optionalCharacter(int code);
    public native  boolean peekKeywordLet();
    public native  void expectCharacter(int code);
    public native  boolean optionalOperator(String op);
    public native  void expectOperator(String operator);
    public native  String expectIdentifierOrKeyword();
    public native  String expectIdentifierOrKeywordOrString();
    public native  AST parseChain();
    public native  AST parsePipe();
    public native  AST parseExpression();
    public native  AST parseConditional();
    public native  AST parseLogicalOr();
    public native  AST parseLogicalAnd();
    public native  AST parseEquality();
    public native  AST parseRelational();
    public native  AST parseAdditive();
    public native  AST parseMultiplicative();
    public native  AST parsePrefix();
    public native  AST parseCallChain();
    public native  AST parsePrimary();
    public native  JsArray<AST> parseExpressionList(int terminator);
    public native  LiteralMap parseLiteralMap();
    public native  AST parseAccessMemberOrMethodCall(AST receiver,boolean /* optional */ isSafe);
    public native  JsArray<BindingPipe> parseCallArguments();
    public native  String expectTemplateBindingKey();
    public native  TemplateBindingParseResult parseTemplateBindings();
    public native  void error(String message,int /* optional */ index);
    public native  void locationText(UNKNOWN_TYPE_NAME_QuestionToken index);
    public native  void skip();
}
