package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\provider_analyzer.d.ts
  * Package ng.core
  * Name ProviderElementContext
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ProviderElementContext  {
    public ProviderViewContext viewContext;
    public Object _parent;
    public Object _isViewRoot;
    public Object _directiveAsts;
    public Object _sourceSpan;
    public Object _contentQueries;
    public Object _transformedProviders;
    public Object _seenProviders;
    public Object _allProviders;
    public Object _attrs;
    public Object _hasViewContainer;
    @JsConstructor
    public ProviderElementContext(ProviderViewContext viewContext,ProviderElementContext _parent,boolean _isViewRoot,JsArray<DirectiveAst> _directiveAsts,JsArray<AttrAst> attrs,JsArray<ReferenceAst> refs,ParseSourceSpan _sourceSpan) {}
    public native  void afterElement();
    public JsArray<ProviderAst> transformProviders;
    public JsArray<DirectiveAst> transformedDirectiveAsts;
    public boolean transformedHasViewContainer;
    public native  void _addQueryReadsTo();
    public native  void _getQueriesFor();
    public native  void _getOrCreateLocalProvider();
    public native  void _getLocalDependency(UNKNOWN_TYPE_NAME_QuestionToken eager);
    public native  void _getDependency(UNKNOWN_TYPE_NAME_QuestionToken eager);
}
