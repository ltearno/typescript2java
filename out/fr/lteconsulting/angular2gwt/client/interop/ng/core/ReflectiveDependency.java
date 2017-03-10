package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ReflectiveKey;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.ReflectiveDependency;

/**
  * Generated from tests\@angular\core\src\di\reflective_provider.d.ts
  * Package ng.core
  * Name ReflectiveDependency
  * `Dependency` is used by the framework to extend DI.
  * This is internal to Angular and should not be used directly.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ReflectiveDependency  {
    @JsProperty(name="key")
    ReflectiveKey getKey();
    @JsProperty(name="key")
    void setKey(ReflectiveKey value);
    @JsProperty(name="optional")
    boolean getOptional();
    @JsProperty(name="optional")
    void setOptional(boolean value);
    @JsProperty(name="visibility")
    Object /* UnionType */ getVisibility();
    @JsProperty(name="visibility")
    void setVisibility(Object /* UnionType */ value);
    @JsConstructor
    public ReflectiveDependency(ReflectiveKey key,boolean optional,Object /* UnionType */ visibility) {}
}
