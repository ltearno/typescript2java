package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.StylesCollectionEntry;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\src\animation\styles_collection.d.ts
  * Package ng.core
  * Name StylesCollection
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StylesCollection  {
    @JsProperty(name="styles")
    JsTypedObject<String,JsArray<StylesCollectionEntry>> getStyles();
    @JsProperty(name="styles")
    void setStyles(JsTypedObject<String,JsArray<StylesCollectionEntry>> value);
     void insertAtTime(String property,int time,Object /* UnionType */ value);
     StylesCollectionEntry getByIndex(String property,int index);
     int indexOfAtOrBeforeTime(String property,int time);
}
