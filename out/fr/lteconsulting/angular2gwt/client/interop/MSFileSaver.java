package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSFileSaver
  * Typescript fqn MSFileSaver
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSFileSaver {
    boolean msSaveBlob(Object blob, String /* optional */ defaultName);

    boolean msSaveOrOpenBlob(Object blob, String /* optional */ defaultName);
}
