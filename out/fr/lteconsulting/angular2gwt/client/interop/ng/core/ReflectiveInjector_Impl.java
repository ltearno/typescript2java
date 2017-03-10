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
@JsType( isNative=true, namespace="ng.core", name="ReflectiveInjector_" )
public class ReflectiveInjector_Impl extends ReflectiveInjector {
    @JsProperty(name="keyIds")
    JsArray<Integer> getKeyIds();
    @JsProperty(name="keyIds")
    void setKeyIds(JsArray<Integer> value);
    @JsProperty(name="objs")
    JsArray<Object> getObjs();
    @JsProperty(name="objs")
    void setObjs(JsArray<Object> value);
    @JsConstructor
    public ReflectiveInjector_Impl(JsArray<ResolvedReflectiveProvider> _providers,Injector /* optional */ _parent) {}
    public native  Object get(Object token,Object /* optional */ notFoundValue);
    @JsProperty(name="parent")
    Injector getParent();
    @JsProperty(name="parent")
    void setParent(Injector value);
    public native  ReflectiveInjector resolveAndCreateChild(JsArray</* NO SYMBOL */Provider> providers);
    public native  ReflectiveInjector createChildFromResolved(JsArray<ResolvedReflectiveProvider> providers);
    public native  Object resolveAndInstantiate(/* NO SYMBOL */Provider provider);
    public native  Object instantiateResolved(ResolvedReflectiveProvider provider);
    public native  ResolvedReflectiveProvider getProviderAtIndex(int index);
    public native  void _getMaxNumberOfObjects();
    public native  void _instantiateProvider();
    public native  void _instantiate();
    public native  void _getByReflectiveDependency();
    public native  void _getByKey();
    public native  void _getObjByKeyId();
    @JsProperty(name="displayName")
    String getDisplayName();
    @JsProperty(name="displayName")
    void setDisplayName(String value);
    public native  String toString();
}
