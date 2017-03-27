package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CSSKeyframeRule
  * Typescript fqn CSSKeyframeRule
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CSSKeyframeRule extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="keyText")
    String getKeyText();

    @JsProperty(name="keyText")
    void setKeyText(String value);

    @JsProperty(name="style")
    CSSStyleDeclaration getStyle();

    @JsProperty(name="style")
    void setStyle(CSSStyleDeclaration value);
}
