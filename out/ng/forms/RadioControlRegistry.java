package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\forms\src\directives\radio_control_value_accessor.d.ts
  * Package ng.forms
  * Name RadioControlRegistry
  * Internal class used by Angular to uncheck radio buttons with the matching name.
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class RadioControlRegistry  {
    public Object _accessors;
    public native  void add(NgControl control,RadioControlValueAccessor accessor);
    public native  void remove(RadioControlValueAccessor accessor);
    public native  void select(RadioControlValueAccessor accessor);
    public native  void _isSameGroup();
}
