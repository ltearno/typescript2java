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
@JsType( isNative=true, namespace="ng.core", name="PropertyWrite" )
public class PropertyWriteImpl extends AST {
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
    public PropertyWriteImpl(ParseSpan span,AST receiver,String name,AST value) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
