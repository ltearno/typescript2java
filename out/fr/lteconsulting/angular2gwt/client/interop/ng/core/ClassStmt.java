package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Expression;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ClassField;
import ng.core.ClassGetter;
import ng.core.ClassMethod;
import jsinterop.annotations.JsConstructor;
import ng.core.StatementVisitor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ClassStmt
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ClassStmt extends Statement {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="parent")
    Expression getParent();
    @JsProperty(name="parent")
    void setParent(Expression value);
    @JsProperty(name="fields")
    JsArray<ClassField> getFields();
    @JsProperty(name="fields")
    void setFields(JsArray<ClassField> value);
    @JsProperty(name="getters")
    JsArray<ClassGetter> getGetters();
    @JsProperty(name="getters")
    void setGetters(JsArray<ClassGetter> value);
    @JsProperty(name="constructorMethod")
    ClassMethod getConstructorMethod();
    @JsProperty(name="constructorMethod")
    void setConstructorMethod(ClassMethod value);
    @JsProperty(name="methods")
    JsArray<ClassMethod> getMethods();
    @JsProperty(name="methods")
    void setMethods(JsArray<ClassMethod> value);
    @JsConstructor
    public ClassStmt(String name,Expression parent,JsArray<ClassField> fields,JsArray<ClassGetter> getters,ClassMethod constructorMethod,JsArray<ClassMethod> methods,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
     Object visitStatement(StatementVisitor visitor,Object context);
}
