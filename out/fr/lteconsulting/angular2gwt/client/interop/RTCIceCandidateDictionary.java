package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name RTCIceCandidateDictionary
  * Typescript fqn RTCIceCandidateDictionary
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface RTCIceCandidateDictionary {
    /* optional property foundation*/    @JsProperty(name="foundation")
    String getFoundation();

    @JsProperty(name="foundation")
    void setFoundation(String value);

    /* optional property priority*/    @JsProperty(name="priority")
    Number getPriority();

    @JsProperty(name="priority")
    void setPriority(Number value);

    /* optional property ip*/    @JsProperty(name="ip")
    String getIp();

    @JsProperty(name="ip")
    void setIp(String value);

    /* optional property protocol*/    @JsProperty(name="protocol")
    String getProtocol();

    @JsProperty(name="protocol")
    void setProtocol(String value);

    /* optional property port*/    @JsProperty(name="port")
    Number getPort();

    @JsProperty(name="port")
    void setPort(Number value);

    /* optional property type*/    @JsProperty(name="type")
    String getType();

    @JsProperty(name="type")
    void setType(String value);

    /* optional property tcpType*/    @JsProperty(name="tcpType")
    String getTcpType();

    @JsProperty(name="tcpType")
    void setTcpType(String value);

    /* optional property relatedAddress*/    @JsProperty(name="relatedAddress")
    String getRelatedAddress();

    @JsProperty(name="relatedAddress")
    void setRelatedAddress(String value);

    /* optional property relatedPort*/    @JsProperty(name="relatedPort")
    Number getRelatedPort();

    @JsProperty(name="relatedPort")
    void setRelatedPort(Number value);

    /* optional property msMTurnSessionId*/    @JsProperty(name="msMTurnSessionId")
    String getMsMTurnSessionId();

    @JsProperty(name="msMTurnSessionId")
    void setMsMTurnSessionId(String value);
}
