package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ExtensionScriptApis
  * Typescript fqn ExtensionScriptApis
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ExtensionScriptApis {
    Number extensionIdToShortId(String extensionId);

    void fireExtensionApiTelemetry(String functionName, boolean isSucceeded, boolean isSupported);

    void genericFunction(Object routerAddress, String /* optional */ parameters, Number /* optional */ callbackId);

    String genericSynchronousFunction(Number functionId, String /* optional */ parameters);

    String getExtensionId();

    void registerGenericFunctionCallbackHandler(Object callbackHandler);

    void registerGenericPersistentCallbackHandler(Object callbackHandler);
}
