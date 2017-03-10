package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.core.AnimationStyles;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationKeyframe;
import ng.core.AnimationPlayer;
import ng.platformBrowser.WebAnimationsPlayer;

/**
  * Generated from tests\@angular\platform-browser\src\dom\web_animations_driver.d.ts
  * Package ng.platformBrowser
  * Name WebAnimationsDriver
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface WebAnimationsDriver extends AnimationDriver {
     WebAnimationsPlayer animate(Object element,AnimationStyles startingStyles,JsArray<AnimationKeyframe> keyframes,int duration,int delay,String easing,JsArray<AnimationPlayer> /* optional */ previousPlayers);
}
