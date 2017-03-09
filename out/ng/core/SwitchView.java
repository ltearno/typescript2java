package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\directives\ng_switch.d.ts
  * Package ng.core
  * Name SwitchView
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class SwitchView  {
    public Object _viewContainerRef;
    public Object _templateRef;
    public Object _created;
    @JsConstructor
    public SwitchView(ViewContainerRef _viewContainerRef,TemplateRef<Object> _templateRef) {}
    public native  void create();
    public native  void destroy();
    public native  void enforceState(boolean created);
}
