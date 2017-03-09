package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\lexer.d.ts
  * Package ng.core
  * Name Token
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Token  {
    public /* ng.core.TokenType */ int type;
    public JsArray<String> parts;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public Token(/* ng.core.TokenType */ int type,JsArray<String> parts,ParseSourceSpan sourceSpan) {}
}
