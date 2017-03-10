package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\compiler\src\output\path_util.d.ts
  * Package ng.core
  * Name ImportResolver
  * Interface that defines how import statements should be generated.
  **/
@JsType( isNative=true, namespace="ng.core", name="ImportResolver" )
public abstract class ImportResolverImpl  {
    public native  String fileNameToModuleName(String importedFilePath,String containingFilePath);
}
