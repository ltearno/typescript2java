package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLFormElement
  * Typescript fqn HTMLFormElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLFormElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form.
     */
    @JsProperty(name="acceptCharset")
    String getAcceptCharset();

    /**
     * Sets or retrieves a list of character encodings for input data that must be accepted by the server processing the form.
     */
    @JsProperty(name="acceptCharset")
    void setAcceptCharset(String value);

    /**
     * Sets or retrieves the URL to which the form content is sent for processing.
     */
    @JsProperty(name="action")
    String getAction();

    /**
     * Sets or retrieves the URL to which the form content is sent for processing.
     */
    @JsProperty(name="action")
    void setAction(String value);

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     */
    @JsProperty(name="autocomplete")
    String getAutocomplete();

    /**
     * Specifies whether autocomplete is applied to an editable text field.
     */
    @JsProperty(name="autocomplete")
    void setAutocomplete(String value);

    /**
     * Retrieves a collection, in source order, of all controls in a given form.
     */
    @JsProperty(name="elements")
    HTMLFormControlsCollection getElements();

    /**
     * Retrieves a collection, in source order, of all controls in a given form.
     */
    @JsProperty(name="elements")
    void setElements(HTMLFormControlsCollection value);

    /**
     * Sets or retrieves the MIME encoding for the form.
     */
    @JsProperty(name="encoding")
    String getEncoding();

    /**
     * Sets or retrieves the MIME encoding for the form.
     */
    @JsProperty(name="encoding")
    void setEncoding(String value);

    /**
     * Sets or retrieves the encoding type for the form.
     */
    @JsProperty(name="enctype")
    String getEnctype();

    /**
     * Sets or retrieves the encoding type for the form.
     */
    @JsProperty(name="enctype")
    void setEnctype(String value);

    /**
     * Sets or retrieves the number of objects in a collection.
     */
    @JsProperty(name="length")
    Number getLength();

    /**
     * Sets or retrieves the number of objects in a collection.
     */
    @JsProperty(name="length")
    void setLength(Number value);

    /**
     * Sets or retrieves how to send the form data to the server.
     */
    @JsProperty(name="method")
    String getMethod();

    /**
     * Sets or retrieves how to send the form data to the server.
     */
    @JsProperty(name="method")
    void setMethod(String value);

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
     * Designates a form that is not validated when submitted.
     */
    @JsProperty(name="noValidate")
    boolean getNoValidate();

    /**
     * Designates a form that is not validated when submitted.
     */
    @JsProperty(name="noValidate")
    void setNoValidate(boolean value);

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    @JsProperty(name="target")
    String getTarget();

    /**
     * Sets or retrieves the window or frame at which to target content.
     */
    @JsProperty(name="target")
    void setTarget(String value);

    /**
     * Returns whether a form will validate when it is submitted, without having to submit it.
     */
    boolean checkValidity();

    /**
     * Retrieves a form object or an object from an elements collection.
     */
    Object item(Object /* optional */ name, Object /* optional */ index);

    /**
     * Retrieves a form object or an object from an elements collection.
     */
    Object namedItem(String name);

    /**
     * Fires when the user resets a form.
     */
    void reset();

    /**
     * Fires when a FORM is about to be submitted.
     */
    void submit();

    <K> void addEventListener(K type, JsFunction2<HTMLFormElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
