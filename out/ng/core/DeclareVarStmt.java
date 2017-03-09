package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name DeclareVarStmt
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DeclareVarStmt extends Statement {
    public String name;
    public Expression value;
    public Type type;
    @JsConstructor
    public DeclareVarStmt(String name,Expression value,Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
