package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name BindingPipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class BindingPipe extends AST {
    public AST exp;
    public String name;
    public JsArray<Object> args;
    @JsConstructor
    public BindingPipe(ParseSpan span,AST exp,String name,JsArray<Object> args) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
