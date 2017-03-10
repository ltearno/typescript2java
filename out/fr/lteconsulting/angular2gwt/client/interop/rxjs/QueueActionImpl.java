package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.QueueScheduler;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.QueueAction;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\scheduler\QueueAction.d.ts
  * Package rxjs
  * Name QueueAction
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs", name="QueueAction" )
public class QueueActionImpl<T> extends AsyncAction<T> {
    @JsProperty(name="scheduler")
    QueueScheduler getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(QueueScheduler value);
    @JsProperty(name="work")
    JsFunction2<QueueAction<T>,T,Void> getWork();
    @JsProperty(name="work")
    void setWork(JsFunction2<QueueAction<T>,T,Void> value);
    @JsConstructor
    public QueueActionImpl(QueueScheduler scheduler,JsFunction2<QueueAction<T>,T,Void> work) {}
    public native  Subscription schedule(T /* optional */ state,int /* optional */ delay);
    public native  Object execute(T state,int delay);
    public native  Object requestAsyncId(QueueScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
}
