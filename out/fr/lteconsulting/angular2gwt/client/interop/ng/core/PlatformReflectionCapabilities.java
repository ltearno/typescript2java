package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Type;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\reflection\platform_reflection_capabilities.d.ts
  * Package ng.core
  * Name PlatformReflectionCapabilities
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PlatformReflectionCapabilities  {
     boolean isReflectionEnabled();
     Function factory(Type<Object> type);
     boolean hasLifecycleHook(Object type,String lcProperty);
     JsArray<JsArray<Object>> parameters(Type<Object> type);
     JsArray<Object> annotations(Type<Object> type);
     JsTypedObject<String,JsArray<Object>> propMetadata(Type<Object> typeOrFunc);
     GetterFn getter(String name);
     SetterFn setter(String name);
     MethodFn method(String name);
     String importUri(Type<Object> type);
     Object resolveIdentifier(String name,String moduleUrl,Object runtime);
     Object resolveEnum(Object enumIdentifier,String name);
}
