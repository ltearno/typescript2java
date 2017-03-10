package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.AppView;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;
import ng.core.ElementRef;
import ng.core.ViewContainerRef_;
import ng.core.Injector;
import fr.lteconsulting.angular2gwt.client.JsFunction2;

/**
  * Generated from tests\@angular\core\src\linker\view_container.d.ts
  * Package ng.core
  * Name ViewContainer
  * A ViewContainer is created for elements that have a ViewContainerRef
  * to keep track of the nested views.
  **/
@JsType( isNative=true, namespace="ng.core", name="ViewContainer" )
public class ViewContainerImpl  {
    @JsProperty(name="index")
    int getIndex();
    @JsProperty(name="index")
    void setIndex(int value);
    @JsProperty(name="parentIndex")
    int getParentIndex();
    @JsProperty(name="parentIndex")
    void setParentIndex(int value);
    @JsProperty(name="parentView")
    AppView<Object> getParentView();
    @JsProperty(name="parentView")
    void setParentView(AppView<Object> value);
    @JsProperty(name="nativeElement")
    Object getNativeElement();
    @JsProperty(name="nativeElement")
    void setNativeElement(Object value);
    @JsProperty(name="nestedViews")
    JsArray<AppView<Object>> getNestedViews();
    @JsProperty(name="nestedViews")
    void setNestedViews(JsArray<AppView<Object>> value);
    @JsProperty(name="projectedViews")
    JsArray<AppView<Object>> getProjectedViews();
    @JsProperty(name="projectedViews")
    void setProjectedViews(JsArray<AppView<Object>> value);
    @JsConstructor
    public ViewContainerImpl(int index,int parentIndex,AppView<Object> parentView,Object nativeElement) {}
    @JsProperty(name="elementRef")
    ElementRef getElementRef();
    @JsProperty(name="elementRef")
    void setElementRef(ElementRef value);
    @JsProperty(name="vcRef")
    ViewContainerRef_ getVcRef();
    @JsProperty(name="vcRef")
    void setVcRef(ViewContainerRef_ value);
    @JsProperty(name="parentInjector")
    Injector getParentInjector();
    @JsProperty(name="parentInjector")
    void setParentInjector(Injector value);
    @JsProperty(name="injector")
    Injector getInjector();
    @JsProperty(name="injector")
    void setInjector(Injector value);
    public native  void detectChangesInNestedViews(boolean throwOnChange);
    public native  void destroyNestedViews();
    public native <C> void visitNestedViewRootNodes(JsFunction2<Object,C,Void> cb,C c);
    public native  JsArray<Object> mapNestedViews(Object nestedViewClass,Function callback);
    public native  void moveView(AppView<Object> view,int currentIndex);
    public native  void attachView(AppView<Object> view,int viewIndex);
    public native  AppView<Object> detachView(int viewIndex);
}
