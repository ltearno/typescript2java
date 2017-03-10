package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Token;
import jsinterop.annotations.JsProperty;
import ng.core.TokenError;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\lexer.d.ts
  * Package ng.core
  * Name TokenizeResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="TokenizeResult" )
public class TokenizeResultImpl  {
    @JsProperty(name="tokens")
    JsArray<Token> getTokens();
    @JsProperty(name="tokens")
    void setTokens(JsArray<Token> value);
    @JsProperty(name="errors")
    JsArray<TokenError> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsArray<TokenError> value);
    @JsConstructor
    public TokenizeResultImpl(JsArray<Token> tokens,JsArray<TokenError> errors) {}
}
