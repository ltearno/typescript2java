package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import jsinterop.annotations.JsType;

/**
  * Generated from tests\test.d.ts
  * Name Toto
  * Typescript fqn "tests/test".Toto
  *
  * Top je suis une classe
  **/
@JsType( isNative=true, namespace="", name="Toto" )
public class Toto implements IToto {
    /**
     * Yopyop
     * Et ouoiuoiuoi
     */
    @Override
    public native static <T> JsArray<T> flatten(IBabouche<Object /* Union type */> list);

    /**
     * Yipyip
     */
    @Override
    public native <T> JsArray<T> expand(JsArray<T> list);

    /**
     * Top je suis une classe
     */
    @Override
    public native Number doSomething(Number v, JsFunction1<String,Boolean> cb);
}
