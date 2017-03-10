package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ml_parser\lexer.d.ts
  * Package ng.core
  * Name Token
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Token  {
    @JsProperty(name="type")
    /* ng.core.TokenType */ int getType();
    @JsProperty(name="type")
    void setType(/* ng.core.TokenType */ int value);
    @JsProperty(name="parts")
    JsArray<String> getParts();
    @JsProperty(name="parts")
    void setParts(JsArray<String> value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public Token(/* ng.core.TokenType */ int type,JsArray<String> parts,ParseSourceSpan sourceSpan) {}
}
