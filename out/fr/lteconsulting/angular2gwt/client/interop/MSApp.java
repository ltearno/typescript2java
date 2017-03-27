package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name MSApp
  * Typescript fqn MSApp
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface MSApp {
    @JsProperty(name="CURRENT")
    String getCURRENT();

    @JsProperty(name="CURRENT")
    void setCURRENT(String value);

    @JsProperty(name="HIGH")
    String getHIGH();

    @JsProperty(name="HIGH")
    void setHIGH(String value);

    @JsProperty(name="IDLE")
    String getIDLE();

    @JsProperty(name="IDLE")
    void setIDLE(String value);

    @JsProperty(name="NORMAL")
    String getNORMAL();

    @JsProperty(name="NORMAL")
    void setNORMAL(String value);

    MSAppAsyncOperation clearTemporaryWebDataAsync();

    Blob createBlobFromRandomAccessStream(String type, Object seeker);

    Object createDataPackage(Object object);

    Object createDataPackageFromSelection();

    File createFileFromStorageFile(Object storageFile);

    MSStream createStreamFromInputStream(String type, Object inputStream);

    void execAsyncAtPriority(MSExecAtPriorityFunctionCallback asynchronousCallback, String priority, JsArray<Object> /* optional */ args);

    Object execAtPriority(MSExecAtPriorityFunctionCallback synchronousCallback, String priority, JsArray<Object> /* optional */ args);

    String getCurrentPriority();

    Promise<Object> getHtmlPrintDocumentSourceAsync(Object htmlDoc);

    Object getViewId(Object view);

    boolean isTaskScheduledAtPriorityOrHigher(String priority);

    void pageHandlesAllApplicationActivations(boolean enabled);

    void suppressSubdownloadCredentialPrompts(boolean suppress);

    void terminateApp(Object exceptionObject);
}
