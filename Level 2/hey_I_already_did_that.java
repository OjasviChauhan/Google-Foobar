import java.util.*;
public class Solution {
    public static String subtract(String x,String y,int b){
        String z = Integer.toString(Integer.parseInt(x,b) - Integer.parseInt(y,b),b);
        return z;
    }
    
    public static String ascending(String s){
        char c[] = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    
    static void reverse(char[] a){ 
        int i, n = a.length; 
        char t; 
        for (i = 0; i < n / 2; i++)  { 
            t = a[i]; 
            a[i] = a[n - i - 1]; 
            a[n - i - 1] = t; 
        } 
    }

    public static String descending(String s){
        char c[] = s.toCharArray();
        Arrays.sort(c);
        reverse(c);
        return new String(c);
    }

    static ArrayList<String> a = new ArrayList<String>(1);
    public static int solution(String n, int b) {
        String x = descending(n);
        String y = ascending(n);
        String z = subtract(x,y,b);
      
        if(a.contains(z)){
            int count=0;
            int last = a.size() - 1;
            for(int i=last;i>=0;i--){
                String str = a.get(i);
                if(!str.equals(z)) count++;
                else break;
            }
            System.out.println(count+1);
        }
        else {
	    	a.add(z);
	    	solution(z,b);
		}
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        int b = sc.nextInt();
        solution(n,b);
        // System.out.println(z);
    }
}
