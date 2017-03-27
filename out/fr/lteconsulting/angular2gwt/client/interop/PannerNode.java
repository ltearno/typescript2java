package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PannerNode
  * Typescript fqn PannerNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PannerNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="coneInnerAngle")
    Number getConeInnerAngle();

    @JsProperty(name="coneInnerAngle")
    void setConeInnerAngle(Number value);

    @JsProperty(name="coneOuterAngle")
    Number getConeOuterAngle();

    @JsProperty(name="coneOuterAngle")
    void setConeOuterAngle(Number value);

    @JsProperty(name="coneOuterGain")
    Number getConeOuterGain();

    @JsProperty(name="coneOuterGain")
    void setConeOuterGain(Number value);

    @JsProperty(name="distanceModel")
    String getDistanceModel();

    @JsProperty(name="distanceModel")
    void setDistanceModel(String value);

    @JsProperty(name="maxDistance")
    Number getMaxDistance();

    @JsProperty(name="maxDistance")
    void setMaxDistance(Number value);

    @JsProperty(name="panningModel")
    String getPanningModel();

    @JsProperty(name="panningModel")
    void setPanningModel(String value);

    @JsProperty(name="refDistance")
    Number getRefDistance();

    @JsProperty(name="refDistance")
    void setRefDistance(Number value);

    @JsProperty(name="rolloffFactor")
    Number getRolloffFactor();

    @JsProperty(name="rolloffFactor")
    void setRolloffFactor(Number value);

    void setOrientation(Number x, Number y, Number z);

    void setPosition(Number x, Number y, Number z);

    void setVelocity(Number x, Number y, Number z);
}
