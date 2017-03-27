package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NotificationOptions
  * Typescript fqn NotificationOptions
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NotificationOptions {
    /* optional property dir*/    @JsProperty(name="dir")
    String getDir();

    @JsProperty(name="dir")
    void setDir(String value);

    /* optional property lang*/    @JsProperty(name="lang")
    String getLang();

    @JsProperty(name="lang")
    void setLang(String value);

    /* optional property body*/    @JsProperty(name="body")
    String getBody();

    @JsProperty(name="body")
    void setBody(String value);

    /* optional property tag*/    @JsProperty(name="tag")
    String getTag();

    @JsProperty(name="tag")
    void setTag(String value);

    /* optional property icon*/    @JsProperty(name="icon")
    String getIcon();

    @JsProperty(name="icon")
    void setIcon(String value);
}
