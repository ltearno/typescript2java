package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\platform-browser\src\dom\shared_styles_host.d.ts
  * Package ng.platformBrowser
  * Name SharedStylesHost
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SharedStylesHost  {
     void addStyles(JsArray<String> styles);
     void onStylesAdded(Set<String> additions);
     JsArray<String> getAllStyles();
}
