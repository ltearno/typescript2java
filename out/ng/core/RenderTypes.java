package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;

/**
  * Generated from tests\@angular\compiler\src\config.d.ts
  * Package ng.core
  * Name RenderTypes
  * Types used for the renderer.
  * Can be replaced to specialize the generated output to a specific renderer
  * to help tree shaking.
  **/
@JsType( isNative=true, namespace="ng.core" )
public interface RenderTypes  {
    @JsProperty(name="renderer")
    CompileIdentifierMetadata renderer();
    @JsProperty(name="renderer")
    void renderer(CompileIdentifierMetadata value);
    @JsProperty(name="renderText")
    CompileIdentifierMetadata renderText();
    @JsProperty(name="renderText")
    void renderText(CompileIdentifierMetadata value);
    @JsProperty(name="renderElement")
    CompileIdentifierMetadata renderElement();
    @JsProperty(name="renderElement")
    void renderElement(CompileIdentifierMetadata value);
    @JsProperty(name="renderComment")
    CompileIdentifierMetadata renderComment();
    @JsProperty(name="renderComment")
    void renderComment(CompileIdentifierMetadata value);
    @JsProperty(name="renderNode")
    CompileIdentifierMetadata renderNode();
    @JsProperty(name="renderNode")
    void renderNode(CompileIdentifierMetadata value);
    @JsProperty(name="renderEvent")
    CompileIdentifierMetadata renderEvent();
    @JsProperty(name="renderEvent")
    void renderEvent(CompileIdentifierMetadata value);
}
