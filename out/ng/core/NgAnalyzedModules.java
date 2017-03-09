package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\aot\compiler.d.ts
  * Package ng.core
  * Name NgAnalyzedModules
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class NgAnalyzedModules  {
    public JsArray<CompileNgModuleMetadata> ngModules;
    public Map<StaticSymbol,CompileNgModuleMetadata> ngModuleByPipeOrDirective;
    public Array</* TypeLiteral */ Object> files;
    public /* optional */ JsArray<StaticSymbol> symbolsMissingModule;
}
