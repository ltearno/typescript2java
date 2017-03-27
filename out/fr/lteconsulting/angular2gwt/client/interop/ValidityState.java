package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ValidityState
  * Typescript fqn ValidityState
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ValidityState {
    @JsProperty(name="badInput")
    boolean getBadInput();

    @JsProperty(name="badInput")
    void setBadInput(boolean value);

    @JsProperty(name="customError")
    boolean getCustomError();

    @JsProperty(name="customError")
    void setCustomError(boolean value);

    @JsProperty(name="patternMismatch")
    boolean getPatternMismatch();

    @JsProperty(name="patternMismatch")
    void setPatternMismatch(boolean value);

    @JsProperty(name="rangeOverflow")
    boolean getRangeOverflow();

    @JsProperty(name="rangeOverflow")
    void setRangeOverflow(boolean value);

    @JsProperty(name="rangeUnderflow")
    boolean getRangeUnderflow();

    @JsProperty(name="rangeUnderflow")
    void setRangeUnderflow(boolean value);

    @JsProperty(name="stepMismatch")
    boolean getStepMismatch();

    @JsProperty(name="stepMismatch")
    void setStepMismatch(boolean value);

    @JsProperty(name="tooLong")
    boolean getTooLong();

    @JsProperty(name="tooLong")
    void setTooLong(boolean value);

    @JsProperty(name="typeMismatch")
    boolean getTypeMismatch();

    @JsProperty(name="typeMismatch")
    void setTypeMismatch(boolean value);

    @JsProperty(name="valid")
    boolean getValid();

    @JsProperty(name="valid")
    void setValid(boolean value);

    @JsProperty(name="valueMissing")
    boolean getValueMissing();

    @JsProperty(name="valueMissing")
    void setValueMissing(boolean value);
}
