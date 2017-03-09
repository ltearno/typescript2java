package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsFunction1;

/**
  * Generated from tests\rxjs\observable\dom\WebSocketSubject.d.ts
  * Package rxjs
  * Name WebSocketSubjectConfig
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class WebSocketSubjectConfig  {
    public String url;
    public /* optional */ Object /* UnionType */ protocol;
    public /* optional */ JsFunction1<MessageEvent,T> resultSelector;
    public /* optional */ NextObserver<Event> openObserver;
    public /* optional */ NextObserver<CloseEvent> closeObserver;
    public /* optional */ NextObserver<Void> closingObserver;
    public /* optional */ /* TypeLiteral */ Object WebSocketCtor;
    public /* optional */ Object /* UnionType */ binaryType;
}
