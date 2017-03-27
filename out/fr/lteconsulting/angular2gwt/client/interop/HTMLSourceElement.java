package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLSourceElement
  * Typescript fqn HTMLSourceElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLSourceElement extends Object /* no JavaNode for symbol */ {
    /**
     * Gets or sets the intended media type of the media source.
     */
    @JsProperty(name="media")
    String getMedia();

    /**
     * Gets or sets the intended media type of the media source.
     */
    @JsProperty(name="media")
    void setMedia(String value);

    @JsProperty(name="msKeySystem")
    String getMsKeySystem();

    @JsProperty(name="msKeySystem")
    void setMsKeySystem(String value);

    @JsProperty(name="sizes")
    String getSizes();

    @JsProperty(name="sizes")
    void setSizes(String value);

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    @JsProperty(name="src")
    String getSrc();

    /**
     * The address or URL of the a media resource that is to be considered.
     */
    @JsProperty(name="src")
    void setSrc(String value);

    @JsProperty(name="srcset")
    String getSrcset();

    @JsProperty(name="srcset")
    void setSrcset(String value);

    /**
     * Gets or sets the MIME type of a media resource.
     */
    @JsProperty(name="type")
    String getType();

    /**
     * Gets or sets the MIME type of a media resource.
     */
    @JsProperty(name="type")
    void setType(String value);

    <K> void addEventListener(K type, JsFunction2<HTMLSourceElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
