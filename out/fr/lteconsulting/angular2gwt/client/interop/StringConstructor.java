package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name StringConstructor
  * Typescript fqn StringConstructor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface StringConstructor {
    /**
     * Return the String value whose elements are, in order, the elements in the List elements.
     * If length is 0, the empty string is returned.
     */
    String fromCodePoint(JsArray<Number> /* optional */ codePoints);

    /**
     * String.raw is intended for use as a tag function of a Tagged Template String. When called
     * as such the first argument will be a well formed template call site object and the rest
     * parameter will contain the substitution values.
     */
    String raw(TemplateStringsArray template, JsArray<Object> /* optional */ substitutions);
}
