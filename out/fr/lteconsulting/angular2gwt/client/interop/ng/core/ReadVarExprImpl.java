package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;
import ng.core.Expression;
import ng.core.WriteVarExpr;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ReadVarExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ReadVarExpr" )
public class ReadVarExprImpl extends Expression {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="builtin")
    /* ng.core.BuiltinVar */ int getBuiltin();
    @JsProperty(name="builtin")
    void setBuiltin(/* ng.core.BuiltinVar */ int value);
    @JsConstructor
    public ReadVarExprImpl(Object /* UnionType */ name,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
    public native  WriteVarExpr set(Expression value);
}
