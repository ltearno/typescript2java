package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\src\dom\shared_styles_host.d.ts
  * Package ng.platformBrowser
  * Name DomSharedStylesHost
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class DomSharedStylesHost extends OnDestroy {
    public Object _doc;
    public Object _hostNodes;
    public Object _styleNodes;
    @JsConstructor
    public DomSharedStylesHost(Object _doc) {}
    public native  void _addStylesToHost();
    public native  void addHost(Node hostNode);
    public native  void removeHost(Node hostNode);
    public native  void onStylesAdded(Set<String> additions);
    public native  void ngOnDestroy();
}
