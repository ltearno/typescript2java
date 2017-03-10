package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.NgZone;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\testability\testability.d.ts
  * Package ng.core
  * Name Testability
  * The Testability service provides testing hooks that can be accessed from
  * the browser and by services such as Protractor. Each bootstrapped Angular
  * application on the page will have an instance of Testability.
  **/
@JsType( isNative=true, namespace="ng.core", name="Testability" )
public class TestabilityImpl extends PublicTestability {
    @JsProperty(name="_ngZone")
    Object get_ngZone();
    @JsProperty(name="_ngZone")
    void set_ngZone(Object value);
    @JsConstructor
    public TestabilityImpl(NgZone _ngZone) {}
    public native  int increasePendingRequestCount();
    public native  int decreasePendingRequestCount();
    public native  boolean isStable();
    public native  void whenStable(Function callback);
    public native  int getPendingRequestCount();
    public native  JsArray<Object> findBindings(Object using,String provider,boolean exactMatch);
    public native  JsArray<Object> findProviders(Object using,String provider,boolean exactMatch);
}
