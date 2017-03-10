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
  * Name MapType
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="MapType" )
public class MapTypeImpl extends Type {
    @JsProperty(name="valueType")
    Type getValueType();
    @JsProperty(name="valueType")
    void setValueType(Type value);
    @JsConstructor
    public MapTypeImpl(Type valueType,JsArray</* ng.core.TypeModifier */ int> /* optional */ modifiers) {}
    public native  Object visitType(TypeVisitor visitor,Object context);
}
