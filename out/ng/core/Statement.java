package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name Statement
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface Statement  {
    @JsProperty(name="modifiers")
    JsArray</* ng.core.StmtModifier */ int> modifiers();
    @JsProperty(name="modifiers")
    void modifiers(JsArray</* ng.core.StmtModifier */ int> value);
    @JsConstructor
    public Statement(JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
     Object visitStatement(StatementVisitor visitor,Object context);
     boolean hasModifier(/* ng.core.StmtModifier */ int modifier);
}
