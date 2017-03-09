package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\platform-browser\src\browser\generic_browser_adapter.d.ts
  * Package ng.platformBrowser
  * Name GenericBrowserDomAdapter
  * Provides DOM operations in any browser environment.
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public interface GenericBrowserDomAdapter extends DomAdapter {
    @JsProperty(name="_animationPrefix")
    Object _animationPrefix();
    @JsProperty(name="_animationPrefix")
    void _animationPrefix(Object value);
    @JsProperty(name="_transitionEnd")
    Object _transitionEnd();
    @JsProperty(name="_transitionEnd")
    void _transitionEnd(Object value);
    @JsConstructor
    public GenericBrowserDomAdapter() {}
     JsArray<Node> getDistributedNodes(HTMLElement el);
     void resolveAndSetHref(HTMLAnchorElement el,String baseUrl,String href);
     boolean supportsDOMEvents();
     boolean supportsNativeShadowDOM();
     String getAnimationPrefix();
     String getTransitionEnd();
     boolean supportsAnimation();
}
