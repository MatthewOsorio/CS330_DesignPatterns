//Matthew Osorio
//CS330: Homework One
//September 8, 2024

import java.util.Scanner;

class Main{
    public static void main(String[] args){
        POS posSystem;
        boolean completedUse= false;
        Scanner scanner= new Scanner(System.in);

        while(!completedUse){
            int pos = -1;
            System.out.print("\n\nSelect POS system\n1: Store\n2: Kiosk\n3: Exit\n> ");

            if(scanner.hasNextInt()){
                pos= scanner.nextInt();
            }
            else{
                pos= -1;
            }

            System.out.print("\n");
            
            switch (pos) {
                case 1:
                    // System.out.println("Using store\n");
                    posSystem = new Store();
                    int paymentMethod;
                    posSystem.display();
                    System.out.print("Payment method\n1. Card\n2. Cash\n> ");
                    if(scanner.hasNextInt()){
                        paymentMethod= scanner.nextInt();
                    }
                    else{
                        paymentMethod= -1;
                    }

                    switch (paymentMethod) {
                        case 1:
                            posSystem.setPaymentProcessingBehavior(new CardPaymentProcessingBehavior());
                            break;
                        case 2:
                            posSystem.setPaymentProcessingBehavior(new CashPaymentProcessingBehavior());
                            break;
                        default:
                            System.out.println("An error has occured!");
                            break;
                    }

                    posSystem.paymentProcessing();
                    posSystem.orderProcessing();
                    break;
                case 2:
                    // System.out.println("Using kioks\n");
                    posSystem= new Kiosk();
                    posSystem.display();
                    posSystem.paymentProcessing();
                    posSystem.orderProcessing();

                    break;
                case 3:
                    System.out.println("Good bye!\n");
                    completedUse= true;
                    break;
                default:
                    System.out.println("An error has occured!");
                    break;
            }
        }   
        scanner.close();
    }
}
