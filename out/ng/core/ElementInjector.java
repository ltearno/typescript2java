package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\element_injector.d.ts
  * Package ng.core
  * Name ElementInjector
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ElementInjector extends Injector {
    public Object _view;
    public Object _nodeIndex;
    @JsConstructor
    public ElementInjector(AppView<Object> _view,int _nodeIndex) {}
    public native  Object get(Object token,Object /* optional */ notFoundValue);
}
