package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\src\base_response_options.d.ts
  * Package ng.http
  * Name BaseResponseOptions
  * Subclass of {@link ResponseOptions}, with default values.
  * 
  * Default values:
  *   * status: 200
  *   * headers: empty {@link Headers} object
  * 
  * This class could be extended and bound to the {@link ResponseOptions} class
  * when configuring an {@link Injector}, in order to override the default options
  * used by {@link Http} to create {@link Response Responses}.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/qv8DLT?p=preview))
  * 
  * ```typescript
  * import {provide} from '@angular/core';
  * import {bootstrap} from '@angular/platform-browser/browser';
  * import {HTTP_PROVIDERS, Headers, Http, BaseResponseOptions, ResponseOptions} from
  * '@angular/http';
  * import {App} from './myapp';
  * 
  * class MyOptions extends BaseResponseOptions {
  *    headers:Headers = new Headers({network: 'github'});
  * }
  * 
  * bootstrap(App, [HTTP_PROVIDERS, {provide: ResponseOptions, useClass: MyOptions}]);
  * ```
  * 
  * The options could also be extended when manually creating a {@link Response}
  * object.
  * 
  * ### Example ([live demo](http://plnkr.co/edit/VngosOWiaExEtbstDoix?p=preview))
  * 
  * ```
  * import {BaseResponseOptions, Response} from '@angular/http';
  * 
  * var options = new BaseResponseOptions();
  * var res = new Response(options.merge({
  *    body: 'Angular',
  *    headers: new Headers({framework: 'angular'})
  * }));
  * console.log('res.headers.get("framework"):', res.headers.get('framework')); // angular
  * console.log('res.text():', res.text()); // Angular;
  * ```
  **/
@JsType( isNative=true, namespace="ng.http" )
public class BaseResponseOptions extends ResponseOptions {
    @JsConstructor
    public BaseResponseOptions() {}
}
