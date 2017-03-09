package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\testing\component_fixture.d.ts
  * Package ng.core
  * Name ComponentFixture
  * Fixture for debugging and testing a component.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ComponentFixture<T>  {
    public ComponentRef<T> componentRef;
    public NgZone ngZone;
    public Object _autoDetect;
    public DebugElement debugElement;
    public T componentInstance;
    public Object nativeElement;
    public ElementRef elementRef;
    public ChangeDetectorRef changeDetectorRef;
    public Object _isStable;
    public Object _isDestroyed;
    public Object _resolve;
    public Object _promise;
    public Object _onUnstableSubscription;
    public Object _onStableSubscription;
    public Object _onMicrotaskEmptySubscription;
    public Object _onErrorSubscription;
    @JsConstructor
    public ComponentFixture(ComponentRef<T> componentRef,NgZone ngZone,boolean _autoDetect) {}
    public native  void _tick();
    public native  void detectChanges(boolean /* optional */ checkNoChanges);
    public native  void checkNoChanges();
    public native  void autoDetectChanges(boolean /* optional */ autoDetect);
    public native  boolean isStable();
    public native  Promise<Object> whenStable();
    public native  void destroy();
}
