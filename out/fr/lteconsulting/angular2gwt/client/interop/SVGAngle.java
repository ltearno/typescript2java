package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGAngle
  * Typescript fqn SVGAngle
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGAngle {
    @JsProperty(name="unitType")
    Number getUnitType();

    @JsProperty(name="unitType")
    void setUnitType(Number value);

    @JsProperty(name="value")
    Number getValue();

    @JsProperty(name="value")
    void setValue(Number value);

    @JsProperty(name="valueAsString")
    String getValueAsString();

    @JsProperty(name="valueAsString")
    void setValueAsString(String value);

    @JsProperty(name="valueInSpecifiedUnits")
    Number getValueInSpecifiedUnits();

    @JsProperty(name="valueInSpecifiedUnits")
    void setValueInSpecifiedUnits(Number value);

    @JsProperty(name="SVG_ANGLETYPE_DEG")
    Number getSVG_ANGLETYPE_DEG();

    @JsProperty(name="SVG_ANGLETYPE_DEG")
    void setSVG_ANGLETYPE_DEG(Number value);

    @JsProperty(name="SVG_ANGLETYPE_GRAD")
    Number getSVG_ANGLETYPE_GRAD();

    @JsProperty(name="SVG_ANGLETYPE_GRAD")
    void setSVG_ANGLETYPE_GRAD(Number value);

    @JsProperty(name="SVG_ANGLETYPE_RAD")
    Number getSVG_ANGLETYPE_RAD();

    @JsProperty(name="SVG_ANGLETYPE_RAD")
    void setSVG_ANGLETYPE_RAD(Number value);

    @JsProperty(name="SVG_ANGLETYPE_UNKNOWN")
    Number getSVG_ANGLETYPE_UNKNOWN();

    @JsProperty(name="SVG_ANGLETYPE_UNKNOWN")
    void setSVG_ANGLETYPE_UNKNOWN(Number value);

    @JsProperty(name="SVG_ANGLETYPE_UNSPECIFIED")
    Number getSVG_ANGLETYPE_UNSPECIFIED();

    @JsProperty(name="SVG_ANGLETYPE_UNSPECIFIED")
    void setSVG_ANGLETYPE_UNSPECIFIED(Number value);

    void convertToSpecifiedUnits(Number unitType);

    void newValueSpecifiedUnits(Number unitType, Number valueInSpecifiedUnits);
}
