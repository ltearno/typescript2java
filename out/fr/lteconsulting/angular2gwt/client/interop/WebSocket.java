package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WebSocket
  * Typescript fqn WebSocket
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WebSocket extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="binaryType")
    String getBinaryType();

    @JsProperty(name="binaryType")
    void setBinaryType(String value);

    @JsProperty(name="bufferedAmount")
    Number getBufferedAmount();

    @JsProperty(name="bufferedAmount")
    void setBufferedAmount(Number value);

    @JsProperty(name="extensions")
    String getExtensions();

    @JsProperty(name="extensions")
    void setExtensions(String value);

    @JsProperty(name="onclose")
    JsFunction2<WebSocket,CloseEvent,Object> getOnclose();

    @JsProperty(name="onclose")
    void setOnclose(JsFunction2<WebSocket,CloseEvent,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<WebSocket,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<WebSocket,Event,Object> value);

    @JsProperty(name="onmessage")
    JsFunction2<WebSocket,MessageEvent,Object> getOnmessage();

    @JsProperty(name="onmessage")
    void setOnmessage(JsFunction2<WebSocket,MessageEvent,Object> value);

    @JsProperty(name="onopen")
    JsFunction2<WebSocket,Event,Object> getOnopen();

    @JsProperty(name="onopen")
    void setOnopen(JsFunction2<WebSocket,Event,Object> value);

    @JsProperty(name="protocol")
    String getProtocol();

    @JsProperty(name="protocol")
    void setProtocol(String value);

    @JsProperty(name="readyState")
    Number getReadyState();

    @JsProperty(name="readyState")
    void setReadyState(Number value);

    @JsProperty(name="url")
    String getUrl();

    @JsProperty(name="url")
    void setUrl(String value);

    @JsProperty(name="CLOSED")
    Number getCLOSED();

    @JsProperty(name="CLOSED")
    void setCLOSED(Number value);

    @JsProperty(name="CLOSING")
    Number getCLOSING();

    @JsProperty(name="CLOSING")
    void setCLOSING(Number value);

    @JsProperty(name="CONNECTING")
    Number getCONNECTING();

    @JsProperty(name="CONNECTING")
    void setCONNECTING(Number value);

    @JsProperty(name="OPEN")
    Number getOPEN();

    @JsProperty(name="OPEN")
    void setOPEN(Number value);

    void close(Number /* optional */ code, String /* optional */ reason);

    void send(Object data);

    <K> void addEventListener(K type, JsFunction2<WebSocket,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
