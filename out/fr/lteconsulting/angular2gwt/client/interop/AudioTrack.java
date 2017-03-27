package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AudioTrack
  * Typescript fqn AudioTrack
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AudioTrack {
    @JsProperty(name="enabled")
    boolean getEnabled();

    @JsProperty(name="enabled")
    void setEnabled(boolean value);

    @JsProperty(name="id")
    String getId();

    @JsProperty(name="id")
    void setId(String value);

    @JsProperty(name="kind")
    String getKind();

    @JsProperty(name="kind")
    void setKind(String value);

    @JsProperty(name="label")
    String getLabel();

    @JsProperty(name="label")
    void setLabel(String value);

    @JsProperty(name="language")
    String getLanguage();

    @JsProperty(name="language")
    void setLanguage(String value);

    @JsProperty(name="sourceBuffer")
    SourceBuffer getSourceBuffer();

    @JsProperty(name="sourceBuffer")
    void setSourceBuffer(SourceBuffer value);
}
