package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name Type
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface Type  {
    @JsProperty(name="modifiers")
    JsArray</* ng.core.TypeModifier */ int> modifiers();
    @JsProperty(name="modifiers")
    void modifiers(JsArray</* ng.core.TypeModifier */ int> value);
    @JsConstructor
    public Type(JsArray</* ng.core.TypeModifier */ int> /* optional */ modifiers) {}
     Object visitType(TypeVisitor visitor,Object context);
     boolean hasModifier(/* ng.core.TypeModifier */ int modifier);
}
