package collection;

import java.util.ArrayList;
import java.util.List;

public class GenericList 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
 List<String> s=new ArrayList<String>();
 s.add("red");
 s.add("blue");
 s.add("yellow");
 s.add("green");
 s.add("white");
 s.add("black");
 s.add("black");
 System.out.println(s);
 s.set(1, "violet");
 System.out.println(s);
 System.out.println(s.get(1));
 System.out.println(s.indexOf("black"));
 System.out.println(s.lastIndexOf("black"));
 System.out.println(s.contains("yellow"));
 s.remove(0);
 System.out.println(s);
	}

}
