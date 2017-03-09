package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\selector.d.ts
  * Package ng.core
  * Name CssSelector
  * A css selector contains an element name,
  * css classes and attribute/value pairs with the purpose
  * of selecting subsets out of them.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CssSelector  {
    public String element;
    public JsArray<String> classNames;
    public JsArray<String> attrs;
    public JsArray<CssSelector> notSelectors;
    public static native  JsArray<CssSelector> parse(String selector);
    public native  boolean isElementSelector();
    public native  boolean hasElementSelector();
    public native  void setElement(String /* optional */ element);
    public native  String getMatchingElementTemplate();
    public native  void addAttribute(String name,String /* optional */ value);
    public native  void addClassName(String name);
    public native  String toString();
}
