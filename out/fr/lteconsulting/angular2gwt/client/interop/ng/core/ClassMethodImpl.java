package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.FnParam;
import ng.core.Statement;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name ClassMethod
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ClassMethod" )
public class ClassMethodImpl extends AbstractClassPart {
    @JsProperty(name="name")
    String getName();
    @JsProperty(name="name")
    void setName(String value);
    @JsProperty(name="params")
    JsArray<FnParam> getParams();
    @JsProperty(name="params")
    void setParams(JsArray<FnParam> value);
    @JsProperty(name="body")
    JsArray<Statement> getBody();
    @JsProperty(name="body")
    void setBody(JsArray<Statement> value);
    @JsConstructor
    public ClassMethodImpl(String name,JsArray<FnParam> params,JsArray<Statement> body,Type /* optional */ type,JsArray</* ng.core.StmtModifier */ int> /* optional */ modifiers) {}
}
