package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtpReceiver
  * Typescript fqn RTCRtpReceiver
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtpReceiver extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="onerror")
    JsFunction2<RTCRtpReceiver,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<RTCRtpReceiver,Event,Object> value);

    @JsProperty(name="rtcpTransport")
    RTCDtlsTransport getRtcpTransport();

    @JsProperty(name="rtcpTransport")
    void setRtcpTransport(RTCDtlsTransport value);

    @JsProperty(name="track")
    MediaStreamTrack getTrack();

    @JsProperty(name="track")
    void setTrack(MediaStreamTrack value);

    @JsProperty(name="transport")
    Object /* Union type */ getTransport();

    @JsProperty(name="transport")
    void setTransport(Object /* Union type */ value);

    JsArray<RTCRtpContributingSource> getContributingSources();

    void receive(RTCRtpParameters parameters);

    void requestSendCSRC(Number csrc);

    void setTransport(Object /* UnionType */ transport, RTCDtlsTransport /* optional */ rtcpTransport);

    void stop();

    <K> void addEventListener(K type, JsFunction2<RTCRtpReceiver,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
