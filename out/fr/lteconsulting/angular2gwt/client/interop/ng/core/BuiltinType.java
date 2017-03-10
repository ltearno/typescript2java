package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.core.TypeVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name BuiltinType
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BuiltinType extends Type {
    @JsProperty(name="name")
    /* ng.core.BuiltinTypeName */ int getName();
    @JsProperty(name="name")
    void setName(/* ng.core.BuiltinTypeName */ int value);
    @JsConstructor
    public BuiltinType(/* ng.core.BuiltinTypeName */ int name,JsArray</* ng.core.TypeModifier */ int> /* optional */ modifiers) {}
     Object visitType(TypeVisitor visitor,Object context);
}
