package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name VBArray
  * Typescript fqn VBArray
  *
  * Enables reading from a COM safe array, which might have an alternate lower bound, or multiple dimensions.
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface VBArray<T> {
    /**
     * Returns the number of dimensions (1-based).
     */
    Number dimensions();

    /**
     * Takes an index for each dimension in the array, and returns the item at the corresponding location.
     */
    T getItem(Number dimension1Index, JsArray<Number> /* optional */ dimensionNIndexes);

    /**
     * Returns the smallest available index for a given dimension.
     */
    Number lbound(Number /* optional */ dimension);

    /**
     * Returns the largest available index for a given dimension.
     */
    Number ubound(Number /* optional */ dimension);

    /**
     * Returns a Javascript array with all the elements in the VBArray. If there are multiple dimensions,
     * each successive dimension is appended to the end of the array.
     * Example: [[1,2,3],[4,5,6]] becomes [1,2,3,4,5,6]
     */
    JsArray<T> toArray();
}
