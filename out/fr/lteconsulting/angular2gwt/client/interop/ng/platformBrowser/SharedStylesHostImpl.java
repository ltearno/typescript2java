package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\platform-browser\src\dom\shared_styles_host.d.ts
  * Package ng.platformBrowser
  * Name SharedStylesHost
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="SharedStylesHost" )
public class SharedStylesHostImpl  {
    public native  void addStyles(JsArray<String> styles);
    public native  void onStylesAdded(Set<String> additions);
    public native  JsArray<String> getAllStyles();
}
