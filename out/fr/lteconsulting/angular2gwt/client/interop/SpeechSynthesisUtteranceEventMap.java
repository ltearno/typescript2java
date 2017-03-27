package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name SpeechSynthesisUtteranceEventMap
  * Typescript fqn SpeechSynthesisUtteranceEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface SpeechSynthesisUtteranceEventMap {
    @JsProperty(name="boundary")
    Event getBoundary();

    @JsProperty(name="boundary")
    void setBoundary(Event value);

    @JsProperty(name="end")
    Event getEnd();

    @JsProperty(name="end")
    void setEnd(Event value);

    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);

    @JsProperty(name="mark")
    Event getMark();

    @JsProperty(name="mark")
    void setMark(Event value);

    @JsProperty(name="pause")
    Event getPause();

    @JsProperty(name="pause")
    void setPause(Event value);

    @JsProperty(name="resume")
    Event getResume();

    @JsProperty(name="resume")
    void setResume(Event value);

    @JsProperty(name="start")
    Event getStart();

    @JsProperty(name="start")
    void setStart(Event value);
}
