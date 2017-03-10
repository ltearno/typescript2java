package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Expression;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_view.d.ts
  * Package ng.core
  * Name CompileViewRootNode
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileViewRootNode  {
    @JsProperty(name="type")
    /* ng.core.CompileViewRootNodeType */ int getType();
    @JsProperty(name="type")
    void setType(/* ng.core.CompileViewRootNodeType */ int value);
    @JsProperty(name="expr")
    Expression getExpr();
    @JsProperty(name="expr")
    void setExpr(Expression value);
    @JsProperty(name="ngContentIndex")
    int getNgContentIndex();
    @JsProperty(name="ngContentIndex")
    void setNgContentIndex(int value);
    @JsConstructor
    public CompileViewRootNode(/* ng.core.CompileViewRootNodeType */ int type,Expression expr,int /* optional */ ngContentIndex) {}
}
