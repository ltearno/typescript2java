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
  * Name PrefixNot
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PrefixNot extends AST {
    @JsProperty(name="expression")
    AST getExpression();
    @JsProperty(name="expression")
    void setExpression(AST value);
    @JsConstructor
    public PrefixNot(ParseSpan span,AST expression) {}
     Object visit(AstVisitor visitor,Object /* optional */ context);
}
