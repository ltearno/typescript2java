package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\change_detection\pipe_transform.d.ts
  * Package ng.core
  * Name PipeTransform
  * To create a Pipe, you must implement this interface.
  * 
  * Angular invokes the `transform` method with the value of a binding
  * as the first argument, and any parameters as the second argument in list form.
  * 
  * ## Syntax
  * 
  * `value | pipeName[:arg0[:arg1...]]`
  * 
  * ### Example ([live demo](http://plnkr.co/edit/f5oyIked9M2cKzvZNKHV?p=preview))
  * 
  * The `RepeatPipe` below repeats the value as many times as indicated by the first argument:
  * 
  * ```
  * import {Pipe, PipeTransform} from '@angular/core';
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface PipeTransform  {
     Object transform(Object value,JsArray<Object> /* optional */ undefined);
}
