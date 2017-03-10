package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.forms.Form;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\forms\src\directives\control_container.d.ts
  * Package ng.forms
  * Name ControlContainer
  * A directive that contains multiple {@link NgControl}s.
  * 
  * Only used by the forms module.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ControlContainer extends AbstractControlDirective {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="formDirective")
    Form getFormDirective();
    @JsProperty(name="formDirective")
    void setFormDirective(Form value);
    @JsProperty(name="path")
    JsArray<String> getPath();
    @JsProperty(name="path")
    void setPath(JsArray<String> value);
}
