package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name PerfWidgetExternal
  * Typescript fqn PerfWidgetExternal
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface PerfWidgetExternal {
    @JsProperty(name="activeNetworkRequestCount")
    Number getActiveNetworkRequestCount();

    @JsProperty(name="activeNetworkRequestCount")
    void setActiveNetworkRequestCount(Number value);

    @JsProperty(name="averageFrameTime")
    Number getAverageFrameTime();

    @JsProperty(name="averageFrameTime")
    void setAverageFrameTime(Number value);

    @JsProperty(name="averagePaintTime")
    Number getAveragePaintTime();

    @JsProperty(name="averagePaintTime")
    void setAveragePaintTime(Number value);

    @JsProperty(name="extraInformationEnabled")
    boolean getExtraInformationEnabled();

    @JsProperty(name="extraInformationEnabled")
    void setExtraInformationEnabled(boolean value);

    @JsProperty(name="independentRenderingEnabled")
    boolean getIndependentRenderingEnabled();

    @JsProperty(name="independentRenderingEnabled")
    void setIndependentRenderingEnabled(boolean value);

    @JsProperty(name="irDisablingContentString")
    String getIrDisablingContentString();

    @JsProperty(name="irDisablingContentString")
    void setIrDisablingContentString(String value);

    @JsProperty(name="irStatusAvailable")
    boolean getIrStatusAvailable();

    @JsProperty(name="irStatusAvailable")
    void setIrStatusAvailable(boolean value);

    @JsProperty(name="maxCpuSpeed")
    Number getMaxCpuSpeed();

    @JsProperty(name="maxCpuSpeed")
    void setMaxCpuSpeed(Number value);

    @JsProperty(name="paintRequestsPerSecond")
    Number getPaintRequestsPerSecond();

    @JsProperty(name="paintRequestsPerSecond")
    void setPaintRequestsPerSecond(Number value);

    @JsProperty(name="performanceCounter")
    Number getPerformanceCounter();

    @JsProperty(name="performanceCounter")
    void setPerformanceCounter(Number value);

    @JsProperty(name="performanceCounterFrequency")
    Number getPerformanceCounterFrequency();

    @JsProperty(name="performanceCounterFrequency")
    void setPerformanceCounterFrequency(Number value);

    void addEventListener(String eventType, Function callback);

    Number getMemoryUsage();

    Number getProcessCpuUsage();

    Object getRecentCpuUsage(Object /* UnionType */ last);

    Object getRecentFrames(Object /* UnionType */ last);

    Object getRecentMemoryUsage(Object /* UnionType */ last);

    Object getRecentPaintRequests(Object /* UnionType */ last);

    void removeEventListener(String eventType, Function callback);

    void repositionWindow(Number x, Number y);

    void resizeWindow(Number width, Number height);
}
