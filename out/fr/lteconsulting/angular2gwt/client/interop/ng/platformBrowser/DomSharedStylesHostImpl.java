package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\platform-browser\src\dom\shared_styles_host.d.ts
  * Package ng.platformBrowser
  * Name DomSharedStylesHost
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="DomSharedStylesHost" )
public class DomSharedStylesHostImpl extends OnDestroy {
    @JsProperty(name="_doc")
    Object get_doc();
    @JsProperty(name="_doc")
    void set_doc(Object value);
    @JsProperty(name="_hostNodes")
    Object get_hostNodes();
    @JsProperty(name="_hostNodes")
    void set_hostNodes(Object value);
    @JsProperty(name="_styleNodes")
    Object get_styleNodes();
    @JsProperty(name="_styleNodes")
    void set_styleNodes(Object value);
    @JsConstructor
    public DomSharedStylesHostImpl(Object _doc) {}
    public native  void _addStylesToHost();
    public native  void addHost(Node hostNode);
    public native  void removeHost(Node hostNode);
    public native  void onStylesAdded(Set<String> additions);
    public native  void ngOnDestroy();
}
