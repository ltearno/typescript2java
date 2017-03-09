package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\animation\styles_collection.d.ts
  * Package ng.core
  * Name StylesCollectionEntry
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class StylesCollectionEntry  {
    public int time;
    public Object /* UnionType */ value;
    @JsConstructor
    public StylesCollectionEntry(int time,Object /* UnionType */ value) {}
    public native  boolean matches(int time,Object /* UnionType */ value);
}
