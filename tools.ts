import * as path from "path"
import * as fs from "fs"

export function mkdirRec(p) {
    const mode = 0o755

    p = path.resolve(p)

    try {
        fs.mkdirSync(p, mode)
    }
    catch (err0) {
        switch (err0.code) {
            case 'ENOENT':
                mkdirRec(path.dirname(p))
                mkdirRec(p)
                break

            default:
                let stat
                try {
                    stat = fs.statSync(p)
                }
                catch (err1) {
                    throw err0
                }
                if (!stat.isDirectory()) throw err0
                break
        }
    }
}

export function dumpObject(o: any) {
    for (let key in o) {
        if (!Object.getOwnPropertyDescriptor(o, key))
            continue

        let value = o[key]
        if (typeof value === 'object') {
            console.log(`${key} : {`)
            console.log(`}`)
        }
    }
}

export function browseTypescriptDefinitionFilesRecursively(dir, filelist = []) {
    let files = fs.readdirSync(dir)
    filelist = filelist || []
    files.forEach(function (file) {
        if (fs.statSync(path.join(dir, file)).isDirectory()) {
            filelist = browseTypescriptDefinitionFilesRecursively(path.join(dir, file), filelist)
        }
        else if (file.endsWith('.d.ts')) {
            filelist.push(path.join(dir, file))
        }
    })
    return filelist
}