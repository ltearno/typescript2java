package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\testing\index.d.ts
  * Package ng.core
  * Name TestingCompilerFactoryImpl
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TestingCompilerFactoryImpl extends TestingCompilerFactory {
    public Object _compilerFactory;
    @JsConstructor
    public TestingCompilerFactoryImpl(CompilerFactory _compilerFactory) {}
    public native  TestingCompiler createTestingCompiler(JsArray<CompilerOptions> options);
}
