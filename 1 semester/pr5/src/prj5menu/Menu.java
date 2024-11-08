package prj5menu;

import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {
        Scanner x= new Scanner(System.in);
        String input;
        do{
            System.out.print(ConsoleColors.BLUE +ConsoleColors.YELLOW_BACKGROUND);
            System.out.println("=========================");
            System.out.println("1 Квадратне рівняння");
            System.out.println("2 Площа фігур");
            System.out.println("0 Вихід");
            System.out.println("=========================");
            input=x.nextLine();

            switch(input){
                case "1":{
                    System.out.println("введіть а,б,ц ...");
                    break;
                }
                case "2":{
                    String input2;
                    do{
                        System.out.println(ConsoleColors.CYAN+ConsoleColors.BLUE_BACKGROUND +"========================="+ ConsoleColors.RESET);
                        System.out.println("1 коло");
                        System.out.println("2 прямокутник");
                        System.out.println("3 трапеція");
                        System.out.println("0 головне меню");
                        System.out.println(ConsoleColors.CYAN+ConsoleColors.BLUE_BACKGROUND +"========================="+ ConsoleColors.RESET);
                        input2=x.nextLine();
                        switch(input2){
                            case "1":{
                                System.out.println("введіть радіус ...");
                                break;
                            }
                            case "2":{
                                System.out.println("(прямокутник) введіть а,б ...");
                                break;
                            }
                            case "3":{
                                System.out.println("(трапеція) введіть а,б,ц ...");
                                break;
                            } 
                            case "0":{
                                break;// exit to main
                            }
                            default:{
                                System.out.println("Не зрозуміле введення, спробуйте знову");
                            }
                        }
                    }while(!input2.endsWith("0"));
                    break;
                }   
                case "0":{
                    System.out.println("Допобачення ");
                    System.exit(0);
                } 
                default:{
                    System.out.println("Не зрозуміле введення, спробуйте знову");
                }
            }
        }while(!input.equals("0"));
    }
    
}
