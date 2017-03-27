package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSHTMLWebViewElement
  * Typescript fqn MSHTMLWebViewElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSHTMLWebViewElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="canGoBack")
    boolean getCanGoBack();

    @JsProperty(name="canGoBack")
    void setCanGoBack(boolean value);

    @JsProperty(name="canGoForward")
    boolean getCanGoForward();

    @JsProperty(name="canGoForward")
    void setCanGoForward(boolean value);

    @JsProperty(name="containsFullScreenElement")
    boolean getContainsFullScreenElement();

    @JsProperty(name="containsFullScreenElement")
    void setContainsFullScreenElement(boolean value);

    @JsProperty(name="documentTitle")
    String getDocumentTitle();

    @JsProperty(name="documentTitle")
    void setDocumentTitle(String value);

    @JsProperty(name="height")
    Number getHeight();

    @JsProperty(name="height")
    void setHeight(Number value);

    @JsProperty(name="settings")
    MSWebViewSettings getSettings();

    @JsProperty(name="settings")
    void setSettings(MSWebViewSettings value);

    @JsProperty(name="src")
    String getSrc();

    @JsProperty(name="src")
    void setSrc(String value);

    @JsProperty(name="width")
    Number getWidth();

    @JsProperty(name="width")
    void setWidth(Number value);

    void addWebAllowedObject(String name, Object applicationObject);

    String buildLocalStreamUri(String contentIdentifier, String relativePath);

    MSWebViewAsyncOperation capturePreviewToBlobAsync();

    MSWebViewAsyncOperation captureSelectedContentToDataPackageAsync();

    DeferredPermissionRequest getDeferredPermissionRequestById(Number id);

    JsArray<DeferredPermissionRequest> getDeferredPermissionRequests();

    void goBack();

    void goForward();

    MSWebViewAsyncOperation invokeScriptAsync(String scriptName, JsArray<Object> /* optional */ args);

    void navigate(String uri);

    void navigateFocus(String navigationReason, FocusNavigationOrigin origin);

    void navigateToLocalStreamUri(String source, Object streamResolver);

    void navigateToString(String contents);

    void navigateWithHttpRequestMessage(Object requestMessage);

    void refresh();

    void stop();

    <K> void addEventListener(K type, JsFunction2<MSHTMLWebViewElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
