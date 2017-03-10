package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileNgModuleMetadata;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileProviderMetadata;
import ng.core.NgModuleCompileResult;

/**
  * Generated from tests\@angular\compiler\src\ng_module_compiler.d.ts
  * Package ng.core
  * Name NgModuleCompiler
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="NgModuleCompiler" )
public class NgModuleCompilerImpl  {
    public native  NgModuleCompileResult compile(CompileNgModuleMetadata ngModuleMeta,JsArray<CompileProviderMetadata> extraProviders);
}
