package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\lexer.d.ts
  * Package ng.core
  * Name TokenError
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TokenError extends ParseError {
    @JsProperty(name="tokenType")
    /* ng.core.TokenType */ int getTokenType();
    @JsProperty(name="tokenType")
    void setTokenType(/* ng.core.TokenType */ int value);
    @JsConstructor
    public TokenError(String errorMsg,/* ng.core.TokenType */ int tokenType,ParseSourceSpan span) {}
}
