package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceTransport
  * Typescript fqn RTCIceTransport
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceTransport extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="component")
    String getComponent();

    @JsProperty(name="component")
    void setComponent(String value);

    @JsProperty(name="iceGatherer")
    RTCIceGatherer getIceGatherer();

    @JsProperty(name="iceGatherer")
    void setIceGatherer(RTCIceGatherer value);

    @JsProperty(name="oncandidatepairchange")
    JsFunction2<RTCIceTransport,RTCIceCandidatePairChangedEvent,Object> getOncandidatepairchange();

    @JsProperty(name="oncandidatepairchange")
    void setOncandidatepairchange(JsFunction2<RTCIceTransport,RTCIceCandidatePairChangedEvent,Object> value);

    @JsProperty(name="onicestatechange")
    JsFunction2<RTCIceTransport,RTCIceTransportStateChangedEvent,Object> getOnicestatechange();

    @JsProperty(name="onicestatechange")
    void setOnicestatechange(JsFunction2<RTCIceTransport,RTCIceTransportStateChangedEvent,Object> value);

    @JsProperty(name="role")
    String getRole();

    @JsProperty(name="role")
    void setRole(String value);

    @JsProperty(name="state")
    String getState();

    @JsProperty(name="state")
    void setState(String value);

    void addRemoteCandidate(Object /* UnionType */ remoteCandidate);

    RTCIceTransport createAssociatedTransport();

    Object /* UnionType */ getNominatedCandidatePair();

    JsArray<RTCIceCandidateDictionary> getRemoteCandidates();

    Object /* UnionType */ getRemoteParameters();

    void setRemoteCandidates(JsArray<RTCIceCandidateDictionary> remoteCandidates);

    void start(RTCIceGatherer gatherer, RTCIceParameters remoteParameters, String /* optional */ role);

    void stop();

    <K> void addEventListener(K type, JsFunction2<RTCIceTransport,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
