package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.platformBrowser.Predicate;
import ng.core.DebugElement;
import ng.core.Type;

/**
  * Generated from tests\@angular\platform-browser\src\dom\debug\by.d.ts
  * Package ng.platformBrowser
  * Name By
  * Predicates for use with {@link DebugElement}'s query functions.
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="By" )
public class ByImpl  {
    public static native  Predicate<DebugElement> all();
    public static native  Predicate<DebugElement> css(String selector);
    public static native  Predicate<DebugElement> directive(Type<Object> type);
}
