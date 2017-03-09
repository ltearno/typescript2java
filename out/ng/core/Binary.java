package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name Binary
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Binary extends AST {
    public String operation;
    public AST left;
    public AST right;
    @JsConstructor
    public Binary(ParseSpan span,String operation,AST left,AST right) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
