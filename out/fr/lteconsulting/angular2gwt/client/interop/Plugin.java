package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Plugin
  * Typescript fqn Plugin
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Plugin {
    @JsProperty(name="description")
    String getDescription();

    @JsProperty(name="description")
    void setDescription(String value);

    @JsProperty(name="filename")
    String getFilename();

    @JsProperty(name="filename")
    void setFilename(String value);

    @JsProperty(name="length")
    Number getLength();

    @JsProperty(name="length")
    void setLength(Number value);

    @JsProperty(name="name")
    String getName();

    @JsProperty(name="name")
    void setName(String value);

    @JsProperty(name="version")
    String getVersion();

    @JsProperty(name="version")
    void setVersion(String value);

    MimeType item(Number index);

    MimeType namedItem(String type);
}
