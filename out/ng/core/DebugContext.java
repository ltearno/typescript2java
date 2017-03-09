package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\linker\debug_context.d.ts
  * Package ng.core
  * Name DebugContext
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DebugContext extends RenderDebugInfo {
    public Object _view;
    public Object _nodeIndex;
    public Object _tplRow;
    public Object _tplCol;
    @JsConstructor
    public DebugContext(DebugAppView<Object> _view,int _nodeIndex,int _tplRow,int _tplCol) {}
    public Object _staticNodeInfo;
    public Object context;
    public Object component;
    public Object componentRenderElement;
    public Injector injector;
    public Object renderNode;
    public JsArray<Object> providerTokens;
    public String source;
    public JsTypedObject<String,Object> references;
}
