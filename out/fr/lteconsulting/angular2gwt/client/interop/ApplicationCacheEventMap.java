package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name ApplicationCacheEventMap
  * Typescript fqn ApplicationCacheEventMap
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface ApplicationCacheEventMap {
    @JsProperty(name="cached")
    Event getCached();

    @JsProperty(name="cached")
    void setCached(Event value);

    @JsProperty(name="checking")
    Event getChecking();

    @JsProperty(name="checking")
    void setChecking(Event value);

    @JsProperty(name="downloading")
    Event getDownloading();

    @JsProperty(name="downloading")
    void setDownloading(Event value);

    @JsProperty(name="error")
    Event getError();

    @JsProperty(name="error")
    void setError(Event value);

    @JsProperty(name="noupdate")
    Event getNoupdate();

    @JsProperty(name="noupdate")
    void setNoupdate(Event value);

    @JsProperty(name="obsolete")
    Event getObsolete();

    @JsProperty(name="obsolete")
    void setObsolete(Event value);

    @JsProperty(name="progress")
    ProgressEvent getProgress();

    @JsProperty(name="progress")
    void setProgress(ProgressEvent value);

    @JsProperty(name="updateready")
    Event getUpdateready();

    @JsProperty(name="updateready")
    void setUpdateready(Event value);
}
