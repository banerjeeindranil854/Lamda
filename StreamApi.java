package java_projects;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApi {
public static void main(String[] arg) {
	ArrayList<String> arg1=new ArrayList<>();
	List<String> arg2=new ArrayList<>();
	Set<String>  arg3=new HashSet<>();
	arg1.add("Indranil");
	arg1.add("Suparna");
	arg1.add("Indranil");
	arg2=arg1.stream().filter(x ->x.equals("Indranil")).collect(Collectors.toList());
	arg3=arg1.stream().filter(x ->x.equals("Indranil")).collect(Collectors.toSet());
	System.out.println(arg2);
	System.out.println(arg3);
	arg2=arg1.stream().sorted().collect(Collectors.toList());
	System.out.println(arg2);
	System.out.println(arg3);
	
	ArrayList<Integer> we=new ArrayList<>();
	List<Integer> wei=new ArrayList<>();
	we.add(1);
	we.add(2);
	wei=we.stream().map(x ->x*2).collect(Collectors.toList());
	System.out.println(wei);
}
}
