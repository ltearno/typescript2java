package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.http.Headers;
import ng.http.ResponseOptions;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\static_response.d.ts
  * Package ng.http
  * Name Response
  * Creates `Response` instances from provided values.
  * 
  * Though this object isn't
  * usually instantiated by end-users, it is the primary object interacted with when it comes time to
  * add data to a view.
  * 
  * ### Example
  * 
  * ```
  * http.request('my-friends.txt').subscribe(response => this.friends = response.text());
  * ```
  * 
  * The Response's interface is inspired by the Response constructor defined in the [Fetch
  * Spec](https://fetch.spec.whatwg.org/#response-class), but is considered a static value whose body
  * can be accessed many times. There are other differences in the implementation, but this is the
  * most significant.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Response extends Body {
    @JsProperty(name="type")
    /* ng.http.ResponseType */ int getType();
    @JsProperty(name="type")
    void setType(/* ng.http.ResponseType */ int value);
    @JsProperty(name="ok")
    boolean getOk();
    @JsProperty(name="ok")
    void setOk(boolean value);
    @JsProperty(name="url")
    String getUrl();
    @JsProperty(name="url")
    void setUrl(String value);
    @JsProperty(name="status")
    int getStatus();
    @JsProperty(name="status")
    void setStatus(int value);
    @JsProperty(name="statusText")
    String getStatusText();
    @JsProperty(name="statusText")
    void setStatusText(String value);
    @JsProperty(name="bytesLoaded")
    int getBytesLoaded();
    @JsProperty(name="bytesLoaded")
    void setBytesLoaded(int value);
    @JsProperty(name="totalBytes")
    int getTotalBytes();
    @JsProperty(name="totalBytes")
    void setTotalBytes(int value);
    @JsProperty(name="headers")
    Headers getHeaders();
    @JsProperty(name="headers")
    void setHeaders(Headers value);
    @JsConstructor
    public Response(ResponseOptions responseOptions) {}
     String toString();
}
