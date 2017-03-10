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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface EventManager  {
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
    public EventManager(JsArray<EventManagerPlugin> plugins,NgZone _zone) {}
     Function addEventListener(HTMLElement element,String eventName,Function handler);
     Function addGlobalEventListener(String target,String eventName,Function handler);
     NgZone getZone();
}
