package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSJitter
  * Typescript fqn MSJitter
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSJitter {
    /* optional property interArrival*/    @JsProperty(name="interArrival")
    Number getInterArrival();

    @JsProperty(name="interArrival")
    void setInterArrival(Number value);

    /* optional property interArrivalMax*/    @JsProperty(name="interArrivalMax")
    Number getInterArrivalMax();

    @JsProperty(name="interArrivalMax")
    void setInterArrivalMax(Number value);

    /* optional property interArrivalSD*/    @JsProperty(name="interArrivalSD")
    Number getInterArrivalSD();

    @JsProperty(name="interArrivalSD")
    void setInterArrivalSD(Number value);
}
