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
@JsType( isNative=true, namespace="ng.core", name="NoComponentFactoryError" )
public class NoComponentFactoryErrorImpl extends BaseError {
    @JsProperty(name="component")
    Function getComponent();
    @JsProperty(name="component")
    void setComponent(Function value);
    @JsConstructor
    public NoComponentFactoryErrorImpl(Function component) {}
}
