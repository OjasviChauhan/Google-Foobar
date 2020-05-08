import java.util.*;
class Solution{
    static int solution(ArrayList<Integer> li){
        Collections.sort(li);
        int count=0;
        int triples[] = new int[3];
        for(int i=0;i<=li.size()-3;i++){
            for(int j=i+1;j<=li.size()-2;j++){
                for(int k=j+1;k<=li.size()-1;k++){
                    triples[0] = li.get(i);
                    triples[1] = li.get(j);
                    triples[2] = li.get(k);

                    if(check(triples)) count++;
                }
            }
        }
        return count;
    }
    
    static boolean check(int arr[]){
        if(arr[1]%arr[0] == 0 && arr[2]%arr[1] == 0) return true;
        else return false;
    }

    public static void main(String args[]){
        Scanner sc  = new Scanner (System.in);
        ArrayList<Integer> li = new ArrayList<Integer>(2);
        while(sc.hasNextInt())
            li.add(sc.nextInt());
            
        int z = solution(li);
        System.out.println(z);
    }
}
