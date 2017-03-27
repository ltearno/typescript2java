package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaTrackSettings
  * Typescript fqn MediaTrackSettings
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaTrackSettings {
    /* optional property width*/    @JsProperty(name="width")
    Number getWidth();

    @JsProperty(name="width")
    void setWidth(Number value);

    /* optional property height*/    @JsProperty(name="height")
    Number getHeight();

    @JsProperty(name="height")
    void setHeight(Number value);

    /* optional property aspectRatio*/    @JsProperty(name="aspectRatio")
    Number getAspectRatio();

    @JsProperty(name="aspectRatio")
    void setAspectRatio(Number value);

    /* optional property frameRate*/    @JsProperty(name="frameRate")
    Number getFrameRate();

    @JsProperty(name="frameRate")
    void setFrameRate(Number value);

    /* optional property facingMode*/    @JsProperty(name="facingMode")
    String getFacingMode();

    @JsProperty(name="facingMode")
    void setFacingMode(String value);

    /* optional property volume*/    @JsProperty(name="volume")
    Number getVolume();

    @JsProperty(name="volume")
    void setVolume(Number value);

    /* optional property sampleRate*/    @JsProperty(name="sampleRate")
    Number getSampleRate();

    @JsProperty(name="sampleRate")
    void setSampleRate(Number value);

    /* optional property sampleSize*/    @JsProperty(name="sampleSize")
    Number getSampleSize();

    @JsProperty(name="sampleSize")
    void setSampleSize(Number value);

    /* optional property echoCancellation*/    @JsProperty(name="echoCancellation")
    boolean getEchoCancellation();

    @JsProperty(name="echoCancellation")
    void setEchoCancellation(boolean value);

    /* optional property deviceId*/    @JsProperty(name="deviceId")
    String getDeviceId();

    @JsProperty(name="deviceId")
    void setDeviceId(String value);

    /* optional property groupId*/    @JsProperty(name="groupId")
    String getGroupId();

    @JsProperty(name="groupId")
    void setGroupId(String value);
}
