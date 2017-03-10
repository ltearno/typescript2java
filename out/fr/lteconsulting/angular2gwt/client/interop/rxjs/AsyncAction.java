package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.AsyncScheduler;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.AsyncAction;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\scheduler\AsyncAction.d.ts
  * Package rxjs
  * Name AsyncAction
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AsyncAction<T> extends Action<T> {
    @JsProperty(name="scheduler")
    AsyncScheduler getScheduler();
    @JsProperty(name="scheduler")
    void setScheduler(AsyncScheduler value);
    @JsProperty(name="work")
    JsFunction2<AsyncAction<T>,T,Void> getWork();
    @JsProperty(name="work")
    void setWork(JsFunction2<AsyncAction<T>,T,Void> value);
    @JsProperty(name="id")
    Object getId();
    @JsProperty(name="id")
    void setId(Object value);
    @JsProperty(name="state")
    T getState();
    @JsProperty(name="state")
    void setState(T value);
    @JsProperty(name="delay")
    int getDelay();
    @JsProperty(name="delay")
    void setDelay(int value);
    @JsProperty(name="pending")
    boolean getPending();
    @JsProperty(name="pending")
    void setPending(boolean value);
    @JsConstructor
    public AsyncAction(AsyncScheduler scheduler,JsFunction2<AsyncAction<T>,T,Void> work) {}
     Subscription schedule(T /* optional */ state,int /* optional */ delay);
     Object requestAsyncId(AsyncScheduler scheduler,Object /* optional */ id,int /* optional */ delay);
     Object recycleAsyncId(AsyncScheduler scheduler,Object id,int /* optional */ delay);
     Object execute(T state,int delay);
     Object _execute(T state,int delay);
     void _unsubscribe();
}
