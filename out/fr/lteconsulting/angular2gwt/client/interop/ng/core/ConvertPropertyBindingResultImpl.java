package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;
import jsinterop.annotations.JsProperty;
import ng.core.Expression;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\compiler_util\expression_converter.d.ts
  * Package ng.core
  * Name ConvertPropertyBindingResult
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ConvertPropertyBindingResult" )
public class ConvertPropertyBindingResultImpl  {
    @JsProperty(name="stmts")
    JsArray<Statement> getStmts();
    @JsProperty(name="stmts")
    void setStmts(JsArray<Statement> value);
    @JsProperty(name="currValExpr")
    Expression getCurrValExpr();
    @JsProperty(name="currValExpr")
    void setCurrValExpr(Expression value);
    @JsProperty(name="forceUpdate")
    Expression getForceUpdate();
    @JsProperty(name="forceUpdate")
    void setForceUpdate(Expression value);
    @JsConstructor
    public ConvertPropertyBindingResultImpl(JsArray<Statement> stmts,Expression currValExpr,Expression forceUpdate) {}
}
