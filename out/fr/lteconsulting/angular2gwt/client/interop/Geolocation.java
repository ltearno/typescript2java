package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Geolocation
  * Typescript fqn Geolocation
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Geolocation {
    void clearWatch(Number watchId);

    void getCurrentPosition(PositionCallback successCallback, PositionErrorCallback /* optional */ errorCallback, PositionOptions /* optional */ options);

    Number watchPosition(PositionCallback successCallback, PositionErrorCallback /* optional */ errorCallback, PositionOptions /* optional */ options);
}
