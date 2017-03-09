package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\lexer.d.ts
  * Package ng.core
  * Name TokenizeResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TokenizeResult  {
    public JsArray<Token> tokens;
    public JsArray<TokenError> errors;
    @JsConstructor
    public TokenizeResult(JsArray<Token> tokens,JsArray<TokenError> errors) {}
}
