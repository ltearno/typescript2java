package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name WebGLContextAttributes
  * Typescript fqn WebGLContextAttributes
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface WebGLContextAttributes {
    /* optional property failIfMajorPerformanceCaveat*/    @JsProperty(name="failIfMajorPerformanceCaveat")
    boolean getFailIfMajorPerformanceCaveat();

    @JsProperty(name="failIfMajorPerformanceCaveat")
    void setFailIfMajorPerformanceCaveat(boolean value);

    /* optional property alpha*/    @JsProperty(name="alpha")
    boolean getAlpha();

    @JsProperty(name="alpha")
    void setAlpha(boolean value);

    /* optional property depth*/    @JsProperty(name="depth")
    boolean getDepth();

    @JsProperty(name="depth")
    void setDepth(boolean value);

    /* optional property stencil*/    @JsProperty(name="stencil")
    boolean getStencil();

    @JsProperty(name="stencil")
    void setStencil(boolean value);

    /* optional property antialias*/    @JsProperty(name="antialias")
    boolean getAntialias();

    @JsProperty(name="antialias")
    void setAntialias(boolean value);

    /* optional property premultipliedAlpha*/    @JsProperty(name="premultipliedAlpha")
    boolean getPremultipliedAlpha();

    @JsProperty(name="premultipliedAlpha")
    void setPremultipliedAlpha(boolean value);

    /* optional property preserveDrawingBuffer*/    @JsProperty(name="preserveDrawingBuffer")
    boolean getPreserveDrawingBuffer();

    @JsProperty(name="preserveDrawingBuffer")
    void setPreserveDrawingBuffer(boolean value);
}
