package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Performance
  * Typescript fqn Performance
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Performance {
    @JsProperty(name="navigation")
    PerformanceNavigation getNavigation();

    @JsProperty(name="navigation")
    void setNavigation(PerformanceNavigation value);

    @JsProperty(name="timing")
    PerformanceTiming getTiming();

    @JsProperty(name="timing")
    void setTiming(PerformanceTiming value);

    void clearMarks(String /* optional */ markName);

    void clearMeasures(String /* optional */ measureName);

    void clearResourceTimings();

    Object getEntries();

    Object getEntriesByName(String name, String /* optional */ entryType);

    Object getEntriesByType(String entryType);

    Object getMarks(String /* optional */ markName);

    Object getMeasures(String /* optional */ measureName);

    void mark(String markName);

    void measure(String measureName, String /* optional */ startMarkName, String /* optional */ endMarkName);

    Number now();

    void setResourceTimingBufferSize(Number maxSize);

    Object toJSON();
}
