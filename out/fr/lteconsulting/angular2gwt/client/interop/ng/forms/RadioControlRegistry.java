package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.forms.NgControl;
import ng.forms.RadioControlValueAccessor;

/**
  * Generated from tests\@angular\forms\src\directives\radio_control_value_accessor.d.ts
  * Package ng.forms
  * Name RadioControlRegistry
  * Internal class used by Angular to uncheck radio buttons with the matching name.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface RadioControlRegistry  {
    @JsProperty(name="_accessors")
    Object get_accessors();
    @JsProperty(name="_accessors")
    void set_accessors(Object value);
     void add(NgControl control,RadioControlValueAccessor accessor);
     void remove(RadioControlValueAccessor accessor);
     void select(RadioControlValueAccessor accessor);
     void _isSameGroup();
}
