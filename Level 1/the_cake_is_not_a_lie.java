import java.util.*;
public class Solution {
    public static int solution(String x) {
        int p=0;
        String str[] = new String[x.length()];
        for(int k=1;k<=x.length();k++){
            int i=1, z=k;
            str[0]=x.substring(0,k);
            while((z+k) <= x.length())
            {
                str[i]=x.substring(z,k+z);
                if(str[0].equals(str[i])) {
                    z += k;
                    i++;
                }
                else break;
            }   
            if(z == x.length()){ 
                p = i; 
                break;
            }
        }
        return p;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        int z = solution(x);
        System.out.println(z);
    }
}
