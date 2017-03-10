package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Expression;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.DeclareVarStmt;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name WriteVarExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="WriteVarExpr" )
public class WriteVarExprImpl extends Expression {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="value")
    Expression getValue();
    @JsProperty(name="value")
    void setValue(Expression value);
    @JsConstructor
    public WriteVarExprImpl(String name,Expression value,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
    public native  DeclareVarStmt toDeclStmt(Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers);
}
