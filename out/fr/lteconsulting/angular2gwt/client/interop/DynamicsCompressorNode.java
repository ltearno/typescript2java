package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name DynamicsCompressorNode
  * Typescript fqn DynamicsCompressorNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface DynamicsCompressorNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="attack")
    AudioParam getAttack();

    @JsProperty(name="attack")
    void setAttack(AudioParam value);

    @JsProperty(name="knee")
    AudioParam getKnee();

    @JsProperty(name="knee")
    void setKnee(AudioParam value);

    @JsProperty(name="ratio")
    AudioParam getRatio();

    @JsProperty(name="ratio")
    void setRatio(AudioParam value);

    @JsProperty(name="reduction")
    Number getReduction();

    @JsProperty(name="reduction")
    void setReduction(Number value);

    @JsProperty(name="release")
    AudioParam getRelease();

    @JsProperty(name="release")
    void setRelease(AudioParam value);

    @JsProperty(name="threshold")
    AudioParam getThreshold();

    @JsProperty(name="threshold")
    void setThreshold(AudioParam value);
}
