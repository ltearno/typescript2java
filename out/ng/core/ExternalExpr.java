package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ExternalExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ExternalExpr extends Expression {
    public CompileIdentifierMetadata value;
    public JsArray<Type> typeParams;
    @JsConstructor
    public ExternalExpr(CompileIdentifierMetadata value,Type /* optional */ type,JsArray<Type> /* optional */ typeParams) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
