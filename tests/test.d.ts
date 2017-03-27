export class Babouche<T> {
	[key:number]:T;
	push(elem:T):void;
}

/**
 * Top je suis une classe
 */
export declare class Toto {
	/** Yopyop
		Et ouoiuoiuoi*/
    static flatten<T>(list: Babouche<T | T[]>): T[];
	
	/** Yipyip */
	expand<T>(list: T[]): T[];
	
	/**
	 * Top je suis une classe
	 */
	doSomething(v:number, cb:(element:string)=>boolean):number;
}

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