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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface WriteVarExpr extends Expression {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="value")
    Expression getValue();
    @JsProperty(name="value")
    void setValue(Expression value);
    @JsConstructor
    public WriteVarExpr(String name,Expression value,Type /* optional */ type) {}
     Object visitExpression(ExpressionVisitor visitor,Object context);
     DeclareVarStmt toDeclStmt(Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers);
}
