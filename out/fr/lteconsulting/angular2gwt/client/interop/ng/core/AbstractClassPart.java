package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Type;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name AbstractClassPart
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AbstractClassPart  {
    @JsProperty(name="type")
    Type getType();
    @JsProperty(name="type")
    void setType(Type value);
    @JsProperty(name="modifiers")
    JsArray</* ng.core.StmtModifier */ int> getModifiers();
    @JsProperty(name="modifiers")
    void setModifiers(JsArray</* ng.core.StmtModifier */ int> value);
    @JsConstructor
    public AbstractClassPart(Type type,JsArray</* ng.core.StmtModifier */ int> modifiers) {}
     boolean hasModifier(/* ng.core.StmtModifier */ int modifier);
}
