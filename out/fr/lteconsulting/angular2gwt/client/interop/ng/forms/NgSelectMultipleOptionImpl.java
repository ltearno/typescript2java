package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ElementRef;
import ng.core.Renderer;
import ng.forms.SelectMultipleControlValueAccessor;
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
@JsType( isNative=true, namespace="ng.forms", name="NgSelectMultipleOption" )
public class NgSelectMultipleOptionImpl extends OnDestroy {
    @JsProperty(name="_element")
    Object get_element();
    @JsProperty(name="_element")
    void set_element(Object value);
    @JsProperty(name="_renderer")
    Object get_renderer();
    @JsProperty(name="_renderer")
    void set_renderer(Object value);
    @JsProperty(name="_select")
    Object get_select();
    @JsProperty(name="_select")
    void set_select(Object value);
    @JsProperty(name="id")
    String getId();
    @JsProperty(name="id")
    void setId(String value);
    @JsConstructor
    public NgSelectMultipleOptionImpl(ElementRef _element,Renderer _renderer,SelectMultipleControlValueAccessor _select) {}
    @JsProperty(name="ngValue")
    Object getNgValue();
    @JsProperty(name="ngValue")
    void setNgValue(Object value);
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    public native  void ngOnDestroy();
}
