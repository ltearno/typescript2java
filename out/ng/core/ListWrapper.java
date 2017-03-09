package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\@angular\compiler\src\facade\collection.d.ts
  * Package ng.core
  * Name ListWrapper
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ListWrapper  {
    public static native <T> T findLast(JsArray<T> arr,JsFunction1<T,Boolean> condition);
    public static native <T> void removeAll(JsArray<T> list,JsArray<T> items);
    public static native <T> boolean remove(JsArray<T> list,T el);
    public static native  boolean equals(JsArray<Object> a,JsArray<Object> b);
    public static native <T> JsArray<T> flatten(Array<Object /* UnionType */> list);
}
