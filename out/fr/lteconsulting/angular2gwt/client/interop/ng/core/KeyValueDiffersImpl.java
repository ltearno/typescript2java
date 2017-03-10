package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.KeyValueDifferFactory;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.KeyValueDiffers;

/**
  * Generated from tests\@angular\core\src\change_detection\differs\keyvalue_differs.d.ts
  * Package ng.core
  * Name KeyValueDiffers
  * A repository of different Map diffing strategies used by NgClass, NgStyle, and others.
  **/
@JsType( isNative=true, namespace="ng.core", name="KeyValueDiffers" )
public class KeyValueDiffersImpl  {
    @JsProperty(name="factories")
    JsArray<KeyValueDifferFactory> getFactories();
    @JsProperty(name="factories")
    void setFactories(JsArray<KeyValueDifferFactory> value);
    @JsConstructor
    public KeyValueDiffersImpl(JsArray<KeyValueDifferFactory> factories) {}
    public static native  KeyValueDiffers create(JsArray<KeyValueDifferFactory> factories,KeyValueDiffers /* optional */ parent);
    public static native  /* NO SYMBOL */Provider extend(JsArray<KeyValueDifferFactory> factories);
    public native  KeyValueDifferFactory find(Object kv);
}
