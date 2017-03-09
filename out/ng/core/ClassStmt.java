package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ClassStmt
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ClassStmt extends Statement {
    public String name;
    public Expression parent;
    public JsArray<ClassField> fields;
    public JsArray<ClassGetter> getters;
    public ClassMethod constructorMethod;
    public JsArray<ClassMethod> methods;
    @JsConstructor
    public ClassStmt(String name,Expression parent,JsArray<ClassField> fields,JsArray<ClassGetter> getters,ClassMethod constructorMethod,JsArray<ClassMethod> methods,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
    public native  Object visitStatement(StatementVisitor visitor,Object context);
}
