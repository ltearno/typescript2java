package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.AsyncAction;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\rxjs\scheduler\AsyncScheduler.d.ts
  * Package rxjs
  * Name AsyncScheduler
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="AsyncScheduler" )
public class AsyncSchedulerImpl extends Scheduler {
    @JsProperty(name="actions")
    Array<AsyncAction<Object>> getActions();
    @JsProperty(name="actions")
    void setActions(Array<AsyncAction<Object>> value);
    @JsProperty(name="active")
    boolean getActive();
    @JsProperty(name="active")
    void setActive(boolean value);
    @JsProperty(name="scheduled")
    Object getScheduled();
    @JsProperty(name="scheduled")
    void setScheduled(Object value);
    public native  void flush(AsyncAction<Object> action);
}
