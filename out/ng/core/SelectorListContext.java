package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\selector.d.ts
  * Package ng.core
  * Name SelectorListContext
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SelectorListContext  {
    public JsArray<CssSelector> selectors;
    public boolean alreadyMatched;
    @JsConstructor
    public SelectorListContext(JsArray<CssSelector> selectors) {}
}
