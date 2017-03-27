package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaSource
  * Typescript fqn MediaSource
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaSource extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="activeSourceBuffers")
    SourceBufferList getActiveSourceBuffers();

    @JsProperty(name="activeSourceBuffers")
    void setActiveSourceBuffers(SourceBufferList value);

    @JsProperty(name="duration")
    Number getDuration();

    @JsProperty(name="duration")
    void setDuration(Number value);

    @JsProperty(name="readyState")
    String getReadyState();

    @JsProperty(name="readyState")
    void setReadyState(String value);

    @JsProperty(name="sourceBuffers")
    SourceBufferList getSourceBuffers();

    @JsProperty(name="sourceBuffers")
    void setSourceBuffers(SourceBufferList value);

    SourceBuffer addSourceBuffer(String type);

    void endOfStream(Number /* optional */ error);

    void removeSourceBuffer(SourceBuffer sourceBuffer);
}
