package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Type;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;
import ng.core.ReadPropExpr;
import ng.core.Expression;
import ng.core.ReadKeyExpr;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.InvokeMethodExpr;
import ng.core.InvokeFunctionExpr;
import ng.core.InstantiateExpr;
import ng.core.ConditionalExpr;
import ng.core.BinaryOperatorExpr;
import ng.core.Statement;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name Expression
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Expression" )
public abstract class ExpressionImpl  {
    @JsProperty(name="type")
    Type getType();
    @JsProperty(name="type")
    void setType(Type value);
    @JsConstructor
    public ExpressionImpl(Type type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
    public native  ReadPropExpr prop(String name);
    public native  ReadKeyExpr key(Expression index,Type /* optional */ type);
    public native  InvokeMethodExpr callMethod(Object /* UnionType */ name,JsArray<Expression> params);
    public native  InvokeFunctionExpr callFn(JsArray<Expression> params);
    public native  InstantiateExpr instantiate(JsArray<Expression> params,Type /* optional */ type);
    public native  ConditionalExpr conditional(Expression trueCase,Expression /* optional */ falseCase);
    public native  BinaryOperatorExpr equals(Expression rhs);
    public native  BinaryOperatorExpr notEquals(Expression rhs);
    public native  BinaryOperatorExpr identical(Expression rhs);
    public native  BinaryOperatorExpr notIdentical(Expression rhs);
    public native  BinaryOperatorExpr minus(Expression rhs);
    public native  BinaryOperatorExpr plus(Expression rhs);
    public native  BinaryOperatorExpr divide(Expression rhs);
    public native  BinaryOperatorExpr multiply(Expression rhs);
    public native  BinaryOperatorExpr modulo(Expression rhs);
    public native  BinaryOperatorExpr and(Expression rhs);
    public native  BinaryOperatorExpr or(Expression rhs);
    public native  BinaryOperatorExpr lower(Expression rhs);
    public native  BinaryOperatorExpr lowerEquals(Expression rhs);
    public native  BinaryOperatorExpr bigger(Expression rhs);
    public native  BinaryOperatorExpr biggerEquals(Expression rhs);
    public native  Expression isBlank();
    public native  Expression cast(Type type);
    public native  Statement toStmt();
}
