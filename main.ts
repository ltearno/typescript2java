import * as fs from 'fs'
import * as Engine from './engine'

// read configuration file through program argument (typescript2java.conf by default)
// check default values in the configuration file
// execute the engine

if (process.argv.length < 2) {
    console.log(`usage : ts2java configuration_file`)
    process.exit()
}

let configurationFile = process.argv[process.argv.length - 1]
let configurationString = fs.readFileSync(configurationFile, "utf8")

let configuration: Engine.Configuration = null

try {
    configuration = JSON.parse(configurationString)
}
catch (err) {
}

if (!configuration) {
    console.log(`error when reading file ${configurationFile}`)
    process.exit()
}

let engine = new Engine.Engine(configuration)
engine.run()