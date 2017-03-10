package fr.lteconsulting.angular2gwt.client.interop.ng.http;

import jsinterop.annotations.JsType;

/**
  * Generated from tests\@angular\http\src\enums.d.ts
  * Package ng.http
  * Name ReadyState
  * All possible states in which a connection can be, based on
  * [States](http://www.w3.org/TR/XMLHttpRequest/#states) from the `XMLHttpRequest` spec, but with an
  * additional "CANCELLED" state.
  **/
public interface ReadyState {
    final int Unsent = 0;
    final int Open = 1;
    final int HeadersReceived = 2;
    final int Loading = 3;
    final int Done = 4;
    final int Cancelled = 5;
}
