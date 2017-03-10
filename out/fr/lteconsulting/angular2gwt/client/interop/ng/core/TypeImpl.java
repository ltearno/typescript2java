package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.TypeVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name Type
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="Type" )
public abstract class TypeImpl  {
    @JsProperty(name="modifiers")
    JsArray</* ng.core.TypeModifier */ int> getModifiers();
    @JsProperty(name="modifiers")
    void setModifiers(JsArray</* ng.core.TypeModifier */ int> value);
    @JsConstructor
    public TypeImpl(JsArray</* ng.core.TypeModifier */ int> /* optional */ modifiers) {}
    public native  Object visitType(TypeVisitor visitor,Object context);
    public native  boolean hasModifier(/* ng.core.TypeModifier */ int modifier);
}
