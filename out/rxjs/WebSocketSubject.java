package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\rxjs\observable\dom\WebSocketSubject.d.ts
  * Package rxjs
  * Name WebSocketSubject
  * We need this JSDoc comment for affecting ESDoc.
  **/
@JsType( isNative=true, namespace="rxjs" )
public class WebSocketSubject<T> extends AnonymousSubject<T> {
    public String url;
    public Object /* UnionType */ protocol;
    public WebSocket socket;
    public NextObserver<Event> openObserver;
    public NextObserver<CloseEvent> closeObserver;
    public NextObserver<Void> closingObserver;
    public /* TypeLiteral */ Object WebSocketCtor;
    public Object /* UnionType */ binaryType;
    public Object _output;
    public native  Object resultSelector(MessageEvent e);
    public static native <T> WebSocketSubject<T> create(Object /* UnionType */ urlConfigOrSource);
    @JsConstructor
    public WebSocketSubject(Object /* UnionType */ urlConfigOrSource,Observer<T> /* optional */ destination) {}
    public native <R> WebSocketSubject<R> lift(Operator<T,R> operator);
    public native  void _resetState();
    public native  Observable<Object> multiplex(JsFunction<Object> subMsg,JsFunction<Object> unsubMsg,JsFunction1<T,Boolean> messageFilter);
    public native  void _connectSocket();
    public native  Subscription _subscribe(Subscriber<T> subscriber);
    public native  void unsubscribe();
}
