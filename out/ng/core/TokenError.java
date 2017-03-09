package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\lexer.d.ts
  * Package ng.core
  * Name TokenError
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TokenError extends ParseError {
    public /* ng.core.TokenType */ int tokenType;
    @JsConstructor
    public TokenError(String errorMsg,/* ng.core.TokenType */ int tokenType,ParseSourceSpan span) {}
}
