package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
		s.add("red");
		s.add("green");
		s.add("blue");
		System.out.println(s);
		Set<String> s1=new HashSet<String>();
		s1.add("black");
		s1.add("white");
		s.addAll(s1);
		System.out.println(s);
		System.out.println(s.contains("blue"));
		System.out.println(s.containsAll(s1));
		System.out.println(s.isEmpty());
		s.remove("green");
		System.out.println(s);
		s.removeAll(s1);
		System.out.println(s);
		System.out.println(s.size());
	}

}
