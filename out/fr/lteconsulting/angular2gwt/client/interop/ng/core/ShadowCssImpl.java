package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\shadow_css.d.ts
  * Package ng.core
  * Name ShadowCss
  * This file is a port of shadowCSS from webcomponents.js to TypeScript.
  * 
  * Please make sure to keep to edits in sync with the source file.
  * 
  * Source:
  * https://github.com/webcomponents/webcomponentsjs/blob/4efecd7e0e/src/ShadowCSS/ShadowCSS.js
  * 
  * The original file level comment is reproduced below
  **/
@JsType( isNative=true, namespace="ng.core", name="ShadowCss" )
public class ShadowCssImpl  {
    @JsProperty(name="strictStyling")
    boolean getStrictStyling();
    @JsProperty(name="strictStyling")
    void setStrictStyling(boolean value);
    @JsConstructor
    public ShadowCssImpl() {}
    public native  String shimCssText(String cssText,String selector,String /* optional */ hostSelector);
    public native  void _insertDirectives();
    public native  void _insertPolyfillDirectivesInCssText();
    public native  void _insertPolyfillRulesInCssText();
    public native  void _scopeCssText();
    public native  void _extractUnscopedRulesFromCssText();
    public native  void _convertColonHost();
    public native  void _convertColonHostContext();
    public native  void _convertColonRule();
    public native  void _colonHostContextPartReplacer();
    public native  void _colonHostPartReplacer();
    public native  void _convertShadowDOMSelectors();
    public native  void _scopeSelectors();
    public native  void _scopeSelector();
    public native  void _selectorNeedsScoping();
    public native  void _makeScopeMatcher();
    public native  void _applySelectorScope();
    public native  void _applySimpleSelectorScope();
    public native  void _insertPolyfillHostInCssText();
}
