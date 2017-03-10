package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.NgModuleFactory;
import ng.core.NgModuleRef;
import ng.core.Type;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.Injector;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\application_ref.d.ts
  * Package ng.core
  * Name PlatformRef
  * The Angular platform is the entry point for Angular on a web page. Each page
  * has exactly one platform, and services (such as reflection) which are common
  * to every Angular application running on the page are bound in its scope.
  * 
  * A page's platform is initialized implicitly when {@link bootstrap}() is called, or
  * explicitly by calling {@link createPlatform}().
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PlatformRef  {
    <M> Promise<NgModuleRef<M>> bootstrapModuleFactory(NgModuleFactory<M> moduleFactory);
    <M> Promise<NgModuleRef<M>> bootstrapModule(Type<M> moduleType,Object /* UnionType */ /* optional */ compilerOptions);
     void onDestroy(JsFunction<Void> callback);
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
     void destroy();
    @JsProperty(name="destroyed")
    boolean getDestroyed();
    @JsProperty(name="destroyed")
    void setDestroyed(boolean value);
}
