package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.DebugAppView;
import jsinterop.annotations.JsConstructor;
import ng.core.Injector;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\linker\debug_context.d.ts
  * Package ng.core
  * Name DebugContext
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DebugContext extends RenderDebugInfo {
    @JsProperty(name="_view")
    Object get_view();
    @JsProperty(name="_view")
    void set_view(Object value);
    @JsProperty(name="_nodeIndex")
    Object get_nodeIndex();
    @JsProperty(name="_nodeIndex")
    void set_nodeIndex(Object value);
    @JsProperty(name="_tplRow")
    Object get_tplRow();
    @JsProperty(name="_tplRow")
    void set_tplRow(Object value);
    @JsProperty(name="_tplCol")
    Object get_tplCol();
    @JsProperty(name="_tplCol")
    void set_tplCol(Object value);
    @JsConstructor
    public DebugContext(DebugAppView<Object> _view,int _nodeIndex,int _tplRow,int _tplCol) {}
    @JsProperty(name="_staticNodeInfo")
    Object get_staticNodeInfo();
    @JsProperty(name="_staticNodeInfo")
    void set_staticNodeInfo(Object value);
    @JsProperty(name="context")
    Object getContext();
    @JsProperty(name="context")
    void setContext(Object value);
    @JsProperty(name="component")
    Object getComponent();
    @JsProperty(name="component")
    void setComponent(Object value);
    @JsProperty(name="componentRenderElement")
    Object getComponentRenderElement();
    @JsProperty(name="componentRenderElement")
    void setComponentRenderElement(Object value);
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    @JsProperty(name="renderNode")
    Object getRenderNode();
    @JsProperty(name="renderNode")
    void setRenderNode(Object value);
    @JsProperty(name="providerTokens")
    JsArray<Object> getProviderTokens();
    @JsProperty(name="providerTokens")
    void setProviderTokens(JsArray<Object> value);
    @JsProperty(name="source")
    String getSource();
    @JsProperty(name="source")
    void setSource(String value);
    @JsProperty(name="references")
    JsTypedObject<String,Object> getReferences();
    @JsProperty(name="references")
    void setReferences(JsTypedObject<String,Object> value);
}
