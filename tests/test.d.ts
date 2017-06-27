/*export let sDuplicate;

 export enum Duplicate{
 Toto
 }*/

export interface PartialClass {
}

export type Toto = PartialClass;

export class PartialClass {
    a: number;
    deeper: PartialClass;
}

export interface TestI<T> {
    a: PartialClass;
}

export interface PartialClass {
    c: string;
}

export let toto: PartialClass;

export interface TestI<T> {
    b: TestI<number>;
    c: PartialClass;
}

export interface ConcreteAbstractPartialClass<U> extends PartialClass {
    faireSomethink();

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