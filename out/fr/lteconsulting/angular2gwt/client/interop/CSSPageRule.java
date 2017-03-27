package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CSSPageRule
  * Typescript fqn CSSPageRule
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CSSPageRule extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="pseudoClass")
    String getPseudoClass();

    @JsProperty(name="pseudoClass")
    void setPseudoClass(String value);

    @JsProperty(name="selector")
    String getSelector();

    @JsProperty(name="selector")
    void setSelector(String value);

    @JsProperty(name="selectorText")
    String getSelectorText();

    @JsProperty(name="selectorText")
    void setSelectorText(String value);

    @JsProperty(name="style")
    CSSStyleDeclaration getStyle();

    @JsProperty(name="style")
    void setStyle(CSSStyleDeclaration value);
}
