package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WindowTimersExtension
  * Typescript fqn WindowTimersExtension
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WindowTimersExtension {
    void clearImmediate(Number handle);

    Number setImmediate(JsFunction1<Array<Object>,Void> handler);

    Number setImmediate(Object handler, JsArray<Object> /* optional */ args);
}
