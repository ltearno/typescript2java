package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\scheduler\AsyncAction.d.ts
  * Package rxjs
  * Name AsyncAction
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class AsyncAction<T> extends Action<T> {
    public AsyncScheduler scheduler;
    public JsFunction2<AsyncAction<T>,T,Void> work;
    public Object id;
    public T state;
    public int delay;
    public boolean pending;
    @JsConstructor
    public AsyncAction(AsyncScheduler scheduler,JsFunction2<AsyncAction<T>,T,Void> work) {}
    public native  Subscription schedule(T /* optional */ state,int /* optional */ delay);
    public native  Object requestAsyncId(AsyncScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
    public native  Object recycleAsyncId(AsyncScheduler scheduler,Object id,int /* optional */ delay);
    public native  Object execute(T state,int delay);
    public native  Object _execute(T state,int delay);
    public native  void _unsubscribe();
}
