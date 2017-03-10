package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowserDynamic;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser-dynamic\testing\dom_test_component_renderer.d.ts
  * Package ng.platformBrowserDynamic
  * Name DOMTestComponentRenderer
  * A DOM based implementation of the TestComponentRenderer.
  **/
@JsType( isNative=true, namespace="ng.platformBrowserDynamic", name="DOMTestComponentRenderer" )
public class DOMTestComponentRendererImpl extends TestComponentRenderer {
    @JsProperty(name="_doc")
    Object get_doc();
    @JsProperty(name="_doc")
    void set_doc(Object value);
    @JsConstructor
    public DOMTestComponentRendererImpl(Object _doc) {}
    public native  void insertRootElement(String rootElId);
}
