package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name PrefixNot
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class PrefixNot extends AST {
    public AST expression;
    @JsConstructor
    public PrefixNot(ParseSpan span,AST expression) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
