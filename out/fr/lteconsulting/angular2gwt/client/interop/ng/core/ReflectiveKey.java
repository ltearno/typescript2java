package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.ReflectiveKey;

/**
  * Generated from tests\@angular\core\src\di\reflective_key.d.ts
  * Package ng.core
  * Name ReflectiveKey
  * A unique object used for retrieving items from the {@link ReflectiveInjector}.
  * 
  * Keys have:
  * - a system-wide unique `id`.
  * - a `token`.
  * 
  * `Key` is used internally by {@link ReflectiveInjector} because its system-wide unique `id` allows
  * the
  * injector to store created objects in a more efficient way.
  * 
  * `Key` should not be created directly. {@link ReflectiveInjector} creates keys automatically when
  * resolving
  * providers.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ReflectiveKey  {
    @JsProperty(name="token")
    Object getToken();
    @JsProperty(name="token")
    void setToken(Object value);
    @JsProperty(name="id")
    int getId();
    @JsProperty(name="id")
    void setId(int value);
    @JsConstructor
    public ReflectiveKey(Object token,int id) {}
    @JsProperty(name="displayName")
    String getDisplayName();
    @JsProperty(name="displayName")
    void setDisplayName(String value);
}
