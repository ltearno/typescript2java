package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSNetworkConnectivityInfo
  * Typescript fqn MSNetworkConnectivityInfo
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSNetworkConnectivityInfo {
    /* optional property vpn*/    @JsProperty(name="vpn")
    boolean getVpn();

    @JsProperty(name="vpn")
    void setVpn(boolean value);

    /* optional property linkspeed*/    @JsProperty(name="linkspeed")
    Number getLinkspeed();

    @JsProperty(name="linkspeed")
    void setLinkspeed(Number value);

    /* optional property networkConnectionDetails*/    @JsProperty(name="networkConnectionDetails")
    String getNetworkConnectionDetails();

    @JsProperty(name="networkConnectionDetails")
    void setNetworkConnectionDetails(String value);
}
