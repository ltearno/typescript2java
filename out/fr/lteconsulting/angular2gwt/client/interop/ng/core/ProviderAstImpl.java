package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileTokenMetadata;
import jsinterop.annotations.JsProperty;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompileProviderMetadata;
import ng.core.ParseSourceSpan;
import jsinterop.annotations.JsConstructor;
import ng.core.TemplateAstVisitor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name ProviderAst
  * A provider declared on an element
  **/
@JsType( isNative=true, namespace="ng.core", name="ProviderAst" )
public class ProviderAstImpl extends TemplateAst {
    @JsProperty(name="token")
    CompileTokenMetadata getToken();
    @JsProperty(name="token")
    void setToken(CompileTokenMetadata value);
    @JsProperty(name="multiProvider")
    boolean getMultiProvider();
    @JsProperty(name="multiProvider")
    void setMultiProvider(boolean value);
    @JsProperty(name="eager")
    boolean getEager();
    @JsProperty(name="eager")
    void setEager(boolean value);
    @JsProperty(name="providers")
    JsArray<CompileProviderMetadata> getProviders();
    @JsProperty(name="providers")
    void setProviders(JsArray<CompileProviderMetadata> value);
    @JsProperty(name="providerType")
    /* ng.core.ProviderAstType */ int getProviderType();
    @JsProperty(name="providerType")
    void setProviderType(/* ng.core.ProviderAstType */ int value);
    @JsProperty(name="lifecycleHooks")
    JsArray</* ng.core.LifecycleHooks */ int> getLifecycleHooks();
    @JsProperty(name="lifecycleHooks")
    void setLifecycleHooks(JsArray</* ng.core.LifecycleHooks */ int> value);
    @JsProperty(name="sourceSpan")
    ParseSourceSpan getSourceSpan();
    @JsProperty(name="sourceSpan")
    void setSourceSpan(ParseSourceSpan value);
    @JsConstructor
    public ProviderAstImpl(CompileTokenMetadata token,boolean multiProvider,boolean eager,JsArray<CompileProviderMetadata> providers,/* ng.core.ProviderAstType */ int providerType,JsArray</* ng.core.LifecycleHooks */ int> lifecycleHooks,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
