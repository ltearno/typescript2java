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
@JsType( isNative=true, namespace="ng.platformBrowser", name="EventManagerPlugin" )
public abstract class EventManagerPluginImpl  {
    @JsProperty(name="manager")
    EventManager getManager();
    @JsProperty(name="manager")
    void setManager(EventManager value);
    public native  boolean supports(String eventName);
    public native  Function addEventListener(HTMLElement element,String eventName,Function handler);
    public native  Function addGlobalEventListener(String element,String eventName,Function handler);
}
