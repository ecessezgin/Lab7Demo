import  java.util.Scanner;
public class Lab7Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //SCENARIO 0
        Lab7.Point a = new Lab7().new Point(0, 0);
        Lab7.Point.Circle r = a.new Circle(5);


        //SCENARIO 1
        Lab7.Student student1 = new Lab7().new Student();
        student1.printInfo();

        Lab7.Student student2 = new Lab7().new Student("Ece", 20);


        //SCENARIO 2
        while(true){
            System.out.println("Choose operation");
            System.out.println("1: DEPOSIT");
            System.out.println("2: WITHDRAW");
            System.out.println("3: ACCOUNT DETAILS");
            System.out.println("4: EXIT");

            int operation = sc.nextInt();

            if(operation == 4){
                break;
            }
        }
       Lab7.Bankaccount costumer = new Lab7().new Bankaccount(100,11);
        costumer.AccountDetails();



        //SCENARIO 3
        Lab7.Book b1 = new Lab7().new Book("programming",300);
        Lab7.Book b2 = b1;
        b2.addPages(20);
        System.out.println("b1:");
        b1.printBook();
        System.out.println("b2:");
        b2.printBook();

        Lab7.Book b3 = new Lab7().new Book("programming",320);

        System.out.println("b3:");
        b3.printBook(); //b3 not equal to b1.



        //BONUS QUESTION
        System.out.println("How many products the store has?");
        int productNumber=sc.nextInt();
        Lab7.Product[] products = new Lab7.Product[productNumber];
        for(int i=0;i<productNumber;i++){
            System.out.print("product name:");
            String name=sc.next();
            System.out.print("stock:");
            int stock=sc.nextInt();
            products[i]=new Lab7().new Product(name,stock);

        }

        while(true){
            System.out.println("Product to buy:");
            String input=sc.next();
            if(input.equals("Q"))
        break;
            boolean found=false;

            for(Lab7.Product p:products){
                if(p.getName().equals(input)){
                    found=true;
                    p.buyOne();
                    break;
                }
            }

            if(!found){
                System.out.println("No such product");
            }
        }

        System.out.println("Product information:");
        for(Lab7.Product p:products){
            p.printInfo();
        }

        }
        }
