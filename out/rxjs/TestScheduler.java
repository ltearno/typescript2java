package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\rxjs\testing\TestScheduler.d.ts
  * Package rxjs
  * Name TestScheduler
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class TestScheduler extends VirtualTimeScheduler {
    public JsFunction2<Object,Object,Object /* UnionType */> assertDeepEqual;
    public Object hotObservables;
    public Object coldObservables;
    public Object flushTests;
    @JsConstructor
    public TestScheduler(JsFunction2<Object,Object,Object /* UnionType */> assertDeepEqual) {}
    public native  int createTime(String marbles);
    public native <T> ColdObservable<T> createColdObservable(String marbles,Object /* optional */ values,Object /* optional */ error);
    public native <T> HotObservable<T> createHotObservable(String marbles,Object /* optional */ values,Object /* optional */ error);
    public native  void materializeInnerObservable();
    public native  /* TypeLiteral */ Object expectObservable(Observable<Object> observable,String /* optional */ unsubscriptionMarbles);
    public native  /* TypeLiteral */ Object expectSubscriptions(JsArray<SubscriptionLog> actualSubscriptionLogs);
    public native  void flush();
    public static native  SubscriptionLog parseMarblesAsSubscriptions(String marbles);
    public static native  JsArray<TestMessage> parseMarbles(String marbles,Object /* optional */ values,Object /* optional */ errorValue,boolean /* optional */ materializeInnerObservables);
}
