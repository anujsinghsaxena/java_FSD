package lession2;
import java.util.*;
import java.util.function.*;
import java.util.*;
class MyConsumer<T> implements Consumer<T>{
	public void accept(T ctask) {
		System.out.println("Working on the number "+ctask);
		System.out.println("Result after adding 5 to given number is: "+((int)ctask+5));
		}
}
public class UtilityPackageDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList mList;
		MyConsumer mcons;
		mList = new ArrayList<>(5);
		mcons = new MyConsumer();
		mList.add(100);
		mList.add(200);
		mList.add(300);
		mList.add(400);
		mList.add(500);
        System.out.println(mList);
        mList.forEach(mcons);
	}

}
