package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name URLSearchParams
  * Typescript fqn URLSearchParams
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface URLSearchParams {
    /**
     * Appends a specified key/value pair as a new search parameter.
     */
    void append(String name, String value);

    /**
     * Deletes the given search parameter, and its associated value, from the list of all search parameters.
     */
    void delete(String name);

    /**
     * Returns the first value associated to the given search parameter.
     */
    Object /* UnionType */ get(String name);

    /**
     * Returns all the values association with a given search parameter.
     */
    JsArray<String> getAll(String name);

    /**
     * Returns a Boolean indicating if such a search parameter exists.
     */
    boolean has(String name);

    /**
     * Sets the value associated to a given search parameter to the given value. If there were several values, delete the others.
     */
    void set(String name, String value);
}
