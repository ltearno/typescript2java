package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLAppletElement
  * Typescript fqn HTMLAppletElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLAppletElement extends Object /* no JavaNode for symbol */ {
    /**
     * Retrieves a string of the URL where the object tag can be found. This is often the href of the document that the object is in, or the value set by a base element.
     */
    @JsProperty(name="BaseHref")
    String getBaseHref();

    /**
     * Retrieves a string of the URL where the object tag can be found. This is often the href of the document that the object is in, or the value set by a base element.
     */
    @JsProperty(name="BaseHref")
    void setBaseHref(String value);

    @JsProperty(name="align")
    String getAlign();

    @JsProperty(name="align")
    void setAlign(String value);

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
     * Gets or sets the optional alternative HTML script to execute if the object fails to load.
     */
    @JsProperty(name="altHtml")
    String getAltHtml();

    /**
     * Gets or sets the optional alternative HTML script to execute if the object fails to load.
     */
    @JsProperty(name="altHtml")
    void setAltHtml(String value);

    /**
     * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
     */
    @JsProperty(name="archive")
    String getArchive();

    /**
     * Sets or retrieves a character string that can be used to implement your own archive functionality for the object.
     */
    @JsProperty(name="archive")
    void setArchive(String value);

    @JsProperty(name="border")
    String getBorder();

    @JsProperty(name="border")
    void setBorder(String value);

    @JsProperty(name="code")
    String getCode();

    @JsProperty(name="code")
    void setCode(String value);

    /**
     * Sets or retrieves the URL of the component.
     */
    @JsProperty(name="codeBase")
    String getCodeBase();

    /**
     * Sets or retrieves the URL of the component.
     */
    @JsProperty(name="codeBase")
    void setCodeBase(String value);

    /**
     * Sets or retrieves the Internet media type for the code associated with the object.
     */
    @JsProperty(name="codeType")
    String getCodeType();

    /**
     * Sets or retrieves the Internet media type for the code associated with the object.
     */
    @JsProperty(name="codeType")
    void setCodeType(String value);

    /**
     * Address of a pointer to the document this page or frame contains. If there is no document, then null will be returned.
     */
    @JsProperty(name="contentDocument")
    Document getContentDocument();

    /**
     * Address of a pointer to the document this page or frame contains. If there is no document, then null will be returned.
     */
    @JsProperty(name="contentDocument")
    void setContentDocument(Document value);

    /**
     * Sets or retrieves the URL that references the data of the object.
     */
    @JsProperty(name="data")
    String getData();

    /**
     * Sets or retrieves the URL that references the data of the object.
     */
    @JsProperty(name="data")
    void setData(String value);

    /**
     * Sets or retrieves a character string that can be used to implement your own declare functionality for the object.
     */
    @JsProperty(name="declare")
    boolean getDeclare();

    /**
     * Sets or retrieves a character string that can be used to implement your own declare functionality for the object.
     */
    @JsProperty(name="declare")
    void setDeclare(boolean value);

    @JsProperty(name="form")
    HTMLFormElement getForm();

    @JsProperty(name="form")
    void setForm(HTMLFormElement value);

    /**
     * Sets or retrieves the height of the object.
     */
    @JsProperty(name="height")
    String getHeight();

    /**
     * Sets or retrieves the height of the object.
     */
    @JsProperty(name="height")
    void setHeight(String value);

    @JsProperty(name="hspace")
    Number getHspace();

    @JsProperty(name="hspace")
    void setHspace(Number value);

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

    @JsProperty(name="object")
    String getObject();

    @JsProperty(name="object")
    void setObject(String value);

    /**
     * Sets or retrieves a message to be displayed while an object is loading.
     */
    @JsProperty(name="standby")
    String getStandby();

    /**
     * Sets or retrieves a message to be displayed while an object is loading.
     */
    @JsProperty(name="standby")
    void setStandby(String value);

    /**
     * Returns the content type of the object.
     */
    @JsProperty(name="type")
    String getType();

    /**
     * Returns the content type of the object.
     */
    @JsProperty(name="type")
    void setType(String value);

    /**
     * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    @JsProperty(name="useMap")
    String getUseMap();

    /**
     * Sets or retrieves the URL, often with a bookmark extension (#name), to use as a client-side image map.
     */
    @JsProperty(name="useMap")
    void setUseMap(String value);

    @JsProperty(name="vspace")
    Number getVspace();

    @JsProperty(name="vspace")
    void setVspace(Number value);

    @JsProperty(name="width")
    Number getWidth();

    @JsProperty(name="width")
    void setWidth(Number value);

    <K> void addEventListener(K type, JsFunction2<HTMLAppletElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
