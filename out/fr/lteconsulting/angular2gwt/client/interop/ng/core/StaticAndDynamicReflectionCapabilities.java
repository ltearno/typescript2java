package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.StaticReflector;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.StaticSymbol;

/**
  * Generated from tests\@angular\compiler\src\aot\static_reflection_capabilities.d.ts
  * Package ng.core
  * Name StaticAndDynamicReflectionCapabilities
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface StaticAndDynamicReflectionCapabilities  {
    @JsProperty(name="staticDelegate")
    Object getStaticDelegate();
    @JsProperty(name="staticDelegate")
    void setStaticDelegate(Object value);
    @JsProperty(name="dynamicDelegate")
    Object getDynamicDelegate();
    @JsProperty(name="dynamicDelegate")
    void setDynamicDelegate(Object value);
    @JsConstructor
    public StaticAndDynamicReflectionCapabilities(StaticReflector staticDelegate) {}
     boolean isReflectionEnabled();
     Function factory(Object type);
     boolean hasLifecycleHook(Object type,String lcProperty);
     JsArray<JsArray<Object>> parameters(Object type);
     JsArray<Object> annotations(Object type);
     JsTypedObject<String,JsArray<Object>> propMetadata(Object typeOrFunc);
     GetterFn getter(String name);
     SetterFn setter(String name);
     MethodFn method(String name);
     String importUri(Object type);
     StaticSymbol resolveIdentifier(String name,String moduleUrl,Object runtime);
     Object resolveEnum(Object enumIdentifier,String name);
}
