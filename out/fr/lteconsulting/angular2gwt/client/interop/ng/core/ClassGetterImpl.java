package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Statement;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ClassGetter
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ClassGetter" )
public class ClassGetterImpl extends AbstractClassPart {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="body")
    JsArray<Statement> getBody();
    @JsProperty(name="body")
    void setBody(JsArray<Statement> value);
    @JsConstructor
    public ClassGetterImpl(String name,JsArray<Statement> body,Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
}
