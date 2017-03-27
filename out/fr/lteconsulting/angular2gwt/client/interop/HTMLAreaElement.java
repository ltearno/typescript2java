package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLAreaElement
  * Typescript fqn HTMLAreaElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLAreaElement extends Object /* no JavaNode for symbol */ {
    /**
     * Sets or retrieves a text alternative to the graphic.
     */
    @JsProperty(name="alt")
    String getAlt();

    /**
     * Sets or retrieves a text alternative to the graphic.
     */
    @JsProperty(name="alt")
    void setAlt(String value);

    /**
     * Sets or retrieves the coordinates of the object.
     */
    @JsProperty(name="coords")
    String getCoords();

    /**
     * Sets or retrieves the coordinates of the object.
     */
    @JsProperty(name="coords")
    void setCoords(String value);

    @JsProperty(name="download")
    String getDownload();

    @JsProperty(name="download")
    void setDownload(String value);

    /**
     * Sets or retrieves the subsection of the href property that follows the number sign (#).
     */
    @JsProperty(name="hash")
    String getHash();

    /**
     * Sets or retrieves the subsection of the href property that follows the number sign (#).
     */
    @JsProperty(name="hash")
    void setHash(String value);

    /**
     * Sets or retrieves the hostname and port number of the location or URL.
     */
    @JsProperty(name="host")
    String getHost();

    /**
     * Sets or retrieves the hostname and port number of the location or URL.
     */
    @JsProperty(name="host")
    void setHost(String value);

    /**
     * Sets or retrieves the host name part of the location or URL.
     */
    @JsProperty(name="hostname")
    String getHostname();

    /**
     * Sets or retrieves the host name part of the location or URL.
     */
    @JsProperty(name="hostname")
    void setHostname(String value);

    /**
     * Sets or retrieves a destination URL or an anchor point.
     */
    @JsProperty(name="href")
    String getHref();

    /**
     * Sets or retrieves a destination URL or an anchor point.
     */
    @JsProperty(name="href")
    void setHref(String value);

    /**
     * Sets or gets whether clicks in this region cause action.
     */
    @JsProperty(name="noHref")
    boolean getNoHref();

    /**
     * Sets or gets whether clicks in this region cause action.
     */
    @JsProperty(name="noHref")
    void setNoHref(boolean value);

    /**
     * Sets or retrieves the file name or path specified by the object.
     */
    @JsProperty(name="pathname")
    String getPathname();

    /**
     * Sets or retrieves the file name or path specified by the object.
     */
    @JsProperty(name="pathname")
    void setPathname(String value);

    /**
     * Sets or retrieves the port number associated with a URL.
     */
    @JsProperty(name="port")
    String getPort();

    /**
     * Sets or retrieves the port number associated with a URL.
     */
    @JsProperty(name="port")
    void setPort(String value);

    /**
     * Sets or retrieves the protocol portion of a URL.
     */
    @JsProperty(name="protocol")
    String getProtocol();

    /**
     * Sets or retrieves the protocol portion of a URL.
     */
    @JsProperty(name="protocol")
    void setProtocol(String value);

    @JsProperty(name="rel")
    String getRel();

    @JsProperty(name="rel")
    void setRel(String value);

    /**
     * Sets or retrieves the substring of the href property that follows the question mark.
     */
    @JsProperty(name="search")
    String getSearch();

    /**
     * Sets or retrieves the substring of the href property that follows the question mark.
     */
    @JsProperty(name="search")
    void setSearch(String value);

    /**
     * Sets or retrieves the shape of the object.
     */
    @JsProperty(name="shape")
    String getShape();

    /**
     * Sets or retrieves the shape of the object.
     */
    @JsProperty(name="shape")
    void setShape(String value);

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
     * Returns a string representation of an object.
     */
    String toString();

    <K> void addEventListener(K type, JsFunction2<HTMLAreaElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
