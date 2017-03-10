package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.Type;
import jsinterop.annotations.JsConstructor;
import ng.core.Injector;
import ng.core.NgModuleRef;

/**
  * Generated from tests\@angular\core\src\linker\ng_module_factory.d.ts
  * Package ng.core
  * Name NgModuleFactory
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="NgModuleFactory" )
public class NgModuleFactoryImpl<T>  {
    @JsProperty(name="_injectorClass")
    Object get_injectorClass();
    @JsProperty(name="_injectorClass")
    void set_injectorClass(Object value);
    @JsProperty(name="_moduleType")
    Object get_moduleType();
    @JsProperty(name="_moduleType")
    void set_moduleType(Object value);
    @JsConstructor
    public NgModuleFactoryImpl(/* TypeLiteral */ Object _injectorClass,Type<T> _moduleType) {}
    @JsProperty(name="moduleType")
    Type<T> getModuleType();
    @JsProperty(name="moduleType")
    void setModuleType(Type<T> value);
    public native  NgModuleRef<T> create(Injector parentInjector);
}
