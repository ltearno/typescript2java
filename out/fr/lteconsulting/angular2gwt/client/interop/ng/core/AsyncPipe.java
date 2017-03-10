package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ChangeDetectorRef;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\pipes\async_pipe.d.ts
  * Package ng.core
  * Name AsyncPipe
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AsyncPipe extends OnDestroy {
    @JsProperty(name="_ref")
    Object get_ref();
    @JsProperty(name="_ref")
    void set_ref(Object value);
    @JsProperty(name="_latestValue")
    Object get_latestValue();
    @JsProperty(name="_latestValue")
    void set_latestValue(Object value);
    @JsProperty(name="_latestReturnedValue")
    Object get_latestReturnedValue();
    @JsProperty(name="_latestReturnedValue")
    void set_latestReturnedValue(Object value);
    @JsProperty(name="_subscription")
    Object get_subscription();
    @JsProperty(name="_subscription")
    void set_subscription(Object value);
    @JsProperty(name="_obj")
    Object get_obj();
    @JsProperty(name="_obj")
    void set_obj(Object value);
    @JsProperty(name="_strategy")
    Object get_strategy();
    @JsProperty(name="_strategy")
    void set_strategy(Object value);
    @JsConstructor
    public AsyncPipe(ChangeDetectorRef _ref) {}
     void ngOnDestroy();
     Object transform(Object /* UnionType */ obj);
     void _subscribe();
     void _selectStrategy();
     void _dispose();
     void _updateLatestValue();
}
