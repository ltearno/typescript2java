package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsFunction1;
import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLCanvasElement
  * Typescript fqn HTMLCanvasElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLCanvasElement extends Object /* no JavaNode for symbol */ {
    /**
     * Gets or sets the height of a canvas element on a document.
     */
    @JsProperty(name="height")
    Number getHeight();

    /**
     * Gets or sets the height of a canvas element on a document.
     */
    @JsProperty(name="height")
    void setHeight(Number value);

    /**
     * Gets or sets the width of a canvas element on a document.
     */
    @JsProperty(name="width")
    Number getWidth();

    /**
     * Gets or sets the width of a canvas element on a document.
     */
    @JsProperty(name="width")
    void setWidth(Number value);

    /**
     * Returns an object that provides methods and properties for drawing and manipulating images and graphics on a canvas element in a document. A context object includes information about colors, line widths, fonts, and other graphic parameters that can be drawn on a canvas.
     */
    Object /* UnionType */ getContext(Object contextId, Canvas2DContextAttributes /* optional */ contextAttributes);

    Object /* UnionType */ getContext(Object /* UnionType */ contextId, WebGLContextAttributes /* optional */ contextAttributes);

    Object /* UnionType */ getContext(String contextId, /* TypeLiteral */ Object /* optional */ contextAttributes);

    /**
     * Returns a blob object encoded as a Portable Network Graphics (PNG) format from a canvas image or drawing.
     */
    Blob msToBlob();

    /**
     * Returns the content of the current canvas as an image that you can use as a source for another canvas or an HTML element.
     */
    String toDataURL(String /* optional */ type, JsArray<Object> /* optional */ args);

    void toBlob(JsFunction1<Blob,Void> callback, String /* optional */ type, JsArray<Object> /* optional */ arguments);

    <K> void addEventListener(K type, JsFunction2<HTMLCanvasElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
