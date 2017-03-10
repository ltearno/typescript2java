package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.AST;
import jsinterop.annotations.JsProperty;
import ng.core.ParseSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.AstVisitor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name PropertyRead
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PropertyRead extends AST {
    @JsProperty(name="receiver")
    AST getReceiver();
    @JsProperty(name="receiver")
    void setReceiver(AST value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsConstructor
    public PropertyRead(ParseSpan span,AST receiver,String name) {}
     Object visit(AstVisitor visitor,Object /* optional */ context);
}
