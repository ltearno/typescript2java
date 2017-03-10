package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowserDynamic;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\platform-browser-dynamic\src\resource_loader\resource_loader_impl.d.ts
  * Package ng.platformBrowserDynamic
  * Name ResourceLoaderImpl
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowserDynamic", name="ResourceLoaderImpl" )
public class ResourceLoaderImplImpl extends ResourceLoader {
    public native  Promise<String> get(String url);
}
