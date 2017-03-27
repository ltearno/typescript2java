package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaError
  * Typescript fqn MediaError
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaError {
    @JsProperty(name="code")
    Number getCode();

    @JsProperty(name="code")
    void setCode(Number value);

    @JsProperty(name="msExtendedCode")
    Number getMsExtendedCode();

    @JsProperty(name="msExtendedCode")
    void setMsExtendedCode(Number value);

    @JsProperty(name="MEDIA_ERR_ABORTED")
    Number getMEDIA_ERR_ABORTED();

    @JsProperty(name="MEDIA_ERR_ABORTED")
    void setMEDIA_ERR_ABORTED(Number value);

    @JsProperty(name="MEDIA_ERR_DECODE")
    Number getMEDIA_ERR_DECODE();

    @JsProperty(name="MEDIA_ERR_DECODE")
    void setMEDIA_ERR_DECODE(Number value);

    @JsProperty(name="MEDIA_ERR_NETWORK")
    Number getMEDIA_ERR_NETWORK();

    @JsProperty(name="MEDIA_ERR_NETWORK")
    void setMEDIA_ERR_NETWORK(Number value);

    @JsProperty(name="MEDIA_ERR_SRC_NOT_SUPPORTED")
    Number getMEDIA_ERR_SRC_NOT_SUPPORTED();

    @JsProperty(name="MEDIA_ERR_SRC_NOT_SUPPORTED")
    void setMEDIA_ERR_SRC_NOT_SUPPORTED(Number value);

    @JsProperty(name="MS_MEDIA_ERR_ENCRYPTED")
    Number getMS_MEDIA_ERR_ENCRYPTED();

    @JsProperty(name="MS_MEDIA_ERR_ENCRYPTED")
    void setMS_MEDIA_ERR_ENCRYPTED(Number value);
}
