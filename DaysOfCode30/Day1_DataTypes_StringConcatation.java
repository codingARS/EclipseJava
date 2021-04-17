package DaysOfCode30;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1_DataTypes_StringConcatation {
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

int i2 = scan.nextInt();
double d2 = scan.nextDouble();
scan.nextLine();
String s2 = scan.nextLine();

String s3 = s.concat(s2);
       
        System.out.println(i+i2);
        System.out.println(d+d2);
        System.out.println(s3);

  scan.close();
        }}
