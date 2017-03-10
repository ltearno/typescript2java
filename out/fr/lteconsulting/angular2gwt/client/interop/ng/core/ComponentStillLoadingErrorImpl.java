package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Type;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\compiler.d.ts
  * Package ng.core
  * Name ComponentStillLoadingError
  * Indicates that a component is still being loaded in a synchronous compile.
  **/
@JsType( isNative=true, namespace="ng.core", name="ComponentStillLoadingError" )
public class ComponentStillLoadingErrorImpl extends BaseError {
    @JsProperty(name="compType")
    Type<Object> getCompType();
    @JsProperty(name="compType")
    void setCompType(Type<Object> value);
    @JsConstructor
    public ComponentStillLoadingErrorImpl(Type<Object> compType) {}
}
