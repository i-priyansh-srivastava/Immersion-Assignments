public class Co_Prime {
        int countCoPrime(int a[], int n)
        {
            // Complete the function
            int count=0;
            
            for(int i=0;i<a.length-1;i++){
                
                if(gcdCheck(a[i],a[i+1])!=1){
                    
                    count++;
                }
                
            }
                
                return count;
            
        }
        public static int gcdCheck(int a , int b){
            int gcd=0;
            while(b!=0){
                int temp=b;
                b=a%b;
                a=temp;
            }
            gcd=a;
            return gcd;
        }
    }
