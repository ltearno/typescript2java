package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ProxyHandler
  * Typescript fqn ProxyHandler
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ProxyHandler<T> {
    /* optional */ Object /* UnionType */ getPrototypeOf(T target);

    /* optional */ boolean setPrototypeOf(T target, Object v);

    /* optional */ boolean isExtensible(T target);

    /* optional */ boolean preventExtensions(T target);

    /* optional */ PropertyDescriptor getOwnPropertyDescriptor(T target, Object /* Union type */ p);

    /* optional */ boolean has(T target, Object /* Union type */ p);

    /* optional */ Object get(T target, Object /* Union type */ p, Object receiver);

    /* optional */ boolean set(T target, Object /* Union type */ p, Object value, Object receiver);

    /* optional */ boolean deleteProperty(T target, Object /* Union type */ p);

    /* optional */ boolean defineProperty(T target, Object /* Union type */ p, PropertyDescriptor attributes);

    /* optional */ JsArray<Object /* Union type */> enumerate(T target);

    /* optional */ JsArray<Object /* Union type */> ownKeys(T target);

    /* optional */ Object apply(T target, Object thisArg, Object /* optional */ argArray);

    /* optional */ void construct(T target, Object argArray, Object /* optional */ newTarget);
}
