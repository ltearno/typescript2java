package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.forms.ControlContainer;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\reactive_directives\form_group_name.d.ts
  * Package ng.forms
  * Name FormGroupName
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface FormGroupName extends OnInit {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsConstructor
    public FormGroupName(ControlContainer parent,JsArray<Object> validators,JsArray<Object> asyncValidators) {}
}
