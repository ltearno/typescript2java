export interface Test {
    toto: TTTTT<string>
}

export interface TTTTT<T> {
    mapMyTTT<U>(callbackfn: (value: T, index: number, array: T[]) => U, thisArg?: any): { (value: T, index: number, array: T[]): U };
}