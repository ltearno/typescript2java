package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;
import jsinterop.annotations.JsProperty;
import ng.core.ReadVarExpr;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compiler_util\expression_converter.d.ts
  * Package ng.core
  * Name ConvertActionBindingResult
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ConvertActionBindingResult  {
    @JsProperty(name="stmts")
    JsArray<Statement> getStmts();
    @JsProperty(name="stmts")
    void setStmts(JsArray<Statement> value);
    @JsProperty(name="preventDefault")
    ReadVarExpr getPreventDefault();
    @JsProperty(name="preventDefault")
    void setPreventDefault(ReadVarExpr value);
    @JsConstructor
    public ConvertActionBindingResult(JsArray<Statement> stmts,ReadVarExpr preventDefault) {}
}
