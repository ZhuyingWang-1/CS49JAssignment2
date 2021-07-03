package edu.sjsu.assignment2;

public class MyRecursion {

    public static void main(String[] args) {

        String a="Mississippi";
        String b="sip";
        int index=indexOf(a,b);
        System.out.println(index); //6

        int index2 = indexOf("panda", "pan");
        System.out.println(index2); //0

        int index3 = indexOf("Hello world", "wow");
        System.out.println(index3); //-1

    }
    public static int indexOf(String first,String second){
        return indexOf(first,second,0,0);
    }

    public static int indexOf(String first, String second,int a, int b){
        if(a>=first.length()) return -1;
        if(b==second.length()) return a-b;
        if(first.charAt(a)==second.charAt(b)) return indexOf(first,second,a+1,b+1);
        else if(b!=0) return indexOf(first,second,a,0);
        else return indexOf(first,second,a+1,0);
    }
}
