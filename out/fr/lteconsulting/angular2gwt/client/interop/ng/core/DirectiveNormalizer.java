package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.ResourceLoader;
import ng.core.UrlResolver;
import ng.core.HtmlParser;
import ng.core.CompilerConfig;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileDirectiveMetadata;
import ng.core.PrenormalizedTemplateMetadata;
import ng.core.SyncAsyncResult;
import ng.core.CompileTemplateMetadata;
import ng.core.CompileStylesheetMetadata;

/**
  * Generated from tests\@angular\compiler\src\directive_normalizer.d.ts
  * Package ng.core
  * Name DirectiveNormalizer
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface DirectiveNormalizer  {
    @JsProperty(name="_resourceLoader")
    Object get_resourceLoader();
    @JsProperty(name="_resourceLoader")
    void set_resourceLoader(Object value);
    @JsProperty(name="_urlResolver")
    Object get_urlResolver();
    @JsProperty(name="_urlResolver")
    void set_urlResolver(Object value);
    @JsProperty(name="_htmlParser")
    Object get_htmlParser();
    @JsProperty(name="_htmlParser")
    void set_htmlParser(Object value);
    @JsProperty(name="_config")
    Object get_config();
    @JsProperty(name="_config")
    void set_config(Object value);
    @JsProperty(name="_resourceLoaderCache")
    Object get_resourceLoaderCache();
    @JsProperty(name="_resourceLoaderCache")
    void set_resourceLoaderCache(Object value);
    @JsConstructor
    public DirectiveNormalizer(ResourceLoader _resourceLoader,UrlResolver _urlResolver,HtmlParser _htmlParser,CompilerConfig _config) {}
     void clearCache();
     void clearCacheFor(CompileDirectiveMetadata normalizedDirective);
     void _fetch();
     SyncAsyncResult<CompileTemplateMetadata> normalizeTemplate(PrenormalizedTemplateMetadata prenormData);
     CompileTemplateMetadata normalizeTemplateSync(PrenormalizedTemplateMetadata prenomData);
     Promise<CompileTemplateMetadata> normalizeTemplateAsync(PrenormalizedTemplateMetadata prenomData);
     CompileTemplateMetadata normalizeLoadedTemplate(PrenormalizedTemplateMetadata prenomData,String template,String templateAbsUrl);
     Promise<CompileTemplateMetadata> normalizeExternalStylesheets(CompileTemplateMetadata templateMeta);
     void _loadMissingExternalStylesheets(UNKNOWN_TYPE_NAME_QuestionToken loadedStylesheets);
     CompileStylesheetMetadata normalizeStylesheet(CompileStylesheetMetadata stylesheet);
}
