package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;

/**
  * Generated from tests\@angular\core\src\metadata\directives.d.ts
  * Package ng.core
  * Name Directive
  * Directive decorator and metadata.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Directive  {
    /* optional property selector*/    @JsProperty(name="selector")
    String selector();
    @JsProperty(name="selector")
    void selector(String value);
    /* optional property inputs*/    @JsProperty(name="inputs")
    JsArray<String> inputs();
    @JsProperty(name="inputs")
    void inputs(JsArray<String> value);
    /* optional property outputs*/    @JsProperty(name="outputs")
    JsArray<String> outputs();
    @JsProperty(name="outputs")
    void outputs(JsArray<String> value);
    /* optional property host*/    @JsProperty(name="host")
    JsTypedObject<String,String> host();
    @JsProperty(name="host")
    void host(JsTypedObject<String,String> value);
    /* optional property providers*/    @JsProperty(name="providers")
    JsArray</* NO SYMBOL */Provider> providers();
    @JsProperty(name="providers")
    void providers(JsArray</* NO SYMBOL */Provider> value);
    /* optional property exportAs*/    @JsProperty(name="exportAs")
    String exportAs();
    @JsProperty(name="exportAs")
    void exportAs(String value);
    /* optional property queries*/    @JsProperty(name="queries")
    JsTypedObject<String,Object> queries();
    @JsProperty(name="queries")
    void queries(JsTypedObject<String,Object> value);
}
