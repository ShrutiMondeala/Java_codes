/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class maximum_number
{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		List<String> str=new ArrayList<>();
		int n =sc.nextInt();
	    Stack <Integer> stac=new Stack<Integer>();
	    Deque<Integer> deque = new LinkedList<Integer>();
	    
	    sc.nextLine();
	    int maxi=-1;
	    for(int i=0;i<n;i++){
	        str.add(sc.nextLine());
	    }
        sc.close();
	    for(int i=0;i<n;i++){
	        if(str.get(i).charAt(0)=='1'){
	            
	           int slm=Integer.parseInt(str.get(i).substring(2,str.get(i).length()));
	           stac.push(slm);
	           deque.offer(slm);
	        }
	        else if(str.get(i).charAt(0)=='2'){
	            stac.pop();
	            deque.removeLast();
	        }
	        else{
	            Object[] arr = deque.toArray();
	            for( int m=0;m<arr.length;m++){
	               maxi=Math.max(maxi,(Integer)arr[m]);
	            }
	          System.out.println(maxi);
	        }
	   }
	}
}

