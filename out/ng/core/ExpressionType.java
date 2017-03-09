package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ExpressionType
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ExpressionType extends Type {
    public Expression value;
    public JsArray<Type> typeParams;
    @JsConstructor
    public ExpressionType(Expression value,JsArray<Type> /* optional */ typeParams,JsArray</* ng.core.TypeModifier */ int> /* optional */ modifiers) {}
    public native  Object visitType(TypeVisitor visitor,Object context);
}
