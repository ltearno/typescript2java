package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name WriteVarExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class WriteVarExpr extends Expression {
    public String name;
    public Expression value;
    @JsConstructor
    public WriteVarExpr(String name,Expression value,Type /* optional */ type) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
    public native  DeclareVarStmt toDeclStmt(Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers);
}
