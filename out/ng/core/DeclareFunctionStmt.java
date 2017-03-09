package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name DeclareFunctionStmt
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DeclareFunctionStmt extends Statement {
    public String name;
    public JsArray<FnParam> params;
    public JsArray<Statement> statements;
    public Type type;
    @JsConstructor
    public DeclareFunctionStmt(String name,JsArray<FnParam> params,JsArray<Statement> statements,Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
