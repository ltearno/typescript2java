package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLFieldSetElement
  * Typescript fqn HTMLFieldSetElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLFieldSetElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves how the object is aligned with adjacent text.
     */
    @JsProperty(name="align")
    String getAlign();

    /**
     * Sets or retrieves how the object is aligned with adjacent text.
     */
    @JsProperty(name="align")
    void setAlign(String value);

    @JsProperty(name="disabled")
    boolean getDisabled();

    @JsProperty(name="disabled")
    void setDisabled(boolean value);

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

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    @JsProperty(name="validationMessage")
    String getValidationMessage();

    /**
     * Returns the error message that would be displayed if the user submits the form, or an empty string if no error message. It also triggers the standard error message, such as "this is a required field". The result is that the user sees validation messages without actually submitting.
     */
    @JsProperty(name="validationMessage")
    void setValidationMessage(String value);

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     */
    @JsProperty(name="validity")
    ValidityState getValidity();

    /**
     * Returns a  ValidityState object that represents the validity states of an element.
     */
    @JsProperty(name="validity")
    void setValidity(ValidityState value);

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    @JsProperty(name="willValidate")
    boolean getWillValidate();

    /**
     * Returns whether an element will successfully validate based on forms validation rules and constraints.
     */
    @JsProperty(name="willValidate")
    void setWillValidate(boolean value);

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    boolean checkValidity();

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     */
    void setCustomValidity(String error);

    <K> void addEventListener(K type, JsFunction2<HTMLFieldSetElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
