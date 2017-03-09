package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\component_factory.d.ts
  * Package ng.core
  * Name ComponentRef_
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ComponentRef_<C> extends ComponentRef<C> {
    public Object _index;
    public Object _parentView;
    public Object _nativeElement;
    public Object _component;
    @JsConstructor
    public ComponentRef_(int _index,AppView<Object> _parentView,Object _nativeElement,C _component) {}
    public ElementRef location;
    public Injector injector;
    public C instance;
    public ViewRef hostView;
    public ChangeDetectorRef changeDetectorRef;
    public Type<Object> componentType;
    public native  void destroy();
    public native  void onDestroy(Function callback);
}
