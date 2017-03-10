package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\aot\generated_file.d.ts
  * Package ng.core
  * Name GeneratedFile
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface GeneratedFile  {
    @JsProperty(name="srcFileUrl")
    String getSrcFileUrl();
    @JsProperty(name="srcFileUrl")
    void setSrcFileUrl(String value);
    @JsProperty(name="genFileUrl")
    String getGenFileUrl();
    @JsProperty(name="genFileUrl")
    void setGenFileUrl(String value);
    @JsProperty(name="source")
    String getSource();
    @JsProperty(name="source")
    void setSource(String value);
    @JsConstructor
    public GeneratedFile(String srcFileUrl,String genFileUrl,String source) {}
}
