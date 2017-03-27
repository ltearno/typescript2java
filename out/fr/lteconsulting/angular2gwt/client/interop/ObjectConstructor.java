package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ObjectConstructor
  * Typescript fqn ObjectConstructor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ObjectConstructor {
    /**
     * Copy the values of all of the enumerable own properties from one or more source objects to a
     * target object. Returns the target object.
     */
    <T,U> void assign(T target, U source);

    /**
     * Copy the values of all of the enumerable own properties from one or more source objects to a
     * target object. Returns the target object.
     */
    <T,U,V> void assign(T target, U source1, V source2);

    /**
     * Copy the values of all of the enumerable own properties from one or more source objects to a
     * target object. Returns the target object.
     */
    <T,U,V,W> void assign(T target, U source1, V source2, W source3);

    /**
     * Copy the values of all of the enumerable own properties from one or more source objects to a
     * target object. Returns the target object.
     */
    Object assign(Object target, JsArray<Object> /* optional */ sources);

    /**
     * Returns an array of all symbol properties found directly on object o.
     */
    JsArray<Object> getOwnPropertySymbols(Object o);

    /**
     * Returns true if the values are the same value, false otherwise.
     */
    boolean is(Object value1, Object value2);

    /**
     * Sets the prototype of a specified object o to  object proto or null. Returns the object o.
     */
    Object setPrototypeOf(Object o, Object /* UnionType */ proto);

    /**
     * Gets the own property descriptor of the specified object.
     * An own property descriptor is one that is defined directly on the object and is not
     * inherited from the object's prototype.
     */
    PropertyDescriptor getOwnPropertyDescriptor(Object o, Object /* Union type */ propertyKey);

    /**
     * Adds a property to an object, or modifies attributes of an existing property.
     */
    Object defineProperty(Object o, Object /* Union type */ propertyKey, PropertyDescriptor attributes);
}
