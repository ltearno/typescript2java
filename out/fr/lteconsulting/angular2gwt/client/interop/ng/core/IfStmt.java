package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Expression;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;
import jsinterop.annotations.JsConstructor;
import ng.core.StatementVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name IfStmt
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface IfStmt extends Statement {
    @JsProperty(name="condition")
    Expression getCondition();
    @JsProperty(name="condition")
    void setCondition(Expression value);
    @JsProperty(name="trueCase")
    JsArray<Statement> getTrueCase();
    @JsProperty(name="trueCase")
    void setTrueCase(JsArray<Statement> value);
    @JsProperty(name="falseCase")
    JsArray<Statement> getFalseCase();
    @JsProperty(name="falseCase")
    void setFalseCase(JsArray<Statement> value);
    @JsConstructor
    public IfStmt(Expression condition,JsArray<Statement> trueCase,JsArray<Statement> /* optional */ falseCase) {}
     Object visitStatement(StatementVisitor visitor,Object context);
}
