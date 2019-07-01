package jp.co.internous.action;

public class Test {
	public static void main(String[]args){
		Person taro = new Person();
		taro.name = "山田太郎";
		taro.age = 20;
		taro.phoneNumber = "090-1111-1111";
		taro.address = "kyoto";

		System.out.println(taro.name);
		System.out.println(taro.age);
		System.out.println(taro.phoneNumber);
		System.out.println(taro.address);
		taro.talk();
		taro.walk();
		taro.run();

		Person ziro = new Person();
		ziro.name = "木村次郎";
		ziro.age = 18;
		ziro.phoneNumber = "080-2222-2222";
		ziro.address = "tokyo";

		System.out.println(ziro.name);
		System.out.println(ziro.age);
		System.out.println(ziro.phoneNumber);
		System.out.println(ziro.address);
		ziro.talk();
		ziro.walk();
		ziro.run();

		Person hanako = new Person();
		hanako.name = "鈴木花子";
		hanako.age = 16;
		hanako.phoneNumber = "080-3333-3333";
		hanako.address = "hokkaido";

		System.out.println(hanako.name);
		System.out.println(hanako.age);
		System.out.println(hanako.phoneNumber);
		System.out.println(hanako.address);
		hanako.talk();
		hanako.walk();
		hanako.run();

		Person kazuki = new Person();
		kazuki.name = "櫻井一毅";
		kazuki.age = 25;
		kazuki.phoneNumber = "080-9999-9999";
		kazuki.address = "USA";

		System.out.println(kazuki.name);
		System.out.println(kazuki.age);
		System.out.println(kazuki.phoneNumber);
		System.out.println(kazuki.address);
		kazuki.talk();
		kazuki.walk();
		kazuki.run();

		Robot aibo = new Robot();
		aibo.name = "アイボ";

		aibo.talk();
		aibo.walk();
		aibo.run();

		Robot asimo = new Robot();
		asimo.name = "アシモ";

		asimo.talk();
		asimo.walk();
		asimo.run();

		Robot pepper = new Robot();
		pepper.name = "ペッパー君";

		pepper.talk();
		pepper.walk();
		pepper.run();

	}
}
