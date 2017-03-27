package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ScriptProcessorNode
  * Typescript fqn ScriptProcessorNode
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ScriptProcessorNode extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="bufferSize")
    Number getBufferSize();

    @JsProperty(name="bufferSize")
    void setBufferSize(Number value);

    @JsProperty(name="onaudioprocess")
    JsFunction2<ScriptProcessorNode,AudioProcessingEvent,Object> getOnaudioprocess();

    @JsProperty(name="onaudioprocess")
    void setOnaudioprocess(JsFunction2<ScriptProcessorNode,AudioProcessingEvent,Object> value);

    <K> void addEventListener(K type, JsFunction2<ScriptProcessorNode,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
