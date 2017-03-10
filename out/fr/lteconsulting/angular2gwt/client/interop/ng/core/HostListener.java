package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\metadata\directives.d.ts
  * Package ng.core
  * Name HostListener
  * Type of the HostListener metadata.,
  * ,HostListener decorator and metadata.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface HostListener  {
    /* optional property eventName*/    @JsProperty(name="eventName")
    String eventName();
    @JsProperty(name="eventName")
    void eventName(String value);
    /* optional property args*/    @JsProperty(name="args")
    JsArray<String> args();
    @JsProperty(name="args")
    void args(JsArray<String> value);
}
