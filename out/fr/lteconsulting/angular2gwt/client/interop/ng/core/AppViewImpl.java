package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.RenderComponentType;
import ng.core.ViewUtils;
import ng.core.AppView;
import ng.core.ViewContainer;
import ng.core.ViewRef_;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ApplicationRef;
import ng.core.Renderer;
import jsinterop.annotations.JsConstructor;
import ng.core.AnimationViewContext;
import ng.core.ComponentRef;
import ng.core.Injector;
import ng.core.ChangeDetectorRef;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\@angular\core\src\linker\view.d.ts
  * Package ng.core
  * Name AppView
  * Cost of making objects: http://jsperf.com/instantiate-size-of-object
  **/
@JsType( isNative=true, namespace="ng.core", name="AppView" )
public abstract class AppViewImpl<T>  {
    @JsProperty(name="clazz")
    Object getClazz();
    @JsProperty(name="clazz")
    void setClazz(Object value);
    @JsProperty(name="componentType")
    RenderComponentType getComponentType();
    @JsProperty(name="componentType")
    void setComponentType(RenderComponentType value);
    @JsProperty(name="type")
    /* ng.core.ViewType */ int getType();
    @JsProperty(name="type")
    void setType(/* ng.core.ViewType */ int value);
    @JsProperty(name="viewUtils")
    ViewUtils getViewUtils();
    @JsProperty(name="viewUtils")
    void setViewUtils(ViewUtils value);
    @JsProperty(name="parentView")
    AppView<Object> getParentView();
    @JsProperty(name="parentView")
    void setParentView(AppView<Object> value);
    @JsProperty(name="parentIndex")
    int getParentIndex();
    @JsProperty(name="parentIndex")
    void setParentIndex(int value);
    @JsProperty(name="parentElement")
    Object getParentElement();
    @JsProperty(name="parentElement")
    void setParentElement(Object value);
    @JsProperty(name="cdMode")
    /* ng.core.ChangeDetectorStatus */ int getCdMode();
    @JsProperty(name="cdMode")
    void setCdMode(/* ng.core.ChangeDetectorStatus */ int value);
    @JsProperty(name="declaredViewContainer")
    ViewContainer getDeclaredViewContainer();
    @JsProperty(name="declaredViewContainer")
    void setDeclaredViewContainer(ViewContainer value);
    @JsProperty(name="ref")
    ViewRef_<T> getRef();
    @JsProperty(name="ref")
    void setRef(ViewRef_<T> value);
    @JsProperty(name="lastRootNode")
    Object getLastRootNode();
    @JsProperty(name="lastRootNode")
    void setLastRootNode(Object value);
    @JsProperty(name="allNodes")
    JsArray<Object> getAllNodes();
    @JsProperty(name="allNodes")
    void setAllNodes(JsArray<Object> value);
    @JsProperty(name="disposables")
    JsArray<Function> getDisposables();
    @JsProperty(name="disposables")
    void setDisposables(JsArray<Function> value);
    @JsProperty(name="viewContainer")
    ViewContainer getViewContainer();
    @JsProperty(name="viewContainer")
    void setViewContainer(ViewContainer value);
    @JsProperty(name="appRef")
    ApplicationRef getAppRef();
    @JsProperty(name="appRef")
    void setAppRef(ApplicationRef value);
    @JsProperty(name="numberOfChecks")
    int getNumberOfChecks();
    @JsProperty(name="numberOfChecks")
    void setNumberOfChecks(int value);
    @JsProperty(name="renderer")
    Renderer getRenderer();
    @JsProperty(name="renderer")
    void setRenderer(Renderer value);
    @JsProperty(name="_hasExternalHostElement")
    Object get_hasExternalHostElement();
    @JsProperty(name="_hasExternalHostElement")
    void set_hasExternalHostElement(Object value);
    @JsProperty(name="_hostInjector")
    Object get_hostInjector();
    @JsProperty(name="_hostInjector")
    void set_hostInjector(Object value);
    @JsProperty(name="_hostProjectableNodes")
    Object get_hostProjectableNodes();
    @JsProperty(name="_hostProjectableNodes")
    void set_hostProjectableNodes(Object value);
    @JsProperty(name="_animationContext")
    Object get_animationContext();
    @JsProperty(name="_animationContext")
    void set_animationContext(Object value);
    @JsProperty(name="_directRenderer")
    Object get_directRenderer();
    @JsProperty(name="_directRenderer")
    void set_directRenderer(Object value);
    @JsProperty(name="context")
    T getContext();
    @JsProperty(name="context")
    void setContext(T value);
    @JsConstructor
    public AppViewImpl(Object clazz,RenderComponentType componentType,/* ng.core.ViewType */ int type,ViewUtils viewUtils,AppView<Object> parentView,int parentIndex,Object parentElement,/* ng.core.ChangeDetectorStatus */ int cdMode,ViewContainer /* optional */ declaredViewContainer) {}
    @JsProperty(name="animationContext")
    AnimationViewContext getAnimationContext();
    @JsProperty(name="animationContext")
    void setAnimationContext(AnimationViewContext value);
    @JsProperty(name="destroyed")
    boolean getDestroyed();
    @JsProperty(name="destroyed")
    void setDestroyed(boolean value);
    public native  ComponentRef<Object> create(T context);
    public native  ComponentRef<Object> createHostView(Object /* UnionType */ rootSelectorOrNode,Injector hostInjector,JsArray<JsArray<Object>> projectableNodes);
    public native  ComponentRef<Object> createInternal(Object /* UnionType */ rootSelectorOrNode);
    public native  AppView<Object> createEmbeddedViewInternal(int templateNodeIndex);
    public native  void init(Object lastRootNode,JsArray<Object> allNodes,JsArray<Function> disposables);
    public native  Object injectorGet(Object token,int nodeIndex,Object /* optional */ notFoundValue);
    public native  Object injectorGetInternal(Object token,int nodeIndex,Object notFoundResult);
    public native  Injector injector(int nodeIndex);
    public native  void detachAndDestroy();
    public native  void destroy();
    public native  void destroyInternal();
    public native  void detachInternal();
    public native  void detach();
    public native  void _renderDetach();
    public native  void attachToAppRef(ApplicationRef appRef);
    public native  void attachAfter(ViewContainer viewContainer,AppView<Object> prevView);
    public native  void moveAfter(ViewContainer viewContainer,AppView<Object> prevView);
    public native  void _renderAttach();
    @JsProperty(name="changeDetectorRef")
    ChangeDetectorRef getChangeDetectorRef();
    @JsProperty(name="changeDetectorRef")
    void setChangeDetectorRef(ChangeDetectorRef value);
    @JsProperty(name="flatRootNodes")
    JsArray<Object> getFlatRootNodes();
    @JsProperty(name="flatRootNodes")
    void setFlatRootNodes(JsArray<Object> value);
    public native  void projectNodes(Object parentElement,int ngContentIndex);
    public native <C> void visitProjectedNodes(int ngContentIndex,JsFunction2<Object,C,Void> cb,C c);
    public native <C> void visitRootNodesInternal(JsFunction2<Object,C,Void> cb,C c);
    public native <C> void visitProjectableNodesInternal(int nodeIndex,int ngContentIndex,JsFunction2<Object,C,Void> cb,C c);
    public native  void dirtyParentQueriesInternal();
    public native  void internalDetectChanges(boolean throwOnChange);
    public native  void detectChanges(boolean throwOnChange);
    public native  void detectChangesInternal(boolean throwOnChange);
    public native  void markAsCheckOnce();
    public native  void markPathToRootAsCheckOnce();
    public native <E,R> JsFunction2<String,E,R> eventHandler(JsFunction2<String,E,R> cb);
    public native  void throwDestroyedError(String details);
}
