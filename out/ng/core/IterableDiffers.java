package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\iterable_differs.d.ts
  * Package ng.core
  * Name IterableDiffers
  * A repository of different iterable diffing strategies used by NgFor, NgClass, and others.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class IterableDiffers  {
    public JsArray<IterableDifferFactory> factories;
    @JsConstructor
    public IterableDiffers(JsArray<IterableDifferFactory> factories) {}
    public static native  IterableDiffers create(JsArray<IterableDifferFactory> factories,IterableDiffers /* optional */ parent);
    public static native  /* NO SYMBOL */Provider extend(JsArray<IterableDifferFactory> factories);
    public native  IterableDifferFactory find(Object iterable);
}
