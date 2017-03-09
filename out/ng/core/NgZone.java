package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;

/**
  * Generated from tests\@angular\core\src\zone\ng_zone.d.ts
  * Package ng.core
  * Name NgZone
  * An injectable service for executing work inside or outside of the Angular zone.
  * 
  * The most common use of this service is to optimize performance when starting a work consisting of
  * one or more asynchronous tasks that don't require UI updates or error handling to be handled by
  * Angular. Such tasks can be kicked off via {@link runOutsideAngular} and if needed, these tasks
  * can reenter the Angular zone via {@link run}.
  * 
  * <!-- TODO: add/fix links to:
  *    - docs explaining zones and the use of zones in Angular and change-detection
  *    - link to runOutsideAngular/run (throughout this file!)
  *    -->
  * 
  * ### Example
  * 
  * ```
  * import {Component, NgZone} from '@angular/core';
  * import {NgIf} from '@angular/common';
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgZone  {
    public Object outer;
    public Object inner;
    public Object _hasPendingMicrotasks;
    public Object _hasPendingMacrotasks;
    public Object _isStable;
    public Object _nesting;
    public Object _onUnstable;
    public Object _onMicrotaskEmpty;
    public Object _onStable;
    public Object _onErrorEvents;
    @JsConstructor
    public NgZone(/* TypeLiteral */ Object undefined) {}
    public static native  boolean isInAngularZone();
    public static native  void assertInAngularZone();
    public static native  void assertNotInAngularZone();
    public native  Object run(JsFunction<Object> fn);
    public native  Object runGuarded(JsFunction<Object> fn);
    public native  Object runOutsideAngular(JsFunction<Object> fn);
    public EventEmitter<Object> onUnstable;
    public EventEmitter<Object> onMicrotaskEmpty;
    public EventEmitter<Object> onStable;
    public EventEmitter<Object> onError;
    public boolean isStable;
    public boolean hasPendingMicrotasks;
    public boolean hasPendingMacrotasks;
    public native  void checkStable();
    public native  void forkInnerZoneWithAngularBehavior();
    public native  void onEnter();
    public native  void onLeave();
    public native  void setHasMicrotask();
    public native  void setHasMacrotask();
    public native  void triggerError();
}
