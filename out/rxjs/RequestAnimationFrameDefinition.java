package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\util\AnimationFrame.d.ts
  * Package rxjs
  * Name RequestAnimationFrameDefinition
  * 
  **/
@JsType( isNative=true, namespace="rxjs" )
public class RequestAnimationFrameDefinition  {
    public JsFunction1<Integer,Void> cancelAnimationFrame;
    public JsFunction1<JsFunction<Void>,Integer> requestAnimationFrame;
    @JsConstructor
    public RequestAnimationFrameDefinition(Object root) {}
}
