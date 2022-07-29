package Threads;
import java.io.*;
public class MyThread extends Thread {
	public void run()
	{
		System.out.print("You are in Thread now");
	}
	public static void main(String[] args)
	{
		MyThread g = new MyThread();
		g.start();
	}
}

