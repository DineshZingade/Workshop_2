package com.bridgelabz;

public class ReviseArray {
	int[] a = new int[] { 1, 2, 3, 4, 5 };

	public void Reverse() {
		System.out.println("Print an Array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println("Print an Array in Reverse order");

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.println(a[i]);
		}
	}

	public void MinNumber() {
		int min = a[0];
		for (int i = 0; i < a.length - 4; i++) {
			if (a[i] < min)
				min = a[i];

			System.out.println("Minimum Array is:" + " " + min);
		}
	}
	
	public static void main(String[] args) {
		ReviseArray obj = new ReviseArray();
		obj.Reverse();
		obj.MinNumber();
	}
}
