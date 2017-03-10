package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\component_factory_resolver.d.ts
  * Package ng.core
  * Name NoComponentFactoryError
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NoComponentFactoryError extends BaseError {
    @JsProperty(name="component")
    Function getComponent();
    @JsProperty(name="component")
    void setComponent(Function value);
    @JsConstructor
    public NoComponentFactoryError(Function component) {}
}
