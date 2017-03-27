package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Account
  * Typescript fqn Account
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Account {
    /* optional property rpDisplayName*/    @JsProperty(name="rpDisplayName")
    String getRpDisplayName();

    @JsProperty(name="rpDisplayName")
    void setRpDisplayName(String value);

    /* optional property displayName*/    @JsProperty(name="displayName")
    String getDisplayName();

    @JsProperty(name="displayName")
    void setDisplayName(String value);

    /* optional property id*/    @JsProperty(name="id")
    String getId();

    @JsProperty(name="id")
    void setId(String value);

    /* optional property name*/    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    /* optional property imageURL*/    @JsProperty(name="imageURL")
    String getImageURL();

    @JsProperty(name="imageURL")
    void setImageURL(String value);
}
