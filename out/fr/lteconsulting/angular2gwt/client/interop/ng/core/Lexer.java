package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Token;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\lexer.d.ts
  * Package ng.core
  * Name Lexer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Lexer  {
     JsArray<Token> tokenize(String text);
}
