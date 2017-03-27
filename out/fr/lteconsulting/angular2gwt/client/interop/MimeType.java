package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MimeType
  * Typescript fqn MimeType
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MimeType {
    @JsProperty(name="description")
    String getDescription();

    @JsProperty(name="description")
    void setDescription(String value);

    @JsProperty(name="enabledPlugin")
    Plugin getEnabledPlugin();

    @JsProperty(name="enabledPlugin")
    void setEnabledPlugin(Plugin value);

    @JsProperty(name="suffixes")
    String getSuffixes();

    @JsProperty(name="suffixes")
    void setSuffixes(String value);

    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);
}
