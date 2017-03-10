package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\platform-browser\src\browser\browser_adapter.d.ts
  * Package ng.platformBrowser
  * Name BrowserDomAdapter
  * A `DomAdapter` powered by full browser DOM APIs.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BrowserDomAdapter extends GenericBrowserDomAdapter {
     void parse(String templateHtml);
     boolean hasProperty(Node element,String name);
     void setProperty(Node el,String name,Object value);
     Object getProperty(Node el,String name);
     Object invoke(Node el,String methodName,JsArray<Object> args);
     void logError(String error);
     void log(String error);
     void logGroup(String error);
     void logGroupEnd();
    @JsProperty(name="attrToPropMap")
    Object getAttrToPropMap();
    @JsProperty(name="attrToPropMap")
    void setAttrToPropMap(Object value);
     Object query(String selector);
     HTMLElement querySelector(Element el,String selector);
     JsArray<Object> querySelectorAll(Object el,String selector);
     void on(Node el,Object evt,Object listener);
     Function onAndCancel(Node el,Object evt,Object listener);
     void dispatchEvent(Node el,Object evt);
     MouseEvent createMouseEvent(String eventType);
     Event createEvent(Object eventType);
     void preventDefault(Event evt);
     boolean isPrevented(Event evt);
     String getInnerHTML(HTMLElement el);
     Node getTemplateContent(Node el);
     String getOuterHTML(HTMLElement el);
     String nodeName(Node node);
     String nodeValue(Node node);
     String type(HTMLInputElement node);
     Node content(Node node);
     Node firstChild(Node el);
     Node nextSibling(Node el);
     Node parentElement(Node el);
     JsArray<Node> childNodes(Object el);
     JsArray<Object> childNodesAsList(Node el);
     void clearNodes(Node el);
     void appendChild(Node el,Node node);
     void removeChild(Node el,Node node);
     void replaceChild(Node el,Node newChild,Node oldChild);
     Node remove(Node node);
     void insertBefore(Node el,Node node);
     void insertAllBefore(Node el,JsArray<Node> nodes);
     void insertAfter(Node el,Object node);
     void setInnerHTML(Element el,String value);
     String getText(Node el);
     void setText(Node el,String value);
     String getValue(Object el);
     void setValue(Object el,String value);
     boolean getChecked(Object el);
     void setChecked(Object el,boolean value);
     Comment createComment(String text);
     HTMLElement createTemplate(Object html);
     HTMLElement createElement(String tagName,Document /* optional */ doc);
     Element createElementNS(String ns,String tagName,Document /* optional */ doc);
     Text createTextNode(String text,Document /* optional */ doc);
     HTMLScriptElement createScriptTag(String attrName,String attrValue,Document /* optional */ doc);
     HTMLStyleElement createStyleElement(String css,Document /* optional */ doc);
     DocumentFragment createShadowRoot(HTMLElement el);
     DocumentFragment getShadowRoot(HTMLElement el);
     HTMLElement getHost(HTMLElement el);
     Node clone(Node node);
     JsArray<HTMLElement> getElementsByClassName(Object element,String name);
     JsArray<HTMLElement> getElementsByTagName(Object element,String name);
     JsArray<Object> classList(Object element);
     void addClass(Object element,String className);
     void removeClass(Object element,String className);
     boolean hasClass(Object element,String className);
     void setStyle(Object element,String styleName,String styleValue);
     void removeStyle(Object element,String stylename);
     String getStyle(Object element,String stylename);
     boolean hasStyle(Object element,String styleName,String /* optional */ styleValue);
     String tagName(Object element);
     Map<String,String> attributeMap(Object element);
     boolean hasAttribute(Element element,String attribute);
     boolean hasAttributeNS(Element element,String ns,String attribute);
     String getAttribute(Element element,String attribute);
     String getAttributeNS(Element element,String ns,String name);
     void setAttribute(Element element,String name,String value);
     void setAttributeNS(Element element,String ns,String name,String value);
     void removeAttribute(Element element,String attribute);
     void removeAttributeNS(Element element,String ns,String name);
     Object templateAwareRoot(Node el);
     HTMLDocument createHtmlDocument();
     HTMLDocument defaultDoc();
     Object getBoundingClientRect(Element el);
     String getTitle();
     void setTitle(String newTitle);
     boolean elementMatches(Object n,String selector);
     boolean isTemplateElement(Node el);
     boolean isTextNode(Node node);
     boolean isCommentNode(Node node);
     boolean isElementNode(Node node);
     boolean hasShadowRoot(Object node);
     boolean isShadowRoot(Object node);
     Object importIntoDoc(Node node);
     Object adoptNode(Node node);
     String getHref(Element el);
     String getEventKey(Object event);
     EventTarget getGlobalEventTarget(String target);
     History getHistory();
     Location getLocation();
     String getBaseHref();
     void resetBaseElement();
     String getUserAgent();
     void setData(Element element,String name,String value);
     String getData(Element element,String name);
     Object getComputedStyle(Object element);
     void setGlobalVar(String path,Object value);
     boolean supportsWebAnimation();
     int performanceNow();
     boolean supportsCookies();
     String getCookie(String name);
     void setCookie(String name,String value);
}
