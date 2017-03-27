package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCRtpEncodingParameters
  * Typescript fqn RTCRtpEncodingParameters
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCRtpEncodingParameters {
    /* optional property ssrc*/    @JsProperty(name="ssrc")
    Number getSsrc();

    @JsProperty(name="ssrc")
    void setSsrc(Number value);

    /* optional property codecPayloadType*/    @JsProperty(name="codecPayloadType")
    Number getCodecPayloadType();

    @JsProperty(name="codecPayloadType")
    void setCodecPayloadType(Number value);

    /* optional property fec*/    @JsProperty(name="fec")
    RTCRtpFecParameters getFec();

    @JsProperty(name="fec")
    void setFec(RTCRtpFecParameters value);

    /* optional property rtx*/    @JsProperty(name="rtx")
    RTCRtpRtxParameters getRtx();

    @JsProperty(name="rtx")
    void setRtx(RTCRtpRtxParameters value);

    /* optional property priority*/    @JsProperty(name="priority")
    Number getPriority();

    @JsProperty(name="priority")
    void setPriority(Number value);

    /* optional property maxBitrate*/    @JsProperty(name="maxBitrate")
    Number getMaxBitrate();

    @JsProperty(name="maxBitrate")
    void setMaxBitrate(Number value);

    /* optional property minQuality*/    @JsProperty(name="minQuality")
    Number getMinQuality();

    @JsProperty(name="minQuality")
    void setMinQuality(Number value);

    /* optional property resolutionScale*/    @JsProperty(name="resolutionScale")
    Number getResolutionScale();

    @JsProperty(name="resolutionScale")
    void setResolutionScale(Number value);

    /* optional property framerateScale*/    @JsProperty(name="framerateScale")
    Number getFramerateScale();

    @JsProperty(name="framerateScale")
    void setFramerateScale(Number value);

    /* optional property maxFramerate*/    @JsProperty(name="maxFramerate")
    Number getMaxFramerate();

    @JsProperty(name="maxFramerate")
    void setMaxFramerate(Number value);

    /* optional property active*/    @JsProperty(name="active")
    boolean getActive();

    @JsProperty(name="active")
    void setActive(boolean value);

    /* optional property encodingId*/    @JsProperty(name="encodingId")
    String getEncodingId();

    @JsProperty(name="encodingId")
    void setEncodingId(String value);

    /* optional property dependencyEncodingIds*/    @JsProperty(name="dependencyEncodingIds")
    Array<String> getDependencyEncodingIds();

    @JsProperty(name="dependencyEncodingIds")
    void setDependencyEncodingIds(Array<String> value);

    /* optional property ssrcRange*/    @JsProperty(name="ssrcRange")
    RTCSsrcRange getSsrcRange();

    @JsProperty(name="ssrcRange")
    void setSsrcRange(RTCSsrcRange value);
}
