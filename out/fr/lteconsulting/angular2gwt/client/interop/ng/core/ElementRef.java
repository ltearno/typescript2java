package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\element_ref.d.ts
  * Package ng.core
  * Name ElementRef
  * A wrapper around a native element inside of a View.
  * 
  * An `ElementRef` is backed by a render-specific element. In the browser, this is usually a DOM
  * element.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ElementRef  {
    @JsProperty(name="nativeElement")
    Object getNativeElement();
    @JsProperty(name="nativeElement")
    void setNativeElement(Object value);
    @JsConstructor
    public ElementRef(Object nativeElement) {}
}
