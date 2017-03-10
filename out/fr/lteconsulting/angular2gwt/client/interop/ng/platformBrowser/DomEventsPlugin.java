package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\dom_events.d.ts
  * Package ng.platformBrowser
  * Name DomEventsPlugin
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DomEventsPlugin extends EventManagerPlugin {
     boolean supports(String eventName);
     Function addEventListener(HTMLElement element,String eventName,Function handler);
}
