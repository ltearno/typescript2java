package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\forms\src\directives\abstract_control_directive.d.ts
  * Package ng.forms
  * Name AbstractControlDirective
  * Base class for control directives.
  * 
  * Only used internally in the forms module.
  **/
@JsType( isNative=true, namespace="ng.forms" )
public interface AbstractControlDirective  {
    @JsProperty(name="control")
    AbstractControl control();
    @JsProperty(name="control")
    void control(AbstractControl value);
    @JsProperty(name="value")
    Object value();
    @JsProperty(name="value")
    void value(Object value);
    @JsProperty(name="valid")
    boolean valid();
    @JsProperty(name="valid")
    void valid(boolean value);
    @JsProperty(name="invalid")
    boolean invalid();
    @JsProperty(name="invalid")
    void invalid(boolean value);
    @JsProperty(name="pending")
    boolean pending();
    @JsProperty(name="pending")
    void pending(boolean value);
    @JsProperty(name="errors")
    JsTypedObject<String,Object> errors();
    @JsProperty(name="errors")
    void errors(JsTypedObject<String,Object> value);
    @JsProperty(name="pristine")
    boolean pristine();
    @JsProperty(name="pristine")
    void pristine(boolean value);
    @JsProperty(name="dirty")
    boolean dirty();
    @JsProperty(name="dirty")
    void dirty(boolean value);
    @JsProperty(name="touched")
    boolean touched();
    @JsProperty(name="touched")
    void touched(boolean value);
    @JsProperty(name="untouched")
    boolean untouched();
    @JsProperty(name="untouched")
    void untouched(boolean value);
    @JsProperty(name="disabled")
    boolean disabled();
    @JsProperty(name="disabled")
    void disabled(boolean value);
    @JsProperty(name="enabled")
    boolean enabled();
    @JsProperty(name="enabled")
    void enabled(boolean value);
    @JsProperty(name="statusChanges")
    Observable<Object> statusChanges();
    @JsProperty(name="statusChanges")
    void statusChanges(Observable<Object> value);
    @JsProperty(name="valueChanges")
    Observable<Object> valueChanges();
    @JsProperty(name="valueChanges")
    void valueChanges(Observable<Object> value);
    @JsProperty(name="path")
    JsArray<String> path();
    @JsProperty(name="path")
    void path(JsArray<String> value);
     void reset(Object /* optional */ value);
     boolean hasError(String errorCode,JsArray<String> /* optional */ path);
     Object getError(String errorCode,JsArray<String> /* optional */ path);
}
