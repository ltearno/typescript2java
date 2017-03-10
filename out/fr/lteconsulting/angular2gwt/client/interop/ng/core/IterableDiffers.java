package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.IterableDifferFactory;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.IterableDiffers;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\iterable_differs.d.ts
  * Package ng.core
  * Name IterableDiffers
  * A repository of different iterable diffing strategies used by NgFor, NgClass, and others.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface IterableDiffers  {
    @JsProperty(name="factories")
    JsArray<IterableDifferFactory> getFactories();
    @JsProperty(name="factories")
    void setFactories(JsArray<IterableDifferFactory> value);
    @JsConstructor
    public IterableDiffers(JsArray<IterableDifferFactory> factories) {}
     IterableDifferFactory find(Object iterable);
}
