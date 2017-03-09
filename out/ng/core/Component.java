package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsPackage;
import fr.lteconsulting.angular2gwt.client.JsArray;

/**
  * Generated from tests\@angular\core\src\metadata\directives.d.ts
  * Package ng.core
  * Name Component
  * Type of the Component metadata.,
  * ,Component decorator and metadata.
  **/
@JsType( isNative=true, name="Object", namespace=JsPackage.GLOBAL )
public class Component extends Directive {
    public /* optional */ /* ng.core.ChangeDetectionStrategy */ int changeDetection;
    public /* optional */ JsArray</* NO SYMBOL */Provider> viewProviders;
    public /* optional */ String moduleId;
    public /* optional */ String templateUrl;
    public /* optional */ String template;
    public /* optional */ JsArray<String> styleUrls;
    public /* optional */ JsArray<String> styles;
    public /* optional */ JsArray<AnimationEntryMetadata> animations;
    public /* optional */ /* ng.core.ViewEncapsulation */ int encapsulation;
    public /* optional */ JsArray<String> /* Tuple [String, String] */ interpolation;
    public /* optional */ Array<Object /* UnionType */> entryComponents;
}
