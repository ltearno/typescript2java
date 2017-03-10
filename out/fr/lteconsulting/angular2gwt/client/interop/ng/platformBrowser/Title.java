package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\platform-browser\src\browser\title.d.ts
  * Package ng.platformBrowser
  * Name Title
  * A service that can be used to get and set the title of a current HTML document.
  * 
  * Since an Angular 2 application can't be bootstrapped on the entire HTML document (`<html>` tag)
  * it is not possible to bind to the `text` property of the `HTMLTitleElement` elements
  * (representing the `<title>` tag). Instead, this service can be used to set and get the current
  * title value.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Title  {
     String getTitle();
     void setTitle(String newTitle);
}
