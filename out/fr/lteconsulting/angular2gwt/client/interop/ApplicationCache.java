package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ApplicationCache
  * Typescript fqn ApplicationCache
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ApplicationCache extends Object /* no JavaNode for symbol */ {
    @JsProperty(name="oncached")
    JsFunction2<ApplicationCache,Event,Object> getOncached();

    @JsProperty(name="oncached")
    void setOncached(JsFunction2<ApplicationCache,Event,Object> value);

    @JsProperty(name="onchecking")
    JsFunction2<ApplicationCache,Event,Object> getOnchecking();

    @JsProperty(name="onchecking")
    void setOnchecking(JsFunction2<ApplicationCache,Event,Object> value);

    @JsProperty(name="ondownloading")
    JsFunction2<ApplicationCache,Event,Object> getOndownloading();

    @JsProperty(name="ondownloading")
    void setOndownloading(JsFunction2<ApplicationCache,Event,Object> value);

    @JsProperty(name="onerror")
    JsFunction2<ApplicationCache,Event,Object> getOnerror();

    @JsProperty(name="onerror")
    void setOnerror(JsFunction2<ApplicationCache,Event,Object> value);

    @JsProperty(name="onnoupdate")
    JsFunction2<ApplicationCache,Event,Object> getOnnoupdate();

    @JsProperty(name="onnoupdate")
    void setOnnoupdate(JsFunction2<ApplicationCache,Event,Object> value);

    @JsProperty(name="onobsolete")
    JsFunction2<ApplicationCache,Event,Object> getOnobsolete();

    @JsProperty(name="onobsolete")
    void setOnobsolete(JsFunction2<ApplicationCache,Event,Object> value);

    @JsProperty(name="onprogress")
    JsFunction2<ApplicationCache,ProgressEvent,Object> getOnprogress();

    @JsProperty(name="onprogress")
    void setOnprogress(JsFunction2<ApplicationCache,ProgressEvent,Object> value);

    @JsProperty(name="onupdateready")
    JsFunction2<ApplicationCache,Event,Object> getOnupdateready();

    @JsProperty(name="onupdateready")
    void setOnupdateready(JsFunction2<ApplicationCache,Event,Object> value);

    @JsProperty(name="status")
    Number getStatus();

    @JsProperty(name="status")
    void setStatus(Number value);

    @JsProperty(name="CHECKING")
    Number getCHECKING();

    @JsProperty(name="CHECKING")
    void setCHECKING(Number value);

    @JsProperty(name="DOWNLOADING")
    Number getDOWNLOADING();

    @JsProperty(name="DOWNLOADING")
    void setDOWNLOADING(Number value);

    @JsProperty(name="IDLE")
    Number getIDLE();

    @JsProperty(name="IDLE")
    void setIDLE(Number value);

    @JsProperty(name="OBSOLETE")
    Number getOBSOLETE();

    @JsProperty(name="OBSOLETE")
    void setOBSOLETE(Number value);

    @JsProperty(name="UNCACHED")
    Number getUNCACHED();

    @JsProperty(name="UNCACHED")
    void setUNCACHED(Number value);

    @JsProperty(name="UPDATEREADY")
    Number getUPDATEREADY();

    @JsProperty(name="UPDATEREADY")
    void setUPDATEREADY(Number value);

    void abort();

    void swapCache();

    void update();

    <K> void addEventListener(K type, JsFunction2<ApplicationCache,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
