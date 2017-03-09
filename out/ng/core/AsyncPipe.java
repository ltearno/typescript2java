package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\pipes\async_pipe.d.ts
  * Package ng.core
  * Name AsyncPipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AsyncPipe extends OnDestroy {
    public Object _ref;
    public Object _latestValue;
    public Object _latestReturnedValue;
    public Object _subscription;
    public Object _obj;
    public Object _strategy;
    @JsConstructor
    public AsyncPipe(ChangeDetectorRef _ref) {}
    public native  void ngOnDestroy();
    public native  Object transform(Object /* UnionType */ obj);
    public native  void _subscribe();
    public native  void _selectStrategy();
    public native  void _dispose();
    public native  void _updateLatestValue();
}
