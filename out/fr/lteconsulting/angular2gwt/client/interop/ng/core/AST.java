package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ParseSpan;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.AstVisitor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name AST
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AST  {
    @JsProperty(name="span")
    ParseSpan getSpan();
    @JsProperty(name="span")
    void setSpan(ParseSpan value);
    @JsConstructor
    public AST(ParseSpan span) {}
     Object visit(AstVisitor visitor,Object /* optional */ context);
     String toString();
}
