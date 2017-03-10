package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.NgZone;
import ng.core.Console;
import ng.core.Injector;
import ng.core.ErrorHandler;
import ng.core.ComponentFactoryResolver;
import ng.core.ApplicationInitStatus;
import ng.core.TestabilityRegistry;
import ng.core.Testability;
import jsinterop.annotations.JsConstructor;
import ng.core.ViewRef;
import ng.core.ComponentRef;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Type;

/**
  * Generated from tests\@angular\core\src\application_ref.d.ts
  * Package ng.core
  * Name ApplicationRef_
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ApplicationRef_" )
public class ApplicationRef_Impl extends ApplicationRef {
    @JsProperty(name="_zone")
    Object get_zone();
    @JsProperty(name="_zone")
    void set_zone(Object value);
    @JsProperty(name="_console")
    Object get_console();
    @JsProperty(name="_console")
    void set_console(Object value);
    @JsProperty(name="_injector")
    Object get_injector();
    @JsProperty(name="_injector")
    void set_injector(Object value);
    @JsProperty(name="_exceptionHandler")
    Object get_exceptionHandler();
    @JsProperty(name="_exceptionHandler")
    void set_exceptionHandler(Object value);
    @JsProperty(name="_componentFactoryResolver")
    Object get_componentFactoryResolver();
    @JsProperty(name="_componentFactoryResolver")
    void set_componentFactoryResolver(Object value);
    @JsProperty(name="_initStatus")
    Object get_initStatus();
    @JsProperty(name="_initStatus")
    void set_initStatus(Object value);
    @JsProperty(name="_testabilityRegistry")
    Object get_testabilityRegistry();
    @JsProperty(name="_testabilityRegistry")
    void set_testabilityRegistry(Object value);
    @JsProperty(name="_testability")
    Object get_testability();
    @JsProperty(name="_testability")
    void set_testability(Object value);
    @JsProperty(name="_bootstrapListeners")
    Object get_bootstrapListeners();
    @JsProperty(name="_bootstrapListeners")
    void set_bootstrapListeners(Object value);
    @JsProperty(name="_rootComponents")
    Object get_rootComponents();
    @JsProperty(name="_rootComponents")
    void set_rootComponents(Object value);
    @JsProperty(name="_rootComponentTypes")
    Object get_rootComponentTypes();
    @JsProperty(name="_rootComponentTypes")
    void set_rootComponentTypes(Object value);
    @JsProperty(name="_views")
    Object get_views();
    @JsProperty(name="_views")
    void set_views(Object value);
    @JsProperty(name="_runningTick")
    Object get_runningTick();
    @JsProperty(name="_runningTick")
    void set_runningTick(Object value);
    @JsProperty(name="_enforceNoNewChanges")
    Object get_enforceNoNewChanges();
    @JsProperty(name="_enforceNoNewChanges")
    void set_enforceNoNewChanges(Object value);
    @JsConstructor
    public ApplicationRef_Impl(NgZone _zone,Console _console,Injector _injector,ErrorHandler _exceptionHandler,ComponentFactoryResolver _componentFactoryResolver,ApplicationInitStatus _initStatus,TestabilityRegistry _testabilityRegistry,Testability _testability) {}
    public native  void attachView(ViewRef viewRef);
    public native  void detachView(ViewRef viewRef);
    public native <C> ComponentRef<C> bootstrap(Object /* UnionType */ componentOrFactory);
    public native  void _loadComponent();
    public native  void _unloadComponent();
    public native  void tick();
    public native  void ngOnDestroy();
    @JsProperty(name="viewCount")
    int getViewCount();
    @JsProperty(name="viewCount")
    void setViewCount(int value);
    @JsProperty(name="componentTypes")
    JsArray<Type<Object>> getComponentTypes();
    @JsProperty(name="componentTypes")
    void setComponentTypes(JsArray<Type<Object>> value);
    @JsProperty(name="components")
    JsArray<ComponentRef<Object>> getComponents();
    @JsProperty(name="components")
    void setComponents(JsArray<ComponentRef<Object>> value);
}
