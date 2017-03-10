package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import ng.core.EventEmitter;

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
@JsType( isNative=true, namespace="ng.core", name="NgZone" )
public class NgZoneImpl  {
    @JsProperty(name="outer")
    Object getOuter();
    @JsProperty(name="outer")
    void setOuter(Object value);
    @JsProperty(name="inner")
    Object getInner();
    @JsProperty(name="inner")
    void setInner(Object value);
    @JsProperty(name="_hasPendingMicrotasks")
    Object get_hasPendingMicrotasks();
    @JsProperty(name="_hasPendingMicrotasks")
    void set_hasPendingMicrotasks(Object value);
    @JsProperty(name="_hasPendingMacrotasks")
    Object get_hasPendingMacrotasks();
    @JsProperty(name="_hasPendingMacrotasks")
    void set_hasPendingMacrotasks(Object value);
    @JsProperty(name="_isStable")
    Object get_isStable();
    @JsProperty(name="_isStable")
    void set_isStable(Object value);
    @JsProperty(name="_nesting")
    Object get_nesting();
    @JsProperty(name="_nesting")
    void set_nesting(Object value);
    @JsProperty(name="_onUnstable")
    Object get_onUnstable();
    @JsProperty(name="_onUnstable")
    void set_onUnstable(Object value);
    @JsProperty(name="_onMicrotaskEmpty")
    Object get_onMicrotaskEmpty();
    @JsProperty(name="_onMicrotaskEmpty")
    void set_onMicrotaskEmpty(Object value);
    @JsProperty(name="_onStable")
    Object get_onStable();
    @JsProperty(name="_onStable")
    void set_onStable(Object value);
    @JsProperty(name="_onErrorEvents")
    Object get_onErrorEvents();
    @JsProperty(name="_onErrorEvents")
    void set_onErrorEvents(Object value);
    @JsConstructor
    public NgZoneImpl(/* TypeLiteral */ Object undefined) {}
    public static native  boolean isInAngularZone();
    public static native  void assertInAngularZone();
    public static native  void assertNotInAngularZone();
    public native  Object run(JsFunction<Object> fn);
    public native  Object runGuarded(JsFunction<Object> fn);
    public native  Object runOutsideAngular(JsFunction<Object> fn);
    @JsProperty(name="onUnstable")
    EventEmitter<Object> getOnUnstable();
    @JsProperty(name="onUnstable")
    void setOnUnstable(EventEmitter<Object> value);
    @JsProperty(name="onMicrotaskEmpty")
    EventEmitter<Object> getOnMicrotaskEmpty();
    @JsProperty(name="onMicrotaskEmpty")
    void setOnMicrotaskEmpty(EventEmitter<Object> value);
    @JsProperty(name="onStable")
    EventEmitter<Object> getOnStable();
    @JsProperty(name="onStable")
    void setOnStable(EventEmitter<Object> value);
    @JsProperty(name="onError")
    EventEmitter<Object> getOnError();
    @JsProperty(name="onError")
    void setOnError(EventEmitter<Object> value);
    @JsProperty(name="isStable")
    boolean getIsStable();
    @JsProperty(name="isStable")
    void setIsStable(boolean value);
    @JsProperty(name="hasPendingMicrotasks")
    boolean getHasPendingMicrotasks();
    @JsProperty(name="hasPendingMicrotasks")
    void setHasPendingMicrotasks(boolean value);
    @JsProperty(name="hasPendingMacrotasks")
    boolean getHasPendingMacrotasks();
    @JsProperty(name="hasPendingMacrotasks")
    void setHasPendingMacrotasks(boolean value);
    public native  void checkStable();
    public native  void forkInnerZoneWithAngularBehavior();
    public native  void onEnter();
    public native  void onLeave();
    public native  void setHasMicrotask();
    public native  void setHasMacrotask();
    public native  void triggerError();
}
