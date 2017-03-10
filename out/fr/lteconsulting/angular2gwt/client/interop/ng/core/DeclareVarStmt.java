package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Expression;
import ng.core.Type;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.core.StatementVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name DeclareVarStmt
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DeclareVarStmt extends Statement {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="value")
    Expression getValue();
    @JsProperty(name="value")
    void setValue(Expression value);
    @JsProperty(name="type")
    Type getType();
    @JsProperty(name="type")
    void setType(Type value);
    @JsConstructor
    public DeclareVarStmt(String name,Expression value,Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
     Object visitStatement(StatementVisitor visitor,Object context);
}
