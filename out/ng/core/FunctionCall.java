package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name FunctionCall
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class FunctionCall extends AST {
    public AST target;
    public JsArray<Object> args;
    @JsConstructor
    public FunctionCall(ParseSpan span,AST target,JsArray<Object> args) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
