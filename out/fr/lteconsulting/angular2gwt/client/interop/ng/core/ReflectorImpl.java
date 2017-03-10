package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.PlatformReflectionCapabilities;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.Type;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\reflection\reflector.d.ts
  * Package ng.core
  * Name Reflector
  * Provides access to reflection data about symbols. Used internally by Angular
  * to power dependency injection and compilation.
  **/
@JsType( isNative=true, namespace="ng.core", name="Reflector" )
public class ReflectorImpl extends ReflectorReader {
    @JsProperty(name="reflectionCapabilities")
    PlatformReflectionCapabilities getReflectionCapabilities();
    @JsProperty(name="reflectionCapabilities")
    void setReflectionCapabilities(PlatformReflectionCapabilities value);
    @JsConstructor
    public ReflectorImpl(PlatformReflectionCapabilities reflectionCapabilities) {}
    public native  void updateCapabilities(PlatformReflectionCapabilities caps);
    public native  Function factory(Type<Object> type);
    public native  JsArray<JsArray<Object>> parameters(Type<Object> typeOrFunc);
    public native  JsArray<Object> annotations(Type<Object> typeOrFunc);
    public native  JsTypedObject<String,JsArray<Object>> propMetadata(Type<Object> typeOrFunc);
    public native  boolean hasLifecycleHook(Object type,String lcProperty);
    public native  GetterFn getter(String name);
    public native  SetterFn setter(String name);
    public native  MethodFn method(String name);
    public native  String importUri(Object type);
    public native  Object resolveIdentifier(String name,String moduleUrl,Object runtime);
    public native  Object resolveEnum(Object identifier,String name);
}
