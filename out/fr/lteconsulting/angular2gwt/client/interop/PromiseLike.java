package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PromiseLike
  * Typescript fqn PromiseLike
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PromiseLike<T> {
    /**
     * Attaches callbacks for the resolution and/or rejection of the Promise.
     */
    PromiseLike<T> then(Object /* UnionType */ /* optional */ onfulfilled, Object /* UnionType */ /* optional */ onrejected);

    /**
     * Attaches callbacks for the resolution and/or rejection of the Promise.
     */
    <TResult> PromiseLike<Object /* Union type */> then(Object /* UnionType */ onfulfilled, JsFunction1<Object,Object /* Union type */> onrejected);

    /**
     * Attaches callbacks for the resolution and/or rejection of the Promise.
     */
    <TResult> PromiseLike<TResult> then(JsFunction1<T,Object /* Union type */> onfulfilled, Object /* UnionType */ /* optional */ onrejected);

    /**
     * Attaches callbacks for the resolution and/or rejection of the Promise.
     */
    <TResult1,TResult2> PromiseLike<Object /* Union type */> then(JsFunction1<T,Object /* Union type */> onfulfilled, JsFunction1<Object,Object /* Union type */> onrejected);
}
