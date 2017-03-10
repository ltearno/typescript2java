package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import ng.core.ResolvedReflectiveProvider;
import ng.core.Injector;
import jsinterop.annotations.JsConstructor;
import ng.core.ReflectiveInjector;

/**
  * Generated from tests\@angular\core\src\di\reflective_injector.d.ts
  * Package ng.core
  * Name ReflectiveInjector_
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ReflectiveInjector_ extends ReflectiveInjector {
    @JsProperty(name="keyIds")
    JsArray<Integer> getKeyIds();
    @JsProperty(name="keyIds")
    void setKeyIds(JsArray<Integer> value);
    @JsProperty(name="objs")
    JsArray<Object> getObjs();
    @JsProperty(name="objs")
    void setObjs(JsArray<Object> value);
    @JsConstructor
    public ReflectiveInjector_(JsArray<ResolvedReflectiveProvider> _providers,Injector /* optional */ _parent) {}
     Object get(Object token,Object /* optional */ notFoundValue);
    @JsProperty(name="parent")
    Injector getParent();
    @JsProperty(name="parent")
    void setParent(Injector value);
     ReflectiveInjector resolveAndCreateChild(JsArray</* NO SYMBOL */Provider> providers);
     ReflectiveInjector createChildFromResolved(JsArray<ResolvedReflectiveProvider> providers);
     Object resolveAndInstantiate(/* NO SYMBOL */Provider provider);
     Object instantiateResolved(ResolvedReflectiveProvider provider);
     ResolvedReflectiveProvider getProviderAtIndex(int index);
     void _getMaxNumberOfObjects();
     void _instantiateProvider();
     void _instantiate();
     void _getByReflectiveDependency();
     void _getByKey();
     void _getObjByKeyId();
    @JsProperty(name="displayName")
    String getDisplayName();
    @JsProperty(name="displayName")
    void setDisplayName(String value);
     String toString();
}
