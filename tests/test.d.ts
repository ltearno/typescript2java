export declare class Toto {
    static flatten<T>(list: Array<T | T[]>): T[];
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