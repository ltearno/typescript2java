package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\base_request_options.d.ts
  * Package ng.http
  * Name BaseRequestOptions
  * Subclass of {@link RequestOptions}, with default values.
  * 
  * Default values:
  *   * method: {@link RequestMethod RequestMethod.Get}
  *   * headers: empty {@link Headers} object
  * 
  * This class could be extended and bound to the {@link RequestOptions} class
  * when configuring an {@link Injector}, in order to override the default options
  * used by {@link Http} to create and send {@link Request Requests}.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/LEKVSx?p=preview))
  * 
  * ```typescript
  * import {provide} from '@angular/core';
  * import {bootstrap} from '@angular/platform-browser/browser';
  * import {HTTP_PROVIDERS, Http, BaseRequestOptions, RequestOptions} from '@angular/http';
  * import {App} from './myapp';
  * 
  * class MyOptions extends BaseRequestOptions {
  *    search: string = 'coreTeam=true';
  * }
  * 
  * bootstrap(App, [HTTP_PROVIDERS, {provide: RequestOptions, useClass: MyOptions}]);
  * ```
  * 
  * The options could also be extended when manually creating a {@link Request}
  * object.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/oyBoEvNtDhOSfi9YxaVb?p=preview))
  * 
  * ```
  * import {BaseRequestOptions, Request, RequestMethod} from '@angular/http';
  * 
  * var options = new BaseRequestOptions();
  * var req = new Request(options.merge({
  *    method: RequestMethod.Post,
  *    url: 'https://google.com'
  * }));
  * console.log('req.method:', RequestMethod[req.method]); // Post
  * console.log('options.url:', options.url); // null
  * console.log('req.url:', req.url); // https://google.com
  * ```
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BaseRequestOptions extends RequestOptions {
    @JsConstructor
    public BaseRequestOptions() {}
}
