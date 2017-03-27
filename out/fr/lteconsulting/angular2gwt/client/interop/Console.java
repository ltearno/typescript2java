package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name Console
  * Typescript fqn Console
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface Console {
    void assert(boolean /* optional */ test, String /* optional */ message, JsArray<Object> /* optional */ optionalParams);

    void clear();

    void count(String /* optional */ countTitle);

    void debug(Object /* optional */ message, JsArray<Object> /* optional */ optionalParams);

    void dir(Object /* optional */ value, JsArray<Object> /* optional */ optionalParams);

    void dirxml(Object value);

    void error(Object /* optional */ message, JsArray<Object> /* optional */ optionalParams);

    void exception(String /* optional */ message, JsArray<Object> /* optional */ optionalParams);

    void group(String /* optional */ groupTitle);

    void groupCollapsed(String /* optional */ groupTitle);

    void groupEnd();

    void info(Object /* optional */ message, JsArray<Object> /* optional */ optionalParams);

    void log(Object /* optional */ message, JsArray<Object> /* optional */ optionalParams);

    boolean msIsIndependentlyComposed(Element element);

    void profile(String /* optional */ reportName);

    void profileEnd();

    void select(Element element);

    void table(JsArray<Object> /* optional */ data);

    void time(String /* optional */ timerName);

    void timeEnd(String /* optional */ timerName);

    void trace(Object /* optional */ message, JsArray<Object> /* optional */ optionalParams);

    void warn(Object /* optional */ message, JsArray<Object> /* optional */ optionalParams);
}
