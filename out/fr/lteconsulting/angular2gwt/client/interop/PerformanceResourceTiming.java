package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PerformanceResourceTiming
  * Typescript fqn PerformanceResourceTiming
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PerformanceResourceTiming extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="connectEnd")
    Number getConnectEnd();

    @JsProperty(name="connectEnd")
    void setConnectEnd(Number value);

    @JsProperty(name="connectStart")
    Number getConnectStart();

    @JsProperty(name="connectStart")
    void setConnectStart(Number value);

    @JsProperty(name="domainLookupEnd")
    Number getDomainLookupEnd();

    @JsProperty(name="domainLookupEnd")
    void setDomainLookupEnd(Number value);

    @JsProperty(name="domainLookupStart")
    Number getDomainLookupStart();

    @JsProperty(name="domainLookupStart")
    void setDomainLookupStart(Number value);

    @JsProperty(name="fetchStart")
    Number getFetchStart();

    @JsProperty(name="fetchStart")
    void setFetchStart(Number value);

    @JsProperty(name="initiatorType")
    String getInitiatorType();

    @JsProperty(name="initiatorType")
    void setInitiatorType(String value);

    @JsProperty(name="redirectEnd")
    Number getRedirectEnd();

    @JsProperty(name="redirectEnd")
    void setRedirectEnd(Number value);

    @JsProperty(name="redirectStart")
    Number getRedirectStart();

    @JsProperty(name="redirectStart")
    void setRedirectStart(Number value);

    @JsProperty(name="requestStart")
    Number getRequestStart();

    @JsProperty(name="requestStart")
    void setRequestStart(Number value);

    @JsProperty(name="responseEnd")
    Number getResponseEnd();

    @JsProperty(name="responseEnd")
    void setResponseEnd(Number value);

    @JsProperty(name="responseStart")
    Number getResponseStart();

    @JsProperty(name="responseStart")
    void setResponseStart(Number value);
}
