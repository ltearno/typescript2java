package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\template_ref.d.ts
  * Package ng.core
  * Name TemplateRef_
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TemplateRef_<C> extends TemplateRef<C> {
    public Object _parentView;
    public Object _nodeIndex;
    public Object _nativeElement;
    @JsConstructor
    public TemplateRef_(AppView<Object> _parentView,int _nodeIndex,Object _nativeElement) {}
    public native  EmbeddedViewRef<C> createEmbeddedView(C context);
    public ElementRef elementRef;
}
