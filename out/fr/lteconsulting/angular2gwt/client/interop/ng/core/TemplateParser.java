package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.TemplateAstVisitor;
import ng.core.Parser;
import ng.core.ElementSchemaRegistry;
import ng.core.I18NHtmlParser;
import ng.core.Console;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileDirectiveMetadata;
import ng.core.CompileDirectiveSummary;
import ng.core.CompilePipeSummary;
import ng.core.SchemaMetadata;
import ng.core.TemplateAst;
import ng.core.TemplateParseResult;
import ng.core.ParseTreeResult;
import ng.core.InterpolationConfig;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_parser.d.ts
  * Package ng.core
  * Name TemplateParser
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface TemplateParser  {
    @JsProperty(name="_exprParser")
    Object get_exprParser();
    @JsProperty(name="_exprParser")
    void set_exprParser(Object value);
    @JsProperty(name="_schemaRegistry")
    Object get_schemaRegistry();
    @JsProperty(name="_schemaRegistry")
    void set_schemaRegistry(Object value);
    @JsProperty(name="_htmlParser")
    Object get_htmlParser();
    @JsProperty(name="_htmlParser")
    void set_htmlParser(Object value);
    @JsProperty(name="_console")
    Object get_console();
    @JsProperty(name="_console")
    void set_console(Object value);
    @JsProperty(name="transforms")
    JsArray<TemplateAstVisitor> getTransforms();
    @JsProperty(name="transforms")
    void setTransforms(JsArray<TemplateAstVisitor> value);
    @JsConstructor
    public TemplateParser(Parser _exprParser,ElementSchemaRegistry _schemaRegistry,I18NHtmlParser _htmlParser,Console _console,JsArray<TemplateAstVisitor> transforms) {}
     JsArray<TemplateAst> parse(CompileDirectiveMetadata component,String template,JsArray<CompileDirectiveSummary> directives,JsArray<CompilePipeSummary> pipes,JsArray<SchemaMetadata> schemas,String templateUrl);
     TemplateParseResult tryParse(CompileDirectiveMetadata component,String template,JsArray<CompileDirectiveSummary> directives,JsArray<CompilePipeSummary> pipes,JsArray<SchemaMetadata> schemas,String templateUrl);
     TemplateParseResult tryParseHtml(ParseTreeResult htmlAstWithErrors,CompileDirectiveMetadata component,String template,JsArray<CompileDirectiveSummary> directives,JsArray<CompilePipeSummary> pipes,JsArray<SchemaMetadata> schemas,String templateUrl);
     ParseTreeResult expandHtml(ParseTreeResult htmlAstWithErrors,boolean /* optional */ forced);
     InterpolationConfig getInterpolationConfig(CompileDirectiveMetadata component);
}
