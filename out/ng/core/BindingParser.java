package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\binding_parser.d.ts
  * Package ng.core
  * Name BindingParser
  * Parses bindings in templates and in the directive host area.
  **/
@JsType( isNative=true, namespace="ng.core" )
public class BindingParser  {
    public Object _exprParser;
    public Object _interpolationConfig;
    public Object _schemaRegistry;
    public Object _targetErrors;
    public Map<String,CompilePipeSummary> pipesByName;
    @JsConstructor
    public BindingParser(Parser _exprParser,InterpolationConfig _interpolationConfig,ElementSchemaRegistry _schemaRegistry,JsArray<CompilePipeSummary> pipes,JsArray<ParseError> _targetErrors) {}
    public native  JsArray<BoundElementPropertyAst> createDirectiveHostPropertyAsts(CompileDirectiveSummary dirMeta,ParseSourceSpan sourceSpan);
    public native  JsArray<BoundEventAst> createDirectiveHostEventAsts(CompileDirectiveSummary dirMeta,ParseSourceSpan sourceSpan);
    public native  ASTWithSource parseInterpolation(String value,ParseSourceSpan sourceSpan);
    public native  void parseInlineTemplateBinding(String prefixToken,String value,ParseSourceSpan sourceSpan,JsArray<JsArray<String>> targetMatchableAttrs,JsArray<BoundProperty> targetProps,JsArray<VariableAst> targetVars);
    public native  void _parseTemplateBindings();
    public native  void parseLiteralAttr(String name,String value,ParseSourceSpan sourceSpan,JsArray<JsArray<String>> targetMatchableAttrs,JsArray<BoundProperty> targetProps);
    public native  void parsePropertyBinding(String name,String expression,boolean isHost,ParseSourceSpan sourceSpan,JsArray<JsArray<String>> targetMatchableAttrs,JsArray<BoundProperty> targetProps);
    public native  boolean parsePropertyInterpolation(String name,String value,ParseSourceSpan sourceSpan,JsArray<JsArray<String>> targetMatchableAttrs,JsArray<BoundProperty> targetProps);
    public native  void _parsePropertyAst();
    public native  void _parseAnimation();
    public native  void _parseBinding();
    public native  BoundElementPropertyAst createElementPropertyAst(String elementSelector,BoundProperty boundProp);
    public native  void parseEvent(String name,String expression,ParseSourceSpan sourceSpan,JsArray<JsArray<String>> targetMatchableAttrs,JsArray<BoundEventAst> targetEvents);
    public native  void _parseAnimationEvent();
    public native  void _parseEvent();
    public native  void _parseAction();
    public native  void _reportError(UNKNOWN_TYPE_NAME_QuestionToken level);
    public native  void _reportExpressionParserErrors();
    public native  void _checkPipes();
    public native  void _validatePropertyOrAttributeName();
}
