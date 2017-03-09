package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name LiteralArrayExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class LiteralArrayExpr extends Expression {
    public JsArray<Expression> entries;
    @JsConstructor
    public LiteralArrayExpr(JsArray<Expression> entries,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
