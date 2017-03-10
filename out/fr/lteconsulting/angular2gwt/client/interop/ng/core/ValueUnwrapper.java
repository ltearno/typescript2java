package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\change_detection\change_detection_util.d.ts
  * Package ng.core
  * Name ValueUnwrapper
  * Helper class for unwrapping WrappedValue s
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ValueUnwrapper  {
    @JsProperty(name="hasWrappedValue")
    boolean getHasWrappedValue();
    @JsProperty(name="hasWrappedValue")
    void setHasWrappedValue(boolean value);
     Object unwrap(Object value);
     void reset();
}
