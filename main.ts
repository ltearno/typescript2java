import * as Engine from './engine'

// read configuration file through program argument (typescript2java.conf by default)
// check default values in the configuration file
// execute the engine

let configuration: Engine.Configuration

configuration = {
    sourceRootDir: './tests.angular4',
    baseJavaPackage: 'fr.lteconsulting.jsinterop',
    defaultJavaPackage: 'env',
    javaPackages: {
        "tests.angular4/@angular/platform-browser-dynamic/src": "ng.platformBrowserDynamic",
        "tests.angular4/@angular/platform-browser/src": "ng.platformBrowser",
        "tests.angular4/@angular/http/src": "ng.http",
        "tests.angular4/@angular/forms/src": "ng.forms",
        "tests.angular4/@angular/router/src": "ng.router",
        "tests.angular4/@angular/core/src": "ng.core",
        "tests.angular4/@angular/common/src": "ng.common",
        "tests.angular4/@angular/compiler/src/i18n": "ng.compiler.i18n",
        "tests.angular4/@angular/compiler/src/aot": "ng.compiler.aot",
        "tests.angular4/@angular/compiler/src/comiler_util": "ng.compiler.util",
        "tests.angular4/@angular/compiler/src/expression_parser": "ng.compiler.expression.parse",
        "tests.angular4/@angular/compiler/src/jit": "ng.compiler.jit",
        "tests.angular4/@angular/compiler/src/ml_parser": "ng.compiler.mlparser",
        "tests.angular4/@angular/compiler/src/output": "ng.compiler.output",
        "tests.angular4/@angular/compiler/src/schema": "ng.compiler.schema",
        "tests.angular4/@angular/compiler/src": "ng.compiler",
        "tests.angular4/@angular/": "ng",
        "tests.angular4/rxjs": "rxjs",
        "tests.angular4": "fr.lteconsulting.test"
    },
    processInternalTypes: true,
    outputDirectory: './out/src/main/java'
}
/*configuration = {
    sourceRootDir: './tests.angular4',
    baseJavaPackage: 'fr.lteconsulting.jsinterop',
    defaultJavaPackage: 'env',
    javaPackages: {
        "tests/@angular/platform-browser-dynamic/src": "ng.platformBrowserDynamic",
        "tests/@angular/platform-browser/src": "ng.platformBrowser",
        "tests/@angular/http/src": "ng.http",
        "tests/@angular/forms/src": "ng.forms",
        "tests/@angular/router/src": "ng.router",
        "tests/@angular/core/src": "ng.core",
        "tests/@angular/common/src": "ng.common",
        "tests/@angular/compiler/src": "ng.compiler",
        "tests/@angular/": "ng",
        "tests/rxjs": "rxjs",
        "tests": "fr.lteconsulting.test"
    },
    processInternalTypes: true,
    outputDirectory: './out/src/main/java'
}*/
if (2 * 3 < 4) {
    configuration = {
        sourceRootDir: './tests.mini',
        baseJavaPackage: 'fr.lteconsulting.jsinterop',
        defaultJavaPackage: 'env',
        javaPackages: {
            "tests.mini": "mini"
        },
        processInternalTypes: false,
        outputDirectory: './out/src/main/java'
    }
}

let engine = new Engine.Engine(configuration)
engine.run()