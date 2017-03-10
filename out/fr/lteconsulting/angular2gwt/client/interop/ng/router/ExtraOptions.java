package fr.lteconsulting.angular2gwt.client.interop.ng.router;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\router\src\router_module.d.ts
  * Package ng.router
  * Name ExtraOptions
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ExtraOptions  {
    /* optional property enableTracing*/    @JsProperty(name="enableTracing")
    boolean enableTracing();
    @JsProperty(name="enableTracing")
    void enableTracing(boolean value);
    /* optional property useHash*/    @JsProperty(name="useHash")
    boolean useHash();
    @JsProperty(name="useHash")
    void useHash(boolean value);
    /* optional property initialNavigation*/    @JsProperty(name="initialNavigation")
    boolean initialNavigation();
    @JsProperty(name="initialNavigation")
    void initialNavigation(boolean value);
    /* optional property errorHandler*/    @JsProperty(name="errorHandler")
    ErrorHandler errorHandler();
    @JsProperty(name="errorHandler")
    void errorHandler(ErrorHandler value);
    /* optional property preloadingStrategy*/    @JsProperty(name="preloadingStrategy")
    Object preloadingStrategy();
    @JsProperty(name="preloadingStrategy")
    void preloadingStrategy(Object value);
}
