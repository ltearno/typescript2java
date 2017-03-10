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
  * Name PropertyWrite
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PropertyWrite extends AST {
    @JsProperty(name="receiver")
    AST getReceiver();
    @JsProperty(name="receiver")
    void setReceiver(AST value);
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="value")
    AST getValue();
    @JsProperty(name="value")
    void setValue(AST value);
    @JsConstructor
    public PropertyWrite(ParseSpan span,AST receiver,String name,AST value) {}
     Object visit(AstVisitor visitor,Object /* optional */ context);
}
