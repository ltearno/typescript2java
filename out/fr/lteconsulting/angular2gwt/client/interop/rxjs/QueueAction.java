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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface QueueAction<T> extends AsyncAction<T> {
    @JsProperty(name="scheduler")
    QueueScheduler getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(QueueScheduler value);
    @JsProperty(name="work")
    JsFunction2<QueueAction<T>,T,Void> getWork();
    @JsProperty(name="work")
    void setWork(JsFunction2<QueueAction<T>,T,Void> value);
    @JsConstructor
    public QueueAction(QueueScheduler scheduler,JsFunction2<QueueAction<T>,T,Void> work) {}
     Subscription schedule(T /* optional */ state,int /* optional */ delay);
     Object execute(T state,int delay);
     Object requestAsyncId(QueueScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
}
