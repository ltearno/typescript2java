package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\dom_events.d.ts
  * Package ng.platformBrowser
  * Name DomEventsPlugin
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="DomEventsPlugin" )
public class DomEventsPluginImpl extends EventManagerPlugin {
    public native  boolean supports(String eventName);
    public native  Function addEventListener(HTMLElement element,String eventName,Function handler);
}
