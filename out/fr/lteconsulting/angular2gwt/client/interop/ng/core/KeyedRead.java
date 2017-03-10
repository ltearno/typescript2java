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
  * Name KeyedRead
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface KeyedRead extends AST {
    @JsProperty(name="obj")
    AST getObj();
    @JsProperty(name="obj")
    void setObj(AST value);
    @JsProperty(name="key")
    AST getKey();
    @JsProperty(name="key")
    void setKey(AST value);
    @JsConstructor
    public KeyedRead(ParseSpan span,AST obj,AST key) {}
     Object visit(AstVisitor visitor,Object /* optional */ context);
}
