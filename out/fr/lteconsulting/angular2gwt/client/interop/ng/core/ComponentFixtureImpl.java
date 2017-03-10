package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ComponentRef;
import jsinterop.annotations.JsProperty;
import ng.core.NgZone;
import ng.core.DebugElement;
import ng.core.ElementRef;
import ng.core.ChangeDetectorRef;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\testing\component_fixture.d.ts
  * Package ng.core
  * Name ComponentFixture
  * Fixture for debugging and testing a component.
  **/
@JsType( isNative=true, namespace="ng.core", name="ComponentFixture" )
public class ComponentFixtureImpl<T>  {
    @JsProperty(name="componentRef")
    ComponentRef<T> getComponentRef();
    @JsProperty(name="componentRef")
    void setComponentRef(ComponentRef<T> value);
    @JsProperty(name="ngZone")
    NgZone getNgZone();
    @JsProperty(name="ngZone")
    void setNgZone(NgZone value);
    @JsProperty(name="_autoDetect")
    Object get_autoDetect();
    @JsProperty(name="_autoDetect")
    void set_autoDetect(Object value);
    @JsProperty(name="debugElement")
    DebugElement getDebugElement();
    @JsProperty(name="debugElement")
    void setDebugElement(DebugElement value);
    @JsProperty(name="componentInstance")
    T getComponentInstance();
    @JsProperty(name="componentInstance")
    void setComponentInstance(T value);
    @JsProperty(name="nativeElement")
    Object getNativeElement();
    @JsProperty(name="nativeElement")
    void setNativeElement(Object value);
    @JsProperty(name="elementRef")
    ElementRef getElementRef();
    @JsProperty(name="elementRef")
    void setElementRef(ElementRef value);
    @JsProperty(name="changeDetectorRef")
    ChangeDetectorRef getChangeDetectorRef();
    @JsProperty(name="changeDetectorRef")
    void setChangeDetectorRef(ChangeDetectorRef value);
    @JsProperty(name="_isStable")
    Object get_isStable();
    @JsProperty(name="_isStable")
    void set_isStable(Object value);
    @JsProperty(name="_isDestroyed")
    Object get_isDestroyed();
    @JsProperty(name="_isDestroyed")
    void set_isDestroyed(Object value);
    @JsProperty(name="_resolve")
    Object get_resolve();
    @JsProperty(name="_resolve")
    void set_resolve(Object value);
    @JsProperty(name="_promise")
    Object get_promise();
    @JsProperty(name="_promise")
    void set_promise(Object value);
    @JsProperty(name="_onUnstableSubscription")
    Object get_onUnstableSubscription();
    @JsProperty(name="_onUnstableSubscription")
    void set_onUnstableSubscription(Object value);
    @JsProperty(name="_onStableSubscription")
    Object get_onStableSubscription();
    @JsProperty(name="_onStableSubscription")
    void set_onStableSubscription(Object value);
    @JsProperty(name="_onMicrotaskEmptySubscription")
    Object get_onMicrotaskEmptySubscription();
    @JsProperty(name="_onMicrotaskEmptySubscription")
    void set_onMicrotaskEmptySubscription(Object value);
    @JsProperty(name="_onErrorSubscription")
    Object get_onErrorSubscription();
    @JsProperty(name="_onErrorSubscription")
    void set_onErrorSubscription(Object value);
    @JsConstructor
    public ComponentFixtureImpl(ComponentRef<T> componentRef,NgZone ngZone,boolean _autoDetect) {}
    public native  void _tick();
    public native  void detectChanges(boolean /* optional */ checkNoChanges);
    public native  void checkNoChanges();
    public native  void autoDetectChanges(boolean /* optional */ autoDetect);
    public native  boolean isStable();
    public native  Promise<Object> whenStable();
    public native  void destroy();
}
