package fr.lteconsulting.angular2gwt.client.interop.ng.core;

import jsinterop.annotations.JsType;
import ng.core.CompileDirectiveMetadata;
import jsinterop.annotations.JsProperty;
import ng.core.CompilerConfig;
import fr.lteconsulting.angular2gwt.client.JsArray;
import ng.core.CompilePipeSummary;
import ng.core.Expression;
import ng.core.AnimationEntryCompileResult;
import ng.core.CompileElement;
import ng.core.CompileQuery;
import ng.core.CompileNode;
import ng.core.CompileViewRootNode;
import ng.core.CompileMethod;
import ng.core.ClassMethod;
import ng.core.Statement;
import ng.core.ClassField;
import ng.core.ClassGetter;
import ng.core.CompileView;
import ng.core.CompilePipe;
import ng.core.Type;
import ng.core.ReadVarExpr;
import jsinterop.annotations.JsConstructor;

/**
  * Generated from tests\@angular\compiler\src\view_compiler\compile_view.d.ts
  * Package ng.core
  * Name CompileView
  * 
  **/
@JsType( isNative=true, namespace="ng.core", name="CompileView" )
public class CompileViewImpl extends NameResolver {
    @JsProperty(name="component")
    CompileDirectiveMetadata getComponent();
    @JsProperty(name="component")
    void setComponent(CompileDirectiveMetadata value);
    @JsProperty(name="genConfig")
    CompilerConfig getGenConfig();
    @JsProperty(name="genConfig")
    void setGenConfig(CompilerConfig value);
    @JsProperty(name="pipeMetas")
    JsArray<CompilePipeSummary> getPipeMetas();
    @JsProperty(name="pipeMetas")
    void setPipeMetas(JsArray<CompilePipeSummary> value);
    @JsProperty(name="styles")
    Expression getStyles();
    @JsProperty(name="styles")
    void setStyles(Expression value);
    @JsProperty(name="animations")
    JsArray<AnimationEntryCompileResult> getAnimations();
    @JsProperty(name="animations")
    void setAnimations(JsArray<AnimationEntryCompileResult> value);
    @JsProperty(name="viewIndex")
    int getViewIndex();
    @JsProperty(name="viewIndex")
    void setViewIndex(int value);
    @JsProperty(name="declarationElement")
    CompileElement getDeclarationElement();
    @JsProperty(name="declarationElement")
    void setDeclarationElement(CompileElement value);
    @JsProperty(name="templateVariableBindings")
    JsArray<JsArray<String>> getTemplateVariableBindings();
    @JsProperty(name="templateVariableBindings")
    void setTemplateVariableBindings(JsArray<JsArray<String>> value);
    @JsProperty(name="targetDependencies")
    Array<Object /* UnionType */> getTargetDependencies();
    @JsProperty(name="targetDependencies")
    void setTargetDependencies(Array<Object /* UnionType */> value);
    @JsProperty(name="viewType")
    /* ng.core.ViewType */ int getViewType();
    @JsProperty(name="viewType")
    void setViewType(/* ng.core.ViewType */ int value);
    @JsProperty(name="viewQueries")
    Map<Object,JsArray<CompileQuery>> getViewQueries();
    @JsProperty(name="viewQueries")
    void setViewQueries(Map<Object,JsArray<CompileQuery>> value);
    @JsProperty(name="viewChildren")
    JsArray<Expression> getViewChildren();
    @JsProperty(name="viewChildren")
    void setViewChildren(JsArray<Expression> value);
    @JsProperty(name="nodes")
    JsArray<CompileNode> getNodes();
    @JsProperty(name="nodes")
    void setNodes(JsArray<CompileNode> value);
    @JsProperty(name="rootNodes")
    JsArray<CompileViewRootNode> getRootNodes();
    @JsProperty(name="rootNodes")
    void setRootNodes(JsArray<CompileViewRootNode> value);
    @JsProperty(name="lastRenderNode")
    Expression getLastRenderNode();
    @JsProperty(name="lastRenderNode")
    void setLastRenderNode(Expression value);
    @JsProperty(name="viewContainers")
    JsArray<Expression> getViewContainers();
    @JsProperty(name="viewContainers")
    void setViewContainers(JsArray<Expression> value);
    @JsProperty(name="createMethod")
    CompileMethod getCreateMethod();
    @JsProperty(name="createMethod")
    void setCreateMethod(CompileMethod value);
    @JsProperty(name="animationBindingsMethod")
    CompileMethod getAnimationBindingsMethod();
    @JsProperty(name="animationBindingsMethod")
    void setAnimationBindingsMethod(CompileMethod value);
    @JsProperty(name="injectorGetMethod")
    CompileMethod getInjectorGetMethod();
    @JsProperty(name="injectorGetMethod")
    void setInjectorGetMethod(CompileMethod value);
    @JsProperty(name="updateContentQueriesMethod")
    CompileMethod getUpdateContentQueriesMethod();
    @JsProperty(name="updateContentQueriesMethod")
    void setUpdateContentQueriesMethod(CompileMethod value);
    @JsProperty(name="dirtyParentQueriesMethod")
    CompileMethod getDirtyParentQueriesMethod();
    @JsProperty(name="dirtyParentQueriesMethod")
    void setDirtyParentQueriesMethod(CompileMethod value);
    @JsProperty(name="updateViewQueriesMethod")
    CompileMethod getUpdateViewQueriesMethod();
    @JsProperty(name="updateViewQueriesMethod")
    void setUpdateViewQueriesMethod(CompileMethod value);
    @JsProperty(name="detectChangesInInputsMethod")
    CompileMethod getDetectChangesInInputsMethod();
    @JsProperty(name="detectChangesInInputsMethod")
    void setDetectChangesInInputsMethod(CompileMethod value);
    @JsProperty(name="detectChangesRenderPropertiesMethod")
    CompileMethod getDetectChangesRenderPropertiesMethod();
    @JsProperty(name="detectChangesRenderPropertiesMethod")
    void setDetectChangesRenderPropertiesMethod(CompileMethod value);
    @JsProperty(name="afterContentLifecycleCallbacksMethod")
    CompileMethod getAfterContentLifecycleCallbacksMethod();
    @JsProperty(name="afterContentLifecycleCallbacksMethod")
    void setAfterContentLifecycleCallbacksMethod(CompileMethod value);
    @JsProperty(name="afterViewLifecycleCallbacksMethod")
    CompileMethod getAfterViewLifecycleCallbacksMethod();
    @JsProperty(name="afterViewLifecycleCallbacksMethod")
    void setAfterViewLifecycleCallbacksMethod(CompileMethod value);
    @JsProperty(name="destroyMethod")
    CompileMethod getDestroyMethod();
    @JsProperty(name="destroyMethod")
    void setDestroyMethod(CompileMethod value);
    @JsProperty(name="detachMethod")
    CompileMethod getDetachMethod();
    @JsProperty(name="detachMethod")
    void setDetachMethod(CompileMethod value);
    @JsProperty(name="methods")
    JsArray<ClassMethod> getMethods();
    @JsProperty(name="methods")
    void setMethods(JsArray<ClassMethod> value);
    @JsProperty(name="ctorStmts")
    JsArray<Statement> getCtorStmts();
    @JsProperty(name="ctorStmts")
    void setCtorStmts(JsArray<Statement> value);
    @JsProperty(name="fields")
    JsArray<ClassField> getFields();
    @JsProperty(name="fields")
    void setFields(JsArray<ClassField> value);
    @JsProperty(name="getters")
    JsArray<ClassGetter> getGetters();
    @JsProperty(name="getters")
    void setGetters(JsArray<ClassGetter> value);
    @JsProperty(name="disposables")
    JsArray<Expression> getDisposables();
    @JsProperty(name="disposables")
    void setDisposables(JsArray<Expression> value);
    @JsProperty(name="componentView")
    CompileView getComponentView();
    @JsProperty(name="componentView")
    void setComponentView(CompileView value);
    @JsProperty(name="purePipes")
    Map<String,CompilePipe> getPurePipes();
    @JsProperty(name="purePipes")
    void setPurePipes(Map<String,CompilePipe> value);
    @JsProperty(name="pipes")
    JsArray<CompilePipe> getPipes();
    @JsProperty(name="pipes")
    void setPipes(JsArray<CompilePipe> value);
    @JsProperty(name="locals")
    Map<String,Expression> getLocals();
    @JsProperty(name="locals")
    void setLocals(Map<String,Expression> value);
    @JsProperty(name="className")
    String getClassName();
    @JsProperty(name="className")
    void setClassName(String value);
    @JsProperty(name="classType")
    Type getClassType();
    @JsProperty(name="classType")
    void setClassType(Type value);
    @JsProperty(name="classExpr")
    ReadVarExpr getClassExpr();
    @JsProperty(name="classExpr")
    void setClassExpr(ReadVarExpr value);
    @JsProperty(name="literalArrayCount")
    int getLiteralArrayCount();
    @JsProperty(name="literalArrayCount")
    void setLiteralArrayCount(int value);
    @JsProperty(name="literalMapCount")
    int getLiteralMapCount();
    @JsProperty(name="literalMapCount")
    void setLiteralMapCount(int value);
    @JsProperty(name="pipeCount")
    int getPipeCount();
    @JsProperty(name="pipeCount")
    void setPipeCount(int value);
    @JsProperty(name="componentContext")
    Expression getComponentContext();
    @JsProperty(name="componentContext")
    void setComponentContext(Expression value);
    @JsConstructor
    public CompileViewImpl(CompileDirectiveMetadata component,CompilerConfig genConfig,JsArray<CompilePipeSummary> pipeMetas,Expression styles,JsArray<AnimationEntryCompileResult> animations,int viewIndex,CompileElement declarationElement,JsArray<JsArray<String>> templateVariableBindings,Array<Object /* UnionType */> targetDependencies) {}
    public native  Expression callPipe(String name,Expression input,JsArray<Expression> args);
    public native  Expression getLocal(String name);
    public native  void finish();
}
