package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\@angular\core\src\linker\view.d.ts
  * Package ng.core
  * Name AppView
  * Cost of making objects: http://jsperf.com/instantiate-size-of-object
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface AppView<T>  {
    @JsProperty(name="clazz")
    Object clazz();
    @JsProperty(name="clazz")
    void clazz(Object value);
    @JsProperty(name="componentType")
    RenderComponentType componentType();
    @JsProperty(name="componentType")
    void componentType(RenderComponentType value);
    @JsProperty(name="type")
    /* ng.core.ViewType */ int type();
    @JsProperty(name="type")
    void type(/* ng.core.ViewType */ int value);
    @JsProperty(name="viewUtils")
    ViewUtils viewUtils();
    @JsProperty(name="viewUtils")
    void viewUtils(ViewUtils value);
    @JsProperty(name="parentView")
    AppView<Object> parentView();
    @JsProperty(name="parentView")
    void parentView(AppView<Object> value);
    @JsProperty(name="parentIndex")
    int parentIndex();
    @JsProperty(name="parentIndex")
    void parentIndex(int value);
    @JsProperty(name="parentElement")
    Object parentElement();
    @JsProperty(name="parentElement")
    void parentElement(Object value);
    @JsProperty(name="cdMode")
    /* ng.core.ChangeDetectorStatus */ int cdMode();
    @JsProperty(name="cdMode")
    void cdMode(/* ng.core.ChangeDetectorStatus */ int value);
    @JsProperty(name="declaredViewContainer")
    ViewContainer declaredViewContainer();
    @JsProperty(name="declaredViewContainer")
    void declaredViewContainer(ViewContainer value);
    @JsProperty(name="ref")
    ViewRef_<T> ref();
    @JsProperty(name="ref")
    void ref(ViewRef_<T> value);
    @JsProperty(name="lastRootNode")
    Object lastRootNode();
    @JsProperty(name="lastRootNode")
    void lastRootNode(Object value);
    @JsProperty(name="allNodes")
    JsArray<Object> allNodes();
    @JsProperty(name="allNodes")
    void allNodes(JsArray<Object> value);
    @JsProperty(name="disposables")
    JsArray<Function> disposables();
    @JsProperty(name="disposables")
    void disposables(JsArray<Function> value);
    @JsProperty(name="viewContainer")
    ViewContainer viewContainer();
    @JsProperty(name="viewContainer")
    void viewContainer(ViewContainer value);
    @JsProperty(name="appRef")
    ApplicationRef appRef();
    @JsProperty(name="appRef")
    void appRef(ApplicationRef value);
    @JsProperty(name="numberOfChecks")
    int numberOfChecks();
    @JsProperty(name="numberOfChecks")
    void numberOfChecks(int value);
    @JsProperty(name="renderer")
    Renderer renderer();
    @JsProperty(name="renderer")
    void renderer(Renderer value);
    @JsProperty(name="_hasExternalHostElement")
    Object _hasExternalHostElement();
    @JsProperty(name="_hasExternalHostElement")
    void _hasExternalHostElement(Object value);
    @JsProperty(name="_hostInjector")
    Object _hostInjector();
    @JsProperty(name="_hostInjector")
    void _hostInjector(Object value);
    @JsProperty(name="_hostProjectableNodes")
    Object _hostProjectableNodes();
    @JsProperty(name="_hostProjectableNodes")
    void _hostProjectableNodes(Object value);
    @JsProperty(name="_animationContext")
    Object _animationContext();
    @JsProperty(name="_animationContext")
    void _animationContext(Object value);
    @JsProperty(name="_directRenderer")
    Object _directRenderer();
    @JsProperty(name="_directRenderer")
    void _directRenderer(Object value);
    @JsProperty(name="context")
    T context();
    @JsProperty(name="context")
    void context(T value);
    @JsConstructor
    public AppView(Object clazz,RenderComponentType componentType,/* ng.core.ViewType */ int type,ViewUtils viewUtils,AppView<Object> parentView,int parentIndex,Object parentElement,/* ng.core.ChangeDetectorStatus */ int cdMode,ViewContainer /* optional */ declaredViewContainer) {}
    @JsProperty(name="animationContext")
    AnimationViewContext animationContext();
    @JsProperty(name="animationContext")
    void animationContext(AnimationViewContext value);
    @JsProperty(name="destroyed")
    boolean destroyed();
    @JsProperty(name="destroyed")
    void destroyed(boolean value);
     ComponentRef<Object> create(T context);
     ComponentRef<Object> createHostView(Object /* UnionType */ rootSelectorOrNode,Injector hostInjector,JsArray<JsArray<Object>> projectableNodes);
     ComponentRef<Object> createInternal(Object /* UnionType */ rootSelectorOrNode);
     AppView<Object> createEmbeddedViewInternal(int templateNodeIndex);
     void init(Object lastRootNode,JsArray<Object> allNodes,JsArray<Function> disposables);
     Object injectorGet(Object token,int nodeIndex,Object /* optional */ notFoundValue);
     Object injectorGetInternal(Object token,int nodeIndex,Object notFoundResult);
     Injector injector(int nodeIndex);
     void detachAndDestroy();
     void destroy();
     void destroyInternal();
     void detachInternal();
     void detach();
     void _renderDetach();
     void attachToAppRef(ApplicationRef appRef);
     void attachAfter(ViewContainer viewContainer,AppView<Object> prevView);
     void moveAfter(ViewContainer viewContainer,AppView<Object> prevView);
     void _renderAttach();
    @JsProperty(name="changeDetectorRef")
    ChangeDetectorRef changeDetectorRef();
    @JsProperty(name="changeDetectorRef")
    void changeDetectorRef(ChangeDetectorRef value);
    @JsProperty(name="flatRootNodes")
    JsArray<Object> flatRootNodes();
    @JsProperty(name="flatRootNodes")
    void flatRootNodes(JsArray<Object> value);
     void projectNodes(Object parentElement,int ngContentIndex);
    <C> void visitProjectedNodes(int ngContentIndex,JsFunction2<Object,C,Void> cb,C c);
    <C> void visitRootNodesInternal(JsFunction2<Object,C,Void> cb,C c);
    <C> void visitProjectableNodesInternal(int nodeIndex,int ngContentIndex,JsFunction2<Object,C,Void> cb,C c);
     void dirtyParentQueriesInternal();
     void internalDetectChanges(boolean throwOnChange);
     void detectChanges(boolean throwOnChange);
     void detectChangesInternal(boolean throwOnChange);
     void markAsCheckOnce();
     void markPathToRootAsCheckOnce();
    <E,R> JsFunction2<String,E,R> eventHandler(JsFunction2<String,E,R> cb);
     void throwDestroyedError(String details);
}
