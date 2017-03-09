package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\application_ref.d.ts
  * Package ng.core
  * Name ApplicationRef_
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ApplicationRef_ extends ApplicationRef {
    public Object _zone;
    public Object _console;
    public Object _injector;
    public Object _exceptionHandler;
    public Object _componentFactoryResolver;
    public Object _initStatus;
    public Object _testabilityRegistry;
    public Object _testability;
    public Object _bootstrapListeners;
    public Object _rootComponents;
    public Object _rootComponentTypes;
    public Object _views;
    public Object _runningTick;
    public Object _enforceNoNewChanges;
    @JsConstructor
    public ApplicationRef_(NgZone _zone,Console _console,Injector _injector,ErrorHandler _exceptionHandler,ComponentFactoryResolver _componentFactoryResolver,ApplicationInitStatus _initStatus,TestabilityRegistry _testabilityRegistry,Testability _testability) {}
    public native  void attachView(ViewRef viewRef);
    public native  void detachView(ViewRef viewRef);
    public native <C> ComponentRef<C> bootstrap(Object /* UnionType */ componentOrFactory);
    public native  void _loadComponent();
    public native  void _unloadComponent();
    public native  void tick();
    public native  void ngOnDestroy();
    public int viewCount;
    public JsArray<Type<Object>> componentTypes;
    public JsArray<ComponentRef<Object>> components;
}
