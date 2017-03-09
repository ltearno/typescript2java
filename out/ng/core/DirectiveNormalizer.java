package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\directive_normalizer.d.ts
  * Package ng.core
  * Name DirectiveNormalizer
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class DirectiveNormalizer  {
    public Object _resourceLoader;
    public Object _urlResolver;
    public Object _htmlParser;
    public Object _config;
    public Object _resourceLoaderCache;
    @JsConstructor
    public DirectiveNormalizer(ResourceLoader _resourceLoader,UrlResolver _urlResolver,HtmlParser _htmlParser,CompilerConfig _config) {}
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
