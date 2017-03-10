package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.Action;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\Scheduler.d.ts
  * Package rxjs
  * Name Scheduler
  * An execution context and a data structure to order tasks and schedule their
  * execution. Provides a notion of (potentially virtual) time, through the
  * `now()` getter method.
  * 
  * Each unit of work in a Scheduler is called an {@link Action}.
  * 
  * ```ts
  * class Scheduler {
  *    now(): number;
  *    schedule(work, delay?, state?): Subscription;
  * }
  * ```
  **/
@JsType( isNative=true, namespace="rxjs", name="Scheduler" )
public class SchedulerImpl extends IScheduler {
    @JsProperty(name="SchedulerAction")
    Object getSchedulerAction();
    @JsProperty(name="SchedulerAction")
    void setSchedulerAction(Object value);
    @JsProperty(name="now")
    static JsFunction<Integer> getNow();
    @JsProperty(name="now")
    static void setNow(JsFunction<Integer> value);
    @JsConstructor
    public SchedulerImpl(UNKNOWN_TYPE_NAME_TypeQuery SchedulerAction,JsFunction<Integer> /* optional */ now) {}
    @JsProperty(name="now")
    JsFunction<Integer> getNow();
    @JsProperty(name="now")
    void setNow(JsFunction<Integer> value);
    public native <T> Subscription schedule(JsFunction2<Action<T>,T,Void> work,int /* optional */ delay,T /* optional */ state);
}
