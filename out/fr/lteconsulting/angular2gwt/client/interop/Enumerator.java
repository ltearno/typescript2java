package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Enumerator
  * Typescript fqn Enumerator
  *
  * Allows enumerating over a COM collection, which may not have indexed item access.
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Enumerator<T> {
    /**
     * Returns true if the current item is the last one in the collection, or the collection is empty,
     * or the current item is undefined.
     */
    boolean atEnd();

    /**
     * Returns the current item in the collection
     */
    T item();

    /**
     * Resets the current item in the collection to the first item. If there are no items in the collection,
     * the current item is set to undefined.
     */
    void moveFirst();

    /**
     * Moves the current item to the next item in the collection. If the enumerator is at the end of
     * the collection or the collection is empty, the current item is set to undefined.
     */
    void moveNext();
}
