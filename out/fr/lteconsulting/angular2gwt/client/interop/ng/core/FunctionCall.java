package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.AST;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ParseSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.AstVisitor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name FunctionCall
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FunctionCall extends AST {
    @JsProperty(name="target")
    AST getTarget();
    @JsProperty(name="target")
    void setTarget(AST value);
    @JsProperty(name="args")
    JsArray<Object> getArgs();
    @JsProperty(name="args")
    void setArgs(JsArray<Object> value);
    @JsConstructor
    public FunctionCall(ParseSpan span,AST target,JsArray<Object> args) {}
     Object visit(AstVisitor visitor,Object /* optional */ context);
}
