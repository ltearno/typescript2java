package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\compiler\src\resource_loader.d.ts
  * Package ng.core
  * Name ResourceLoader
  * An interface for retrieving documents by URL that the compiler uses
  * to load templates.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ResourceLoader  {
    public native  Promise<String> get(String url);
}
