package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CSSStyleRule
  * Typescript fqn CSSStyleRule
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CSSStyleRule extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="readOnly")
    boolean getReadOnly();

    @JsProperty(name="readOnly")
    void setReadOnly(boolean value);

    @JsProperty(name="selectorText")
    String getSelectorText();

    @JsProperty(name="selectorText")
    void setSelectorText(String value);

    @JsProperty(name="style")
    CSSStyleDeclaration getStyle();

    @JsProperty(name="style")
    void setStyle(CSSStyleDeclaration value);
}
