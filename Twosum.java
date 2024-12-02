import java.util.*;
class Twosum{
    public static void main(String[] args)
    {
        int arr[] = {4,2,2,1,7,1,1};
        int n = arr.length;
        int target = 13;
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<n;i++)
        // {
        //     int diff = target - arr[i];
        //     if(map.containsKey(diff))
        //     {
        //         System.out.println(i+" "+map.get(diff)+" " +arr[i]+diff);
        //         break;
        //     }
        //     else{1
        //         map.put(arr[i],i);
        //     }
        // }
        // System.out.println("Done!!");
        Arrays.sort(arr);
        int i=0;
        int j=n-1;
        while(i<j&&i<n)
        {
            if(target>arr[i]+arr[j])
            {
                i++;
            }
            else if(target<arr[i]+arr[j])
            {
                j--;
            }
            else
            {
                System.out.println("true");
                break;
            }
        }
        System.out.println("done!!");
        
    }
}