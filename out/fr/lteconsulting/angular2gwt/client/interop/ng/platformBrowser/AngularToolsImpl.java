package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.platformBrowser.AngularProfiler;
import jsinterop.annotations.JsProperty;
import ng.core.ComponentRef;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\src\browser\tools\common_tools.d.ts
  * Package ng.platformBrowser
  * Name AngularTools
  * Entry point for all Angular debug tools. This object corresponds to the `ng`
  * global variable accessible in the dev console.
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="AngularTools" )
public class AngularToolsImpl  {
    @JsProperty(name="profiler")
    AngularProfiler getProfiler();
    @JsProperty(name="profiler")
    void setProfiler(AngularProfiler value);
    @JsConstructor
    public AngularToolsImpl(ComponentRef<Object> ref) {}
}
