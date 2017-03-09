package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\output\output_ast.d.ts
  * Package ng.core
  * Name AbstractClassPart
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class AbstractClassPart  {
    public Type type;
    public JsArray</* ng.core.StmtModifier */ int> modifiers;
    @JsConstructor
    public AbstractClassPart(Type type,JsArray</* ng.core.StmtModifier */ int> modifiers) {}
    public native  boolean hasModifier(/* ng.core.StmtModifier */ int modifier);
}
