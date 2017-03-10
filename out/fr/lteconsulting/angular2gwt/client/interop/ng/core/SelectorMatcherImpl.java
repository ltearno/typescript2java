package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CssSelector;
import ng.core.SelectorMatcher;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\@angular\compiler\src\selector.d.ts
  * Package ng.core
  * Name SelectorMatcher
  * Reads a list of CssSelectors and allows to calculate which ones
  * are contained in a given CssSelector.
  **/
@JsType( isNative=true, namespace="ng.core", name="SelectorMatcher" )
public class SelectorMatcherImpl  {
    public static native  SelectorMatcher createNotMatcher(JsArray<CssSelector> notSelectors);
    @JsProperty(name="_elementMap")
    Object get_elementMap();
    @JsProperty(name="_elementMap")
    void set_elementMap(Object value);
    @JsProperty(name="_elementPartialMap")
    Object get_elementPartialMap();
    @JsProperty(name="_elementPartialMap")
    void set_elementPartialMap(Object value);
    @JsProperty(name="_classMap")
    Object get_classMap();
    @JsProperty(name="_classMap")
    void set_classMap(Object value);
    @JsProperty(name="_classPartialMap")
    Object get_classPartialMap();
    @JsProperty(name="_classPartialMap")
    void set_classPartialMap(Object value);
    @JsProperty(name="_attrValueMap")
    Object get_attrValueMap();
    @JsProperty(name="_attrValueMap")
    void set_attrValueMap(Object value);
    @JsProperty(name="_attrValuePartialMap")
    Object get_attrValuePartialMap();
    @JsProperty(name="_attrValuePartialMap")
    void set_attrValuePartialMap(Object value);
    @JsProperty(name="_listContexts")
    Object get_listContexts();
    @JsProperty(name="_listContexts")
    void set_listContexts(Object value);
    public native  void addSelectables(JsArray<CssSelector> cssSelectors,Object /* optional */ callbackCtxt);
    public native  void _addSelectable();
    public native  void _addTerminal();
    public native  void _addPartial();
    public native  boolean match(CssSelector cssSelector,JsFunction2<CssSelector,Object,Void> matchedCallback);
}
