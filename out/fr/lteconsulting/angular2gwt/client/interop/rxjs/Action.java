package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import rxjs.Scheduler;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import rxjs.Action;
import jsinterop.annotations.JsConstructor;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\scheduler\Action.d.ts
  * Package rxjs
  * Name Action
  * A unit of work to be executed in a {@link Scheduler}. An action is typically
  * created from within a Scheduler and an RxJS user does not need to concern
  * themselves about creating and manipulating an Action.
  * 
  * ```ts
  * class Action<T> extends Subscription {
  *    new (scheduler: Scheduler, work: (state?: T) => void);
  *    schedule(state?: T, delay: number = 0): Subscription;
  * }
  * ```
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Action<T> extends Subscription {
    @JsConstructor
    public Action(Scheduler scheduler,JsFunction2<Action<T>,T,Void> work) {}
     Subscription schedule(T /* optional */ state,int /* optional */ delay);
}
