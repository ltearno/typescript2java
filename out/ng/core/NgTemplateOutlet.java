package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\common\src\directives\ng_template_outlet.d.ts
  * Package ng.core
  * Name NgTemplateOutlet
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgTemplateOutlet extends OnChanges {
    public Object _viewContainerRef;
    public Object _viewRef;
    public Object _context;
    public Object _templateRef;
    @JsConstructor
    public NgTemplateOutlet(ViewContainerRef _viewContainerRef) {}
    public Object ngOutletContext;
    public TemplateRef<Object> ngTemplateOutlet;
    public native  void ngOnChanges(SimpleChanges changes);
}
