package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLButtonElement
  * Typescript fqn HTMLButtonElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLButtonElement extends Object /* no JavaNode for symbol */ {
    /**
     * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true when present on an element, and false when missing.
     */
    @JsProperty(name="autofocus")
    boolean getAutofocus();

    /**
     * Provides a way to direct a user to a specific field when a document loads. This can provide both direction and convenience for a user, reducing the need to click or tab to a field when a page opens. This attribute is true when present on an element, and false when missing.
     */
    @JsProperty(name="autofocus")
    void setAutofocus(boolean value);

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

    /**
     * Overrides the action attribute (where the data on a form is sent) on the parent form element.
     */
    @JsProperty(name="formAction")
    String getFormAction();

    /**
     * Overrides the action attribute (where the data on a form is sent) on the parent form element.
     */
    @JsProperty(name="formAction")
    void setFormAction(String value);

    /**
     * Used to override the encoding (formEnctype attribute) specified on the form element.
     */
    @JsProperty(name="formEnctype")
    String getFormEnctype();

    /**
     * Used to override the encoding (formEnctype attribute) specified on the form element.
     */
    @JsProperty(name="formEnctype")
    void setFormEnctype(String value);

    /**
     * Overrides the submit method attribute previously specified on a form element.
     */
    @JsProperty(name="formMethod")
    String getFormMethod();

    /**
     * Overrides the submit method attribute previously specified on a form element.
     */
    @JsProperty(name="formMethod")
    void setFormMethod(String value);

    /**
     * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
     */
    @JsProperty(name="formNoValidate")
    String getFormNoValidate();

    /**
     * Overrides any validation or required attributes on a form or form elements to allow it to be submitted without validation. This can be used to create a "save draft"-type submit option.
     */
    @JsProperty(name="formNoValidate")
    void setFormNoValidate(String value);

    /**
     * Overrides the target attribute on a form element.
     */
    @JsProperty(name="formTarget")
    String getFormTarget();

    /**
     * Overrides the target attribute on a form element.
     */
    @JsProperty(name="formTarget")
    void setFormTarget(String value);

    /**
     * Sets or retrieves the name of the object.
     */
    @JsProperty(name="name")
    String getName();

    /**
     * Sets or retrieves the name of the object.
     */
    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="status")
    Object getStatus();

    @JsProperty(name="status")
    void setStatus(Object value);

    /**
     * Gets the classification and default behavior of the button.
     */
    @JsProperty(name="type")
    String getType();

    /**
     * Gets the classification and default behavior of the button.
     */
    @JsProperty(name="type")
    void setType(String value);

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
     * Sets or retrieves the default or selected value of the control.
     */
    @JsProperty(name="value")
    String getValue();

    /**
     * Sets or retrieves the default or selected value of the control.
     */
    @JsProperty(name="value")
    void setValue(String value);

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

    <K> void addEventListener(K type, JsFunction2<HTMLButtonElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
