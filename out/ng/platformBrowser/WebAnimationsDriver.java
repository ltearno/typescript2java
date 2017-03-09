package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.core.AnimationStyles;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationKeyframe;
import ng.core.AnimationPlayer;

/**
  * Generated from tests\@angular\platform-browser\src\dom\web_animations_driver.d.ts
  * Package ng.platformBrowser
  * Name WebAnimationsDriver
  * 
  **/
@JsType( isNative=true, namespace="ng.platformBrowser" )
public class WebAnimationsDriver extends AnimationDriver {
    public native  WebAnimationsPlayer animate(Object element,AnimationStyles startingStyles,JsArray<AnimationKeyframe> keyframes,int duration,int delay,String easing,JsArray<AnimationPlayer> /* optional */ previousPlayers);
}
