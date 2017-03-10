package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import rxjs.ColdObservable;
import rxjs.HotObservable;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsArray;
import rxjs.SubscriptionLog;
import rxjs.TestMessage;

/**
  * Generated from tests\rxjs\testing\TestScheduler.d.ts
  * Package rxjs
  * Name TestScheduler
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TestScheduler extends VirtualTimeScheduler {
    @JsProperty(name="assertDeepEqual")
    JsFunction2<Object,Object,Object /* UnionType */> getAssertDeepEqual();
    @JsProperty(name="assertDeepEqual")
    void setAssertDeepEqual(JsFunction2<Object,Object,Object /* UnionType */> value);
    @JsProperty(name="hotObservables")
    Object getHotObservables();
    @JsProperty(name="hotObservables")
    void setHotObservables(Object value);
    @JsProperty(name="coldObservables")
    Object getColdObservables();
    @JsProperty(name="coldObservables")
    void setColdObservables(Object value);
    @JsProperty(name="flushTests")
    Object getFlushTests();
    @JsProperty(name="flushTests")
    void setFlushTests(Object value);
    @JsConstructor
    public TestScheduler(JsFunction2<Object,Object,Object /* UnionType */> assertDeepEqual) {}
     int createTime(String marbles);
    <T> ColdObservable<T> createColdObservable(String marbles,Object /* optional */ values,Object /* optional */ error);
    <T> HotObservable<T> createHotObservable(String marbles,Object /* optional */ values,Object /* optional */ error);
     void materializeInnerObservable();
     /* TypeLiteral */ Object expectObservable(Observable<Object> observable,String /* optional */ unsubscriptionMarbles);
     /* TypeLiteral */ Object expectSubscriptions(JsArray<SubscriptionLog> actualSubscriptionLogs);
     void flush();
}
