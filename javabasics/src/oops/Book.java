package oops;



        /*
         public class Book {
         String bookname, subject;
          int price;

          public Book(String b, String s, int p) {
              bookname = b;
              subject = s;
              price = p;
          }

          public void display() {
              System.out.printf("Book Name=%s,Subject=%s\n", bookname, subject, price);
          }



      public static void main(String[] args) {
          Book b1 = new Book("basic c", "c", 150);
          Book b2 = new Book("Adv java", "java", 350);
          b1.display();
          b2.display();
      }*/
   /*     public class Book {
        String bookname, subject;
        int price;

        public Book(String b, String s, int p) {
            bookname = b;
            subject = s;
            price = p;
        }

        public void display() {
            System.out.printf("Book name=%s,subject=%s\n", bookname, subject, price);
        }

        public static void main(String[] args) {
            Book b1=new Book("basic c", "c", 150);
            Book b2=new Book("adv java", "java", 350);
            System.out.println(b1);
            System.out.println(b2);
        }


}*/
public class Book {
            String bookname,subject;
            int price;
            public Book(String b,String s,int p)
            {
                bookname=b;
                subject=s;
                price=p;
            }
            public static void main(String[]args){
                Book b1=new Book("basic c","c",150);
                Book b2=new Book("adv java ","java",350);
                System.out.println(b1);
                System.out.println(b2);
            }
            public String toString()
    {
        return String.format("Book name=%s,Subject=%s,price=%s",bookname,subject,price);
    }
}