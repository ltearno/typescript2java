package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLScriptElement
  * Typescript fqn HTMLScriptElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLScriptElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="async")
    boolean getAsync();

    @JsProperty(name="async")
    void setAsync(boolean value);

    /**
     * Sets or retrieves the character set used to encode the object.
     */
    @JsProperty(name="charset")
    String getCharset();

    /**
     * Sets or retrieves the character set used to encode the object.
     */
    @JsProperty(name="charset")
    void setCharset(String value);

    @JsProperty(name="crossOrigin")
    String getCrossOrigin();

    @JsProperty(name="crossOrigin")
    void setCrossOrigin(String value);

    /**
     * Sets or retrieves the status of the script.
     */
    @JsProperty(name="defer")
    boolean getDefer();

    /**
     * Sets or retrieves the status of the script.
     */
    @JsProperty(name="defer")
    void setDefer(boolean value);

    /**
     * Sets or retrieves the event for which the script is written.
     */
    @JsProperty(name="event")
    String getEvent();

    /**
     * Sets or retrieves the event for which the script is written.
     */
    @JsProperty(name="event")
    void setEvent(String value);

    /**
     * Sets or retrieves the object that is bound to the event script.
     */
    @JsProperty(name="htmlFor")
    String getHtmlFor();

    /**
     * Sets or retrieves the object that is bound to the event script.
     */
    @JsProperty(name="htmlFor")
    void setHtmlFor(String value);

    /**
     * Retrieves the URL to an external file that contains the source code or data.
     */
    @JsProperty(name="src")
    String getSrc();

    /**
     * Retrieves the URL to an external file that contains the source code or data.
     */
    @JsProperty(name="src")
    void setSrc(String value);

    /**
     * Retrieves or sets the text of the object as a string.
     */
    @JsProperty(name="text")
    String getText();

    /**
     * Retrieves or sets the text of the object as a string.
     */
    @JsProperty(name="text")
    void setText(String value);

    /**
     * Sets or retrieves the MIME type for the associated scripting engine.
     */
    @JsProperty(name="type")
    String getType();

    /**
     * Sets or retrieves the MIME type for the associated scripting engine.
     */
    @JsProperty(name="type")
    void setType(String value);

    @JsProperty(name="integrity")
    String getIntegrity();

    @JsProperty(name="integrity")
    void setIntegrity(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLScriptElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
