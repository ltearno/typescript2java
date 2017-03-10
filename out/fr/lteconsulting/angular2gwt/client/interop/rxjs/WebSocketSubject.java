package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import rxjs.NextObserver;
import rxjs.WebSocketSubject;
import rxjs.Observer;
import jsinterop.annotations.JsConstructor;
import rxjs.Operator;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import rxjs.Observable;
import rxjs.Subscriber;
import rxjs.Subscription;

/**
  * Generated from tests\rxjs\observable\dom\WebSocketSubject.d.ts
  * Package rxjs
  * Name WebSocketSubject
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface WebSocketSubject<T> extends AnonymousSubject<T> {
    @JsProperty(name="url")
    String getUrl();
    @JsProperty(name="url")
    void setUrl(String value);
    @JsProperty(name="protocol")
    Object /* UnionType */ getProtocol();
    @JsProperty(name="protocol")
    void setProtocol(Object /* UnionType */ value);
    @JsProperty(name="socket")
    WebSocket getSocket();
    @JsProperty(name="socket")
    void setSocket(WebSocket value);
    @JsProperty(name="openObserver")
    NextObserver<Event> getOpenObserver();
    @JsProperty(name="openObserver")
    void setOpenObserver(NextObserver<Event> value);
    @JsProperty(name="closeObserver")
    NextObserver<CloseEvent> getCloseObserver();
    @JsProperty(name="closeObserver")
    void setCloseObserver(NextObserver<CloseEvent> value);
    @JsProperty(name="closingObserver")
    NextObserver<Void> getClosingObserver();
    @JsProperty(name="closingObserver")
    void setClosingObserver(NextObserver<Void> value);
    @JsProperty(name="WebSocketCtor")
    /* TypeLiteral */ Object getWebSocketCtor();
    @JsProperty(name="WebSocketCtor")
    void setWebSocketCtor(/* TypeLiteral */ Object value);
    @JsProperty(name="binaryType")
    Object /* UnionType */ getBinaryType();
    @JsProperty(name="binaryType")
    void setBinaryType(Object /* UnionType */ value);
    @JsProperty(name="_output")
    Object get_output();
    @JsProperty(name="_output")
    void set_output(Object value);
     Object resultSelector(MessageEvent e);
    @JsConstructor
    public WebSocketSubject(Object /* UnionType */ urlConfigOrSource,Observer<T> /* optional */ destination) {}
    <R> WebSocketSubject<R> lift(Operator<T,R> operator);
     void _resetState();
     Observable<Object> multiplex(JsFunction<Object> subMsg,JsFunction<Object> unsubMsg,JsFunction1<T,Boolean> messageFilter);
     void _connectSocket();
     Subscription _subscribe(Subscriber<T> subscriber);
     void unsubscribe();
}
