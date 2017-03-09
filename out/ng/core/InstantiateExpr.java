package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name InstantiateExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class InstantiateExpr extends Expression {
    public Expression classExpr;
    public JsArray<Expression> args;
    @JsConstructor
    public InstantiateExpr(Expression classExpr,JsArray<Expression> args,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
