package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name IntersectionObserver
  * Typescript fqn IntersectionObserver
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IntersectionObserver {
    @JsProperty(name="root")
    Element getRoot();

    @JsProperty(name="root")
    void setRoot(Element value);

    @JsProperty(name="rootMargin")
    String getRootMargin();

    @JsProperty(name="rootMargin")
    void setRootMargin(String value);

    @JsProperty(name="thresholds")
    Array<Number> getThresholds();

    @JsProperty(name="thresholds")
    void setThresholds(Array<Number> value);

    void disconnect();

    void observe(Element target);

    JsArray<IntersectionObserverEntry> takeRecords();

    void unobserve(Element target);
}
