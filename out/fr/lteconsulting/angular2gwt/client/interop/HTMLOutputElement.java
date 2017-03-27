package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLOutputElement
  * Typescript fqn HTMLOutputElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLOutputElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="defaultValue")
    String getDefaultValue();

    @JsProperty(name="defaultValue")
    void setDefaultValue(String value);

    @JsProperty(name="form")
    HTMLFormElement getForm();

    @JsProperty(name="form")
    void setForm(HTMLFormElement value);

    @JsProperty(name="htmlFor")
    DOMSettableTokenList getHtmlFor();

    @JsProperty(name="htmlFor")
    void setHtmlFor(DOMSettableTokenList value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    @JsProperty(name="validationMessage")
    String getValidationMessage();

    @JsProperty(name="validationMessage")
    void setValidationMessage(String value);

    @JsProperty(name="validity")
    ValidityState getValidity();

    @JsProperty(name="validity")
    void setValidity(ValidityState value);

    @JsProperty(name="value")
    String getValue();

    @JsProperty(name="value")
    void setValue(String value);

    @JsProperty(name="willValidate")
    boolean getWillValidate();

    @JsProperty(name="willValidate")
    void setWillValidate(boolean value);

    boolean checkValidity();

    boolean reportValidity();

    void setCustomValidity(String error);

    <K> void addEventListener(K type, JsFunction2<HTMLOutputElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
