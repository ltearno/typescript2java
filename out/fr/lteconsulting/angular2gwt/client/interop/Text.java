package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Text
  * Typescript fqn Text
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Text extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="wholeText")
    String getWholeText();

    @JsProperty(name="wholeText")
    void setWholeText(String value);

    @JsProperty(name="assignedSlot")
    HTMLSlotElement getAssignedSlot();

    @JsProperty(name="assignedSlot")
    void setAssignedSlot(HTMLSlotElement value);

    Text splitText(Number offset);
}
