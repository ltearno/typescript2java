package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.core.ElementRef;
import ng.core.Renderer;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\select_multiple_control_value_accessor.d.ts
  * Package ng.forms
  * Name NgSelectMultipleOption
  * Marks `<option>` as dynamic, so Angular can be notified when options change.
  * 
  * ### Example
  * 
  * ```
  * <select multiple name="city" ngModel>
  *    <option *ngFor="let c of cities" [value]="c"></option>
  * </select>
  * ```
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class NgSelectMultipleOption extends OnDestroy {
    public Object _element;
    public Object _renderer;
    public Object _select;
    public String id;
    @JsConstructor
    public NgSelectMultipleOption(ElementRef _element,Renderer _renderer,SelectMultipleControlValueAccessor _select) {}
    public Object ngValue;
    public Object value;
    public native  void ngOnDestroy();
}
