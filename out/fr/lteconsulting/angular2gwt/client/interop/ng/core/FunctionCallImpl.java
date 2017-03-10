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
@JsType( isNative=true, namespace="ng.core", name="FunctionCall" )
public class FunctionCallImpl extends AST {
    @JsProperty(name="target")
    AST getTarget();
    @JsProperty(name="target")
    void setTarget(AST value);
    @JsProperty(name="args")
    JsArray<Object> getArgs();
    @JsProperty(name="args")
    void setArgs(JsArray<Object> value);
    @JsConstructor
    public FunctionCallImpl(ParseSpan span,AST target,JsArray<Object> args) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
