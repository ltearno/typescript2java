package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AST;
import ng.core.ParseSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.AstVisitor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name Binary
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Binary extends AST {
    @JsProperty(name="operation")
    String getOperation();
    @JsProperty(name="operation")
    void setOperation(String value);
    @JsProperty(name="left")
    AST getLeft();
    @JsProperty(name="left")
    void setLeft(AST value);
    @JsProperty(name="right")
    AST getRight();
    @JsProperty(name="right")
    void setRight(AST value);
    @JsConstructor
    public Binary(ParseSpan span,String operation,AST left,AST right) {}
     Object visit(AstVisitor visitor,Object /* optional */ context);
}
