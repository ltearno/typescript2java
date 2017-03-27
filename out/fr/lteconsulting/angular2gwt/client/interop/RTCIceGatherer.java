package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceGatherer
  * Typescript fqn RTCIceGatherer
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceGatherer extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="component")
    String getComponent();

    @JsProperty(name="component")
    void setComponent(String value);

    @JsProperty(name="onerror")
    JsFunction2<RTCIceGatherer,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<RTCIceGatherer,Event,Object> value);

    @JsProperty(name="onlocalcandidate")
    JsFunction2<RTCIceGatherer,RTCIceGathererEvent,Object> getOnlocalcandidate();

    @JsProperty(name="onlocalcandidate")
    void setOnlocalcandidate(JsFunction2<RTCIceGatherer,RTCIceGathererEvent,Object> value);

    RTCIceGatherer createAssociatedGatherer();

    JsArray<RTCIceCandidateDictionary> getLocalCandidates();

    RTCIceParameters getLocalParameters();

    <K> void addEventListener(K type, JsFunction2<RTCIceGatherer,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
