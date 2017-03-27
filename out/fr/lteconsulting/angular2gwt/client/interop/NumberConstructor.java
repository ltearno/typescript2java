package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NumberConstructor
  * Typescript fqn NumberConstructor
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NumberConstructor {
    /**
     * The value of Number.EPSILON is the difference between 1 and the smallest value greater than 1
     * that is representable as a Number value, which is approximately:
     * 2.2204460492503130808472633361816 x 10‍−‍16.
     */
    @JsProperty(name="EPSILON")
    Number getEPSILON();

    /**
     * The value of Number.EPSILON is the difference between 1 and the smallest value greater than 1
     * that is representable as a Number value, which is approximately:
     * 2.2204460492503130808472633361816 x 10‍−‍16.
     */
    @JsProperty(name="EPSILON")
    void setEPSILON(Number value);

    /**
     * The value of the largest integer n such that n and n + 1 are both exactly representable as
     * a Number value.
     * The value of Number.MAX_SAFE_INTEGER is 9007199254740991 2^53 − 1.
     */
    @JsProperty(name="MAX_SAFE_INTEGER")
    Number getMAX_SAFE_INTEGER();

    /**
     * The value of the largest integer n such that n and n + 1 are both exactly representable as
     * a Number value.
     * The value of Number.MAX_SAFE_INTEGER is 9007199254740991 2^53 − 1.
     */
    @JsProperty(name="MAX_SAFE_INTEGER")
    void setMAX_SAFE_INTEGER(Number value);

    /**
     * The value of the smallest integer n such that n and n − 1 are both exactly representable as
     * a Number value.
     * The value of Number.MIN_SAFE_INTEGER is −9007199254740991 (−(2^53 − 1)).
     */
    @JsProperty(name="MIN_SAFE_INTEGER")
    Number getMIN_SAFE_INTEGER();

    /**
     * The value of the smallest integer n such that n and n − 1 are both exactly representable as
     * a Number value.
     * The value of Number.MIN_SAFE_INTEGER is −9007199254740991 (−(2^53 − 1)).
     */
    @JsProperty(name="MIN_SAFE_INTEGER")
    void setMIN_SAFE_INTEGER(Number value);

    /**
     * Returns true if passed value is finite.
     * Unlike the global isFinite, Number.isFinite doesn't forcibly convert the parameter to a
     * number. Only finite values of the type number, result in true.
     */
    boolean isFinite(Number number);

    /**
     * Returns true if the value passed is an integer, false otherwise.
     */
    boolean isInteger(Number number);

    /**
     * Returns a Boolean value that indicates whether a value is the reserved value NaN (not a
     * number). Unlike the global isNaN(), Number.isNaN() doesn't forcefully convert the parameter
     * to a number. Only values of the type number, that are also NaN, result in true.
     */
    boolean isNaN(Number number);

    /**
     * Returns true if the value passed is a safe integer.
     */
    boolean isSafeInteger(Number number);

    /**
     * Converts a string to a floating-point number.
     */
    Number parseFloat(String string);

    /**
     * Converts A string to an integer.
     */
    Number parseInt(String string, Number /* optional */ radix);
}
