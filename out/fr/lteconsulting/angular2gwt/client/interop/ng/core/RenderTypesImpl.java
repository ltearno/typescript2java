package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileIdentifierMetadata;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\src\config.d.ts
  * Package ng.core
  * Name RenderTypes
  * Types used for the renderer.
  * Can be replaced to specialize the generated output to a specific renderer
  * to help tree shaking.
  **/
@JsType( isNative=true, namespace="ng.core", name="RenderTypes" )
public abstract class RenderTypesImpl  {
    @JsProperty(name="renderer")
    CompileIdentifierMetadata getRenderer();
    @JsProperty(name="renderer")
    void setRenderer(CompileIdentifierMetadata value);
    @JsProperty(name="renderText")
    CompileIdentifierMetadata getRenderText();
    @JsProperty(name="renderText")
    void setRenderText(CompileIdentifierMetadata value);
    @JsProperty(name="renderElement")
    CompileIdentifierMetadata getRenderElement();
    @JsProperty(name="renderElement")
    void setRenderElement(CompileIdentifierMetadata value);
    @JsProperty(name="renderComment")
    CompileIdentifierMetadata getRenderComment();
    @JsProperty(name="renderComment")
    void setRenderComment(CompileIdentifierMetadata value);
    @JsProperty(name="renderNode")
    CompileIdentifierMetadata getRenderNode();
    @JsProperty(name="renderNode")
    void setRenderNode(CompileIdentifierMetadata value);
    @JsProperty(name="renderEvent")
    CompileIdentifierMetadata getRenderEvent();
    @JsProperty(name="renderEvent")
    void setRenderEvent(CompileIdentifierMetadata value);
}
