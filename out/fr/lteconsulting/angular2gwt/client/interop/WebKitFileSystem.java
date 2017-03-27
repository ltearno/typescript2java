package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WebKitFileSystem
  * Typescript fqn WebKitFileSystem
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WebKitFileSystem {
    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="root")
    WebKitDirectoryEntry getRoot();

    @JsProperty(name="root")
    void setRoot(WebKitDirectoryEntry value);
}
