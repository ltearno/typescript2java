package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSPacketLoss
  * Typescript fqn MSPacketLoss
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSPacketLoss {
    /* optional property lossRate*/    @JsProperty(name="lossRate")
    Number getLossRate();

    @JsProperty(name="lossRate")
    void setLossRate(Number value);

    /* optional property lossRateMax*/    @JsProperty(name="lossRateMax")
    Number getLossRateMax();

    @JsProperty(name="lossRateMax")
    void setLossRateMax(Number value);
}
