package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSBlobBuilder
  * Typescript fqn MSBlobBuilder
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSBlobBuilder {
    void append(Object data, String /* optional */ endings);

    Blob getBlob(String /* optional */ contentType);
}
