package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\expression_parser\ast.d.ts
  * Package ng.core
  * Name Conditional
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Conditional extends AST {
    public AST condition;
    public AST trueExp;
    public AST falseExp;
    @JsConstructor
    public Conditional(ParseSpan span,AST condition,AST trueExp,AST falseExp) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
