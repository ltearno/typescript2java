package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\reflection\platform_reflection_capabilities.d.ts
  * Package ng.core
  * Name PlatformReflectionCapabilities
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class PlatformReflectionCapabilities  {
    public native  boolean isReflectionEnabled();
    public native  Function factory(Type<Object> type);
    public native  boolean hasLifecycleHook(Object type,String lcProperty);
    public native  JsArray<JsArray<Object>> parameters(Type<Object> type);
    public native  JsArray<Object> annotations(Type<Object> type);
    public native  JsTypedObject<String,JsArray<Object>> propMetadata(Type<Object> typeOrFunc);
    public native  GetterFn getter(String name);
    public native  SetterFn setter(String name);
    public native  MethodFn method(String name);
    public native  String importUri(Type<Object> type);
    public native  Object resolveIdentifier(String name,String moduleUrl,Object runtime);
    public native  Object resolveEnum(Object enumIdentifier,String name);
}
