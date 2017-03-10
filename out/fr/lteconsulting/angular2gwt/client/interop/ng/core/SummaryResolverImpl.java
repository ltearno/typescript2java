package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.Summary;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\summary_resolver.d.ts
  * Package ng.core
  * Name SummaryResolver
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="SummaryResolver" )
public class SummaryResolverImpl<T>  {
    public native  Summary<T> resolveSummary(T reference);
    public native  JsArray<T> getSymbolsOf(String filePath);
}
