package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import rxjs.Observable;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\forms\src\model.d.ts
  * Package ng.forms
  * Name AbstractControl
  * 
  **/
@JsType( isNative=true, namespace="ng.forms" )
public interface AbstractControl  {
    @JsProperty(name="validator")
    ValidatorFn validator();
    @JsProperty(name="validator")
    void validator(ValidatorFn value);
    @JsProperty(name="asyncValidator")
    AsyncValidatorFn asyncValidator();
    @JsProperty(name="asyncValidator")
    void asyncValidator(AsyncValidatorFn value);
    @JsProperty(name="_valueChanges")
    Object _valueChanges();
    @JsProperty(name="_valueChanges")
    void _valueChanges(Object value);
    @JsProperty(name="_statusChanges")
    Object _statusChanges();
    @JsProperty(name="_statusChanges")
    void _statusChanges(Object value);
    @JsProperty(name="_status")
    Object _status();
    @JsProperty(name="_status")
    void _status(Object value);
    @JsProperty(name="_errors")
    Object _errors();
    @JsProperty(name="_errors")
    void _errors(Object value);
    @JsProperty(name="_pristine")
    Object _pristine();
    @JsProperty(name="_pristine")
    void _pristine(Object value);
    @JsProperty(name="_touched")
    Object _touched();
    @JsProperty(name="_touched")
    void _touched(Object value);
    @JsProperty(name="_parent")
    Object _parent();
    @JsProperty(name="_parent")
    void _parent(Object value);
    @JsProperty(name="_asyncValidationSubscription")
    Object _asyncValidationSubscription();
    @JsProperty(name="_asyncValidationSubscription")
    void _asyncValidationSubscription(Object value);
    @JsConstructor
    public AbstractControl(ValidatorFn validator,AsyncValidatorFn asyncValidator) {}
    @JsProperty(name="value")
    Object value();
    @JsProperty(name="value")
    void value(Object value);
    @JsProperty(name="parent")
    Object /* UnionType */ parent();
    @JsProperty(name="parent")
    void parent(Object /* UnionType */ value);
    @JsProperty(name="status")
    String status();
    @JsProperty(name="status")
    void status(String value);
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
    @JsProperty(name="disabled")
    boolean disabled();
    @JsProperty(name="disabled")
    void disabled(boolean value);
    @JsProperty(name="enabled")
    boolean enabled();
    @JsProperty(name="enabled")
    void enabled(boolean value);
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
    @JsProperty(name="valueChanges")
    Observable<Object> valueChanges();
    @JsProperty(name="valueChanges")
    void valueChanges(Observable<Object> value);
    @JsProperty(name="statusChanges")
    Observable<Object> statusChanges();
    @JsProperty(name="statusChanges")
    void statusChanges(Observable<Object> value);
     void setValidators(Object /* UnionType */ newValidator);
     void setAsyncValidators(Object /* UnionType */ newValidator);
     void clearValidators();
     void clearAsyncValidators();
     void markAsTouched(/* TypeLiteral */ Object /* optional */ undefined);
     void markAsUntouched(/* TypeLiteral */ Object /* optional */ undefined);
     void markAsDirty(/* TypeLiteral */ Object /* optional */ undefined);
     void markAsPristine(/* TypeLiteral */ Object /* optional */ undefined);
     void markAsPending(/* TypeLiteral */ Object /* optional */ undefined);
     void disable(/* TypeLiteral */ Object /* optional */ undefined);
     void enable(/* TypeLiteral */ Object /* optional */ undefined);
     void _updateAncestors();
     void setParent(Object /* UnionType */ parent);
     void setValue(Object value,Object /* optional */ options);
     void patchValue(Object value,Object /* optional */ options);
     void reset(Object /* optional */ value,Object /* optional */ options);
     void updateValueAndValidity(/* TypeLiteral */ Object /* optional */ undefined);
     void _setInitialStatus();
     void _runValidator();
     void _runAsyncValidator();
     void _cancelExistingSubscription();
     void setErrors(JsTypedObject<String,Object> errors,/* TypeLiteral */ Object /* optional */ undefined);
     AbstractControl get(Object /* UnionType */ path);
     Object getError(String errorCode,JsArray<String> /* optional */ path);
     boolean hasError(String errorCode,JsArray<String> /* optional */ path);
    @JsProperty(name="root")
    AbstractControl root();
    @JsProperty(name="root")
    void root(AbstractControl value);
     void _calculateStatus();
}
