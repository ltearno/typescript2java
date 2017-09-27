# Typescript definitions to GWT JsInterop translater

This tools takes Typescript definition files (`.d.ts`) as input, process them, and then outputs `JsInterop` Java types for use within a GWT application.

It is written in Typescript and uses the Typescript compiler to parse definition files.

This tool is really in beta stage, many things can be added to render the generated API more user-friendly.

## How to use

Compile it with `npm install` then `tsc`.

Then launch it with `nodejs target/main.js CONFIG_FILE`.

Sample configuration files can be found at the root directory (`ts2java.browser.config.json` for instance).