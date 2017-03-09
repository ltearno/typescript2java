package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\template_parser\template_ast.d.ts
  * Package ng.core
  * Name ProviderAst
  * A provider declared on an element
  **/
@JsType( isNative=true, namespace="ng.core" )
public class ProviderAst extends TemplateAst {
    public CompileTokenMetadata token;
    public boolean multiProvider;
    public boolean eager;
    public JsArray<CompileProviderMetadata> providers;
    public /* ng.core.ProviderAstType */ int providerType;
    public JsArray</* ng.core.LifecycleHooks */ int> lifecycleHooks;
    public ParseSourceSpan sourceSpan;
    @JsConstructor
    public ProviderAst(CompileTokenMetadata token,boolean multiProvider,boolean eager,JsArray<CompileProviderMetadata> providers,/* ng.core.ProviderAstType */ int providerType,JsArray</* ng.core.LifecycleHooks */ int> lifecycleHooks,ParseSourceSpan sourceSpan) {}
    public native  Object visit(TemplateAstVisitor visitor,Object context);
}
