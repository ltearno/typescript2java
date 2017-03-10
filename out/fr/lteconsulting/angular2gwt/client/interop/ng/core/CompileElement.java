package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileDirectiveSummary;
import jsinterop.annotations.JsProperty;
import ng.core.CompileElement;
import ng.core.Expression;
import ng.core.ReadPropExpr;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileViewRootNode;
import ng.core.CompileView;
import fr.lteconsulting.angular2gwt.client.JsTypedObject;
import ng.core.CompileTokenMetadata;
import ng.core.TemplateAst;
import ng.core.ProviderAst;
import ng.core.ReferenceAst;
import jsinterop.annotations.JsConstructor;
import ng.core.CompileQuery;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_element.d.ts
  * Package ng.core
  * Name CompileElement
  * 
  **/
@JsType( isNative=true, namespace="jsinterop.annotations.JsPackage.GLOBAL", name="Object" )
public interface CompileElement extends CompileNode {
    @JsProperty(name="component")
    CompileDirectiveSummary getComponent();
    @JsProperty(name="component")
    void setComponent(CompileDirectiveSummary value);
    @JsProperty(name="_directives")
    Object get_directives();
    @JsProperty(name="_directives")
    void set_directives(Object value);
    @JsProperty(name="_resolvedProvidersArray")
    Object get_resolvedProvidersArray();
    @JsProperty(name="_resolvedProvidersArray")
    void set_resolvedProvidersArray(Object value);
    @JsProperty(name="hasViewContainer")
    boolean getHasViewContainer();
    @JsProperty(name="hasViewContainer")
    void setHasViewContainer(boolean value);
    @JsProperty(name="hasEmbeddedView")
    boolean getHasEmbeddedView();
    @JsProperty(name="hasEmbeddedView")
    void setHasEmbeddedView(boolean value);
    @JsProperty(name="compViewExpr")
    Expression getCompViewExpr();
    @JsProperty(name="compViewExpr")
    void setCompViewExpr(Expression value);
    @JsProperty(name="viewContainer")
    ReadPropExpr getViewContainer();
    @JsProperty(name="viewContainer")
    void setViewContainer(ReadPropExpr value);
    @JsProperty(name="elementRef")
    Expression getElementRef();
    @JsProperty(name="elementRef")
    void setElementRef(Expression value);
    @JsProperty(name="instances")
    Map<Object,Expression> getInstances();
    @JsProperty(name="instances")
    void setInstances(Map<Object,Expression> value);
    @JsProperty(name="directiveWrapperInstance")
    Map<Object,Expression> getDirectiveWrapperInstance();
    @JsProperty(name="directiveWrapperInstance")
    void setDirectiveWrapperInstance(Map<Object,Expression> value);
    @JsProperty(name="_resolvedProviders")
    Object get_resolvedProviders();
    @JsProperty(name="_resolvedProviders")
    void set_resolvedProviders(Object value);
    @JsProperty(name="_queryCount")
    Object get_queryCount();
    @JsProperty(name="_queryCount")
    void set_queryCount(Object value);
    @JsProperty(name="_queries")
    Object get_queries();
    @JsProperty(name="_queries")
    void set_queries(Object value);
    @JsProperty(name="contentNodesByNgContentIndex")
    JsArray<Array<CompileViewRootNode>> getContentNodesByNgContentIndex();
    @JsProperty(name="contentNodesByNgContentIndex")
    void setContentNodesByNgContentIndex(JsArray<Array<CompileViewRootNode>> value);
    @JsProperty(name="embeddedView")
    CompileView getEmbeddedView();
    @JsProperty(name="embeddedView")
    void setEmbeddedView(CompileView value);
    @JsProperty(name="referenceTokens")
    JsTypedObject<String,CompileTokenMetadata> getReferenceTokens();
    @JsProperty(name="referenceTokens")
    void setReferenceTokens(JsTypedObject<String,CompileTokenMetadata> value);
    @JsConstructor
    public CompileElement(CompileElement parent,CompileView view,int nodeIndex,Expression renderNode,TemplateAst sourceAst,CompileDirectiveSummary component,JsArray<CompileDirectiveSummary> _directives,JsArray<ProviderAst> _resolvedProvidersArray,boolean hasViewContainer,boolean hasEmbeddedView,JsArray<ReferenceAst> references) {}
     void _createViewContainer();
     void _createComponentFactoryResolver();
     void setComponentView(Expression compViewExpr);
     void setEmbeddedView(CompileView embeddedView);
     void beforeChildren();
     void afterChildren(int childNodeCount);
     void finish();
     void addContentNode(int ngContentIndex,CompileViewRootNode nodeExpr);
     Expression getComponent();
     JsArray<CompileTokenMetadata> getProviderTokens();
     JsArray<CompileQuery> getQueriesFor(CompileTokenMetadata token);
     void _addQuery();
     void _getLocalDependency();
     void _getDependency();
}
