package arrayList;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class DemoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyOnWriteArrayList <String> a=new CopyOnWriteArrayList<>();
		//ArrayList <String> a=new ArrayList<>();
		a.add("velmurugan");
		a.add("sudhakar");
		a.add("Bhuvanesh");
		a.add("silambu");
		a.add("anbu");

		// try to remove any values in array List it will shows error
		// which help of copyOnWriteArrayList we can slove the error
		for(String b:a) {
			System.out.println(b);
			a.remove("anbu");	
			}
		System.out.println(a);
	}

}
