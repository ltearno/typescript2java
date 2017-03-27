package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name String
  * Typescript fqn String
  *
  * Allows manipulation and formatting of text strings and determination and location of substrings within strings.
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface String {
    /**
     * Matches a string an object that supports being matched against, and returns an array containing the results of that search.
     */
    Object /* UnionType */ match(/* TypeLiteral */ Object matcher);

    /**
     * Replaces text in a string, using an object that supports replacement within a string.
     */
    String replace(/* TypeLiteral */ Object searchValue, String replaceValue);

    /**
     * Replaces text in a string, using an object that supports replacement within a string.
     */
    String replace(/* TypeLiteral */ Object searchValue, JsFunction2<String,Array<Object>,String> replacer);

    /**
     * Finds the first substring match in a regular expression search.
     */
    Number search(/* TypeLiteral */ Object searcher);

    /**
     * Split a string into substrings using the specified separator and return them as an array.
     */
    JsArray<String> split(/* TypeLiteral */ Object splitter, Number /* optional */ limit);
}
