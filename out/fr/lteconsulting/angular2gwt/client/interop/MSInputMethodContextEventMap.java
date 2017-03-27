package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSInputMethodContextEventMap
  * Typescript fqn MSInputMethodContextEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSInputMethodContextEventMap {
    @JsProperty(name="MSCandidateWindowHide")
    Event getMSCandidateWindowHide();

    @JsProperty(name="MSCandidateWindowHide")
    void setMSCandidateWindowHide(Event value);

    @JsProperty(name="MSCandidateWindowShow")
    Event getMSCandidateWindowShow();

    @JsProperty(name="MSCandidateWindowShow")
    void setMSCandidateWindowShow(Event value);

    @JsProperty(name="MSCandidateWindowUpdate")
    Event getMSCandidateWindowUpdate();

    @JsProperty(name="MSCandidateWindowUpdate")
    void setMSCandidateWindowUpdate(Event value);
}
