package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationEntryMetadata;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\core\src\metadata\view.d.ts
  * Package ng.core
  * Name ViewMetadata
  * Metadata properties available for configuring Views.
  * 
  * For details on the `@Component` annotation, see {@link Component}.
  * 
  * ### Example
  * 
  * ```
  **/
@JsType( isNative=true, namespace="ng.core", name="ViewMetadata" )
public class ViewMetadataImpl  {
    @JsProperty(name="templateUrl")
    String getTemplateUrl();
    @JsProperty(name="templateUrl")
    void setTemplateUrl(String value);
    @JsProperty(name="template")
    String getTemplate();
    @JsProperty(name="template")
    void setTemplate(String value);
    @JsProperty(name="styleUrls")
    JsArray<String> getStyleUrls();
    @JsProperty(name="styleUrls")
    void setStyleUrls(JsArray<String> value);
    @JsProperty(name="styles")
    JsArray<String> getStyles();
    @JsProperty(name="styles")
    void setStyles(JsArray<String> value);
    @JsProperty(name="encapsulation")
    /* ng.core.ViewEncapsulation */ int getEncapsulation();
    @JsProperty(name="encapsulation")
    void setEncapsulation(/* ng.core.ViewEncapsulation */ int value);
    @JsProperty(name="animations")
    JsArray<AnimationEntryMetadata> getAnimations();
    @JsProperty(name="animations")
    void setAnimations(JsArray<AnimationEntryMetadata> value);
    @JsProperty(name="interpolation")
    JsArray<String> /* Tuple [String, String] */ getInterpolation();
    @JsProperty(name="interpolation")
    void setInterpolation(JsArray<String> /* Tuple [String, String] */ value);
    @JsConstructor
    public ViewMetadataImpl(/* TypeLiteral */ Object /* optional */ undefined) {}
}
