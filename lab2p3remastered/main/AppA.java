package main;


import java.util.Scanner;

import impl.ConcreteDictionary;

import adt.Dictionary;

public class AppA {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Dictionary<String, String> map = new ConcreteDictionary<String, String>();
		map.addNewEntry("asd", "value1");
		map.addNewEntry("key2", "another value");
		System.out.print(map);
		for (String key: map) {
			System.out.print(key + "\n");
		}
		while (true) {
			System.out.print("Choose an option from below:\n"
							+ "1. Check a word's plural\n"
							+ "2. Enter a pair of (word,word's plural)\n"
							+ "3. Exit\n");
			int cmd = input.nextInt();
			switch (cmd) {
			case 1:
				String word = input.next();
				System.out.print("The plural is: " + map.getValueByKey(word) + "\n");
				break;
			case 2:
				String singular = input.next();
				String plural = input.next();
				map.addNewEntry(singular, plural);
				plural = "fuck";
				System.out.print("Words added!\n");
				break;
			case 3:
				System.out.print("Quiting...\n");
				System.exit(0);
			default:
				System.out.print("Wrong choice!!\n\n");
			}
		}
	}

}
