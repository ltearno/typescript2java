package fr.lteconsulting.angular2gwt.client.interop.ng.forms;

import jsinterop.annotations.JsType;
import ng.forms.AbstractControl;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AbstractControlDirective  {
    @JsProperty(name="control")
    AbstractControl getControl();
    @JsProperty(name="control")
    void setControl(AbstractControl value);
    @JsProperty(name="value")
    Object getValue();
    @JsProperty(name="value")
    void setValue(Object value);
    @JsProperty(name="valid")
    boolean getValid();
    @JsProperty(name="valid")
    void setValid(boolean value);
    @JsProperty(name="invalid")
    boolean getInvalid();
    @JsProperty(name="invalid")
    void setInvalid(boolean value);
    @JsProperty(name="pending")
    boolean getPending();
    @JsProperty(name="pending")
    void setPending(boolean value);
    @JsProperty(name="errors")
    JsTypedObject<String,Object> getErrors();
    @JsProperty(name="errors")
    void setErrors(JsTypedObject<String,Object> value);
    @JsProperty(name="pristine")
    boolean getPristine();
    @JsProperty(name="pristine")
    void setPristine(boolean value);
    @JsProperty(name="dirty")
    boolean getDirty();
    @JsProperty(name="dirty")
    void setDirty(boolean value);
    @JsProperty(name="touched")
    boolean getTouched();
    @JsProperty(name="touched")
    void setTouched(boolean value);
    @JsProperty(name="untouched")
    boolean getUntouched();
    @JsProperty(name="untouched")
    void setUntouched(boolean value);
    @JsProperty(name="disabled")
    boolean getDisabled();
    @JsProperty(name="disabled")
    void setDisabled(boolean value);
    @JsProperty(name="enabled")
    boolean getEnabled();
    @JsProperty(name="enabled")
    void setEnabled(boolean value);
    @JsProperty(name="statusChanges")
    Observable<Object> getStatusChanges();
    @JsProperty(name="statusChanges")
    void setStatusChanges(Observable<Object> value);
    @JsProperty(name="valueChanges")
    Observable<Object> getValueChanges();
    @JsProperty(name="valueChanges")
    void setValueChanges(Observable<Object> value);
    @JsProperty(name="path")
    JsArray<String> getPath();
    @JsProperty(name="path")
    void setPath(JsArray<String> value);
     void reset(Object /* optional */ value);
     boolean hasError(String errorCode,JsArray<String> /* optional */ path);
     Object getError(String errorCode,JsArray<String> /* optional */ path);
}
