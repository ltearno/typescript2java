package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\debug\debug_node.d.ts
  * Package ng.core
  * Name EventListener
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="EventListener" )
public class EventListenerImpl  {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="callback")
    Function getCallback();
    @JsProperty(name="callback")
    void setCallback(Function value);
    @JsConstructor
    public EventListenerImpl(String name,Function callback) {}
}
