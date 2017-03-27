package fr.lteconsulting.angular2gwt.client.interop;

import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

/**
  * Generated from node_modules\typescript\lib\lib.es6.d.ts
  * Name CSSRule
  * Typescript fqn CSSRule
  *
  * 
  **/
@JsType( isNative=true, namespace=JsPackage.GLOBAL, name="Object" )
public interface CSSRule {
    @JsProperty(name="cssText")
    String getCssText();

    @JsProperty(name="cssText")
    void setCssText(String value);

    @JsProperty(name="parentRule")
    CSSRule getParentRule();

    @JsProperty(name="parentRule")
    void setParentRule(CSSRule value);

    @JsProperty(name="parentStyleSheet")
    CSSStyleSheet getParentStyleSheet();

    @JsProperty(name="parentStyleSheet")
    void setParentStyleSheet(CSSStyleSheet value);

    @JsProperty(name="type")
    Number getType();

    @JsProperty(name="type")
    void setType(Number value);

    @JsProperty(name="CHARSET_RULE")
    Number getCHARSET_RULE();

    @JsProperty(name="CHARSET_RULE")
    void setCHARSET_RULE(Number value);

    @JsProperty(name="FONT_FACE_RULE")
    Number getFONT_FACE_RULE();

    @JsProperty(name="FONT_FACE_RULE")
    void setFONT_FACE_RULE(Number value);

    @JsProperty(name="IMPORT_RULE")
    Number getIMPORT_RULE();

    @JsProperty(name="IMPORT_RULE")
    void setIMPORT_RULE(Number value);

    @JsProperty(name="KEYFRAMES_RULE")
    Number getKEYFRAMES_RULE();

    @JsProperty(name="KEYFRAMES_RULE")
    void setKEYFRAMES_RULE(Number value);

    @JsProperty(name="KEYFRAME_RULE")
    Number getKEYFRAME_RULE();

    @JsProperty(name="KEYFRAME_RULE")
    void setKEYFRAME_RULE(Number value);

    @JsProperty(name="MEDIA_RULE")
    Number getMEDIA_RULE();

    @JsProperty(name="MEDIA_RULE")
    void setMEDIA_RULE(Number value);

    @JsProperty(name="NAMESPACE_RULE")
    Number getNAMESPACE_RULE();

    @JsProperty(name="NAMESPACE_RULE")
    void setNAMESPACE_RULE(Number value);

    @JsProperty(name="PAGE_RULE")
    Number getPAGE_RULE();

    @JsProperty(name="PAGE_RULE")
    void setPAGE_RULE(Number value);

    @JsProperty(name="STYLE_RULE")
    Number getSTYLE_RULE();

    @JsProperty(name="STYLE_RULE")
    void setSTYLE_RULE(Number value);

    @JsProperty(name="SUPPORTS_RULE")
    Number getSUPPORTS_RULE();

    @JsProperty(name="SUPPORTS_RULE")
    void setSUPPORTS_RULE(Number value);

    @JsProperty(name="UNKNOWN_RULE")
    Number getUNKNOWN_RULE();

    @JsProperty(name="UNKNOWN_RULE")
    void setUNKNOWN_RULE(Number value);

    @JsProperty(name="VIEWPORT_RULE")
    Number getVIEWPORT_RULE();

    @JsProperty(name="VIEWPORT_RULE")
    void setVIEWPORT_RULE(Number value);
}
