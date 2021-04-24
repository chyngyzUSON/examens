package com.company;

public class Main {

    public static void main(String[] args) {
	Thread threadJava = new ThreadJava();
	threadJava.start();
	threadJava.setPriority(10);

	Thread threadPython = new ThreadPython();
	threadPython.start();
	threadPython.setPriority(8);

	Thread threadGo = new ThreadGo();
	threadGo.start();
	threadGo.setPriority(6);

	Thread threadJS = new ThreadJavaScript();
	threadJS.start();
	threadJS.setPriority(4);

	Thread threadPHP = new ThreadPHP();
	threadPHP.start();
	threadPHP.setPriority(2);

    }


}
/*В каждом из которых, при запуске потока на консоль вывести одно из слов
(Java, C#, PHP, JavaScript, Go, Python). Один поток - выводит одно слово.

Нужно сделать так, чтобы слова на консоли всегда выходили строго по очереди:
Java
Python
Go
JavaScript
PHP */