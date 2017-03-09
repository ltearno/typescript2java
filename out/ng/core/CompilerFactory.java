package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\linker\compiler.d.ts
  * Package ng.core
  * Name CompilerFactory
  * A factory for creating a Compiler
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface CompilerFactory  {
     Compiler createCompiler(JsArray<CompilerOptions> /* optional */ options);
}
