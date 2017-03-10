package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
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
@JsType( isNative=true, namespace="ng.core", name="QueryList" )
public class QueryListImpl<T>  {
    @JsProperty(name="_dirty")
    Object get_dirty();
    @JsProperty(name="_dirty")
    void set_dirty(Object value);
    @JsProperty(name="_results")
    Object get_results();
    @JsProperty(name="_results")
    void set_results(Object value);
    @JsProperty(name="_emitter")
    Object get_emitter();
    @JsProperty(name="_emitter")
    void set_emitter(Object value);
    @JsProperty(name="changes")
    Observable<Object> getChanges();
    @JsProperty(name="changes")
    void setChanges(Observable<Object> value);
    @JsProperty(name="length")
    int getLength();
    @JsProperty(name="length")
    void setLength(int value);
    @JsProperty(name="first")
    T getFirst();
    @JsProperty(name="first")
    void setFirst(T value);
    @JsProperty(name="last")
    T getLast();
    @JsProperty(name="last")
    void setLast(T value);
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
    @JsProperty(name="dirty")
    boolean getDirty();
    @JsProperty(name="dirty")
    void setDirty(boolean value);
}
