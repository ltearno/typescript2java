package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\testing\test_bed.d.ts
  * Package ng.core
  * Name InjectSetupWrapper
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface InjectSetupWrapper  {
    @JsProperty(name="_moduleDef")
    Object get_moduleDef();
    @JsProperty(name="_moduleDef")
    void set_moduleDef(Object value);
    @JsConstructor
    public InjectSetupWrapper(JsFunction<TestModuleMetadata> _moduleDef) {}
     void _addModule();
     JsFunction<Object> inject(JsArray<Object> tokens,Function fn);
}
