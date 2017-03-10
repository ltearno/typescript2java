package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.core.Compiler;

/**
  * Generated from tests\@angular\compiler\src\jit\compiler_factory.d.ts
  * Package ng.core
  * Name JitCompilerFactory
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="JitCompilerFactory" )
public class JitCompilerFactoryImpl extends CompilerFactory {
    @JsProperty(name="_defaultOptions")
    Object get_defaultOptions();
    @JsProperty(name="_defaultOptions")
    void set_defaultOptions(Object value);
    @JsConstructor
    public JitCompilerFactoryImpl(JsArray<CompilerOptions> defaultOptions) {}
    public native  Compiler createCompiler(JsArray<CompilerOptions> /* optional */ options);
}
