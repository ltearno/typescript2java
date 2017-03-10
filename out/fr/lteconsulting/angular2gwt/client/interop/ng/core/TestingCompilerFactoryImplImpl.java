package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompilerFactory;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.TestingCompiler;

/**
  * Generated from tests\@angular\compiler\testing\index.d.ts
  * Package ng.core
  * Name TestingCompilerFactoryImpl
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="TestingCompilerFactoryImpl" )
public class TestingCompilerFactoryImplImpl extends TestingCompilerFactory {
    @JsProperty(name="_compilerFactory")
    Object get_compilerFactory();
    @JsProperty(name="_compilerFactory")
    void set_compilerFactory(Object value);
    @JsConstructor
    public TestingCompilerFactoryImplImpl(CompilerFactory _compilerFactory) {}
    public native  TestingCompiler createTestingCompiler(JsArray<CompilerOptions> options);
}
