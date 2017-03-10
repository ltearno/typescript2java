package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.core.Type;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\platform-browser\src\dom\dom_adapter.d.ts
  * Package ng.platformBrowser
  * Name DomAdapter
  * Provides DOM operations in an environment-agnostic way.
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="DomAdapter" )
public abstract class DomAdapterImpl  {
    @JsProperty(name="resourceLoaderType")
    Type<Object> getResourceLoaderType();
    @JsProperty(name="resourceLoaderType")
    void setResourceLoaderType(Type<Object> value);
    public native  boolean hasProperty(Object element,String name);
    public native  Object setProperty(Element el,String name,Object value);
    public native  Object getProperty(Element el,String name);
    public native  Object invoke(Element el,String methodName,JsArray<Object> args);
    public native  Object logError(Object error);
    public native  Object log(Object error);
    public native  Object logGroup(Object error);
    public native  Object logGroupEnd();
    @JsProperty(name="attrToPropMap")
    JsTypedObject<String,String> getAttrToPropMap();
    @JsProperty(name="attrToPropMap")
    void setAttrToPropMap(JsTypedObject<String,String> value);
    public native  Object parse(String templateHtml);
    public native  Object query(String selector);
    public native  HTMLElement querySelector(Object el,String selector);
    public native  JsArray<Object> querySelectorAll(Object el,String selector);
    public native  Object on(Object el,Object evt,Object listener);
    public native  Function onAndCancel(Object el,Object evt,Object listener);
    public native  Object dispatchEvent(Object el,Object evt);
    public native  Object createMouseEvent(Object eventType);
    public native  Object createEvent(String eventType);
    public native  Object preventDefault(Object evt);
    public native  boolean isPrevented(Object evt);
    public native  String getInnerHTML(Object el);
    public native  Object getTemplateContent(Object el);
    public native  String getOuterHTML(Object el);
    public native  String nodeName(Object node);
    public native  String nodeValue(Object node);
    public native  String type(Object node);
    public native  Object content(Object node);
    public native  Node firstChild(Object el);
    public native  Node nextSibling(Object el);
    public native  Node parentElement(Object el);
    public native  JsArray<Node> childNodes(Object el);
    public native  JsArray<Node> childNodesAsList(Object el);
    public native  Object clearNodes(Object el);
    public native  Object appendChild(Object el,Object node);
    public native  Object removeChild(Object el,Object node);
    public native  Object replaceChild(Object el,Object newNode,Object oldNode);
    public native  Node remove(Object el);
    public native  Object insertBefore(Object el,Object node);
    public native  Object insertAllBefore(Object el,Object nodes);
    public native  Object insertAfter(Object el,Object node);
    public native  Object setInnerHTML(Object el,Object value);
    public native  String getText(Object el);
    public native  Object setText(Object el,String value);
    public native  String getValue(Object el);
    public native  Object setValue(Object el,String value);
    public native  boolean getChecked(Object el);
    public native  Object setChecked(Object el,boolean value);
    public native  Object createComment(String text);
    public native  HTMLElement createTemplate(Object html);
    public native  HTMLElement createElement(Object tagName,Object /* optional */ doc);
    public native  Element createElementNS(String ns,String tagName,Object /* optional */ doc);
    public native  Text createTextNode(String text,Object /* optional */ doc);
    public native  HTMLElement createScriptTag(String attrName,String attrValue,Object /* optional */ doc);
    public native  HTMLStyleElement createStyleElement(String css,Object /* optional */ doc);
    public native  Object createShadowRoot(Object el);
    public native  Object getShadowRoot(Object el);
    public native  Object getHost(Object el);
    public native  JsArray<Node> getDistributedNodes(Object el);
    public native  Node clone(Node node);
    public native  JsArray<HTMLElement> getElementsByClassName(Object element,String name);
    public native  JsArray<HTMLElement> getElementsByTagName(Object element,String name);
    public native  JsArray<Object> classList(Object element);
    public native  Object addClass(Object element,String className);
    public native  Object removeClass(Object element,String className);
    public native  boolean hasClass(Object element,String className);
    public native  Object setStyle(Object element,String styleName,String styleValue);
    public native  Object removeStyle(Object element,String styleName);
    public native  String getStyle(Object element,String styleName);
    public native  boolean hasStyle(Object element,String styleName,String /* optional */ styleValue);
    public native  String tagName(Object element);
    public native  Map<String,String> attributeMap(Object element);
    public native  boolean hasAttribute(Object element,String attribute);
    public native  boolean hasAttributeNS(Object element,String ns,String attribute);
    public native  String getAttribute(Object element,String attribute);
    public native  String getAttributeNS(Object element,String ns,String attribute);
    public native  Object setAttribute(Object element,String name,String value);
    public native  Object setAttributeNS(Object element,String ns,String name,String value);
    public native  Object removeAttribute(Object element,String attribute);
    public native  Object removeAttributeNS(Object element,String ns,String attribute);
    public native  Object templateAwareRoot(Object el);
    public native  HTMLDocument createHtmlDocument();
    public native  HTMLDocument defaultDoc();
    public native  Object getBoundingClientRect(Object el);
    public native  String getTitle();
    public native  Object setTitle(String newTitle);
    public native  boolean elementMatches(Object n,String selector);
    public native  boolean isTemplateElement(Object el);
    public native  boolean isTextNode(Object node);
    public native  boolean isCommentNode(Object node);
    public native  boolean isElementNode(Object node);
    public native  boolean hasShadowRoot(Object node);
    public native  boolean isShadowRoot(Object node);
    public native  Node importIntoDoc(Node node);
    public native  Node adoptNode(Node node);
    public native  String getHref(Object element);
    public native  String getEventKey(Object event);
    public native  Object resolveAndSetHref(Object element,String baseUrl,String href);
    public native  boolean supportsDOMEvents();
    public native  boolean supportsNativeShadowDOM();
    public native  Object getGlobalEventTarget(String target);
    public native  History getHistory();
    public native  Location getLocation();
    public native  String getBaseHref();
    public native  void resetBaseElement();
    public native  String getUserAgent();
    public native  Object setData(Object element,String name,String value);
    public native  Object getComputedStyle(Object element);
    public native  String getData(Object element,String name);
    public native  Object setGlobalVar(String name,Object value);
    public native  boolean supportsWebAnimation();
    public native  int performanceNow();
    public native  String getAnimationPrefix();
    public native  String getTransitionEnd();
    public native  boolean supportsAnimation();
    public native  boolean supportsCookies();
    public native  String getCookie(String name);
    public native  Object setCookie(String name,String value);
}
