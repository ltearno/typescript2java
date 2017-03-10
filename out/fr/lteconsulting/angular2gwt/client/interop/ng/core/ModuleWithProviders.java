package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Type;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\metadata\ng_module.d.ts
  * Package ng.core
  * Name ModuleWithProviders
  * A wrapper around a module that also includes the providers.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ModuleWithProviders  {
    @JsProperty(name="ngModule")
    Type<Object> ngModule();
    @JsProperty(name="ngModule")
    void ngModule(Type<Object> value);
    /* optional property providers*/    @JsProperty(name="providers")
    JsArray</* NO SYMBOL */Provider> providers();
    @JsProperty(name="providers")
    void providers(JsArray</* NO SYMBOL */Provider> value);
}
