package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.StaticNodeDebugInfo;
import jsinterop.annotations.JsProperty;
import ng.core.RenderComponentType;
import ng.core.ViewUtils;
import ng.core.AppView;
import ng.core.ViewContainer;
import jsinterop.annotations.JsConstructor;
import ng.core.ComponentRef;
import ng.core.Injector;
import ng.core.DebugContext;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\@angular\core\src\linker\view.d.ts
  * Package ng.core
  * Name DebugAppView
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="DebugAppView" )
public class DebugAppViewImpl<T> extends AppView<T> {
    @JsProperty(name="staticNodeDebugInfos")
    JsArray<StaticNodeDebugInfo> getStaticNodeDebugInfos();
    @JsProperty(name="staticNodeDebugInfos")
    void setStaticNodeDebugInfos(JsArray<StaticNodeDebugInfo> value);
    @JsProperty(name="_currentDebugContext")
    Object get_currentDebugContext();
    @JsProperty(name="_currentDebugContext")
    void set_currentDebugContext(Object value);
    @JsConstructor
    public DebugAppViewImpl(Object clazz,RenderComponentType componentType,/* ng.core.ViewType */ int type,ViewUtils viewUtils,AppView<Object> parentView,int parentIndex,Object parentNode,/* ng.core.ChangeDetectorStatus */ int cdMode,JsArray<StaticNodeDebugInfo> staticNodeDebugInfos,ViewContainer /* optional */ declaredViewContainer) {}
    public native  ComponentRef<Object> create(T context);
    public native  ComponentRef<Object> createHostView(Object /* UnionType */ rootSelectorOrNode,Injector injector,JsArray<JsArray<Object>> /* optional */ projectableNodes);
    public native  Object injectorGet(Object token,int nodeIndex,Object /* optional */ notFoundResult);
    public native  void detach();
    public native  void destroy();
    public native  void detectChanges(boolean throwOnChange);
    public native  void _resetDebug();
    public native  DebugContext debug(int nodeIndex,int rowNum,int colNum);
    public native  void _rethrowWithContext();
    public native <E,R> JsFunction2<String,E,R> eventHandler(JsFunction2<String,E,R> cb);
}
