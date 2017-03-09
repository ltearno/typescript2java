package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\debug\debug_node.d.ts
  * Package ng.core
  * Name EventListener
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class EventListener  {
    public String name;
    public Function callback;
    @JsConstructor
    public EventListener(String name,Function callback) {}
}
