package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.forms.NgControl;
import ng.forms.FormControl;
import ng.forms.AbstractFormGroupDirective;
import ng.forms.FormGroup;

/**
  * Generated from tests\@angular\forms\src\directives\form_interface.d.ts
  * Package ng.forms
  * Name Form
  * An interface that {@link FormGroupDirective} and {@link NgForm} implement.
  * 
  * Only used by the forms module.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Form  {
     void addControl(NgControl dir);
     void removeControl(NgControl dir);
     FormControl getControl(NgControl dir);
     void addFormGroup(AbstractFormGroupDirective dir);
     void removeFormGroup(AbstractFormGroupDirective dir);
     FormGroup getFormGroup(AbstractFormGroupDirective dir);
     void updateModel(NgControl dir,Object value);
}
