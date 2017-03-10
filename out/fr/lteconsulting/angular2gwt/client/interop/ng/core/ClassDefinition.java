package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Type;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\core\src\util\decorators.d.ts
  * Package ng.core
  * Name ClassDefinition
  * Declares the interface to be used with {@link Class}.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ClassDefinition  {
    /* optional property extends*/    @JsProperty(name="extends")
    Type<Object> extends();
    @JsProperty(name="extends")
    void extends(Type<Object> value);
    @JsProperty(name="constructor")
    Object /* UnionType */ constructor();
    @JsProperty(name="constructor")
    void constructor(Object /* UnionType */ value);
    // ignored IndexSignature
}
