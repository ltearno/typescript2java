export interface A<T> {
    value: T
}

export interface MonTuple<T, U, V> {
    a: [T, U, V]
}

export interface TTTTT<T> {
    mygod(): A<[number, T]>;
}