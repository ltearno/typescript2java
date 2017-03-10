package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.RenderTypes;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\config.d.ts
  * Package ng.core
  * Name CompilerConfig
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompilerConfig" )
public class CompilerConfigImpl  {
    @JsProperty(name="renderTypes")
    RenderTypes getRenderTypes();
    @JsProperty(name="renderTypes")
    void setRenderTypes(RenderTypes value);
    @JsProperty(name="defaultEncapsulation")
    /* ng.core.ViewEncapsulation */ int getDefaultEncapsulation();
    @JsProperty(name="defaultEncapsulation")
    void setDefaultEncapsulation(/* ng.core.ViewEncapsulation */ int value);
    @JsProperty(name="_genDebugInfo")
    Object get_genDebugInfo();
    @JsProperty(name="_genDebugInfo")
    void set_genDebugInfo(Object value);
    @JsProperty(name="_logBindingUpdate")
    Object get_logBindingUpdate();
    @JsProperty(name="_logBindingUpdate")
    void set_logBindingUpdate(Object value);
    @JsProperty(name="useJit")
    boolean getUseJit();
    @JsProperty(name="useJit")
    void setUseJit(boolean value);
    @JsConstructor
    public CompilerConfigImpl(/* TypeLiteral */ Object /* optional */ undefined) {}
    @JsProperty(name="genDebugInfo")
    boolean getGenDebugInfo();
    @JsProperty(name="genDebugInfo")
    void setGenDebugInfo(boolean value);
    @JsProperty(name="logBindingUpdate")
    boolean getLogBindingUpdate();
    @JsProperty(name="logBindingUpdate")
    void setLogBindingUpdate(boolean value);
}
