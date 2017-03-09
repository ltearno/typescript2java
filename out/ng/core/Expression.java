package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name Expression
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface Expression  {
    @JsProperty(name="type")
    Type type();
    @JsProperty(name="type")
    void type(Type value);
    @JsConstructor
    public Expression(Type type) {}
     Object visitExpression(ExpressionVisitor visitor,Object context);
     ReadPropExpr prop(String name);
     ReadKeyExpr key(Expression index,Type /* optional */ type);
     InvokeMethodExpr callMethod(Object /* UnionType */ name,JsArray<Expression> params);
     InvokeFunctionExpr callFn(JsArray<Expression> params);
     InstantiateExpr instantiate(JsArray<Expression> params,Type /* optional */ type);
     ConditionalExpr conditional(Expression trueCase,Expression /* optional */ falseCase);
     BinaryOperatorExpr equals(Expression rhs);
     BinaryOperatorExpr notEquals(Expression rhs);
     BinaryOperatorExpr identical(Expression rhs);
     BinaryOperatorExpr notIdentical(Expression rhs);
     BinaryOperatorExpr minus(Expression rhs);
     BinaryOperatorExpr plus(Expression rhs);
     BinaryOperatorExpr divide(Expression rhs);
     BinaryOperatorExpr multiply(Expression rhs);
     BinaryOperatorExpr modulo(Expression rhs);
     BinaryOperatorExpr and(Expression rhs);
     BinaryOperatorExpr or(Expression rhs);
     BinaryOperatorExpr lower(Expression rhs);
     BinaryOperatorExpr lowerEquals(Expression rhs);
     BinaryOperatorExpr bigger(Expression rhs);
     BinaryOperatorExpr biggerEquals(Expression rhs);
     Expression isBlank();
     Expression cast(Type type);
     Statement toStmt();
}
