package mypackage;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(20);

		int sum = 0;
		for (int number : list) {
			sum += number;
		}

	    System.out.println("リスト内の数値の合計：" + sum);
	}
}