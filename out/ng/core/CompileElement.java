package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_element.d.ts
  * Package ng.core
  * Name CompileElement
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompileElement extends CompileNode {
    public CompileDirectiveSummary component;
    public Object _directives;
    public Object _resolvedProvidersArray;
    public boolean hasViewContainer;
    public boolean hasEmbeddedView;
    public static native  CompileElement createNull();
    public Expression compViewExpr;
    public ReadPropExpr viewContainer;
    public Expression elementRef;
    public Map<Object,Expression> instances;
    public Map<Object,Expression> directiveWrapperInstance;
    public Object _resolvedProviders;
    public Object _queryCount;
    public Object _queries;
    public JsArray<Array<CompileViewRootNode>> contentNodesByNgContentIndex;
    public CompileView embeddedView;
    public JsTypedObject<String,CompileTokenMetadata> referenceTokens;
    @JsConstructor
    public CompileElement(CompileElement parent,CompileView view,int nodeIndex,Expression renderNode,TemplateAst sourceAst,CompileDirectiveSummary component,JsArray<CompileDirectiveSummary> _directives,JsArray<ProviderAst> _resolvedProvidersArray,boolean hasViewContainer,boolean hasEmbeddedView,JsArray<ReferenceAst> references) {}
    public native  void _createViewContainer();
    public native  void _createComponentFactoryResolver();
    public native  void setComponentView(Expression compViewExpr);
    public native  void setEmbeddedView(CompileView embeddedView);
    public native  void beforeChildren();
    public native  void afterChildren(int childNodeCount);
    public native  void finish();
    public native  void addContentNode(int ngContentIndex,CompileViewRootNode nodeExpr);
    public native  Expression getComponent();
    public native  JsArray<CompileTokenMetadata> getProviderTokens();
    public native  JsArray<CompileQuery> getQueriesFor(CompileTokenMetadata token);
    public native  void _addQuery();
    public native  void _getLocalDependency();
    public native  void _getDependency();
}
