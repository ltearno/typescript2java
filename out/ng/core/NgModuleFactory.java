package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\linker\ng_module_factory.d.ts
  * Package ng.core
  * Name NgModuleFactory
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class NgModuleFactory<T>  {
    public Object _injectorClass;
    public Object _moduleType;
    @JsConstructor
    public NgModuleFactory(/* TypeLiteral */ Object _injectorClass,Type<T> _moduleType) {}
    public Type<T> moduleType;
    public native  NgModuleRef<T> create(Injector parentInjector);
}
