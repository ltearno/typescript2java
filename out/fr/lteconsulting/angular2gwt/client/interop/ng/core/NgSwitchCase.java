package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ViewContainerRef;
import ng.core.TemplateRef;
import ng.core.NgSwitch;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\directives\ng_switch.d.ts
  * Package ng.core
  * Name NgSwitchCase
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgSwitchCase extends DoCheck {
    @JsProperty(name="ngSwitch")
    Object getNgSwitch();
    @JsProperty(name="ngSwitch")
    void setNgSwitch(Object value);
    @JsProperty(name="_view")
    Object get_view();
    @JsProperty(name="_view")
    void set_view(Object value);
    @JsProperty(name="ngSwitchCase")
    Object getNgSwitchCase();
    @JsProperty(name="ngSwitchCase")
    void setNgSwitchCase(Object value);
    @JsConstructor
    public NgSwitchCase(ViewContainerRef viewContainer,TemplateRef<Object> templateRef,NgSwitch ngSwitch) {}
     void ngDoCheck();
}
