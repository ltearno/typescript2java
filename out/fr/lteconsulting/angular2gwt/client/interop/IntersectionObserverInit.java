package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IntersectionObserverInit
  * Typescript fqn IntersectionObserverInit
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IntersectionObserverInit {
    /* optional property root*/    @JsProperty(name="root")
    Element getRoot();

    @JsProperty(name="root")
    void setRoot(Element value);

    /* optional property rootMargin*/    @JsProperty(name="rootMargin")
    String getRootMargin();

    @JsProperty(name="rootMargin")
    void setRootMargin(String value);

    /* optional property threshold*/    @JsProperty(name="threshold")
    Object /* Union type */ getThreshold();

    @JsProperty(name="threshold")
    void setThreshold(Object /* Union type */ value);
}
