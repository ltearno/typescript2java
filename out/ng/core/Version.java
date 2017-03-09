package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\version.d.ts
  * Package ng.core
  * Name Version
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class Version  {
    public String full;
    @JsConstructor
    public Version(String full) {}
    public String major;
    public String minor;
    public String patch;
}
