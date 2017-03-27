package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name XPathEvaluator
  * Typescript fqn XPathEvaluator
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface XPathEvaluator {
    XPathExpression createExpression(String expression, XPathNSResolver resolver);

    XPathNSResolver createNSResolver(Node /* optional */ nodeResolver);

    XPathResult evaluate(String expression, Node contextNode, Object /* UnionType */ resolver, Number type, Object /* UnionType */ result);
}
