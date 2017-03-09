package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_provider.d.ts
  * Package ng.core
  * Name ReflectiveDependency
  * `Dependency` is used by the framework to extend DI.
  * This is internal to Angular and should not be used directly.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ReflectiveDependency  {
    public ReflectiveKey key;
    public boolean optional;
    public Object /* UnionType */ visibility;
    @JsConstructor
    public ReflectiveDependency(ReflectiveKey key,boolean optional,Object /* UnionType */ visibility) {}
    public static native  ReflectiveDependency fromKey(ReflectiveKey key);
}
