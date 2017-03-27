package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLAnchorElement
  * Typescript fqn HTMLAnchorElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLAnchorElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="Methods")
    String getMethods();

    @JsProperty(name="Methods")
    void setMethods(String value);

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
     * Contains the anchor portion of the URL including the hash sign (#).
     */
    @JsProperty(name="hash")
    String getHash();

    /**
     * Contains the anchor portion of the URL including the hash sign (#).
     */
    @JsProperty(name="hash")
    void setHash(String value);

    /**
     * Contains the hostname and port values of the URL.
     */
    @JsProperty(name="host")
    String getHost();

    /**
     * Contains the hostname and port values of the URL.
     */
    @JsProperty(name="host")
    void setHost(String value);

    /**
     * Contains the hostname of a URL.
     */
    @JsProperty(name="hostname")
    String getHostname();

    /**
     * Contains the hostname of a URL.
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
     * Sets or retrieves the language code of the object.
     */
    @JsProperty(name="hreflang")
    String getHreflang();

    /**
     * Sets or retrieves the language code of the object.
     */
    @JsProperty(name="hreflang")
    void setHreflang(String value);

    @JsProperty(name="mimeType")
    String getMimeType();

    @JsProperty(name="mimeType")
    void setMimeType(String value);

    /**
     * Sets or retrieves the shape of the object.
     */
    @JsProperty(name="name")
    String getName();

    /**
     * Sets or retrieves the shape of the object.
     */
    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="nameProp")
    String getNameProp();

    @JsProperty(name="nameProp")
    void setNameProp(String value);

    /**
     * Contains the pathname of the URL.
     */
    @JsProperty(name="pathname")
    String getPathname();

    /**
     * Contains the pathname of the URL.
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
     * Contains the protocol of the URL.
     */
    @JsProperty(name="protocol")
    String getProtocol();

    /**
     * Contains the protocol of the URL.
     */
    @JsProperty(name="protocol")
    void setProtocol(String value);

    @JsProperty(name="protocolLong")
    String getProtocolLong();

    @JsProperty(name="protocolLong")
    void setProtocolLong(String value);

    /**
     * Sets or retrieves the relationship between the object and the destination of the link.
     */
    @JsProperty(name="rel")
    String getRel();

    /**
     * Sets or retrieves the relationship between the object and the destination of the link.
     */
    @JsProperty(name="rel")
    void setRel(String value);

    /**
     * Sets or retrieves the relationship between the object and the destination of the link.
     */
    @JsProperty(name="rev")
    String getRev();

    /**
     * Sets or retrieves the relationship between the object and the destination of the link.
     */
    @JsProperty(name="rev")
    void setRev(String value);

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
     * Retrieves or sets the text of the object as a string.
     */
    @JsProperty(name="text")
    String getText();

    /**
     * Retrieves or sets the text of the object as a string.
     */
    @JsProperty(name="text")
    void setText(String value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    @JsProperty(name="urn")
    String getUrn();

    @JsProperty(name="urn")
    void setUrn(String value);

    /**
     * Returns a string representation of an object.
     */
    String toString();

    <K> void addEventListener(K type, JsFunction2<HTMLAnchorElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
