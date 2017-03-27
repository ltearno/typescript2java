package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NavigatorUserMedia
  * Typescript fqn NavigatorUserMedia
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NavigatorUserMedia {
    @JsProperty(name="mediaDevices")
    MediaDevices getMediaDevices();

    @JsProperty(name="mediaDevices")
    void setMediaDevices(MediaDevices value);

    void getUserMedia(MediaStreamConstraints constraints, NavigatorUserMediaSuccessCallback successCallback, NavigatorUserMediaErrorCallback errorCallback);
}
