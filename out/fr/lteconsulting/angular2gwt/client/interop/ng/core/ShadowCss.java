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
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface ShadowCss  {
    @JsProperty(name="strictStyling")
    boolean getStrictStyling();
    @JsProperty(name="strictStyling")
    void setStrictStyling(boolean value);
    @JsConstructor
    public ShadowCss() {}
     String shimCssText(String cssText,String selector,String /* optional */ hostSelector);
     void _insertDirectives();
     void _insertPolyfillDirectivesInCssText();
     void _insertPolyfillRulesInCssText();
     void _scopeCssText();
     void _extractUnscopedRulesFromCssText();
     void _convertColonHost();
     void _convertColonHostContext();
     void _convertColonRule();
     void _colonHostContextPartReplacer();
     void _colonHostPartReplacer();
     void _convertShadowDOMSelectors();
     void _scopeSelectors();
     void _scopeSelector();
     void _selectorNeedsScoping();
     void _makeScopeMatcher();
     void _applySelectorScope();
     void _applySimpleSelectorScope();
     void _insertPolyfillHostInCssText();
}
