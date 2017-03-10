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
  * Name Conditional
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Conditional" )
public class ConditionalImpl extends AST {
    @JsProperty(name="condition")
    AST getCondition();
    @JsProperty(name="condition")
    void setCondition(AST value);
    @JsProperty(name="trueExp")
    AST getTrueExp();
    @JsProperty(name="trueExp")
    void setTrueExp(AST value);
    @JsProperty(name="falseExp")
    AST getFalseExp();
    @JsProperty(name="falseExp")
    void setFalseExp(AST value);
    @JsConstructor
    public ConditionalImpl(ParseSpan span,AST condition,AST trueExp,AST falseExp) {}
    public native  Object visit(AstVisitor visitor,Object /* optional */ context);
}
