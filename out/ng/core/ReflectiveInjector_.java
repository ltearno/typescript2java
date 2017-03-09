package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\di\reflective_injector.d.ts
  * Package ng.core
  * Name ReflectiveInjector_
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ReflectiveInjector_ extends ReflectiveInjector {
    public JsArray<Integer> keyIds;
    public JsArray<Object> objs;
    @JsConstructor
    public ReflectiveInjector_(JsArray<ResolvedReflectiveProvider> _providers,Injector /* optional */ _parent) {}
    public native  Object get(Object token,Object /* optional */ notFoundValue);
    public Injector parent;
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
    public String displayName;
    public native  String toString();
}
