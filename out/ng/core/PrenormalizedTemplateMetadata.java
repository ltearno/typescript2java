package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\compiler\src\directive_normalizer.d.ts
  * Package ng.core
  * Name PrenormalizedTemplateMetadata
  * 
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class PrenormalizedTemplateMetadata  {
    public Object componentType;
    public String moduleUrl;
    public /* optional */ String template;
    public /* optional */ String templateUrl;
    public /* optional */ JsArray<String> styles;
    public /* optional */ JsArray<String> styleUrls;
    public /* optional */ JsArray<String> /* Tuple [String, String] */ interpolation;
    public /* optional */ /* ng.core.ViewEncapsulation */ int encapsulation;
    public /* optional */ JsArray<CompileAnimationEntryMetadata> animations;
}
