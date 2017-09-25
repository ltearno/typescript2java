import * as Engine from './engine'

// read configuration file through program argument (typescript2java.conf by default)
// check default values in the configuration file
// execute the engine

let configuration: Engine.Configuration

configuration = {
    sourceRootDir: './tests',
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
}
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