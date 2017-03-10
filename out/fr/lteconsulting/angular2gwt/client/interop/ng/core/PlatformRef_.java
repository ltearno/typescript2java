package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Injector;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.NgModuleFactory;
import ng.core.NgModuleRef;
import ng.core.Type;

/**
  * Generated from tests\@angular\core\src\application_ref.d.ts
  * Package ng.core
  * Name PlatformRef_
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PlatformRef_ extends PlatformRef {
    @JsProperty(name="_injector")
    Object get_injector();
    @JsProperty(name="_injector")
    void set_injector(Object value);
    @JsProperty(name="_modules")
    Object get_modules();
    @JsProperty(name="_modules")
    void set_modules(Object value);
    @JsProperty(name="_destroyListeners")
    Object get_destroyListeners();
    @JsProperty(name="_destroyListeners")
    void set_destroyListeners(Object value);
    @JsProperty(name="_destroyed")
    Object get_destroyed();
    @JsProperty(name="_destroyed")
    void set_destroyed(Object value);
    @JsConstructor
    public PlatformRef_(Injector _injector) {}
     void onDestroy(JsFunction<Void> callback);
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    @JsProperty(name="destroyed")
    boolean getDestroyed();
    @JsProperty(name="destroyed")
    void setDestroyed(boolean value);
     void destroy();
    <M> Promise<NgModuleRef<M>> bootstrapModuleFactory(NgModuleFactory<M> moduleFactory);
    <M> void _bootstrapModuleFactoryWithZone();
    <M> Promise<NgModuleRef<M>> bootstrapModule(Type<M> moduleType,Object /* UnionType */ /* optional */ compilerOptions);
    <M> void _bootstrapModuleWithZone(UNKNOWN_TYPE_NAME_QuestionToken componentFactoryCallback);
     void _moduleDoBootstrap();
}
