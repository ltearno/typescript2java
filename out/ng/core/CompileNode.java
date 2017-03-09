package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_element.d.ts
  * Package ng.core
  * Name CompileNode
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompileNode  {
    public CompileElement parent;
    public CompileView view;
    public int nodeIndex;
    public Expression renderNode;
    public TemplateAst sourceAst;
    @JsConstructor
    public CompileNode(CompileElement parent,CompileView view,int nodeIndex,Expression renderNode,TemplateAst sourceAst) {}
    public native  boolean isNull();
    public native  boolean isRootElement();
}
