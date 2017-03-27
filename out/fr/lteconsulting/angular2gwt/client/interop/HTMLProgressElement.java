package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLProgressElement
  * Typescript fqn HTMLProgressElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLProgressElement extends Object /* no JavaNode for symbol */ {
    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JsProperty(name="form")
    HTMLFormElement getForm();

    /**
     * Retrieves a reference to the form that the object is embedded in.
     */
    @JsProperty(name="form")
    void setForm(HTMLFormElement value);

    /**
     * Defines the maximum, or "done" value for a progress element.
     */
    @JsProperty(name="max")
    Number getMax();

    /**
     * Defines the maximum, or "done" value for a progress element.
     */
    @JsProperty(name="max")
    void setMax(Number value);

    /**
     * Returns the quotient of value/max when the value attribute is set (determinate progress bar), or -1 when the value attribute is missing (indeterminate progress bar).
     */
    @JsProperty(name="position")
    Number getPosition();

    /**
     * Returns the quotient of value/max when the value attribute is set (determinate progress bar), or -1 when the value attribute is missing (indeterminate progress bar).
     */
    @JsProperty(name="position")
    void setPosition(Number value);

    /**
     * Sets or gets the current value of a progress element. The value must be a non-negative number between 0 and the max value.
     */
    @JsProperty(name="value")
    Number getValue();

    /**
     * Sets or gets the current value of a progress element. The value must be a non-negative number between 0 and the max value.
     */
    @JsProperty(name="value")
    void setValue(Number value);

    <K> void addEventListener(K type, JsFunction2<HTMLProgressElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
