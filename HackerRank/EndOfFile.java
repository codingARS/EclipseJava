package HackerRank;
import java.io.*;
import java.util.*;

public class EndOfFile {

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        for(int i=1; sc.hasNext()==true; i++){    //Sc.hasNext() method returns true if and only if this scanner has another token
	            System.out.println(i + " " + sc.nextLine());
	        }
	    }
	}

