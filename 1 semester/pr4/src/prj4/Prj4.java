package prj4;
import java.io.*;

public class Prj4 {

    public static void main(String[] args) throws IOException {
        System.out.println(  "Звичайний текст для порівняння  ");

        System.out.print(ConsoleColors.BLUE +ConsoleColors.YELLOW_BACKGROUND);
        System.out.print("     Певний текст синього кольору на жовтому фоні    ");        
        System.out.println(ConsoleColors.RESET);
        
        System.out.print(ConsoleColors.YELLOW +ConsoleColors.BLUE_BACKGROUND);
        System.out.print("     Певний текст жовтого кольору на синьому фоні    ");
                System.out.println(ConsoleColors.RESET);//скидаємо встановлені кольори 
                
        
        System.out.println("\n\nще приклади :\n\n");
        
        System.out.print(ConsoleColors.WHITE_BOLD +ConsoleColors.PURPLE_BACKGROUND);
        System.out.print("     Певний текст    ");
                System.out.println(ConsoleColors.RESET);//скидаємо встановлені кольори                 
        System.out.println("\n\n");        
        
        System.out.print(ConsoleColors.CYAN+ConsoleColors.BLUE_BACKGROUND );
        System.out.print("     Певний текст    ");
                System.out.println(ConsoleColors.RESET);//скидаємо встановлені кольори                 
        System.out.println("\n\n");     
        
        System.out.print(ConsoleColors.BLUE +ConsoleColors.GREEN_BACKGROUND );
        System.out.print("     Певний текст    ");
                System.out.println(ConsoleColors.RESET);//скидаємо встановлені кольори                 
        System.out.println("\n\n");             
    }
    
}
