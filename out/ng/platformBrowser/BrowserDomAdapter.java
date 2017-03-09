package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\platform-browser\src\browser\browser_adapter.d.ts
  * Package ng.platformBrowser
  * Name BrowserDomAdapter
  * A `DomAdapter` powered by full browser DOM APIs.
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class BrowserDomAdapter extends GenericBrowserDomAdapter {
    public native  void parse(String templateHtml);
    public static native  void makeCurrent();
    public native  boolean hasProperty(Node element,String name);
    public native  void setProperty(Node el,String name,Object value);
    public native  Object getProperty(Node el,String name);
    public native  Object invoke(Node el,String methodName,JsArray<Object> args);
    public native  void logError(String error);
    public native  void log(String error);
    public native  void logGroup(String error);
    public native  void logGroupEnd();
    public Object attrToPropMap;
    public native  Object query(String selector);
    public native  HTMLElement querySelector(Element el,String selector);
    public native  JsArray<Object> querySelectorAll(Object el,String selector);
    public native  void on(Node el,Object evt,Object listener);
    public native  Function onAndCancel(Node el,Object evt,Object listener);
    public native  void dispatchEvent(Node el,Object evt);
    public native  MouseEvent createMouseEvent(String eventType);
    public native  Event createEvent(Object eventType);
    public native  void preventDefault(Event evt);
    public native  boolean isPrevented(Event evt);
    public native  String getInnerHTML(HTMLElement el);
    public native  Node getTemplateContent(Node el);
    public native  String getOuterHTML(HTMLElement el);
    public native  String nodeName(Node node);
    public native  String nodeValue(Node node);
    public native  String type(HTMLInputElement node);
    public native  Node content(Node node);
    public native  Node firstChild(Node el);
    public native  Node nextSibling(Node el);
    public native  Node parentElement(Node el);
    public native  JsArray<Node> childNodes(Object el);
    public native  JsArray<Object> childNodesAsList(Node el);
    public native  void clearNodes(Node el);
    public native  void appendChild(Node el,Node node);
    public native  void removeChild(Node el,Node node);
    public native  void replaceChild(Node el,Node newChild,Node oldChild);
    public native  Node remove(Node node);
    public native  void insertBefore(Node el,Node node);
    public native  void insertAllBefore(Node el,JsArray<Node> nodes);
    public native  void insertAfter(Node el,Object node);
    public native  void setInnerHTML(Element el,String value);
    public native  String getText(Node el);
    public native  void setText(Node el,String value);
    public native  String getValue(Object el);
    public native  void setValue(Object el,String value);
    public native  boolean getChecked(Object el);
    public native  void setChecked(Object el,boolean value);
    public native  Comment createComment(String text);
    public native  HTMLElement createTemplate(Object html);
    public native  HTMLElement createElement(String tagName,Document /* optional */ doc);
    public native  Element createElementNS(String ns,String tagName,Document /* optional */ doc);
    public native  Text createTextNode(String text,Document /* optional */ doc);
    public native  HTMLScriptElement createScriptTag(String attrName,String attrValue,Document /* optional */ doc);
    public native  HTMLStyleElement createStyleElement(String css,Document /* optional */ doc);
    public native  DocumentFragment createShadowRoot(HTMLElement el);
    public native  DocumentFragment getShadowRoot(HTMLElement el);
    public native  HTMLElement getHost(HTMLElement el);
    public native  Node clone(Node node);
    public native  JsArray<HTMLElement> getElementsByClassName(Object element,String name);
    public native  JsArray<HTMLElement> getElementsByTagName(Object element,String name);
    public native  JsArray<Object> classList(Object element);
    public native  void addClass(Object element,String className);
    public native  void removeClass(Object element,String className);
    public native  boolean hasClass(Object element,String className);
    public native  void setStyle(Object element,String styleName,String styleValue);
    public native  void removeStyle(Object element,String stylename);
    public native  String getStyle(Object element,String stylename);
    public native  boolean hasStyle(Object element,String styleName,String /* optional */ styleValue);
    public native  String tagName(Object element);
    public native  Map<String,String> attributeMap(Object element);
    public native  boolean hasAttribute(Element element,String attribute);
    public native  boolean hasAttributeNS(Element element,String ns,String attribute);
    public native  String getAttribute(Element element,String attribute);
    public native  String getAttributeNS(Element element,String ns,String name);
    public native  void setAttribute(Element element,String name,String value);
    public native  void setAttributeNS(Element element,String ns,String name,String value);
    public native  void removeAttribute(Element element,String attribute);
    public native  void removeAttributeNS(Element element,String ns,String name);
    public native  Object templateAwareRoot(Node el);
    public native  HTMLDocument createHtmlDocument();
    public native  HTMLDocument defaultDoc();
    public native  Object getBoundingClientRect(Element el);
    public native  String getTitle();
    public native  void setTitle(String newTitle);
    public native  boolean elementMatches(Object n,String selector);
    public native  boolean isTemplateElement(Node el);
    public native  boolean isTextNode(Node node);
    public native  boolean isCommentNode(Node node);
    public native  boolean isElementNode(Node node);
    public native  boolean hasShadowRoot(Object node);
    public native  boolean isShadowRoot(Object node);
    public native  Object importIntoDoc(Node node);
    public native  Object adoptNode(Node node);
    public native  String getHref(Element el);
    public native  String getEventKey(Object event);
    public native  EventTarget getGlobalEventTarget(String target);
    public native  History getHistory();
    public native  Location getLocation();
    public native  String getBaseHref();
    public native  void resetBaseElement();
    public native  String getUserAgent();
    public native  void setData(Element element,String name,String value);
    public native  String getData(Element element,String name);
    public native  Object getComputedStyle(Object element);
    public native  void setGlobalVar(String path,Object value);
    public native  boolean supportsWebAnimation();
    public native  int performanceNow();
    public native  boolean supportsCookies();
    public native  String getCookie(String name);
    public native  void setCookie(String name,String value);
}