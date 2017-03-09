package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import fr.lteconsulting.angular2gwt.client.JsArray;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_view.d.ts
  * Package ng.core
  * Name CompileView
  * 
  **/
@JsType( isNative=true, namespace="ng.core" )
public class CompileView extends NameResolver {
    public CompileDirectiveMetadata component;
    public CompilerConfig genConfig;
    public JsArray<CompilePipeSummary> pipeMetas;
    public Expression styles;
    public JsArray<AnimationEntryCompileResult> animations;
    public int viewIndex;
    public CompileElement declarationElement;
    public JsArray<JsArray<String>> templateVariableBindings;
    public Array<Object /* UnionType */> targetDependencies;
    public /* ng.core.ViewType */ int viewType;
    public Map<Object,JsArray<CompileQuery>> viewQueries;
    public JsArray<Expression> viewChildren;
    public JsArray<CompileNode> nodes;
    public JsArray<CompileViewRootNode> rootNodes;
    public Expression lastRenderNode;
    public JsArray<Expression> viewContainers;
    public CompileMethod createMethod;
    public CompileMethod animationBindingsMethod;
    public CompileMethod injectorGetMethod;
    public CompileMethod updateContentQueriesMethod;
    public CompileMethod dirtyParentQueriesMethod;
    public CompileMethod updateViewQueriesMethod;
    public CompileMethod detectChangesInInputsMethod;
    public CompileMethod detectChangesRenderPropertiesMethod;
    public CompileMethod afterContentLifecycleCallbacksMethod;
    public CompileMethod afterViewLifecycleCallbacksMethod;
    public CompileMethod destroyMethod;
    public CompileMethod detachMethod;
    public JsArray<ClassMethod> methods;
    public JsArray<Statement> ctorStmts;
    public JsArray<ClassField> fields;
    public JsArray<ClassGetter> getters;
    public JsArray<Expression> disposables;
    public CompileView componentView;
    public Map<String,CompilePipe> purePipes;
    public JsArray<CompilePipe> pipes;
    public Map<String,Expression> locals;
    public String className;
    public Type classType;
    public ReadVarExpr classExpr;
    public int literalArrayCount;
    public int literalMapCount;
    public int pipeCount;
    public Expression componentContext;
    @JsConstructor
    public CompileView(CompileDirectiveMetadata component,CompilerConfig genConfig,JsArray<CompilePipeSummary> pipeMetas,Expression styles,JsArray<AnimationEntryCompileResult> animations,int viewIndex,CompileElement declarationElement,JsArray<JsArray<String>> templateVariableBindings,Array<Object /* UnionType */> targetDependencies) {}
    public native  Expression callPipe(String name,Expression input,JsArray<Expression> args);
    public native  Expression getLocal(String name);
    public native  void finish();
}
