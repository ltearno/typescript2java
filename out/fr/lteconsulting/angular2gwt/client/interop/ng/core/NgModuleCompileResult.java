package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;
import jsinterop.annotations.JsProperty;
import ng.core.ComponentFactoryDependency;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\ng_module_compiler.d.ts
  * Package ng.core
  * Name NgModuleCompileResult
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface NgModuleCompileResult  {
    @JsProperty(name="statements")
    JsArray<Statement> getStatements();
    @JsProperty(name="statements")
    void setStatements(JsArray<Statement> value);
    @JsProperty(name="ngModuleFactoryVar")
    String getNgModuleFactoryVar();
    @JsProperty(name="ngModuleFactoryVar")
    void setNgModuleFactoryVar(String value);
    @JsProperty(name="dependencies")
    JsArray<ComponentFactoryDependency> getDependencies();
    @JsProperty(name="dependencies")
    void setDependencies(JsArray<ComponentFactoryDependency> value);
    @JsConstructor
    public NgModuleCompileResult(JsArray<Statement> statements,String ngModuleFactoryVar,JsArray<ComponentFactoryDependency> dependencies) {}
}
