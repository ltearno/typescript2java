package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileView;
import jsinterop.annotations.JsProperty;
import ng.core.CompilePipeSummary;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.Expression;
import ng.core.ReadPropExpr;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_pipe.d.ts
  * Package ng.core
  * Name CompilePipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompilePipe" )
public class CompilePipeImpl  {
    @JsProperty(name="view")
    CompileView getView();
    @JsProperty(name="view")
    void setView(CompileView value);
    @JsProperty(name="meta")
    CompilePipeSummary getMeta();
    @JsProperty(name="meta")
    void setMeta(CompilePipeSummary value);
    public static native  Expression call(CompileView view,String name,JsArray<Expression> args);
    @JsProperty(name="instance")
    ReadPropExpr getInstance();
    @JsProperty(name="instance")
    void setInstance(ReadPropExpr value);
    @JsProperty(name="_purePipeProxyCount")
    Object get_purePipeProxyCount();
    @JsProperty(name="_purePipeProxyCount")
    void set_purePipeProxyCount(Object value);
    @JsConstructor
    public CompilePipeImpl(CompileView view,CompilePipeSummary meta) {}
    @JsProperty(name="pure")
    boolean getPure();
    @JsProperty(name="pure")
    void setPure(boolean value);
    public native  void _call();
}
