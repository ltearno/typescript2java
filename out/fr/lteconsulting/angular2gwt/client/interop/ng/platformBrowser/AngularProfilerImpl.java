package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.core.ApplicationRef;
import jsinterop.annotations.JsProperty;
import ng.core.ComponentRef;
import jsinterop.annotations.JsConstructor;
import ng.platformBrowser.ChangeDetectionPerfRecord;

/**
  * Generated from tests\@angular\platform-browser\src\browser\tools\common_tools.d.ts
  * Package ng.platformBrowser
  * Name AngularProfiler
  * Entry point for all Angular profiling-related debug tools. This object
  * corresponds to the `ng.profiler` in the dev console.
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="AngularProfiler" )
public class AngularProfilerImpl  {
    @JsProperty(name="appRef")
    ApplicationRef getAppRef();
    @JsProperty(name="appRef")
    void setAppRef(ApplicationRef value);
    @JsConstructor
    public AngularProfilerImpl(ComponentRef<Object> ref) {}
    public native  ChangeDetectionPerfRecord timeChangeDetection(Object config);
}
