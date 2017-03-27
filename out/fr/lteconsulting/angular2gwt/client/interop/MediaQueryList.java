package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaQueryList
  * Typescript fqn MediaQueryList
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaQueryList {
    @JsProperty(name="matches")
    boolean getMatches();

    @JsProperty(name="matches")
    void setMatches(boolean value);

    @JsProperty(name="media")
    String getMedia();

    @JsProperty(name="media")
    void setMedia(String value);

    void addListener(MediaQueryListListener listener);

    void removeListener(MediaQueryListListener listener);
}
