package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.FnParam;
import ng.core.Statement;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.StatementVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name DeclareFunctionStmt
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DeclareFunctionStmt extends Statement {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="params")
    JsArray<FnParam> getParams();
    @JsProperty(name="params")
    void setParams(JsArray<FnParam> value);
    @JsProperty(name="statements")
    JsArray<Statement> getStatements();
    @JsProperty(name="statements")
    void setStatements(JsArray<Statement> value);
    @JsProperty(name="type")
    Type getType();
    @JsProperty(name="type")
    void setType(Type value);
    @JsConstructor
    public DeclareFunctionStmt(String name,JsArray<FnParam> params,JsArray<Statement> statements,Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
     Object visitStatement(StatementVisitor visitor,Object context);
}
