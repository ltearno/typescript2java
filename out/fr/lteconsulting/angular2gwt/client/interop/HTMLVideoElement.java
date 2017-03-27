package fr.lteconsulting.angular2gwt.client.interop;

import fr.lteconsulting.angular2gwt.client.JsFunction2;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name HTMLVideoElement
  * Typescript fqn HTMLVideoElement
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface HTMLVideoElement extends Object /* no JavaNode for symbol */ {
    /**
     * Gets or sets the height of the video element.
     */
    @JsProperty(name="height")
    Number getHeight();

    /**
     * Gets or sets the height of the video element.
     */
    @JsProperty(name="height")
    void setHeight(Number value);

    @JsProperty(name="msHorizontalMirror")
    boolean getMsHorizontalMirror();

    @JsProperty(name="msHorizontalMirror")
    void setMsHorizontalMirror(boolean value);

    @JsProperty(name="msIsLayoutOptimalForPlayback")
    boolean getMsIsLayoutOptimalForPlayback();

    @JsProperty(name="msIsLayoutOptimalForPlayback")
    void setMsIsLayoutOptimalForPlayback(boolean value);

    @JsProperty(name="msIsStereo3D")
    boolean getMsIsStereo3D();

    @JsProperty(name="msIsStereo3D")
    void setMsIsStereo3D(boolean value);

    @JsProperty(name="msStereo3DPackingMode")
    String getMsStereo3DPackingMode();

    @JsProperty(name="msStereo3DPackingMode")
    void setMsStereo3DPackingMode(String value);

    @JsProperty(name="msStereo3DRenderMode")
    String getMsStereo3DRenderMode();

    @JsProperty(name="msStereo3DRenderMode")
    void setMsStereo3DRenderMode(String value);

    @JsProperty(name="msZoom")
    boolean getMsZoom();

    @JsProperty(name="msZoom")
    void setMsZoom(boolean value);

    @JsProperty(name="onMSVideoFormatChanged")
    JsFunction2<HTMLVideoElement,Event,Object> getOnMSVideoFormatChanged();

    @JsProperty(name="onMSVideoFormatChanged")
    void setOnMSVideoFormatChanged(JsFunction2<HTMLVideoElement,Event,Object> value);

    @JsProperty(name="onMSVideoFrameStepCompleted")
    JsFunction2<HTMLVideoElement,Event,Object> getOnMSVideoFrameStepCompleted();

    @JsProperty(name="onMSVideoFrameStepCompleted")
    void setOnMSVideoFrameStepCompleted(JsFunction2<HTMLVideoElement,Event,Object> value);

    @JsProperty(name="onMSVideoOptimalLayoutChanged")
    JsFunction2<HTMLVideoElement,Event,Object> getOnMSVideoOptimalLayoutChanged();

    @JsProperty(name="onMSVideoOptimalLayoutChanged")
    void setOnMSVideoOptimalLayoutChanged(JsFunction2<HTMLVideoElement,Event,Object> value);

    /**
     * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
     */
    @JsProperty(name="poster")
    String getPoster();

    /**
     * Gets or sets a URL of an image to display, for example, like a movie poster. This can be a still frame from the video, or another image if no video data is available.
     */
    @JsProperty(name="poster")
    void setPoster(String value);

    /**
     * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
     */
    @JsProperty(name="videoHeight")
    Number getVideoHeight();

    /**
     * Gets the intrinsic height of a video in CSS pixels, or zero if the dimensions are not known.
     */
    @JsProperty(name="videoHeight")
    void setVideoHeight(Number value);

    /**
     * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
     */
    @JsProperty(name="videoWidth")
    Number getVideoWidth();

    /**
     * Gets the intrinsic width of a video in CSS pixels, or zero if the dimensions are not known.
     */
    @JsProperty(name="videoWidth")
    void setVideoWidth(Number value);

    @JsProperty(name="webkitDisplayingFullscreen")
    boolean getWebkitDisplayingFullscreen();

    @JsProperty(name="webkitDisplayingFullscreen")
    void setWebkitDisplayingFullscreen(boolean value);

    @JsProperty(name="webkitSupportsFullscreen")
    boolean getWebkitSupportsFullscreen();

    @JsProperty(name="webkitSupportsFullscreen")
    void setWebkitSupportsFullscreen(boolean value);

    /**
     * Gets or sets the width of the video element.
     */
    @JsProperty(name="width")
    Number getWidth();

    /**
     * Gets or sets the width of the video element.
     */
    @JsProperty(name="width")
    void setWidth(Number value);

    VideoPlaybackQuality getVideoPlaybackQuality();

    void msFrameStep(boolean forward);

    void msInsertVideoEffect(String activatableClassId, boolean effectRequired, Object /* optional */ config);

    void msSetVideoRectangle(Number left, Number top, Number right, Number bottom);

    void webkitEnterFullScreen();

    void webkitEnterFullscreen();

    void webkitExitFullScreen();

    void webkitExitFullscreen();

    <K> void addEventListener(K type, JsFunction2<HTMLVideoElement,Object,Object> listener, boolean /* optional */ useCapture);

    void addEventListener(String type, Object /* Union type */ listener, boolean /* optional */ useCapture);
}
