import * as path from "path"
import * as fs from "fs"

export function mkdirRec(p, opts = undefined, made = null) {
    if (!opts || typeof opts !== 'object')
        opts = { mode: opts }

    var mode = opts.mode
    var xfs = opts.fs || fs

    if (mode === undefined)
        mode = 0x777 & (~process.umask())
    if (!made) made = null

    p = path.resolve(p)

    try {
        xfs.mkdirSync(p, mode)
        made = made || p
    }
    catch (err0) {
        switch (err0.code) {
            case 'ENOENT':
                made = mkdirRec(path.dirname(p), opts, made)
                mkdirRec(p, opts, made)
                break

            // In the case of any other error, just see if there's a dir
            // there already.  If so, then hooray!  If not, then something
            // is borked.
            default:
                var stat
                try {
                    stat = xfs.statSync(p)
                }
                catch (err1) {
                    throw err0
                }
                if (!stat.isDirectory()) throw err0
                break
        }
    }

    return made
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