package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.AnimationEntryMetadata;

/**
  * Generated from tests\@angular\core\src\metadata\directives.d.ts
  * Package ng.core
  * Name Component
  * Type of the Component metadata.,
  * ,Component decorator and metadata.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface Component extends Directive {
    /* optional property changeDetection*/    @JsProperty(name="changeDetection")
    /* ng.core.ChangeDetectionStrategy */ int changeDetection();
    @JsProperty(name="changeDetection")
    void changeDetection(/* ng.core.ChangeDetectionStrategy */ int value);
    /* optional property viewProviders*/    @JsProperty(name="viewProviders")
    JsArray</* NO SYMBOL */Provider> viewProviders();
    @JsProperty(name="viewProviders")
    void viewProviders(JsArray</* NO SYMBOL */Provider> value);
    /* optional property moduleId*/    @JsProperty(name="moduleId")
    String moduleId();
    @JsProperty(name="moduleId")
    void moduleId(String value);
    /* optional property templateUrl*/    @JsProperty(name="templateUrl")
    String templateUrl();
    @JsProperty(name="templateUrl")
    void templateUrl(String value);
    /* optional property template*/    @JsProperty(name="template")
    String template();
    @JsProperty(name="template")
    void template(String value);
    /* optional property styleUrls*/    @JsProperty(name="styleUrls")
    JsArray<String> styleUrls();
    @JsProperty(name="styleUrls")
    void styleUrls(JsArray<String> value);
    /* optional property styles*/    @JsProperty(name="styles")
    JsArray<String> styles();
    @JsProperty(name="styles")
    void styles(JsArray<String> value);
    /* optional property animations*/    @JsProperty(name="animations")
    JsArray<AnimationEntryMetadata> animations();
    @JsProperty(name="animations")
    void animations(JsArray<AnimationEntryMetadata> value);
    /* optional property encapsulation*/    @JsProperty(name="encapsulation")
    /* ng.core.ViewEncapsulation */ int encapsulation();
    @JsProperty(name="encapsulation")
    void encapsulation(/* ng.core.ViewEncapsulation */ int value);
    /* optional property interpolation*/    @JsProperty(name="interpolation")
    JsArray<String> /* Tuple [String, String] */ interpolation();
    @JsProperty(name="interpolation")
    void interpolation(JsArray<String> /* Tuple [String, String] */ value);
    /* optional property entryComponents*/    @JsProperty(name="entryComponents")
    Array<Object /* UnionType */> entryComponents();
    @JsProperty(name="entryComponents")
    void entryComponents(Array<Object /* UnionType */> value);
}
