package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name VideoTrack
  * Typescript fqn VideoTrack
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface VideoTrack {
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

    @JsProperty(name="selected")
    boolean getSelected();

    @JsProperty(name="selected")
    void setSelected(boolean value);

    @JsProperty(name="sourceBuffer")
    SourceBuffer getSourceBuffer();

    @JsProperty(name="sourceBuffer")
    void setSourceBuffer(SourceBuffer value);
}
