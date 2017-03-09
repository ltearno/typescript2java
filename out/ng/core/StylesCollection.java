package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\animation\styles_collection.d.ts
  * Package ng.core
  * Name StylesCollection
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class StylesCollection  {
    public JsTypedObject<String,JsArray<StylesCollectionEntry>> styles;
    public native  void insertAtTime(String property,int time,Object /* UnionType */ value);
    public native  StylesCollectionEntry getByIndex(String property,int index);
    public native  int indexOfAtOrBeforeTime(String property,int time);
}
