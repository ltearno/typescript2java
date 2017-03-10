package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import rxjs.NextObserver;

/**
  * Generated from tests\rxjs\observable\dom\WebSocketSubject.d.ts
  * Package rxjs
  * Name WebSocketSubjectConfig
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface WebSocketSubjectConfig  {
    @JsProperty(name="url")
    String url();
    @JsProperty(name="url")
    void url(String value);
    /* optional property protocol*/    @JsProperty(name="protocol")
    Object /* UnionType */ protocol();
    @JsProperty(name="protocol")
    void protocol(Object /* UnionType */ value);
    /* optional property resultSelector*/    @JsProperty(name="resultSelector")
    JsFunction1<MessageEvent,T> resultSelector();
    @JsProperty(name="resultSelector")
    void resultSelector(JsFunction1<MessageEvent,T> value);
    /* optional property openObserver*/    @JsProperty(name="openObserver")
    NextObserver<Event> openObserver();
    @JsProperty(name="openObserver")
    void openObserver(NextObserver<Event> value);
    /* optional property closeObserver*/    @JsProperty(name="closeObserver")
    NextObserver<CloseEvent> closeObserver();
    @JsProperty(name="closeObserver")
    void closeObserver(NextObserver<CloseEvent> value);
    /* optional property closingObserver*/    @JsProperty(name="closingObserver")
    NextObserver<Void> closingObserver();
    @JsProperty(name="closingObserver")
    void closingObserver(NextObserver<Void> value);
    /* optional property WebSocketCtor*/    @JsProperty(name="WebSocketCtor")
    /* TypeLiteral */ Object WebSocketCtor();
    @JsProperty(name="WebSocketCtor")
    void WebSocketCtor(/* TypeLiteral */ Object value);
    /* optional property binaryType*/    @JsProperty(name="binaryType")
    Object /* UnionType */ binaryType();
    @JsProperty(name="binaryType")
    void binaryType(Object /* UnionType */ value);
}
