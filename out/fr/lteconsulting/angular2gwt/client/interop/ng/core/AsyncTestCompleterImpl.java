package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\testing\async_test_completer.d.ts
  * Package ng.core
  * Name AsyncTestCompleter
  * Injectable completer that allows signaling completion of an asynchronous test. Used internally.
  **/
@JsType( isNative=true, namespace="ng.core", name="AsyncTestCompleter" )
public class AsyncTestCompleterImpl  {
    @JsProperty(name="_resolve")
    Object get_resolve();
    @JsProperty(name="_resolve")
    void set_resolve(Object value);
    @JsProperty(name="_reject")
    Object get_reject();
    @JsProperty(name="_reject")
    void set_reject(Object value);
    @JsProperty(name="_promise")
    Object get_promise();
    @JsProperty(name="_promise")
    void set_promise(Object value);
    public native  void done(Object /* optional */ value);
    public native  void fail(Object /* optional */ error,String /* optional */ stackTrace);
    @JsProperty(name="promise")
    Promise<Object> getPromise();
    @JsProperty(name="promise")
    void setPromise(Promise<Object> value);
}
