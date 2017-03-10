package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationAst
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationAst  {
    @JsProperty(name="startTime")
    int getStartTime();
    @JsProperty(name="startTime")
    void setStartTime(int value);
    @JsProperty(name="playTime")
    int getPlayTime();
    @JsProperty(name="playTime")
    void setPlayTime(int value);
     Object visit(AnimationAstVisitor visitor,Object context);
}
