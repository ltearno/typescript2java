package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCSrtpKeyParam
  * Typescript fqn RTCSrtpKeyParam
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCSrtpKeyParam {
    /* optional property keyMethod*/    @JsProperty(name="keyMethod")
    String getKeyMethod();

    @JsProperty(name="keyMethod")
    void setKeyMethod(String value);

    /* optional property keySalt*/    @JsProperty(name="keySalt")
    String getKeySalt();

    @JsProperty(name="keySalt")
    void setKeySalt(String value);

    /* optional property lifetime*/    @JsProperty(name="lifetime")
    String getLifetime();

    @JsProperty(name="lifetime")
    void setLifetime(String value);

    /* optional property mkiValue*/    @JsProperty(name="mkiValue")
    Number getMkiValue();

    @JsProperty(name="mkiValue")
    void setMkiValue(Number value);

    /* optional property mkiLength*/    @JsProperty(name="mkiLength")
    Number getMkiLength();

    @JsProperty(name="mkiLength")
    void setMkiLength(Number value);
}
