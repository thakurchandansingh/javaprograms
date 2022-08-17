package oops;

public class hello {
    //public static void printhello(int n) {
      /*  System.out.println("hello word");
        System.out.println("hello word");
        System.out.println("hello word");
        System.out.println("hello word");
        System.out.println("hello word");
        System.out.println("hello word");

        */
      /*  for(int i=0;i<=n;i++)
            System.out.println("hello word");
    }
    public static void main(String[]args)
    {
        printhello(5);



        printhello(10);



        printhello(7);
    }*/



        public static void printhello(int n ,String massage){
            for(int i=0;i<=n;i++)
                System.out.println(massage);
        }
        public static void main(String[]args){
            printhello(5 ,"hello");


            printhello(7,"love");

            printhello(1,"when you meet him");
        }
}
