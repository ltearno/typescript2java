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
@JsType( isNative=true, namespace="ng.core", name="ReflectionCapabilities" )
public class ReflectionCapabilitiesImpl extends PlatformReflectionCapabilities {
    @JsProperty(name="_reflect")
    Object get_reflect();
    @JsProperty(name="_reflect")
    void set_reflect(Object value);
    @JsConstructor
    public ReflectionCapabilitiesImpl(Object /* optional */ reflect) {}
    public native  boolean isReflectionEnabled();
    public native <T> JsFunction1<JsArray<Object>,T> factory(Type<T> t);
    public native  void _ownParameters();
    public native  JsArray<JsArray<Object>> parameters(Type<Object> type);
    public native  void _ownAnnotations();
    public native  JsArray<Object> annotations(Type<Object> typeOrFunc);
    public native  void _ownPropMetadata();
    public native  JsTypedObject<String,JsArray<Object>> propMetadata(Object typeOrFunc);
    public native  boolean hasLifecycleHook(Object type,String lcProperty);
    public native  GetterFn getter(String name);
    public native  SetterFn setter(String name);
    public native  MethodFn method(String name);
    public native  String importUri(Object type);
    public native  Object resolveIdentifier(String name,String moduleUrl,Object runtime);
    public native  Object resolveEnum(Object enumIdentifier,String name);
}
