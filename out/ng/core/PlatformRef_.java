package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\core\src\application_ref.d.ts
  * Package ng.core
  * Name PlatformRef_
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class PlatformRef_ extends PlatformRef {
    public Object _injector;
    public Object _modules;
    public Object _destroyListeners;
    public Object _destroyed;
    @JsConstructor
    public PlatformRef_(Injector _injector) {}
    public native  void onDestroy(JsFunction<Void> callback);
    public Injector injector;
    public boolean destroyed;
    public native  void destroy();
    public native <M> Promise<NgModuleRef<M>> bootstrapModuleFactory(NgModuleFactory<M> moduleFactory);
    public native <M> void _bootstrapModuleFactoryWithZone();
    public native <M> Promise<NgModuleRef<M>> bootstrapModule(Type<M> moduleType,Object /* UnionType */ /* optional */ compilerOptions);
    public native <M> void _bootstrapModuleWithZone(UNKNOWN_TYPE_NAME_QuestionToken componentFactoryCallback);
    public native  void _moduleDoBootstrap();
}
