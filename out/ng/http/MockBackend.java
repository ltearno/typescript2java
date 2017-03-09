package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\http\testing\mock_backend.d.ts
  * Package ng.http
  * Name MockBackend
  * A mock backend for testing the {@link Http} service.
  * 
  * This class can be injected in tests, and should be used to override providers
  * to other backends, such as {@link XHRBackend}.
  * 
  * ### Example
  * 
  * ```
  * import {Injectable, ReflectiveInjector} from '@angular/core';
  * import {async, fakeAsync, tick} from '@angular/core/testing';
  * import {BaseRequestOptions, ConnectionBackend, Http, RequestOptions} from '@angular/http';
  * import {Response, ResponseOptions} from '@angular/http';
  * import {MockBackend, MockConnection} from '@angular/http/testing';
  * 
  * const HERO_ONE = 'HeroNrOne';
  * const HERO_TWO = 'WillBeAlwaysTheSecond';
  **/
@JsType( isNative=true, namespace="ng.http" )
public class MockBackend extends ConnectionBackend {
    public Object connections;
    public JsArray<MockConnection> connectionsArray;
    public Object pendingConnections;
    @JsConstructor
    public MockBackend() {}
    public native  void verifyNoPendingRequests();
    public native  void resolveAllConnections();
    public native  MockConnection createConnection(Request req);
}
