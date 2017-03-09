package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_parser.d.ts
  * Package ng.core
  * Name TemplateParser
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class TemplateParser  {
    public Object _exprParser;
    public Object _schemaRegistry;
    public Object _htmlParser;
    public Object _console;
    public JsArray<TemplateAstVisitor> transforms;
    @JsConstructor
    public TemplateParser(Parser _exprParser,ElementSchemaRegistry _schemaRegistry,I18NHtmlParser _htmlParser,Console _console,JsArray<TemplateAstVisitor> transforms) {}
    public native  JsArray<TemplateAst> parse(CompileDirectiveMetadata component,String template,JsArray<CompileDirectiveSummary> directives,JsArray<CompilePipeSummary> pipes,JsArray<SchemaMetadata> schemas,String templateUrl);
    public native  TemplateParseResult tryParse(CompileDirectiveMetadata component,String template,JsArray<CompileDirectiveSummary> directives,JsArray<CompilePipeSummary> pipes,JsArray<SchemaMetadata> schemas,String templateUrl);
    public native  TemplateParseResult tryParseHtml(ParseTreeResult htmlAstWithErrors,CompileDirectiveMetadata component,String template,JsArray<CompileDirectiveSummary> directives,JsArray<CompilePipeSummary> pipes,JsArray<SchemaMetadata> schemas,String templateUrl);
    public native  ParseTreeResult expandHtml(ParseTreeResult htmlAstWithErrors,boolean /* optional */ forced);
    public native  InterpolationConfig getInterpolationConfig(CompileDirectiveMetadata component);
}
