package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\version.d.ts
  * Package ng.core
  * Name Version
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Version  {
    @JsProperty(name="full")
    String getFull();
    @JsProperty(name="full")
    void setFull(String value);
    @JsConstructor
    public Version(String full) {}
    @JsProperty(name="major")
    String getMajor();
    @JsProperty(name="major")
    void setMajor(String value);
    @JsProperty(name="minor")
    String getMinor();
    @JsProperty(name="minor")
    void setMinor(String value);
    @JsProperty(name="patch")
    String getPatch();
    @JsProperty(name="patch")
    void setPatch(String value);
}
