package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SymbolConstructor
  * Typescript fqn SymbolConstructor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SymbolConstructor {
    /**
     * A method that determines if a constructor object recognizes an object as one of the 
     * constructor’s instances. Called by the semantics of the instanceof operator.
     */
    @JsProperty(name="hasInstance")
    Object getHasInstance();

    /**
     * A method that determines if a constructor object recognizes an object as one of the 
     * constructor’s instances. Called by the semantics of the instanceof operator.
     */
    @JsProperty(name="hasInstance")
    void setHasInstance(Object value);

    /**
     * A Boolean value that if true indicates that an object should flatten to its array elements
     * by Array.prototype.concat.
     */
    @JsProperty(name="isConcatSpreadable")
    Object getIsConcatSpreadable();

    /**
     * A Boolean value that if true indicates that an object should flatten to its array elements
     * by Array.prototype.concat.
     */
    @JsProperty(name="isConcatSpreadable")
    void setIsConcatSpreadable(Object value);

    /**
     * A regular expression method that matches the regular expression against a string. Called 
     * by the String.prototype.match method.
     */
    @JsProperty(name="match")
    Object getMatch();

    /**
     * A regular expression method that matches the regular expression against a string. Called 
     * by the String.prototype.match method.
     */
    @JsProperty(name="match")
    void setMatch(Object value);

    /**
     * A regular expression method that replaces matched substrings of a string. Called by the 
     * String.prototype.replace method.
     */
    @JsProperty(name="replace")
    Object getReplace();

    /**
     * A regular expression method that replaces matched substrings of a string. Called by the 
     * String.prototype.replace method.
     */
    @JsProperty(name="replace")
    void setReplace(Object value);

    /**
     * A regular expression method that returns the index within a string that matches the 
     * regular expression. Called by the String.prototype.search method.
     */
    @JsProperty(name="search")
    Object getSearch();

    /**
     * A regular expression method that returns the index within a string that matches the 
     * regular expression. Called by the String.prototype.search method.
     */
    @JsProperty(name="search")
    void setSearch(Object value);

    /**
     * A function valued property that is the constructor function that is used to create 
     * derived objects.
     */
    @JsProperty(name="species")
    Object getSpecies();

    /**
     * A function valued property that is the constructor function that is used to create 
     * derived objects.
     */
    @JsProperty(name="species")
    void setSpecies(Object value);

    /**
     * A regular expression method that splits a string at the indices that match the regular 
     * expression. Called by the String.prototype.split method.
     */
    @JsProperty(name="split")
    Object getSplit();

    /**
     * A regular expression method that splits a string at the indices that match the regular 
     * expression. Called by the String.prototype.split method.
     */
    @JsProperty(name="split")
    void setSplit(Object value);

    /**
     * A method that converts an object to a corresponding primitive value.
     * Called by the ToPrimitive abstract operation.
     */
    @JsProperty(name="toPrimitive")
    Object getToPrimitive();

    /**
     * A method that converts an object to a corresponding primitive value.
     * Called by the ToPrimitive abstract operation.
     */
    @JsProperty(name="toPrimitive")
    void setToPrimitive(Object value);

    /**
     * A String value that is used in the creation of the default string description of an object.
     * Called by the built-in method Object.prototype.toString.
     */
    @JsProperty(name="toStringTag")
    Object getToStringTag();

    /**
     * A String value that is used in the creation of the default string description of an object.
     * Called by the built-in method Object.prototype.toString.
     */
    @JsProperty(name="toStringTag")
    void setToStringTag(Object value);

    /**
     * An Object whose own property names are property names that are excluded from the 'with'
     * environment bindings of the associated objects.
     */
    @JsProperty(name="unscopables")
    Object getUnscopables();

    /**
     * An Object whose own property names are property names that are excluded from the 'with'
     * environment bindings of the associated objects.
     */
    @JsProperty(name="unscopables")
    void setUnscopables(Object value);
}
