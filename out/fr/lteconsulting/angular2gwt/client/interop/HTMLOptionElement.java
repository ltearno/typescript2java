package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLOptionElement
  * Typescript fqn HTMLOptionElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLOptionElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves the status of an option.
     */
    @JsProperty(name="defaultSelected")
    boolean getDefaultSelected();

    /**
     * Sets or retrieves the status of an option.
     */
    @JsProperty(name="defaultSelected")
    void setDefaultSelected(boolean value);

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
     * Sets or retrieves the ordinal position of an option in a list box.
     */
    @JsProperty(name="index")
    Number getIndex();

    /**
     * Sets or retrieves the ordinal position of an option in a list box.
     */
    @JsProperty(name="index")
    void setIndex(Number value);

    /**
     * Sets or retrieves a value that you can use to implement your own label functionality for the object.
     */
    @JsProperty(name="label")
    String getLabel();

    /**
     * Sets or retrieves a value that you can use to implement your own label functionality for the object.
     */
    @JsProperty(name="label")
    void setLabel(String value);

    /**
     * Sets or retrieves whether the option in the list box is the default item.
     */
    @JsProperty(name="selected")
    boolean getSelected();

    /**
     * Sets or retrieves whether the option in the list box is the default item.
     */
    @JsProperty(name="selected")
    void setSelected(boolean value);

    /**
     * Sets or retrieves the text string specified by the option tag.
     */
    @JsProperty(name="text")
    String getText();

    /**
     * Sets or retrieves the text string specified by the option tag.
     */
    @JsProperty(name="text")
    void setText(String value);

    /**
     * Sets or retrieves the value which is returned to the server when the form control is submitted.
     */
    @JsProperty(name="value")
    String getValue();

    /**
     * Sets or retrieves the value which is returned to the server when the form control is submitted.
     */
    @JsProperty(name="value")
    void setValue(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLOptionElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
