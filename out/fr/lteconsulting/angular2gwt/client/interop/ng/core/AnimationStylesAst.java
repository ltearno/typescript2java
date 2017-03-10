package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;
import ng.core.AnimationAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationStylesAst
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationStylesAst extends AnimationAst {
    @JsProperty(name="styles")
    Array<JsTypedObject<String,Object /* UnionType */>> getStyles();
    @JsProperty(name="styles")
    void setStyles(Array<JsTypedObject<String,Object /* UnionType */>> value);
    @JsConstructor
    public AnimationStylesAst(Array<JsTypedObject<String,Object /* UnionType */>> styles) {}
     Object visit(AnimationAstVisitor visitor,Object context);
}
