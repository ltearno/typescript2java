package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\rxjs\util\AnimationFrame.d.ts
  * Package rxjs
  * Name RequestAnimationFrameDefinition
  * 
  **/
@JsType( isNative=true, namespace="rxjs", name="RequestAnimationFrameDefinition" )
public class RequestAnimationFrameDefinitionImpl  {
    @JsProperty(name="cancelAnimationFrame")
    JsFunction1<Integer,Void> getCancelAnimationFrame();
    @JsProperty(name="cancelAnimationFrame")
    void setCancelAnimationFrame(JsFunction1<Integer,Void> value);
    @JsProperty(name="requestAnimationFrame")
    JsFunction1<JsFunction<Void>,Integer> getRequestAnimationFrame();
    @JsProperty(name="requestAnimationFrame")
    void setRequestAnimationFrame(JsFunction1<JsFunction<Void>,Integer> value);
    @JsConstructor
    public RequestAnimationFrameDefinitionImpl(Object root) {}
}
