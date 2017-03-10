package fr.lteconsulting.angular2gwt.client.interop.rxjs;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsFunction;
import rxjs.Subscriber;

/**
  * Generated from tests\rxjs\observable\dom\AjaxObservable.d.ts
  * Package rxjs
  * Name AjaxRequest
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AjaxRequest  {
    /* optional property url*/    @JsProperty(name="url")
    String url();
    @JsProperty(name="url")
    void url(String value);
    /* optional property body*/    @JsProperty(name="body")
    Object body();
    @JsProperty(name="body")
    void body(Object value);
    /* optional property user*/    @JsProperty(name="user")
    String user();
    @JsProperty(name="user")
    void user(String value);
    /* optional property async*/    @JsProperty(name="async")
    boolean async();
    @JsProperty(name="async")
    void async(boolean value);
    /* optional property method*/    @JsProperty(name="method")
    String method();
    @JsProperty(name="method")
    void method(String value);
    /* optional property headers*/    @JsProperty(name="headers")
    Object headers();
    @JsProperty(name="headers")
    void headers(Object value);
    /* optional property timeout*/    @JsProperty(name="timeout")
    int timeout();
    @JsProperty(name="timeout")
    void timeout(int value);
    /* optional property password*/    @JsProperty(name="password")
    String password();
    @JsProperty(name="password")
    void password(String value);
    /* optional property hasContent*/    @JsProperty(name="hasContent")
    boolean hasContent();
    @JsProperty(name="hasContent")
    void hasContent(boolean value);
    /* optional property crossDomain*/    @JsProperty(name="crossDomain")
    boolean crossDomain();
    @JsProperty(name="crossDomain")
    void crossDomain(boolean value);
    /* optional property withCredentials*/    @JsProperty(name="withCredentials")
    boolean withCredentials();
    @JsProperty(name="withCredentials")
    void withCredentials(boolean value);
    /* optional property createXHR*/    @JsProperty(name="createXHR")
    JsFunction<XMLHttpRequest> createXHR();
    @JsProperty(name="createXHR")
    void createXHR(JsFunction<XMLHttpRequest> value);
    /* optional property progressSubscriber*/    @JsProperty(name="progressSubscriber")
    Subscriber<Object> progressSubscriber();
    @JsProperty(name="progressSubscriber")
    void progressSubscriber(Subscriber<Object> value);
    /* optional property responseType*/    @JsProperty(name="responseType")
    String responseType();
    @JsProperty(name="responseType")
    void responseType(String value);
}
