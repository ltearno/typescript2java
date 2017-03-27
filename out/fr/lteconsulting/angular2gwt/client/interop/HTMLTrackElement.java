package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLTrackElement
  * Typescript fqn HTMLTrackElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLTrackElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="default")
    boolean getDefault();

    @JsProperty(name="default")
    void setDefault(boolean value);

    @JsProperty(name="kind")
    String getKind();

    @JsProperty(name="kind")
    void setKind(String value);

    @JsProperty(name="label")
    String getLabel();

    @JsProperty(name="label")
    void setLabel(String value);

    @JsProperty(name="readyState")
    Number getReadyState();

    @JsProperty(name="readyState")
    void setReadyState(Number value);

    @JsProperty(name="src")
    String getSrc();

    @JsProperty(name="src")
    void setSrc(String value);

    @JsProperty(name="srclang")
    String getSrclang();

    @JsProperty(name="srclang")
    void setSrclang(String value);

    @JsProperty(name="track")
    TextTrack getTrack();

    @JsProperty(name="track")
    void setTrack(TextTrack value);

    @JsProperty(name="ERROR")
    Number getERROR();

    @JsProperty(name="ERROR")
    void setERROR(Number value);

    @JsProperty(name="LOADED")
    Number getLOADED();

    @JsProperty(name="LOADED")
    void setLOADED(Number value);

    @JsProperty(name="LOADING")
    Number getLOADING();

    @JsProperty(name="LOADING")
    void setLOADING(Number value);

    @JsProperty(name="NONE")
    Number getNONE();

    @JsProperty(name="NONE")
    void setNONE(Number value);

    <K> void addEventListener(K type, JsFunction2<HTMLTrackElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
