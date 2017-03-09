package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\src\animation\animation_ast.d.ts
  * Package ng.core
  * Name AnimationAst
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface AnimationAst  {
    @JsProperty(name="startTime")
    int startTime();
    @JsProperty(name="startTime")
    void startTime(int value);
    @JsProperty(name="playTime")
    int playTime();
    @JsProperty(name="playTime")
    void playTime(int value);
     Object visit(AnimationAstVisitor visitor,Object context);
}
