package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from tests\test.d.ts
  * Name Toto
  * Typescript fqn "tests/test".Toto
  *
  * Top je suis une classe
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface IToto {
    @JsProperty(name="test")
    Array<Number> getTest();

    @JsProperty(name="test")
    void setTest(Array<Number> value);

    /**
     * Yipyip
     */
    <T> JsArray<T> expand(JsArray<T> list);

    /**
     * Top je suis une classe
     */
    Number doSomething(Number v, JsFunction1<String,Boolean> cb);
}
