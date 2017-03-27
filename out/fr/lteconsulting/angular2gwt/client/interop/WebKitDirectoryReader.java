package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WebKitDirectoryReader
  * Typescript fqn WebKitDirectoryReader
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WebKitDirectoryReader {
    void readEntries(WebKitEntriesCallback successCallback, WebKitErrorCallback /* optional */ errorCallback);
}
