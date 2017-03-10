package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name LiteralArrayExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="LiteralArrayExpr" )
public class LiteralArrayExprImpl extends Expression {
    @JsProperty(name="entries")
    JsArray<Expression> getEntries();
    @JsProperty(name="entries")
    void setEntries(JsArray<Expression> value);
    @JsConstructor
    public LiteralArrayExprImpl(JsArray<Expression> entries,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
