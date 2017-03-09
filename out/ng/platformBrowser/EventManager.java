package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.NgZone;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\event_manager.d.ts
  * Package ng.platformBrowser
  * Name EventManager
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class EventManager  {
    public Object _zone;
    public Object _plugins;
    public Object _eventNameToPlugin;
    @JsConstructor
    public EventManager(JsArray<EventManagerPlugin> plugins,NgZone _zone) {}
    public native  Function addEventListener(HTMLElement element,String eventName,Function handler);
    public native  Function addGlobalEventListener(String target,String eventName,Function handler);
    public native  NgZone getZone();
}
