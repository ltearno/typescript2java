export declare class Toto {
    static flatten<T>(list: Array<T | T[]>): T[];
}

export interface Hoho {
}

export interface Hihi<T> {
}

export interface A {
}

export interface B extends A {
}

export class C implements B {
}

export class Damour extends C implements Hoho, AA<Hihi<string>, BB<A> {
}

export interface E extends Damour {
}

export interface AA<T, U> {
}

export interface BB<V> extends AA<number, V> {
}