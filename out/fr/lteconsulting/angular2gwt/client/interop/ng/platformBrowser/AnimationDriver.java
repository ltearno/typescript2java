package fr.lteconsulting.angular2gwt.client.interop.ng.platformBrowser;

import jsinterop.annotations.JsType;
import ng.platformBrowser.AnimationDriver;
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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface AnimationDriver  {
     AnimationPlayer animate(Object element,AnimationStyles startingStyles,JsArray<AnimationKeyframe> keyframes,int duration,int delay,String easing,JsArray<AnimationPlayer> /* optional */ previousPlayers);
}
