import java.util.Scanner;

public class max_subarray
{
    private static  int max_sub_array(int[] a)
    {
        int cMax = a[0]; //Current max. 
        int gMax = a[0]; // global max.
        int s = 0; // Min index
        int e = 0; // Max. index

        for(int i = 1; i < a.length; i++)
        {
            if(cMax + a[i] > a[i])
            {
                cMax = cMax + a[i];

                if(cMax > gMax)
                {
                    e = i;
                }
            }
            else
            {
                cMax = a[i];
                
                if(cMax > gMax)
                {
                    s = i;
                    e = i;
                }
                
                //System.out.println("Local lower index: " + s);
            }
            
            
            //cMax = ( (cMax + a[i]) > a[i] ) ? (cMax + a[i]) : a[i]; 
            
            if(cMax > gMax)
            {
                gMax = cMax;
            }
        }

        System.out.println("sub_array lower index: " + s);
        System.out.println("sub_array max index: " + e);
        
        return gMax;
    }
    
    public static void main( String[] args)
    {
        //int[] a = {-5, 6, 7, 1, 4, -8, 16};
        System.out.println("Enter the input array ");

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println("Your input array: " + str);
  
        String[] strs = str.split(" ");
        int[] a = new int[strs.length];

        for(int i=0; i< strs.length; i++)
        {
            a[i] = Integer.parseInt(strs[i]);
        }

        /*
        System.out.println("Input array: ");
        for(int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + ", "); 
        }
        */

        System.out.println();
        System.out.println("Max sub_array: " + max_sub_array(a));
    }
}

