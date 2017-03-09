package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\base_response_options.d.ts
  * Package ng.http
  * Name ResponseOptions
  * Creates a response options object to be optionally provided when instantiating a
  * {@link Response}.
  * 
  * This class is based on the `ResponseInit` description in the [Fetch
  * Spec](https://fetch.spec.whatwg.org/#responseinit).
  * 
  * All values are null by default. Typical defaults can be found in the
  * {@link BaseResponseOptions} class, which sub-classes `ResponseOptions`.
  * 
  * This class may be used in tests to build {@link Response Responses} for
  * mock responses (see {@link MockBackend}).
  * 
  * ### Example ([live demo](http://plnkr.co/edit/P9Jkk8e8cz6NVzbcxEsD?p=preview))
  * 
  * ```typescript
  * import {ResponseOptions, Response} from '@angular/http';
  * 
  * var options = new ResponseOptions({
  *    body: '{"name":"Jeff"}'
  * });
  * var res = new Response(options);
  * 
  * console.log('res.json():', res.json()); // Object {name: "Jeff"}
  * ```
  **/
@JsType( isNative=true, namespace="ng.http" )
public class ResponseOptions  {
    public Object /* UnionType */ body;
    public int status;
    public Headers headers;
    public String url;
    @JsConstructor
    public ResponseOptions(ResponseOptionsArgs /* optional */ undefined) {}
    public native  ResponseOptions merge(ResponseOptionsArgs /* optional */ options);
}
