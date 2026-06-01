// import java.util.Scanner;
// class ConditionalStatement{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter ur age");
//         int age=sc.nextInt();
//         if(age>18){
//             System.out.println("adult");      //if else
//                 }
//                 else{
//                     System.out.println("child");
//                 }
//     }
// }





// import java.util.Scanner;
// class ConditionalStatement{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter num");
//         int num=sc.nextInt();
//         if(num%2==0){
//             System.out.println("even");
//         }
//         else{
//             System.out.println("odd");
//         }
//     }
// }




// import java.util.Scanner;
// class ConditionalStatement{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//          int b=sc.nextInt();
//         if(a==b){
//             System.out.println("equal");
//         }
//         else{
//             if(a>b){
//                 System.out.println("a greater");
//             }
//             else{
//             System.out.println("b greater");
//               }
//               }
//     }
// }



// import java.util.Scanner;
// class ConditionalStatement{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         int a=sc.nextInt();
//          int b=sc.nextInt();
//         if(a==b){
//             System.out.println("equal");                  //if else if else
//         }
//         else if(a>b){
//                 System.out.println("a greater");
//             }
//             else{
//             System.out.println("b greater");
//               }
//               }
//     }







// import java.util.Scanner;
// class ConditionalStatement{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("press number");
//         int number=sc.nextInt();
//         if(number==1){
//             System.out.println("hello");
//         }
//         else if(number==2){
//             System.out.println("namaste");
//         }
//         else if(number==3){
//             System.out.println("assalamalaikum");
//         }
//         else{
//             System.out.println("erroe");
//         }
//     }
// }







//switch
// import java.util.Scanner;
// class ConditionalStatement{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("press number");
//         int number=sc.nextInt();
//         switch(number){
//             case 1: System.out.println("hello");
//                      break;
//             case 2: System.out.println("namaste");
//                      break;
//             case 3: System.out.println("aasalamalaikum");
//                      break; 
//             default:System.out.println("erroe");                 

//     }
// }
// }



//calculator
// import java.util.Scanner;
// class ConditionalStatement{
//     public static void main(String args[]){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a");
//         int a=sc.nextInt();
//         System.out.println("enter b");
//         int b=sc.nextInt();
//         System.out.println("press 1 for addition");
//         System.out.println("press 2 for subt");
//         System.out.println("press 3 for multi");
//         System.out.println("press 4 for division");
//         System.out.println("press 5 for modular");
//         int operation=sc.nextInt();
//         switch(operation){
//             case 1: System.out.println(a+b);
//                      break;
//             case 2: System.out.println(a-b);
//                      break;
//             case 3: System.out.println(a*b);
//                      break;
//             case 4: System.out.println(a/b);
//                      break;         
//             case 5: System.out.println(a%b);
//                      break;  
//             default:System.out.println("invalid choice");                
//         }
//     }
// }



//month problem
import java.util.Scanner;
class ConditionalStatement{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int month=sc.nextInt();
        switch(month){
            case 1: System.out.println("jan");
            break;
             case 2: System.out.println("feb");
            break;
             case 3: System.out.println("march");
            break;
             case 4: System.out.println("april");
            break;
             case 5: System.out.println("may");
            break;
             case 6: System.out.println("june");
            break;
             case 7: System.out.println("july");
            break;
             case 8: System.out.println("aug");
            break;
             case 9: System.out.println("sept");
            break;
             case 10: System.out.println("oct");
            break;
             case 11: System.out.println("nov");
            break;
             case 12: System.out.println("dec");
            break;
            default:System.out.println("inavalid choice");

        }

    }
}