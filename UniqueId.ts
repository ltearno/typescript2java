interface Object {
    _uniqueId(): number;
}

let id = 0

Object.prototype._uniqueId = function () {
    if (this['__uniq_id__'] === undefined)
        this['__uniq_id__'] = id++
    return this['__uniq_id__'] as number
}

let o: {}
o._uniqueId()

