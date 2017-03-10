package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ViewContainerRef;
import jsinterop.annotations.JsConstructor;
import ng.core.TemplateRef;
import ng.core.SimpleChanges;

/**
  * Generated from tests\@angular\common\src\directives\ng_template_outlet.d.ts
  * Package ng.core
  * Name NgTemplateOutlet
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgTemplateOutlet extends OnChanges {
    @JsProperty(name="_viewContainerRef")
    Object get_viewContainerRef();
    @JsProperty(name="_viewContainerRef")
    void set_viewContainerRef(Object value);
    @JsProperty(name="_viewRef")
    Object get_viewRef();
    @JsProperty(name="_viewRef")
    void set_viewRef(Object value);
    @JsProperty(name="_context")
    Object get_context();
    @JsProperty(name="_context")
    void set_context(Object value);
    @JsProperty(name="_templateRef")
    Object get_templateRef();
    @JsProperty(name="_templateRef")
    void set_templateRef(Object value);
    @JsConstructor
    public NgTemplateOutlet(ViewContainerRef _viewContainerRef) {}
    @JsProperty(name="ngOutletContext")
    Object getNgOutletContext();
    @JsProperty(name="ngOutletContext")
    void setNgOutletContext(Object value);
    @JsProperty(name="ngTemplateOutlet")
    TemplateRef<Object> getNgTemplateOutlet();
    @JsProperty(name="ngTemplateOutlet")
    void setNgTemplateOutlet(TemplateRef<Object> value);
     void ngOnChanges(SimpleChanges changes);
}
