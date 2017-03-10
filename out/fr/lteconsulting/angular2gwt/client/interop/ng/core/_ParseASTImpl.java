package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Token;
import ng.core.ParserError;
import jsinterop.annotations.JsConstructor;
import ng.core.ParseSpan;
import ng.core.AST;
import ng.core.LiteralMap;
import ng.core.BindingPipe;
import ng.core.TemplateBindingParseResult;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\parser.d.ts
  * Package ng.core
  * Name _ParseAST
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="_ParseAST" )
public class _ParseASTImpl  {
    @JsProperty(name="input")
    String getInput();
    @JsProperty(name="input")
    void setInput(String value);
    @JsProperty(name="location")
    Object getLocation();
    @JsProperty(name="location")
    void setLocation(Object value);
    @JsProperty(name="tokens")
    JsArray<Token> getTokens();
    @JsProperty(name="tokens")
    void setTokens(JsArray<Token> value);
    @JsProperty(name="inputLength")
    int getInputLength();
    @JsProperty(name="inputLength")
    void setInputLength(int value);
    @JsProperty(name="parseAction")
    boolean getParseAction();
    @JsProperty(name="parseAction")
    void setParseAction(boolean value);
    @JsProperty(name="errors")
    Object getErrors();
    @JsProperty(name="errors")
    void setErrors(Object value);
    @JsProperty(name="offset")
    Object getOffset();
    @JsProperty(name="offset")
    void setOffset(Object value);
    @JsProperty(name="rparensExpected")
    Object getRparensExpected();
    @JsProperty(name="rparensExpected")
    void setRparensExpected(Object value);
    @JsProperty(name="rbracketsExpected")
    Object getRbracketsExpected();
    @JsProperty(name="rbracketsExpected")
    void setRbracketsExpected(Object value);
    @JsProperty(name="rbracesExpected")
    Object getRbracesExpected();
    @JsProperty(name="rbracesExpected")
    void setRbracesExpected(Object value);
    @JsProperty(name="index")
    int getIndex();
    @JsProperty(name="index")
    void setIndex(int value);
    @JsConstructor
    public _ParseASTImpl(String input,Object location,JsArray<Token> tokens,int inputLength,boolean parseAction,JsArray<ParserError> errors,int offset) {}
    public native  Token peek(int offset);
    @JsProperty(name="next")
    Token getNext();
    @JsProperty(name="next")
    void setNext(Token value);
    @JsProperty(name="inputIndex")
    int getInputIndex();
    @JsProperty(name="inputIndex")
    void setInputIndex(int value);
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
