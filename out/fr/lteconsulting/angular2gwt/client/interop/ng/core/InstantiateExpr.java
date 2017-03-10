package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name InstantiateExpr
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface InstantiateExpr extends Expression {
    @JsProperty(name="classExpr")
    Expression getClassExpr();
    @JsProperty(name="classExpr")
    void setClassExpr(Expression value);
    @JsProperty(name="args")
    JsArray<Expression> getArgs();
    @JsProperty(name="args")
    void setArgs(JsArray<Expression> value);
    @JsConstructor
    public InstantiateExpr(Expression classExpr,JsArray<Expression> args,Type /* optional */ type) {}
     Object visitExpression(ExpressionVisitor visitor,Object context);
}
