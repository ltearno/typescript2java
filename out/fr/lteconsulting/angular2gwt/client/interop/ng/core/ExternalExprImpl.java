package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileIdentifierMetadata;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.ExpressionVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ExternalExpr
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ExternalExpr" )
public class ExternalExprImpl extends Expression {
    @JsProperty(name="value")
    CompileIdentifierMetadata getValue();
    @JsProperty(name="value")
    void setValue(CompileIdentifierMetadata value);
    @JsProperty(name="typeParams")
    JsArray<Type> getTypeParams();
    @JsProperty(name="typeParams")
    void setTypeParams(JsArray<Type> value);
    @JsConstructor
    public ExternalExprImpl(CompileIdentifierMetadata value,Type /* optional */ type,JsArray<Type> /* optional */ typeParams) {}
    public native  Object visitExpression(ExpressionVisitor visitor,Object context);
}
