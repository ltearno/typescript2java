package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.forms.ControlContainer;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\forms\src\directives\ng_model_group.d.ts
  * Package ng.forms
  * Name NgModelGroup
  * 
  **/
@JsType( isNative=true, namespace="ng.forms", name="NgModelGroup" )
public class NgModelGroupImpl extends OnInit {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsConstructor
    public NgModelGroupImpl(ControlContainer parent,JsArray<Object> validators,JsArray<Object> asyncValidators) {}
}
