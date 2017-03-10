package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsProperty;
import ng.core.ClassDefinition;
import ng.core.Type;

/**
  * Generated from tests\@angular\core\src\util\decorators.d.ts
  * Package ng.core
  * Name TypeDecorator
  * An interface implemented by all Angular type decorators, which allows them to be used as ES7
  * decorators as well as
  * Angular DSL syntax.
  * 
  * DSL syntax:
  * 
  * ```
  * var MyClass = ng
  *    .Component({...})
  *    .Class({...});
  * ```
  * 
  * ES7 syntax:
  * 
  * ```
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TypeDecorator  {
    // ignored CallSignature
    // ignored CallSignature
    @JsProperty(name="annotations")
    JsArray<Object> annotations();
    @JsProperty(name="annotations")
    void annotations(JsArray<Object> value);
     Type<Object> Class(ClassDefinition obj);
}
