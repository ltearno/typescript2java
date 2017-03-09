package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\default_iterable_differ.d.ts
  * Package ng.core
  * Name CollectionChangeRecord
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CollectionChangeRecord  {
    public Object item;
    public Object trackById;
    public int currentIndex;
    public int previousIndex;
    @JsConstructor
    public CollectionChangeRecord(Object item,Object trackById) {}
    public native  String toString();
}
