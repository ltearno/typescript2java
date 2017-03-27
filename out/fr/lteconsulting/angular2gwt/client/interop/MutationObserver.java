package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MutationObserver
  * Typescript fqn MutationObserver
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MutationObserver {
    void disconnect();

    void observe(Node target, MutationObserverInit options);

    JsArray<MutationRecord> takeRecords();
}
