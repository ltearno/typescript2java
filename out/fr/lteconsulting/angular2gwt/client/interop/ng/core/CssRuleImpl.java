package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\shadow_css.d.ts
  * Package ng.core
  * Name CssRule
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CssRule" )
public class CssRuleImpl  {
    @JsProperty(name="selector")
    String getSelector();
    @JsProperty(name="selector")
    void setSelector(String value);
    @JsProperty(name="content")
    String getContent();
    @JsProperty(name="content")
    void setContent(String value);
    @JsConstructor
    public CssRuleImpl(String selector,String content) {}
}
