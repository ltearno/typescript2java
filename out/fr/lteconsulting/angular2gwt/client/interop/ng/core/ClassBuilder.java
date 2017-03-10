package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ClassField;
import jsinterop.annotations.JsProperty;
import ng.core.ClassMethod;
import ng.core.ClassGetter;
import ng.core.Statement;

/**
  * Generated from tests\@angular\compiler\src\output\class_builder.d.ts
  * Package ng.core
  * Name ClassBuilder
  * Collects data for a generated class.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ClassBuilder  {
    @JsProperty(name="fields")
    JsArray<ClassField> fields();
    @JsProperty(name="fields")
    void fields(JsArray<ClassField> value);
    @JsProperty(name="methods")
    JsArray<ClassMethod> methods();
    @JsProperty(name="methods")
    void methods(JsArray<ClassMethod> value);
    @JsProperty(name="getters")
    JsArray<ClassGetter> getters();
    @JsProperty(name="getters")
    void getters(JsArray<ClassGetter> value);
    @JsProperty(name="ctorStmts")
    JsArray<Statement> ctorStmts();
    @JsProperty(name="ctorStmts")
    void ctorStmts(JsArray<Statement> value);
}
