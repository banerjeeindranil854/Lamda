package java_projects;

import java.util.ArrayList;

public class LamdaExpression {
public static void main(String[] args) {
ArrayList<String> allValue=new ArrayList<>();
allValue.add("indranil");
allValue.add("suparna");
allValue.forEach(n ->{if(n.equals("indranil"))System.out.println(n);});
}
}
