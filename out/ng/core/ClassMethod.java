package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ClassMethod
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ClassMethod extends AbstractClassPart {
    public String name;
    public JsArray<FnParam> params;
    public JsArray<Statement> body;
    @JsConstructor
    public ClassMethod(String name,JsArray<FnParam> params,JsArray<Statement> body,Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
}
