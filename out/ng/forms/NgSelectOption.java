package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.core.ElementRef;
import ng.core.Renderer;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\select_control_value_accessor.d.ts
  * Package ng.forms
  * Name NgSelectOption
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class NgSelectOption extends OnDestroy {
    public Object _element;
    public Object _renderer;
    public Object _select;
    public String id;
    @JsConstructor
    public NgSelectOption(ElementRef _element,Renderer _renderer,SelectControlValueAccessor _select) {}
    public Object ngValue;
    public Object value;
    public native  void ngOnDestroy();
}
