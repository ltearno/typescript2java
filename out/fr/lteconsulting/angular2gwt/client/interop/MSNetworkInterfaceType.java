package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSNetworkInterfaceType
  * Typescript fqn MSNetworkInterfaceType
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSNetworkInterfaceType {
    /* optional property interfaceTypeEthernet*/    @JsProperty(name="interfaceTypeEthernet")
    boolean getInterfaceTypeEthernet();

    @JsProperty(name="interfaceTypeEthernet")
    void setInterfaceTypeEthernet(boolean value);

    /* optional property interfaceTypeWireless*/    @JsProperty(name="interfaceTypeWireless")
    boolean getInterfaceTypeWireless();

    @JsProperty(name="interfaceTypeWireless")
    void setInterfaceTypeWireless(boolean value);

    /* optional property interfaceTypePPP*/    @JsProperty(name="interfaceTypePPP")
    boolean getInterfaceTypePPP();

    @JsProperty(name="interfaceTypePPP")
    void setInterfaceTypePPP(boolean value);

    /* optional property interfaceTypeTunnel*/    @JsProperty(name="interfaceTypeTunnel")
    boolean getInterfaceTypeTunnel();

    @JsProperty(name="interfaceTypeTunnel")
    void setInterfaceTypeTunnel(boolean value);

    /* optional property interfaceTypeWWAN*/    @JsProperty(name="interfaceTypeWWAN")
    boolean getInterfaceTypeWWAN();

    @JsProperty(name="interfaceTypeWWAN")
    void setInterfaceTypeWWAN(boolean value);
}
