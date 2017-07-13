/*export let sDuplicate;

 export enum Duplicate{
 Toto
}*/

export enum MonEnum1 {
    Un,
    Deux,
    Cinq = 5,
    Sept
}

export enum MonEnum2 {
    Yo,
    Yi,
    Ya
}

export interface Rock {
    tototo?: MonEnum1
    moimoi(a: string): string
}

export declare var Rock: {
    new (a: string, b: number): Rock

    SAVE_ME: number
}

export declare var SpaceShip: {
    new (a: string, b: number): {
        mimi(mati: number): number[]
    }
}

export interface JeSuisInterface { }

export class JeSuisClasse { }

export interface PartialClass {
    (n: string): number;
}

export type Toto = PartialClass;

/**
 * This is something or not, and is named PartialClass
 * What if I put many lines ?
 * 
 * And empty lines ?
 */
export class PartialClass {
    a: number;
    deeper: PartialClass;
    aFunction(n: number, s: string): number;

    constructor(a: string, b, c, d, e);
}

export declare class CompileAnimationStateDeclarationMetadata {
    stateNameExpr: Toto;
    constructor(stateNameExpr: string, styles: PartialClass);
}

export interface TestI<TTT> {
    a: PartialClass;
}

export interface PartialClass {
    c: string;
}

export let toto: PartialClass;

export interface TestI<TTT> {
    baobab: TestI<number>;
    cc: PartialClass;
}

export interface ConcreteAbstractPartialClass<U> extends PartialClass {
    faireSomethink();

    faireSomethins(i: number, toto: ConcreteAbstractPartialClass<U>);

    toto: TestI<U>
    titi: TestI<string>

    monTest: TestI<string | U>;
}


/*export namespace Duplicate {
 export let sDuplicate;
 }

 export class Babouche<T> {
 [key: number]: T;
 push(elem: T): void;
 }*/

/**
 * Top je suis une classe
 */
/*
 export declare class Toto {
 static flatten<T>(list: Babouche<T | T[]>): T[];

 expand<T>(list: T[]): T[];

 doSomething(v: number, cb: (element: string) => boolean): number;

 test: Array<number>;
 }*/

/*export interface Hoho {
 a:number;
 b;
 c:string;
 d:Hihi<number>;

 doSomething(v:number, cb:(element:string)=>boolean):number;
 }

 export interface Hihi<T> {
 ouiKan<U>(toto:T, tata?:Hihi<T>):Hihi<Hihi<U>>;
 }

 export interface A {
 }

 export interface B extends A {
 }

 export class C implements B {
 }

 export abstract class Damour extends C implements Hoho, AA<Hihi<string>, BB<A>> {
 a:number;
 b;
 c:string;
 d:Hihi<number>;

 constructor(t:number,s:string);

 doSomething(v:number):number;
 }

 export interface E extends Damour {
 }

 export interface AA<T, U> {
 }

 export interface BB<V> extends AA<number, V> {
 }

 export enum TTT {
 A = 0,
 B = 1,
 C = 2
 }*/

/*
 export interface BB {
 getMoi(): string;
 }

 export interface A {
 toto: string;

 new(tara: string, toto: number): BB[];
 }

 export class A {
 constructor(e: number);

 nono();
 }

 export let aaa: A;
 export let bb;

 export class B extends A {
 }

 export class C extends A {
 constructor();
 }

 export function aa(a: A);
 */