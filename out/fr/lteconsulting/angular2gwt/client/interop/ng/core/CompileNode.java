package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileElement;
import jsinterop.annotations.JsProperty;
import ng.core.CompileView;
import ng.core.Expression;
import ng.core.TemplateAst;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_element.d.ts
  * Package ng.core
  * Name CompileNode
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileNode  {
    @JsProperty(name="parent")
    CompileElement getParent();
    @JsProperty(name="parent")
    void setParent(CompileElement value);
    @JsProperty(name="view")
    CompileView getView();
    @JsProperty(name="view")
    void setView(CompileView value);
    @JsProperty(name="nodeIndex")
    int getNodeIndex();
    @JsProperty(name="nodeIndex")
    void setNodeIndex(int value);
    @JsProperty(name="renderNode")
    Expression getRenderNode();
    @JsProperty(name="renderNode")
    void setRenderNode(Expression value);
    @JsProperty(name="sourceAst")
    TemplateAst getSourceAst();
    @JsProperty(name="sourceAst")
    void setSourceAst(TemplateAst value);
    @JsConstructor
    public CompileNode(CompileElement parent,CompileView view,int nodeIndex,Expression renderNode,TemplateAst sourceAst) {}
     boolean isNull();
     boolean isRootElement();
}
