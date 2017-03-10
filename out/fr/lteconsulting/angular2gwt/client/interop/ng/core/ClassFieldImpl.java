package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ClassField
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ClassField" )
public class ClassFieldImpl extends AbstractClassPart {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsConstructor
    public ClassFieldImpl(String name,Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
}
