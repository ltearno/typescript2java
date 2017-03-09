package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowserDynamic;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser-dynamic\testing\dom_test_component_renderer.d.ts
  * Package ng.platformBrowserDynamic
  * Name DOMTestComponentRenderer
  * A DOM based implementation of the TestComponentRenderer.
  **/
@JsType( isNative=true, namespace="ng.platformBrowserDynamic" )
public class DOMTestComponentRenderer extends TestComponentRenderer {
    public Object _doc;
    @JsConstructor
    public DOMTestComponentRenderer(Object _doc) {}
    public native  void insertRootElement(String rootElId);
}
