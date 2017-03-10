package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ReadPropExpr;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compiler_util\binding_util.d.ts
  * Package ng.core
  * Name CheckBindingField
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CheckBindingField  {
    @JsProperty(name="expression")
    ReadPropExpr getExpression();
    @JsProperty(name="expression")
    void setExpression(ReadPropExpr value);
    @JsProperty(name="bindingId")
    String getBindingId();
    @JsProperty(name="bindingId")
    void setBindingId(String value);
    @JsConstructor
    public CheckBindingField(ReadPropExpr expression,String bindingId) {}
}
