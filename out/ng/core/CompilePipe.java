package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_pipe.d.ts
  * Package ng.core
  * Name CompilePipe
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompilePipe  {
    public CompileView view;
    public CompilePipeSummary meta;
    public static native  Expression call(CompileView view,String name,JsArray<Expression> args);
    public ReadPropExpr instance;
    public Object _purePipeProxyCount;
    @JsConstructor
    public CompilePipe(CompileView view,CompilePipeSummary meta) {}
    public boolean pure;
    public native  void _call();
}
