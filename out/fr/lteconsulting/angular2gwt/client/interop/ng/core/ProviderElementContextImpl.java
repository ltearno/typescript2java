package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.ProviderViewContext;
import jsinterop.annotations.JsProperty;
import ng.core.ProviderElementContext;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.DirectiveAst;
import ng.core.AttrAst;
import ng.core.ReferenceAst;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.ProviderAst;

/**
  * Generated from tests\@angular\compiler\src\provider_analyzer.d.ts
  * Package ng.core
  * Name ProviderElementContext
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="ProviderElementContext" )
public class ProviderElementContextImpl  {
    @JsProperty(name="viewContext")
    ProviderViewContext getViewContext();
    @JsProperty(name="viewContext")
    void setViewContext(ProviderViewContext value);
    @JsProperty(name="_parent")
    Object get_parent();
    @JsProperty(name="_parent")
    void set_parent(Object value);
    @JsProperty(name="_isViewRoot")
    Object get_isViewRoot();
    @JsProperty(name="_isViewRoot")
    void set_isViewRoot(Object value);
    @JsProperty(name="_directiveAsts")
    Object get_directiveAsts();
    @JsProperty(name="_directiveAsts")
    void set_directiveAsts(Object value);
    @JsProperty(name="_sourceSpan")
    Object get_sourceSpan();
    @JsProperty(name="_sourceSpan")
    void set_sourceSpan(Object value);
    @JsProperty(name="_contentQueries")
    Object get_contentQueries();
    @JsProperty(name="_contentQueries")
    void set_contentQueries(Object value);
    @JsProperty(name="_transformedProviders")
    Object get_transformedProviders();
    @JsProperty(name="_transformedProviders")
    void set_transformedProviders(Object value);
    @JsProperty(name="_seenProviders")
    Object get_seenProviders();
    @JsProperty(name="_seenProviders")
    void set_seenProviders(Object value);
    @JsProperty(name="_allProviders")
    Object get_allProviders();
    @JsProperty(name="_allProviders")
    void set_allProviders(Object value);
    @JsProperty(name="_attrs")
    Object get_attrs();
    @JsProperty(name="_attrs")
    void set_attrs(Object value);
    @JsProperty(name="_hasViewContainer")
    Object get_hasViewContainer();
    @JsProperty(name="_hasViewContainer")
    void set_hasViewContainer(Object value);
    @JsConstructor
    public ProviderElementContextImpl(ProviderViewContext viewContext,ProviderElementContext _parent,boolean _isViewRoot,JsArray<DirectiveAst> _directiveAsts,JsArray<AttrAst> attrs,JsArray<ReferenceAst> refs,ParseSourceSpan _sourceSpan) {}
    public native  void afterElement();
    @JsProperty(name="transformProviders")
    JsArray<ProviderAst> getTransformProviders();
    @JsProperty(name="transformProviders")
    void setTransformProviders(JsArray<ProviderAst> value);
    @JsProperty(name="transformedDirectiveAsts")
    JsArray<DirectiveAst> getTransformedDirectiveAsts();
    @JsProperty(name="transformedDirectiveAsts")
    void setTransformedDirectiveAsts(JsArray<DirectiveAst> value);
    @JsProperty(name="transformedHasViewContainer")
    boolean getTransformedHasViewContainer();
    @JsProperty(name="transformedHasViewContainer")
    void setTransformedHasViewContainer(boolean value);
    public native  void _addQueryReadsTo();
    public native  void _getQueriesFor();
    public native  void _getOrCreateLocalProvider();
    public native  void _getLocalDependency(UNKNOWN_TYPE_NAME_QuestionToken eager);
    public native  void _getDependency(UNKNOWN_TYPE_NAME_QuestionToken eager);
}
