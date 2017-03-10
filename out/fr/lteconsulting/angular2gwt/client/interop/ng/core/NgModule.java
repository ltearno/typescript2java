package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\metadata\ng_module.d.ts
  * Package ng.core
  * Name NgModule
  * Type of the NgModule metadata.,
  * ,NgModule decorator and metadata.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgModule  {
    /* optional property providers*/    @JsProperty(name="providers")
    JsArray</* NO SYMBOL */Provider> providers();
    @JsProperty(name="providers")
    void providers(JsArray</* NO SYMBOL */Provider> value);
    /* optional property declarations*/    @JsProperty(name="declarations")
    Array<Object /* UnionType */> declarations();
    @JsProperty(name="declarations")
    void declarations(Array<Object /* UnionType */> value);
    /* optional property imports*/    @JsProperty(name="imports")
    Array<Object /* UnionType */> imports();
    @JsProperty(name="imports")
    void imports(Array<Object /* UnionType */> value);
    /* optional property exports*/    @JsProperty(name="exports")
    Array<Object /* UnionType */> exports();
    @JsProperty(name="exports")
    void exports(Array<Object /* UnionType */> value);
    /* optional property entryComponents*/    @JsProperty(name="entryComponents")
    Array<Object /* UnionType */> entryComponents();
    @JsProperty(name="entryComponents")
    void entryComponents(Array<Object /* UnionType */> value);
    /* optional property bootstrap*/    @JsProperty(name="bootstrap")
    Array<Object /* UnionType */> bootstrap();
    @JsProperty(name="bootstrap")
    void bootstrap(Array<Object /* UnionType */> value);
    /* optional property schemas*/    @JsProperty(name="schemas")
    Array<Object /* UnionType */> schemas();
    @JsProperty(name="schemas")
    void schemas(Array<Object /* UnionType */> value);
    /* optional property id*/    @JsProperty(name="id")
    String id();
    @JsProperty(name="id")
    void id(String value);
}
