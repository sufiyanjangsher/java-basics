//for loop
// import java.util.Scanner;
// class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         for(int i=1;i<5;i++){             
//             System.out.println("hello");
//         }
//     }
// }


// import java.util.Scanner;
// class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         for(int i=1;i<10;i++){             
//             System.out.println(i);
//         }
//     }
// }



//while loop
// import java.util.Scanner;
// class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int i=1;
//         while(i<5){
//             System.out.println("hello");
//             i++;
//         }
        
//     }
// }



//do while 
// import java.util.Scanner;
// class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int i=1;
//         do{
//             System.out.println(i);
//             i++;
//         }
//         while(i<5);
        
//     }
// }






// import java.util.Scanner;
// class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=n;i++){
            
//             sum=sum+i;

            
//         }
//         System.out.println(sum);
        
//     }
// }







// import java.util.Scanner;
// class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
    
//         for(int i=1;i<=10;i++){
            
            
//              System.out.println(n*i);
        

            
//         }
       
//     }
// }







// import java.util.Scanner;
// class loops{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
    
//         for(int i=1;i<=n;i++){
//             if(i%2==0){
//                 System.out.println(i);
//             }
       
//         }
       
//     }
// }





import java.util.Scanner;
class loops{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n;
        do{
            System.out.println("enter 1 for input and 0 for stop");
            n=sc.nextInt();
            if(n==1){
                System.out.println("enter marks");
                int marks=sc.nextInt();
                if(marks>=90){
                    System.out.println("A");
                }
                else if(marks>=80){
                    System.out.println("B");
                }
                else if(marks>=70){
                    System.out.println("C");
                }
                else{
                    System.out.println("fail");
                }
            }
        }while (n!=0);
        System.out.println("stop");
    
        
       
    }
}




