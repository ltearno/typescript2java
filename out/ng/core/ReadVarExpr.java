package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ReadVarExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ReadVarExpr extends Expression {
    public String name;
    public /* ng.core.BuiltinVar */ int builtin;
    @JsConstructor
    public ReadVarExpr(Object /* UnionType */ name,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
    public native  WriteVarExpr set(Expression value);
}
