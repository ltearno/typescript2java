package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaStreamConstraints
  * Typescript fqn MediaStreamConstraints
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaStreamConstraints {
    /* optional property video*/    @JsProperty(name="video")
    Object /* Union type */ getVideo();

    @JsProperty(name="video")
    void setVideo(Object /* Union type */ value);

    /* optional property audio*/    @JsProperty(name="audio")
    Object /* Union type */ getAudio();

    @JsProperty(name="audio")
    void setAudio(Object /* Union type */ value);
}
