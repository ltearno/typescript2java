package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSUtilization
  * Typescript fqn MSUtilization
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSUtilization {
    /* optional property packets*/    @JsProperty(name="packets")
    Number getPackets();

    @JsProperty(name="packets")
    void setPackets(Number value);

    /* optional property bandwidthEstimation*/    @JsProperty(name="bandwidthEstimation")
    Number getBandwidthEstimation();

    @JsProperty(name="bandwidthEstimation")
    void setBandwidthEstimation(Number value);

    /* optional property bandwidthEstimationMin*/    @JsProperty(name="bandwidthEstimationMin")
    Number getBandwidthEstimationMin();

    @JsProperty(name="bandwidthEstimationMin")
    void setBandwidthEstimationMin(Number value);

    /* optional property bandwidthEstimationMax*/    @JsProperty(name="bandwidthEstimationMax")
    Number getBandwidthEstimationMax();

    @JsProperty(name="bandwidthEstimationMax")
    void setBandwidthEstimationMax(Number value);

    /* optional property bandwidthEstimationStdDev*/    @JsProperty(name="bandwidthEstimationStdDev")
    Number getBandwidthEstimationStdDev();

    @JsProperty(name="bandwidthEstimationStdDev")
    void setBandwidthEstimationStdDev(Number value);

    /* optional property bandwidthEstimationAvg*/    @JsProperty(name="bandwidthEstimationAvg")
    Number getBandwidthEstimationAvg();

    @JsProperty(name="bandwidthEstimationAvg")
    void setBandwidthEstimationAvg(Number value);
}
