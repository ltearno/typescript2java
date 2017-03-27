package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name AudioListener
  * Typescript fqn AudioListener
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface AudioListener {
    @JsProperty(name="dopplerFactor")
    Number getDopplerFactor();

    @JsProperty(name="dopplerFactor")
    void setDopplerFactor(Number value);

    @JsProperty(name="speedOfSound")
    Number getSpeedOfSound();

    @JsProperty(name="speedOfSound")
    void setSpeedOfSound(Number value);

    void setOrientation(Number x, Number y, Number z, Number xUp, Number yUp, Number zUp);

    void setPosition(Number x, Number y, Number z);

    void setVelocity(Number x, Number y, Number z);
}
