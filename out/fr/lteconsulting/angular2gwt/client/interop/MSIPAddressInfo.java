package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSIPAddressInfo
  * Typescript fqn MSIPAddressInfo
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSIPAddressInfo {
    /* optional property ipAddr*/    @JsProperty(name="ipAddr")
    String getIpAddr();

    @JsProperty(name="ipAddr")
    void setIpAddr(String value);

    /* optional property port*/    @JsProperty(name="port")
    Number getPort();

    @JsProperty(name="port")
    void setPort(Number value);

    /* optional property manufacturerMacAddrMask*/    @JsProperty(name="manufacturerMacAddrMask")
    String getManufacturerMacAddrMask();

    @JsProperty(name="manufacturerMacAddrMask")
    void setManufacturerMacAddrMask(String value);
}
