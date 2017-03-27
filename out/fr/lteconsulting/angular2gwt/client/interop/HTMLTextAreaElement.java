package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLTextAreaElement
  * Typescript fqn HTMLTextAreaElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLTextAreaElement extends Object /* no JavaNode for symbol */ {
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

    /**
     * Sets or retrieves the width of the object.
     */
    @JsProperty(name="cols")
    Number getCols();

    /**
     * Sets or retrieves the width of the object.
     */
    @JsProperty(name="cols")
    void setCols(Number value);

    /**
     * Sets or retrieves the initial contents of the object.
     */
    @JsProperty(name="defaultValue")
    String getDefaultValue();

    /**
     * Sets or retrieves the initial contents of the object.
     */
    @JsProperty(name="defaultValue")
    void setDefaultValue(String value);

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
     * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    @JsProperty(name="maxLength")
    Number getMaxLength();

    /**
     * Sets or retrieves the maximum number of characters that the user can enter in a text control.
     */
    @JsProperty(name="maxLength")
    void setMaxLength(Number value);

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

    /**
     * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    @JsProperty(name="placeholder")
    String getPlaceholder();

    /**
     * Gets or sets a text string that is displayed in an input field as a hint or prompt to users as the format or type of information they need to enter.The text appears in an input field until the user puts focus on the field.
     */
    @JsProperty(name="placeholder")
    void setPlaceholder(String value);

    /**
     * Sets or retrieves the value indicated whether the content of the object is read-only.
     */
    @JsProperty(name="readOnly")
    boolean getReadOnly();

    /**
     * Sets or retrieves the value indicated whether the content of the object is read-only.
     */
    @JsProperty(name="readOnly")
    void setReadOnly(boolean value);

    /**
     * When present, marks an element that can't be submitted without a value.
     */
    @JsProperty(name="required")
    boolean getRequired();

    /**
     * When present, marks an element that can't be submitted without a value.
     */
    @JsProperty(name="required")
    void setRequired(boolean value);

    /**
     * Sets or retrieves the number of horizontal rows contained in the object.
     */
    @JsProperty(name="rows")
    Number getRows();

    /**
     * Sets or retrieves the number of horizontal rows contained in the object.
     */
    @JsProperty(name="rows")
    void setRows(Number value);

    /**
     * Gets or sets the end position or offset of a text selection.
     */
    @JsProperty(name="selectionEnd")
    Number getSelectionEnd();

    /**
     * Gets or sets the end position or offset of a text selection.
     */
    @JsProperty(name="selectionEnd")
    void setSelectionEnd(Number value);

    /**
     * Gets or sets the starting position or offset of a text selection.
     */
    @JsProperty(name="selectionStart")
    Number getSelectionStart();

    /**
     * Gets or sets the starting position or offset of a text selection.
     */
    @JsProperty(name="selectionStart")
    void setSelectionStart(Number value);

    /**
     * Sets or retrieves the value indicating whether the control is selected.
     */
    @JsProperty(name="status")
    Object getStatus();

    /**
     * Sets or retrieves the value indicating whether the control is selected.
     */
    @JsProperty(name="status")
    void setStatus(Object value);

    /**
     * Retrieves the type of control.
     */
    @JsProperty(name="type")
    String getType();

    /**
     * Retrieves the type of control.
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
     * Retrieves or sets the text in the entry field of the textArea element.
     */
    @JsProperty(name="value")
    String getValue();

    /**
     * Retrieves or sets the text in the entry field of the textArea element.
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
     * Sets or retrieves how to handle wordwrapping in the object.
     */
    @JsProperty(name="wrap")
    String getWrap();

    /**
     * Sets or retrieves how to handle wordwrapping in the object.
     */
    @JsProperty(name="wrap")
    void setWrap(String value);

    @JsProperty(name="minLength")
    Number getMinLength();

    @JsProperty(name="minLength")
    void setMinLength(Number value);

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    boolean checkValidity();

    /**
     * Highlights the input area of a form element.
     */
    void select();

    /**
     * Sets a custom error message that is displayed when a form is submitted.
     */
    void setCustomValidity(String error);

    /**
     * Sets the start and end positions of a selection in a text field.
     */
    void setSelectionRange(Number start, Number end);

    <K> void addEventListener(K type, JsFunction2<HTMLTextAreaElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
