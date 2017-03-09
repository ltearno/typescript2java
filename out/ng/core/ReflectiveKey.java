package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

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
@JsType( isNative=true, namespace="ng.core" )
public class ReflectiveKey  {
    public Object token;
    public int id;
    @JsConstructor
    public ReflectiveKey(Object token,int id) {}
    public String displayName;
    public static native  ReflectiveKey get(Object token);
    public static int numberOfKeys;
}
