package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SVGLength
  * Typescript fqn SVGLength
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SVGLength {
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

    @JsProperty(name="SVG_LENGTHTYPE_CM")
    Number getSVG_LENGTHTYPE_CM();

    @JsProperty(name="SVG_LENGTHTYPE_CM")
    void setSVG_LENGTHTYPE_CM(Number value);

    @JsProperty(name="SVG_LENGTHTYPE_EMS")
    Number getSVG_LENGTHTYPE_EMS();

    @JsProperty(name="SVG_LENGTHTYPE_EMS")
    void setSVG_LENGTHTYPE_EMS(Number value);

    @JsProperty(name="SVG_LENGTHTYPE_EXS")
    Number getSVG_LENGTHTYPE_EXS();

    @JsProperty(name="SVG_LENGTHTYPE_EXS")
    void setSVG_LENGTHTYPE_EXS(Number value);

    @JsProperty(name="SVG_LENGTHTYPE_IN")
    Number getSVG_LENGTHTYPE_IN();

    @JsProperty(name="SVG_LENGTHTYPE_IN")
    void setSVG_LENGTHTYPE_IN(Number value);

    @JsProperty(name="SVG_LENGTHTYPE_MM")
    Number getSVG_LENGTHTYPE_MM();

    @JsProperty(name="SVG_LENGTHTYPE_MM")
    void setSVG_LENGTHTYPE_MM(Number value);

    @JsProperty(name="SVG_LENGTHTYPE_NUMBER")
    Number getSVG_LENGTHTYPE_NUMBER();

    @JsProperty(name="SVG_LENGTHTYPE_NUMBER")
    void setSVG_LENGTHTYPE_NUMBER(Number value);

    @JsProperty(name="SVG_LENGTHTYPE_PC")
    Number getSVG_LENGTHTYPE_PC();

    @JsProperty(name="SVG_LENGTHTYPE_PC")
    void setSVG_LENGTHTYPE_PC(Number value);

    @JsProperty(name="SVG_LENGTHTYPE_PERCENTAGE")
    Number getSVG_LENGTHTYPE_PERCENTAGE();

    @JsProperty(name="SVG_LENGTHTYPE_PERCENTAGE")
    void setSVG_LENGTHTYPE_PERCENTAGE(Number value);

    @JsProperty(name="SVG_LENGTHTYPE_PT")
    Number getSVG_LENGTHTYPE_PT();

    @JsProperty(name="SVG_LENGTHTYPE_PT")
    void setSVG_LENGTHTYPE_PT(Number value);

    @JsProperty(name="SVG_LENGTHTYPE_PX")
    Number getSVG_LENGTHTYPE_PX();

    @JsProperty(name="SVG_LENGTHTYPE_PX")
    void setSVG_LENGTHTYPE_PX(Number value);

    @JsProperty(name="SVG_LENGTHTYPE_UNKNOWN")
    Number getSVG_LENGTHTYPE_UNKNOWN();

    @JsProperty(name="SVG_LENGTHTYPE_UNKNOWN")
    void setSVG_LENGTHTYPE_UNKNOWN(Number value);

    void convertToSpecifiedUnits(Number unitType);

    void newValueSpecifiedUnits(Number unitType, Number valueInSpecifiedUnits);
}
