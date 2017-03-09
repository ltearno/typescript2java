package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\event_manager.d.ts
  * Package ng.platformBrowser
  * Name EventManagerPlugin
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public interface EventManagerPlugin  {
    @JsProperty(name="manager")
    EventManager manager();
    @JsProperty(name="manager")
    void manager(EventManager value);
     boolean supports(String eventName);
     Function addEventListener(HTMLElement element,String eventName,Function handler);
     Function addGlobalEventListener(String element,String eventName,Function handler);
}
