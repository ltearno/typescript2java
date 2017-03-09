package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsFunction3;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction4;

/**
  * Generated from tests\@angular\core\src\linker\query_list.d.ts
  * Package ng.core
  * Name QueryList
  * An unmodifiable list of items that Angular keeps up to date when the state
  * of the application changes.
  * 
  * The type of object that {@link Query} and {@link ViewQueryMetadata} provide.
  * 
  * Implements an iterable interface, therefore it can be used in both ES6
  * javascript `for (var i of items)` loops as well as in Angular templates with
  * `*ngFor="let i of myList"`.
  * 
  * Changes can be observed by subscribing to the changes `Observable`.
  * 
  * NOTE: In the future this class will implement an `Observable` interface.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/RX8sJnQYl9FWuSCWme5z?p=preview))
  * ```typescript
  **/
@JsType( isNative=true, namespace="ng.core" )
public class QueryList<T>  {
    public Object _dirty;
    public Object _results;
    public Object _emitter;
    public Observable<Object> changes;
    public int length;
    public T first;
    public T last;
    public native <U> JsArray<U> map(JsFunction3<T,Integer,JsArray<T>,U> fn);
    public native  JsArray<T> filter(JsFunction3<T,Integer,JsArray<T>,Boolean> fn);
    public native  T find(JsFunction3<T,Integer,JsArray<T>,Boolean> fn);
    public native <U> U reduce(JsFunction4<U,T,Integer,JsArray<T>,U> fn,U init);
    public native  void forEach(JsFunction3<T,Integer,JsArray<T>,Void> fn);
    public native  boolean some(JsFunction3<T,Integer,JsArray<T>,Boolean> fn);
    public native  JsArray<T> toArray();
    public native  String toString();
    public native  void reset(Array<Object /* UnionType */> res);
    public native  void notifyOnChanges();
    public native  void setDirty();
    public boolean dirty;
}
