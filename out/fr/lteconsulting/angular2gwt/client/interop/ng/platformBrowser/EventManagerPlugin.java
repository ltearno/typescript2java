package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.platformBrowser.EventManager;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\event_manager.d.ts
  * Package ng.platformBrowser
  * Name EventManagerPlugin
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface EventManagerPlugin  {
    @JsProperty(name="manager")
    EventManager getManager();
    @JsProperty(name="manager")
    void setManager(EventManager value);
     boolean supports(String eventName);
     Function addEventListener(HTMLElement element,String eventName,Function handler);
     Function addGlobalEventListener(String element,String eventName,Function handler);
}
