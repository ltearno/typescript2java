package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\core\testing\async_test_completer.d.ts
  * Package ng.core
  * Name AsyncTestCompleter
  * Injectable completer that allows signaling completion of an asynchronous test. Used internally.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AsyncTestCompleter  {
    public Object _resolve;
    public Object _reject;
    public Object _promise;
    public native  void done(Object /* optional */ value);
    public native  void fail(Object /* optional */ error,String /* optional */ stackTrace);
    public Promise<Object> promise;
}
