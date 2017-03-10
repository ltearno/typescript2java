package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_iterable_differ.d.ts
  * Package ng.core
  * Name CollectionChangeRecord
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CollectionChangeRecord" )
public class CollectionChangeRecordImpl  {
    @JsProperty(name="item")
    Object getItem();
    @JsProperty(name="item")
    void setItem(Object value);
    @JsProperty(name="trackById")
    Object getTrackById();
    @JsProperty(name="trackById")
    void setTrackById(Object value);
    @JsProperty(name="currentIndex")
    int getCurrentIndex();
    @JsProperty(name="currentIndex")
    void setCurrentIndex(int value);
    @JsProperty(name="previousIndex")
    int getPreviousIndex();
    @JsProperty(name="previousIndex")
    void setPreviousIndex(int value);
    @JsConstructor
    public CollectionChangeRecordImpl(Object item,Object trackById) {}
    public native  String toString();
}
