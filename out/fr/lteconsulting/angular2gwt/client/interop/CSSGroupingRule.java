package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CSSGroupingRule
  * Typescript fqn CSSGroupingRule
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CSSGroupingRule extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="cssRules")
    CSSRuleList getCssRules();

    @JsProperty(name="cssRules")
    void setCssRules(CSSRuleList value);

    void deleteRule(Number index);

    Number insertRule(String rule, Number index);
}
