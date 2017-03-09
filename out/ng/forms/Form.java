package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;

/**
  * Generated from tests\@angular\forms\src\directives\form_interface.d.ts
  * Package ng.forms
  * Name Form
  * An interface that {@link FormGroupDirective} and {@link NgForm} implement.
  * 
  * Only used by the forms module.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class Form  {
    public native  void addControl(NgControl dir);
    public native  void removeControl(NgControl dir);
    public native  FormControl getControl(NgControl dir);
    public native  void addFormGroup(AbstractFormGroupDirective dir);
    public native  void removeFormGroup(AbstractFormGroupDirective dir);
    public native  FormGroup getFormGroup(AbstractFormGroupDirective dir);
    public native  void updateModel(NgControl dir,Object value);
}
