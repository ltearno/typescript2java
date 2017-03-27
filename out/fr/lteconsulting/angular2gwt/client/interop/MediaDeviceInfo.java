package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MediaDeviceInfo
  * Typescript fqn MediaDeviceInfo
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MediaDeviceInfo {
    @JsProperty(name="deviceId")
    String getDeviceId();

    @JsProperty(name="deviceId")
    void setDeviceId(String value);

    @JsProperty(name="groupId")
    String getGroupId();

    @JsProperty(name="groupId")
    void setGroupId(String value);

    @JsProperty(name="kind")
    String getKind();

    @JsProperty(name="kind")
    void setKind(String value);

    @JsProperty(name="label")
    String getLabel();

    @JsProperty(name="label")
    void setLabel(String value);
}
