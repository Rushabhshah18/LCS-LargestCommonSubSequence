package developingInterestInCoding;

import java.sql.Timestamp;
import java.util.*;

public class LargestCommonSubsquence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        System.out.println(timestamp);
		/*String a=input.nextLine();
		String b=input.nextLine();*/
        String a="AGGTAB";
        String b="GXTXAYB";
        List c=new LinkedList<>();
        //char [] c=new char[b.length()+a.length()];
		for(int i=0;i<a.length();i++) {
			for(int k=0;k<b.length();k++) {
				if(a.charAt(i)==b.charAt(k)) {
					if(!c.contains(a.charAt(i))) {
						c.add(a.charAt(i));
						System.out.print(a.charAt(i)+" ");
					}
					break;
				}
			}
		}
		System.out.println("LCS:"+c.size());
		
        System.out.println(timestamp);
	}

}
