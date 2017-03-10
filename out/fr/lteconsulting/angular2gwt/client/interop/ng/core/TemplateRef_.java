package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AppView;
import jsinterop.annotations.JsConstructor;
import ng.core.EmbeddedViewRef;
import ng.core.ElementRef;

/**
  * Generated from tests\@angular\core\src\linker\template_ref.d.ts
  * Package ng.core
  * Name TemplateRef_
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TemplateRef_<C> extends TemplateRef<C> {
    @JsProperty(name="_parentView")
    Object get_parentView();
    @JsProperty(name="_parentView")
    void set_parentView(Object value);
    @JsProperty(name="_nodeIndex")
    Object get_nodeIndex();
    @JsProperty(name="_nodeIndex")
    void set_nodeIndex(Object value);
    @JsProperty(name="_nativeElement")
    Object get_nativeElement();
    @JsProperty(name="_nativeElement")
    void set_nativeElement(Object value);
    @JsConstructor
    public TemplateRef_(AppView<Object> _parentView,int _nodeIndex,Object _nativeElement) {}
     EmbeddedViewRef<C> createEmbeddedView(C context);
    @JsProperty(name="elementRef")
    ElementRef getElementRef();
    @JsProperty(name="elementRef")
    void setElementRef(ElementRef value);
}
