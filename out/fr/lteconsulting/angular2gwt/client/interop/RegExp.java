package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RegExp
  * Typescript fqn RegExp
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RegExp {
    /**
     * Matches a string with this regular expression, and returns an array containing the results of
     * that search.
     */
    Object /* UnionType */ [ComputedPropertyName](String string);

    /**
     * Replaces text in a string, using this regular expression.
     */
    String [ComputedPropertyName](String string, String replaceValue);

    /**
     * Replaces text in a string, using this regular expression.
     */
    String [ComputedPropertyName](String string, JsFunction2<String,Array<Object>,String> replacer);

    /**
     * Finds the position beginning first substring match in a regular expression search
     * using this regular expression.
     */
    Number [ComputedPropertyName](String string);

    /**
     * Returns an array of substrings that were delimited by strings in the original input that
     * match against this regular expression.
     * 
     * If the regular expression contains capturing parentheses, then each time this
     * regular expression matches, the results (including any undefined results) of the
     * capturing parentheses are spliced.
     */
    JsArray<String> [ComputedPropertyName](String string, Number /* optional */ limit);
}
