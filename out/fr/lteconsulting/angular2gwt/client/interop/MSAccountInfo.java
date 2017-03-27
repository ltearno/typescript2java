package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSAccountInfo
  * Typescript fqn MSAccountInfo
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSAccountInfo {
    /* optional property rpDisplayName*/    @JsProperty(name="rpDisplayName")
    String getRpDisplayName();

    @JsProperty(name="rpDisplayName")
    void setRpDisplayName(String value);

    /* optional property userDisplayName*/    @JsProperty(name="userDisplayName")
    String getUserDisplayName();

    @JsProperty(name="userDisplayName")
    void setUserDisplayName(String value);

    /* optional property accountName*/    @JsProperty(name="accountName")
    String getAccountName();

    @JsProperty(name="accountName")
    void setAccountName(String value);

    /* optional property userId*/    @JsProperty(name="userId")
    String getUserId();

    @JsProperty(name="userId")
    void setUserId(String value);

    /* optional property accountImageUri*/    @JsProperty(name="accountImageUri")
    String getAccountImageUri();

    @JsProperty(name="accountImageUri")
    void setAccountImageUri(String value);
}
