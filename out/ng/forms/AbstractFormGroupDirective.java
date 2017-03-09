package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\forms\src\directives\abstract_form_group_directive.d.ts
  * Package ng.forms
  * Name AbstractFormGroupDirective
  * This is a base class for code shared between {@link NgModelGroup} and {@link FormGroupName}.
  **/
@JsType( isNative=true, namespace="ng.forms" )
public class AbstractFormGroupDirective extends OnInit {
    public native  void ngOnInit();
    public native  void ngOnDestroy();
    public FormGroup control;
    public JsArray<String> path;
    public Form formDirective;
    public ValidatorFn validator;
    public AsyncValidatorFn asyncValidator;
}
