package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.platformBrowser.EventManagerPlugin;
import ng.core.NgZone;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\src\dom\events\event_manager.d.ts
  * Package ng.platformBrowser
  * Name EventManager
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="EventManager" )
public class EventManagerImpl  {
    @JsProperty(name="_zone")
    Object get_zone();
    @JsProperty(name="_zone")
    void set_zone(Object value);
    @JsProperty(name="_plugins")
    Object get_plugins();
    @JsProperty(name="_plugins")
    void set_plugins(Object value);
    @JsProperty(name="_eventNameToPlugin")
    Object get_eventNameToPlugin();
    @JsProperty(name="_eventNameToPlugin")
    void set_eventNameToPlugin(Object value);
    @JsConstructor
    public EventManagerImpl(JsArray<EventManagerPlugin> plugins,NgZone _zone) {}
    public native  Function addEventListener(HTMLElement element,String eventName,Function handler);
    public native  Function addGlobalEventListener(String target,String eventName,Function handler);
    public native  NgZone getZone();
}
