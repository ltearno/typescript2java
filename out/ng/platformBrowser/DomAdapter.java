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
@JsType( isNative=true, namespace="ng.platformBrowser" )
public interface DomAdapter  {
    @JsProperty(name="resourceLoaderType")
    Type<Object> resourceLoaderType();
    @JsProperty(name="resourceLoaderType")
    void resourceLoaderType(Type<Object> value);
     boolean hasProperty(Object element,String name);
     Object setProperty(Element el,String name,Object value);
     Object getProperty(Element el,String name);
     Object invoke(Element el,String methodName,JsArray<Object> args);
     Object logError(Object error);
     Object log(Object error);
     Object logGroup(Object error);
     Object logGroupEnd();
    @JsProperty(name="attrToPropMap")
    JsTypedObject<String,String> attrToPropMap();
    @JsProperty(name="attrToPropMap")
    void attrToPropMap(JsTypedObject<String,String> value);
     Object parse(String templateHtml);
     Object query(String selector);
     HTMLElement querySelector(Object el,String selector);
     JsArray<Object> querySelectorAll(Object el,String selector);
     Object on(Object el,Object evt,Object listener);
     Function onAndCancel(Object el,Object evt,Object listener);
     Object dispatchEvent(Object el,Object evt);
     Object createMouseEvent(Object eventType);
     Object createEvent(String eventType);
     Object preventDefault(Object evt);
     boolean isPrevented(Object evt);
     String getInnerHTML(Object el);
     Object getTemplateContent(Object el);
     String getOuterHTML(Object el);
     String nodeName(Object node);
     String nodeValue(Object node);
     String type(Object node);
     Object content(Object node);
     Node firstChild(Object el);
     Node nextSibling(Object el);
     Node parentElement(Object el);
     JsArray<Node> childNodes(Object el);
     JsArray<Node> childNodesAsList(Object el);
     Object clearNodes(Object el);
     Object appendChild(Object el,Object node);
     Object removeChild(Object el,Object node);
     Object replaceChild(Object el,Object newNode,Object oldNode);
     Node remove(Object el);
     Object insertBefore(Object el,Object node);
     Object insertAllBefore(Object el,Object nodes);
     Object insertAfter(Object el,Object node);
     Object setInnerHTML(Object el,Object value);
     String getText(Object el);
     Object setText(Object el,String value);
     String getValue(Object el);
     Object setValue(Object el,String value);
     boolean getChecked(Object el);
     Object setChecked(Object el,boolean value);
     Object createComment(String text);
     HTMLElement createTemplate(Object html);
     HTMLElement createElement(Object tagName,Object /* optional */ doc);
     Element createElementNS(String ns,String tagName,Object /* optional */ doc);
     Text createTextNode(String text,Object /* optional */ doc);
     HTMLElement createScriptTag(String attrName,String attrValue,Object /* optional */ doc);
     HTMLStyleElement createStyleElement(String css,Object /* optional */ doc);
     Object createShadowRoot(Object el);
     Object getShadowRoot(Object el);
     Object getHost(Object el);
     JsArray<Node> getDistributedNodes(Object el);
     Node clone(Node node);
     JsArray<HTMLElement> getElementsByClassName(Object element,String name);
     JsArray<HTMLElement> getElementsByTagName(Object element,String name);
     JsArray<Object> classList(Object element);
     Object addClass(Object element,String className);
     Object removeClass(Object element,String className);
     boolean hasClass(Object element,String className);
     Object setStyle(Object element,String styleName,String styleValue);
     Object removeStyle(Object element,String styleName);
     String getStyle(Object element,String styleName);
     boolean hasStyle(Object element,String styleName,String /* optional */ styleValue);
     String tagName(Object element);
     Map<String,String> attributeMap(Object element);
     boolean hasAttribute(Object element,String attribute);
     boolean hasAttributeNS(Object element,String ns,String attribute);
     String getAttribute(Object element,String attribute);
     String getAttributeNS(Object element,String ns,String attribute);
     Object setAttribute(Object element,String name,String value);
     Object setAttributeNS(Object element,String ns,String name,String value);
     Object removeAttribute(Object element,String attribute);
     Object removeAttributeNS(Object element,String ns,String attribute);
     Object templateAwareRoot(Object el);
     HTMLDocument createHtmlDocument();
     HTMLDocument defaultDoc();
     Object getBoundingClientRect(Object el);
     String getTitle();
     Object setTitle(String newTitle);
     boolean elementMatches(Object n,String selector);
     boolean isTemplateElement(Object el);
     boolean isTextNode(Object node);
     boolean isCommentNode(Object node);
     boolean isElementNode(Object node);
     boolean hasShadowRoot(Object node);
     boolean isShadowRoot(Object node);
     Node importIntoDoc(Node node);
     Node adoptNode(Node node);
     String getHref(Object element);
     String getEventKey(Object event);
     Object resolveAndSetHref(Object element,String baseUrl,String href);
     boolean supportsDOMEvents();
     boolean supportsNativeShadowDOM();
     Object getGlobalEventTarget(String target);
     History getHistory();
     Location getLocation();
     String getBaseHref();
     void resetBaseElement();
     String getUserAgent();
     Object setData(Object element,String name,String value);
     Object getComputedStyle(Object element);
     String getData(Object element,String name);
     Object setGlobalVar(String name,Object value);
     boolean supportsWebAnimation();
     int performanceNow();
     String getAnimationPrefix();
     String getTransitionEnd();
     boolean supportsAnimation();
     boolean supportsCookies();
     String getCookie(String name);
     Object setCookie(String name,String value);
}
