package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\keyvalue_differs.d.ts
  * Package ng.core
  * Name KeyValueDiffers
  * A repository of different Map diffing strategies used by NgClass, NgStyle, and others.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class KeyValueDiffers  {
    public JsArray<KeyValueDifferFactory> factories;
    @JsConstructor
    public KeyValueDiffers(JsArray<KeyValueDifferFactory> factories) {}
    public static native  KeyValueDiffers create(JsArray<KeyValueDifferFactory> factories,KeyValueDiffers /* optional */ parent);
    public static native  /* NO SYMBOL */Provider extend(JsArray<KeyValueDifferFactory> factories);
    public native  KeyValueDifferFactory find(Object kv);
}
