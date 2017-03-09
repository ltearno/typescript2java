package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\testing\test_bed.d.ts
  * Package ng.core
  * Name InjectSetupWrapper
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class InjectSetupWrapper  {
    public Object _moduleDef;
    @JsConstructor
    public InjectSetupWrapper(JsFunction<TestModuleMetadata> _moduleDef) {}
    public native  void _addModule();
    public native  JsFunction<Object> inject(JsArray<Object> tokens,Function fn);
}
