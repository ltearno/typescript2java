package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\jit\compiler_factory.d.ts
  * Package ng.core
  * Name JitCompilerFactory
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class JitCompilerFactory extends CompilerFactory {
    public Object _defaultOptions;
    @JsConstructor
    public JitCompilerFactory(JsArray<CompilerOptions> defaultOptions) {}
    public native  Compiler createCompiler(JsArray<CompilerOptions> /* optional */ options);
}
