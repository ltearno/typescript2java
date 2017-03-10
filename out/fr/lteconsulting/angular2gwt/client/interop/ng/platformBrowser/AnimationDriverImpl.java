package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.platformBrowser.AnimationDriver;
import jsinterop.annotations.JsProperty;
import ng.core.AnimationStyles;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationKeyframe;
import ng.core.AnimationPlayer;

/**
  * Generated from tests\@angular\platform-browser\src\dom\animation_driver.d.ts
  * Package ng.platformBrowser
  * Name AnimationDriver
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser", name="AnimationDriver" )
public abstract class AnimationDriverImpl  {
    @JsProperty(name="NOOP")
    static AnimationDriver getNOOP();
    @JsProperty(name="NOOP")
    static void setNOOP(AnimationDriver value);
    public native  AnimationPlayer animate(Object element,AnimationStyles startingStyles,JsArray<AnimationKeyframe> keyframes,int duration,int delay,String easing,JsArray<AnimationPlayer> /* optional */ previousPlayers);
}
