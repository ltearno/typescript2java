package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
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
@JsType( isNative=true, namespace="ng.http" )
public class Response extends Body {
    public /* ng.http.ResponseType */ int type;
    public boolean ok;
    public String url;
    public int status;
    public String statusText;
    public int bytesLoaded;
    public int totalBytes;
    public Headers headers;
    @JsConstructor
    public Response(ResponseOptions responseOptions) {}
    public native  String toString();
}
