package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CSSKeyframesRule
  * Typescript fqn CSSKeyframesRule
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CSSKeyframesRule extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="cssRules")
    CSSRuleList getCssRules();

    @JsProperty(name="cssRules")
    void setCssRules(CSSRuleList value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    void appendRule(String rule);

    void deleteRule(String rule);

    CSSKeyframeRule findRule(String rule);
}
