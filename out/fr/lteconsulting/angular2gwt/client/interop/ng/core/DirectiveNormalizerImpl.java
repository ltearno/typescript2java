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
@JsType( isNative=true, namespace="ng.core", name="DirectiveNormalizer" )
public class DirectiveNormalizerImpl  {
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
    public DirectiveNormalizerImpl(ResourceLoader _resourceLoader,UrlResolver _urlResolver,HtmlParser _htmlParser,CompilerConfig _config) {}
    public native  void clearCache();
    public native  void clearCacheFor(CompileDirectiveMetadata normalizedDirective);
    public native  void _fetch();
    public native  SyncAsyncResult<CompileTemplateMetadata> normalizeTemplate(PrenormalizedTemplateMetadata prenormData);
    public native  CompileTemplateMetadata normalizeTemplateSync(PrenormalizedTemplateMetadata prenomData);
    public native  Promise<CompileTemplateMetadata> normalizeTemplateAsync(PrenormalizedTemplateMetadata prenomData);
    public native  CompileTemplateMetadata normalizeLoadedTemplate(PrenormalizedTemplateMetadata prenomData,String template,String templateAbsUrl);
    public native  Promise<CompileTemplateMetadata> normalizeExternalStylesheets(CompileTemplateMetadata templateMeta);
    public native  void _loadMissingExternalStylesheets(UNKNOWN_TYPE_NAME_QuestionToken loadedStylesheets);
    public native  CompileStylesheetMetadata normalizeStylesheet(CompileStylesheetMetadata stylesheet);
}
