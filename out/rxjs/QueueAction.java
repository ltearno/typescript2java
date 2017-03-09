package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\scheduler\QueueAction.d.ts
  * Package rxjs
  * Name QueueAction
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class QueueAction<T> extends AsyncAction<T> {
    public QueueScheduler scheduler;
    public JsFunction2<QueueAction<T>,T,Void> work;
    @JsConstructor
    public QueueAction(QueueScheduler scheduler,JsFunction2<QueueAction<T>,T,Void> work) {}
    public native  Subscription schedule(T /* optional */ state,int /* optional */ delay);
    public native  Object execute(T state,int delay);
    public native  Object requestAsyncId(QueueScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
}
