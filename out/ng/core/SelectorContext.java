package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\@angular\compiler\src\selector.d.ts
  * Package ng.core
  * Name SelectorContext
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SelectorContext  {
    public CssSelector selector;
    public Object cbContext;
    public SelectorListContext listContext;
    public JsArray<CssSelector> notSelectors;
    @JsConstructor
    public SelectorContext(CssSelector selector,Object cbContext,SelectorListContext listContext) {}
    public native  boolean finalize(CssSelector cssSelector,JsFunction2<CssSelector,Object,Void> callback);
}
