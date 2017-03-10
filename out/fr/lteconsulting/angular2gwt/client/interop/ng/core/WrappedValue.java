package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.WrappedValue;

/**
  * Generated from tests\@angular\core\src\change_detection\change_detection_util.d.ts
  * Package ng.core
  * Name WrappedValue
  * Indicates that the result of a {@link Pipe} transformation has changed even though the
  * reference
  * has not changed.
  * 
  * The wrapped value will be unwrapped by change detection, and the unwrapped value will be stored.
  * 
  * Example:
  * 
  * ```
  * if (this._latestValue === this._latestReturnedValue) {
  *     return this._latestReturnedValue;
  *   } else {
  *     this._latestReturnedValue = this._latestValue;
  *     return WrappedValue.wrap(this._latestValue); // this will force update
  *   }
  * ```
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface WrappedValue  {
    @JsProperty(name="wrapped")
    Object getWrapped();
    @JsProperty(name="wrapped")
    void setWrapped(Object value);
    @JsConstructor
    public WrappedValue(Object wrapped) {}
}
