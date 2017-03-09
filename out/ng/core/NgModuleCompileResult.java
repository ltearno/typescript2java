package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ng_module_compiler.d.ts
  * Package ng.core
  * Name NgModuleCompileResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgModuleCompileResult  {
    public JsArray<Statement> statements;
    public String ngModuleFactoryVar;
    public JsArray<ComponentFactoryDependency> dependencies;
    @JsConstructor
    public NgModuleCompileResult(JsArray<Statement> statements,String ngModuleFactoryVar,JsArray<ComponentFactoryDependency> dependencies) {}
}
