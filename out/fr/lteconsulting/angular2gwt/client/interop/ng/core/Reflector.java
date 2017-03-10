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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Reflector extends ReflectorReader {
    @JsProperty(name="reflectionCapabilities")
    PlatformReflectionCapabilities getReflectionCapabilities();
    @JsProperty(name="reflectionCapabilities")
    void setReflectionCapabilities(PlatformReflectionCapabilities value);
    @JsConstructor
    public Reflector(PlatformReflectionCapabilities reflectionCapabilities) {}
     void updateCapabilities(PlatformReflectionCapabilities caps);
     Function factory(Type<Object> type);
     JsArray<JsArray<Object>> parameters(Type<Object> typeOrFunc);
     JsArray<Object> annotations(Type<Object> typeOrFunc);
     JsTypedObject<String,JsArray<Object>> propMetadata(Type<Object> typeOrFunc);
     boolean hasLifecycleHook(Object type,String lcProperty);
     GetterFn getter(String name);
     SetterFn setter(String name);
     MethodFn method(String name);
     String importUri(Object type);
     Object resolveIdentifier(String name,String moduleUrl,Object runtime);
     Object resolveEnum(Object identifier,String name);
}
