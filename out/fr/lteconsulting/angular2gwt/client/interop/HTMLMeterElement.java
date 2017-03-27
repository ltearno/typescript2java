package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLMeterElement
  * Typescript fqn HTMLMeterElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLMeterElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="high")
    Number getHigh();

    @JsProperty(name="high")
    void setHigh(Number value);

    @JsProperty(name="low")
    Number getLow();

    @JsProperty(name="low")
    void setLow(Number value);

    @JsProperty(name="max")
    Number getMax();

    @JsProperty(name="max")
    void setMax(Number value);

    @JsProperty(name="min")
    Number getMin();

    @JsProperty(name="min")
    void setMin(Number value);

    @JsProperty(name="optimum")
    Number getOptimum();

    @JsProperty(name="optimum")
    void setOptimum(Number value);

    @JsProperty(name="value")
    Number getValue();

    @JsProperty(name="value")
    void setValue(Number value);

    <K> void addEventListener(K type, JsFunction2<HTMLMeterElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
