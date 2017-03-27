package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name File
  * Typescript fqn File
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface File extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="lastModifiedDate")
    Object getLastModifiedDate();

    @JsProperty(name="lastModifiedDate")
    void setLastModifiedDate(Object value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="webkitRelativePath")
    String getWebkitRelativePath();

    @JsProperty(name="webkitRelativePath")
    void setWebkitRelativePath(String value);
}
