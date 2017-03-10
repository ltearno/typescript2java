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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface _ParseAST  {
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
    public _ParseAST(String input,Object location,JsArray<Token> tokens,int inputLength,boolean parseAction,JsArray<ParserError> errors,int offset) {}
     Token peek(int offset);
    @JsProperty(name="next")
    Token getNext();
    @JsProperty(name="next")
    void setNext(Token value);
    @JsProperty(name="inputIndex")
    int getInputIndex();
    @JsProperty(name="inputIndex")
    void setInputIndex(int value);
     ParseSpan span(int start);
     void advance();
     boolean optionalCharacter(int code);
     boolean peekKeywordLet();
     void expectCharacter(int code);
     boolean optionalOperator(String op);
     void expectOperator(String operator);
     String expectIdentifierOrKeyword();
     String expectIdentifierOrKeywordOrString();
     AST parseChain();
     AST parsePipe();
     AST parseExpression();
     AST parseConditional();
     AST parseLogicalOr();
     AST parseLogicalAnd();
     AST parseEquality();
     AST parseRelational();
     AST parseAdditive();
     AST parseMultiplicative();
     AST parsePrefix();
     AST parseCallChain();
     AST parsePrimary();
     JsArray<AST> parseExpressionList(int terminator);
     LiteralMap parseLiteralMap();
     AST parseAccessMemberOrMethodCall(AST receiver,boolean /* optional */ isSafe);
     JsArray<BindingPipe> parseCallArguments();
     String expectTemplateBindingKey();
     TemplateBindingParseResult parseTemplateBindings();
     void error(String message,int /* optional */ index);
     void locationText(UNKNOWN_TYPE_NAME_QuestionToken index);
     void skip();
}
