package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name BuiltinType
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class BuiltinType extends Type {
    public /* ng.core.BuiltinTypeName */ int name;
    @JsConstructor
    public BuiltinType(/* ng.core.BuiltinTypeName */ int name,JsArray</* ng.core.TypeModifier */ int> /* optional */ modifiers) {}
    public native  Object visitType(TypeVisitor visitor,Object context);
}
