package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CssSelector;

/**
  * Generated from tests\@angular\compiler\src\selector.d.ts
  * Package ng.core
  * Name CssSelector
  * A css selector contains an element name,
  * css classes and attribute/value pairs with the purpose
  * of selecting subsets out of them.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CssSelector  {
    @JsProperty(name="element")
    String getElement();
    @JsProperty(name="element")
    void setElement(String value);
    @JsProperty(name="classNames")
    JsArray<String> getClassNames();
    @JsProperty(name="classNames")
    void setClassNames(JsArray<String> value);
    @JsProperty(name="attrs")
    JsArray<String> getAttrs();
    @JsProperty(name="attrs")
    void setAttrs(JsArray<String> value);
    @JsProperty(name="notSelectors")
    JsArray<CssSelector> getNotSelectors();
    @JsProperty(name="notSelectors")
    void setNotSelectors(JsArray<CssSelector> value);
     boolean isElementSelector();
     boolean hasElementSelector();
     void setElement(String /* optional */ element);
     String getMatchingElementTemplate();
     void addAttribute(String name,String /* optional */ value);
     void addClassName(String name);
     String toString();
}
