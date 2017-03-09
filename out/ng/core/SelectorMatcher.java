package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\@angular\compiler\src\selector.d.ts
  * Package ng.core
  * Name SelectorMatcher
  * Reads a list of CssSelectors and allows to calculate which ones
  * are contained in a given CssSelector.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SelectorMatcher  {
    public static native  SelectorMatcher createNotMatcher(JsArray<CssSelector> notSelectors);
    public Object _elementMap;
    public Object _elementPartialMap;
    public Object _classMap;
    public Object _classPartialMap;
    public Object _attrValueMap;
    public Object _attrValuePartialMap;
    public Object _listContexts;
    public native  void addSelectables(JsArray<CssSelector> cssSelectors,Object /* optional */ callbackCtxt);
    public native  void _addSelectable();
    public native  void _addTerminal();
    public native  void _addPartial();
    public native  boolean match(CssSelector cssSelector,JsFunction2<CssSelector,Object,Void> matchedCallback);
}
