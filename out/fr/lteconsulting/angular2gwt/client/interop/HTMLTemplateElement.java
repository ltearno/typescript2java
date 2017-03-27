package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLTemplateElement
  * Typescript fqn HTMLTemplateElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLTemplateElement extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="content")
    DocumentFragment getContent();

    @JsProperty(name="content")
    void setContent(DocumentFragment value);

    <K> void addEventListener(K type, JsFunction2<HTMLTemplateElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
