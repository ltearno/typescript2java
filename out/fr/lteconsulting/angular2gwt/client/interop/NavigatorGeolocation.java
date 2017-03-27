package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name NavigatorGeolocation
  * Typescript fqn NavigatorGeolocation
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface NavigatorGeolocation {
    @JsProperty(name="geolocation")
    Geolocation getGeolocation();

    @JsProperty(name="geolocation")
    void setGeolocation(Geolocation value);
}
