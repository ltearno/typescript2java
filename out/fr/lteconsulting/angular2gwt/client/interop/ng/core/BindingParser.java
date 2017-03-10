package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import jsinterop.annotations.JsProperty;
import ng.core.CompilePipeSummary;
import ng.core.Parser;
import ng.core.InterpolationConfig;
import ng.core.ElementSchemaRegistry;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.ParseError;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileDirectiveSummary;
import ng.core.ParseSourceSpan;
import ng.core.BoundElementPropertyAst;
import ng.core.BoundEventAst;
import ng.core.ASTWithSource;
import ng.core.BoundProperty;
import ng.core.VariableAst;

/**
  * Generated from tests\@angular\compiler\src\template_parser\binding_parser.d.ts
  * Package ng.core
  * Name BindingParser
  * Parses bindings in templates and in the directive host area.
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface BindingParser  {
    @JsProperty(name="_exprParser")
    Object get_exprParser();
    @JsProperty(name="_exprParser")
    void set_exprParser(Object value);
    @JsProperty(name="_interpolationConfig")
    Object get_interpolationConfig();
    @JsProperty(name="_interpolationConfig")
    void set_interpolationConfig(Object value);
    @JsProperty(name="_schemaRegistry")
    Object get_schemaRegistry();
    @JsProperty(name="_schemaRegistry")
    void set_schemaRegistry(Object value);
    @JsProperty(name="_targetErrors")
    Object get_targetErrors();
    @JsProperty(name="_targetErrors")
    void set_targetErrors(Object value);
    @JsProperty(name="pipesByName")
    Map<String,CompilePipeSummary> getPipesByName();
    @JsProperty(name="pipesByName")
    void setPipesByName(Map<String,CompilePipeSummary> value);
    @JsConstructor
    public BindingParser(Parser _exprParser,InterpolationConfig _interpolationConfig,ElementSchemaRegistry _schemaRegistry,JsArray<CompilePipeSummary> pipes,JsArray<ParseError> _targetErrors) {}
     JsArray<BoundElementPropertyAst> createDirectiveHostPropertyAsts(CompileDirectiveSummary dirMeta,ParseSourceSpan sourceSpan);
     JsArray<BoundEventAst> createDirectiveHostEventAsts(CompileDirectiveSummary dirMeta,ParseSourceSpan sourceSpan);
     ASTWithSource parseInterpolation(String value,ParseSourceSpan sourceSpan);
     void parseInlineTemplateBinding(String prefixToken,String value,ParseSourceSpan sourceSpan,JsArray<JsArray<String>> targetMatchableAttrs,JsArray<BoundProperty> targetProps,JsArray<VariableAst> targetVars);
     void _parseTemplateBindings();
     void parseLiteralAttr(String name,String value,ParseSourceSpan sourceSpan,JsArray<JsArray<String>> targetMatchableAttrs,JsArray<BoundProperty> targetProps);
     void parsePropertyBinding(String name,String expression,boolean isHost,ParseSourceSpan sourceSpan,JsArray<JsArray<String>> targetMatchableAttrs,JsArray<BoundProperty> targetProps);
     boolean parsePropertyInterpolation(String name,String value,ParseSourceSpan sourceSpan,JsArray<JsArray<String>> targetMatchableAttrs,JsArray<BoundProperty> targetProps);
     void _parsePropertyAst();
     void _parseAnimation();
     void _parseBinding();
     BoundElementPropertyAst createElementPropertyAst(String elementSelector,BoundProperty boundProp);
     void parseEvent(String name,String expression,ParseSourceSpan sourceSpan,JsArray<JsArray<String>> targetMatchableAttrs,JsArray<BoundEventAst> targetEvents);
     void _parseAnimationEvent();
     void _parseEvent();
     void _parseAction();
     void _reportError(UNKNOWN_TYPE_NAME_QuestionToken level);
     void _reportExpressionParserErrors();
     void _checkPipes();
     void _validatePropertyOrAttributeName();
}
