package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\application_ref.d.ts
  * Package ng.core
  * Name NgProbeToken
  * A token for third-party components that can register themselves with NgProbe.
  **/
@JsType( isNative=true, namespace="ng.core", name="NgProbeToken" )
public class NgProbeTokenImpl  {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="token")
    Object getToken();
    @JsProperty(name="token")
    void setToken(Object value);
    @JsConstructor
    public NgProbeTokenImpl(String name,Object token) {}
}
