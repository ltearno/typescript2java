package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ClassGetter
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ClassGetter extends AbstractClassPart {
    public String name;
    public JsArray<Statement> body;
    @JsConstructor
    public ClassGetter(String name,JsArray<Statement> body,Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
}
