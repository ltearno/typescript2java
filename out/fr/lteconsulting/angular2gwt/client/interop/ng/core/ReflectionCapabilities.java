package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.Type;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\reflection\reflection_capabilities.d.ts
  * Package ng.core
  * Name ReflectionCapabilities
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ReflectionCapabilities extends PlatformReflectionCapabilities {
    @JsProperty(name="_reflect")
    Object get_reflect();
    @JsProperty(name="_reflect")
    void set_reflect(Object value);
    @JsConstructor
    public ReflectionCapabilities(Object /* optional */ reflect) {}
     boolean isReflectionEnabled();
    <T> JsFunction1<JsArray<Object>,T> factory(Type<T> t);
     void _ownParameters();
     JsArray<JsArray<Object>> parameters(Type<Object> type);
     void _ownAnnotations();
     JsArray<Object> annotations(Type<Object> typeOrFunc);
     void _ownPropMetadata();
     JsTypedObject<String,JsArray<Object>> propMetadata(Object typeOrFunc);
     boolean hasLifecycleHook(Object type,String lcProperty);
     GetterFn getter(String name);
     SetterFn setter(String name);
     MethodFn method(String name);
     String importUri(Object type);
     Object resolveIdentifier(String name,String moduleUrl,Object runtime);
     Object resolveEnum(Object enumIdentifier,String name);
}
