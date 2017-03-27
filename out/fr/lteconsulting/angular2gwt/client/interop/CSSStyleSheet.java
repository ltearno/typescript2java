package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CSSStyleSheet
  * Typescript fqn CSSStyleSheet
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CSSStyleSheet extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="cssRules")
    CSSRuleList getCssRules();

    @JsProperty(name="cssRules")
    void setCssRules(CSSRuleList value);

    @JsProperty(name="cssText")
    String getCssText();

    @JsProperty(name="cssText")
    void setCssText(String value);

    @JsProperty(name="id")
    String getId();

    @JsProperty(name="id")
    void setId(String value);

    @JsProperty(name="imports")
    StyleSheetList getImports();

    @JsProperty(name="imports")
    void setImports(StyleSheetList value);

    @JsProperty(name="isAlternate")
    boolean getIsAlternate();

    @JsProperty(name="isAlternate")
    void setIsAlternate(boolean value);

    @JsProperty(name="isPrefAlternate")
    boolean getIsPrefAlternate();

    @JsProperty(name="isPrefAlternate")
    void setIsPrefAlternate(boolean value);

    @JsProperty(name="ownerRule")
    CSSRule getOwnerRule();

    @JsProperty(name="ownerRule")
    void setOwnerRule(CSSRule value);

    @JsProperty(name="owningElement")
    Element getOwningElement();

    @JsProperty(name="owningElement")
    void setOwningElement(Element value);

    @JsProperty(name="pages")
    StyleSheetPageList getPages();

    @JsProperty(name="pages")
    void setPages(StyleSheetPageList value);

    @JsProperty(name="readOnly")
    boolean getReadOnly();

    @JsProperty(name="readOnly")
    void setReadOnly(boolean value);

    @JsProperty(name="rules")
    CSSRuleList getRules();

    @JsProperty(name="rules")
    void setRules(CSSRuleList value);

    Number addImport(String bstrURL, Number /* optional */ lIndex);

    Number addPageRule(String bstrSelector, String bstrStyle, Number /* optional */ lIndex);

    Number addRule(String bstrSelector, String /* optional */ bstrStyle, Number /* optional */ lIndex);

    void deleteRule(Number /* optional */ index);

    Number insertRule(String rule, Number /* optional */ index);

    void removeImport(Number lIndex);

    void removeRule(Number lIndex);
}
