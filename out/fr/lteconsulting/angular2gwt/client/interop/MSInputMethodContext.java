package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSInputMethodContext
  * Typescript fqn MSInputMethodContext
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSInputMethodContext extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="compositionEndOffset")
    Number getCompositionEndOffset();

    @JsProperty(name="compositionEndOffset")
    void setCompositionEndOffset(Number value);

    @JsProperty(name="compositionStartOffset")
    Number getCompositionStartOffset();

    @JsProperty(name="compositionStartOffset")
    void setCompositionStartOffset(Number value);

    @JsProperty(name="oncandidatewindowhide")
    JsFunction2<MSInputMethodContext,Event,Object> getOncandidatewindowhide();

    @JsProperty(name="oncandidatewindowhide")
    void setOncandidatewindowhide(JsFunction2<MSInputMethodContext,Event,Object> value);

    @JsProperty(name="oncandidatewindowshow")
    JsFunction2<MSInputMethodContext,Event,Object> getOncandidatewindowshow();

    @JsProperty(name="oncandidatewindowshow")
    void setOncandidatewindowshow(JsFunction2<MSInputMethodContext,Event,Object> value);

    @JsProperty(name="oncandidatewindowupdate")
    JsFunction2<MSInputMethodContext,Event,Object> getOncandidatewindowupdate();

    @JsProperty(name="oncandidatewindowupdate")
    void setOncandidatewindowupdate(JsFunction2<MSInputMethodContext,Event,Object> value);

    @JsProperty(name="target")
    HTMLElement getTarget();

    @JsProperty(name="target")
    void setTarget(HTMLElement value);

    ClientRect getCandidateWindowClientRect();

    JsArray<String> getCompositionAlternatives();

    boolean hasComposition();

    boolean isCandidateWindowVisible();

    <K> void addEventListener(K type, JsFunction2<MSInputMethodContext,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
