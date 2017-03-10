package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\src\dom\debug\ng_probe.d.ts
  * Package ng.platformBrowser
  * Name NgProbeToken
  * Deprecated. Use the one from '@angular/core'.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgProbeToken  {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="token")
    Object getToken();
    @JsProperty(name="token")
    void setToken(Object value);
    @JsConstructor
    public NgProbeToken(String name,Object token) {}
}
