package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLMetaElement
  * Typescript fqn HTMLMetaElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLMetaElement extends Object /* no JavaNode for symbol */ {
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

    /**
     * Gets or sets meta-information to associate with httpEquiv or name.
     */
    @JsProperty(name="content")
    String getContent();

    /**
     * Gets or sets meta-information to associate with httpEquiv or name.
     */
    @JsProperty(name="content")
    void setContent(String value);

    /**
     * Gets or sets information used to bind the value of a content attribute of a meta element to an HTTP response header.
     */
    @JsProperty(name="httpEquiv")
    String getHttpEquiv();

    /**
     * Gets or sets information used to bind the value of a content attribute of a meta element to an HTTP response header.
     */
    @JsProperty(name="httpEquiv")
    void setHttpEquiv(String value);

    /**
     * Sets or retrieves the value specified in the content attribute of the meta object.
     */
    @JsProperty(name="name")
    String getName();

    /**
     * Sets or retrieves the value specified in the content attribute of the meta object.
     */
    @JsProperty(name="name")
    void setName(String value);

    /**
     * Sets or retrieves a scheme to be used in interpreting the value of a property specified for the object.
     */
    @JsProperty(name="scheme")
    String getScheme();

    /**
     * Sets or retrieves a scheme to be used in interpreting the value of a property specified for the object.
     */
    @JsProperty(name="scheme")
    void setScheme(String value);

    /**
     * Sets or retrieves the URL property that will be loaded after the specified time has elapsed.
     */
    @JsProperty(name="url")
    String getUrl();

    /**
     * Sets or retrieves the URL property that will be loaded after the specified time has elapsed.
     */
    @JsProperty(name="url")
    void setUrl(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLMetaElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
