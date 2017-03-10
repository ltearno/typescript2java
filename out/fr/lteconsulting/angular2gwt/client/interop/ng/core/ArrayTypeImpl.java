package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Type;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.core.TypeVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ArrayType
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ArrayType" )
public class ArrayTypeImpl extends Type {
    @JsProperty(name="of")
    Type getOf();
    @JsProperty(name="of")
    void setOf(Type value);
    @JsConstructor
    public ArrayTypeImpl(Type of,JsArray</* ng.core.TypeModifier */ int> /* optional */ modifiers) {}
    public native  Object visitType(TypeVisitor visitor,Object context);
}
