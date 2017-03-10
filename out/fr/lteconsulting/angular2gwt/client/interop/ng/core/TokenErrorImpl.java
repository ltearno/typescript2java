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
@JsType( isNative=true, namespace="ng.core", name="TokenError" )
public class TokenErrorImpl extends ParseError {
    @JsProperty(name="tokenType")
    /* ng.core.TokenType */ int getTokenType();
    @JsProperty(name="tokenType")
    void setTokenType(/* ng.core.TokenType */ int value);
    @JsConstructor
    public TokenErrorImpl(String errorMsg,/* ng.core.TokenType */ int tokenType,ParseSourceSpan span) {}
}
