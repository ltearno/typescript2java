package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\styles_collection.d.ts
  * Package ng.core
  * Name StylesCollectionEntry
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StylesCollectionEntry  {
    @JsProperty(name="time")
    int getTime();
    @JsProperty(name="time")
    void setTime(int value);
    @JsProperty(name="value")
    Object /* UnionType */ getValue();
    @JsProperty(name="value")
    void setValue(Object /* UnionType */ value);
    @JsConstructor
    public StylesCollectionEntry(int time,Object /* UnionType */ value) {}
     boolean matches(int time,Object /* UnionType */ value);
}
