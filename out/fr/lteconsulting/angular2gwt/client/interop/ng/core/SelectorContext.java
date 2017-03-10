package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CssSelector;
import jsinterop.annotations.JsProperty;
import ng.core.SelectorListContext;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\@angular\compiler\src\selector.d.ts
  * Package ng.core
  * Name SelectorContext
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SelectorContext  {
    @JsProperty(name="selector")
    CssSelector getSelector();
    @JsProperty(name="selector")
    void setSelector(CssSelector value);
    @JsProperty(name="cbContext")
    Object getCbContext();
    @JsProperty(name="cbContext")
    void setCbContext(Object value);
    @JsProperty(name="listContext")
    SelectorListContext getListContext();
    @JsProperty(name="listContext")
    void setListContext(SelectorListContext value);
    @JsProperty(name="notSelectors")
    JsArray<CssSelector> getNotSelectors();
    @JsProperty(name="notSelectors")
    void setNotSelectors(JsArray<CssSelector> value);
    @JsConstructor
    public SelectorContext(CssSelector selector,Object cbContext,SelectorListContext listContext) {}
     boolean finalize(CssSelector cssSelector,JsFunction2<CssSelector,Object,Void> callback);
}
