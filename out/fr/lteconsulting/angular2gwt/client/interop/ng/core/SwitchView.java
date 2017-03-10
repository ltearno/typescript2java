package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ViewContainerRef;
import ng.core.TemplateRef;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\directives\ng_switch.d.ts
  * Package ng.core
  * Name SwitchView
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface SwitchView  {
    @JsProperty(name="_viewContainerRef")
    Object get_viewContainerRef();
    @JsProperty(name="_viewContainerRef")
    void set_viewContainerRef(Object value);
    @JsProperty(name="_templateRef")
    Object get_templateRef();
    @JsProperty(name="_templateRef")
    void set_templateRef(Object value);
    @JsProperty(name="_created")
    Object get_created();
    @JsProperty(name="_created")
    void set_created(Object value);
    @JsConstructor
    public SwitchView(ViewContainerRef _viewContainerRef,TemplateRef<Object> _templateRef) {}
     void create();
     void destroy();
     void enforceState(boolean created);
}
