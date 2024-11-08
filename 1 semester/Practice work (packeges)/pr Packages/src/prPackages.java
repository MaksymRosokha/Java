import java.io.*;

public class prPackages {
    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        
        int level = 1;
        boolean isWin = false;
        
        while(true)
        {
            System.out.print("\n- - - МЕНЮ - - -"
                           + "\n0 - Вихід"
                           + "\n1 - Грати"
                           + "\n2 - Про гру"
                           + "\n3 - Про автора"
                           + "\n- - - - - - - - -"
                           + "\nКоманда: ");
            
            String input = in.readLine();
            
            switch(input){
                case "0":
                {
                    System.out.println("Допобачення");
                    return;
                }
                case "1":
                {
                    Player.Player player = new Player.Player();
                    System.out.print("\nВведіть ім\'я: ");
                    player.setName(in.readLine());
                    
                    while(true)
                    {
                        switch(level){
                            case 1:{
                                String input1;
                                Level1.Bot1 bot1 = new Level1.Bot1();
                                
                                player.showPlayerStatus();
                                bot1.showBotStatus();
                                System.out.println("Ви на 1-му рівні");
                                
                                while(true){
                                      System.out.print("Виберіть режим:"
                                                     + "\n0 - самостійний"
                                                     + "\n1 - автоматичний"
                                                     + "\nКоманда: ");

                                    input1 = in.readLine();
                                    
                                    switch(input1){
                                        case "0":{
                                            isWin = independentGame(player, bot1);
                                            break;
                                        }
                                        case "1":{
                                            isWin = autoGame(player,bot1);
                                            break;
                                        }
                                        default:{
                                            System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                
                                if(isWin){
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("\n"+player.getName()+" ПЕРЕМІГ");
                                    
                                    player.normalHP();
                                    player.showPlayerStatus();
                                    String bonus;

                                    while(true){
                                        System.out.print("\nЗа перемогу вам вручається один з призів:"
                                                        +"\n1 - (+ 50 до життя)"
                                                        +"\n2 - (+ 10 до атаки)"
                                                        +"\n3 - (+ 5 до защити)"
                                                        +"\nВибір: ");
                                        bonus = in.readLine();
                                        switch(bonus){
                                            case "1":{
                                                player.setBonusHP(50);
                                                break;
                                            }
                                            case "2":{
                                                player.setBonusAttack(10);
                                                break;
                                            }
                                            case "3":{
                                                player.setBonusArmor(5);
                                                break;
                                            }
                                            default:{
                                                System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                                                continue;
                                            }
                                        }
                                        
                                        break;
                                    }
                                    level++;
                                    continue;
                                }
                                else{
                                    level = 1;
                                    player.normalCharacteristics();
                                    bot1.normalHP();
                                    System.out.println("\n" + bot1.getName() + " переміг...");
                                    System.out.print("Бажаєте зіграти ще раз?"
                                                   + "\n1 - Так"
                                                   + "\n0 - Повернутися в меню"
                                                   + "\nКоманда: ");
                                    input1 = in.readLine();
                                    switch(input1){
                                        case "0":{
                                            break;
                                        }
                                        case "1":{
                                            continue;
                                        }
                                        default:{
                                            System.out.println("Помилка! Неправильно введена команда. Вас перекинуто в меню\n");
                                            break;
                                        }
                                    }
                                }
                                
                                break;
                            }
                            case 2:{
                                String input2;
                                Level2.Bot2 bot2 = new Level2.Bot2();
                                
                                player.showPlayerStatus();
                                bot2.showBotStatus();
                                System.out.println("Ви на 2-му рівні");
                                
                                while(true){
                                    System.out.print("Виберіть режим:"
                                                     + "\n0 - самостійний"
                                                     + "\n1 - автоматичний"
                                                     + "\nКоманда: ");

                                    input2 = in.readLine();
                                    
                                    switch(input2){
                                        case "0":{
                                            isWin = independentGame(player, bot2);
                                            break;
                                        }
                                        case "1":{
                                            isWin = autoGame(player,bot2);
                                            break;
                                        }
                                        default:{
                                            System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                
                                if(isWin){
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("\n"+player.getName()+" ПЕРЕМІГ");
                                    
                                    player.normalHP();
                                    player.showPlayerStatus();
                                    String bonus;

                                    while(true){
                                        System.out.print("\nЗа перемогу вам вручається один з призів:"
                                                        +"\n1 - (+ 100 до життя)"
                                                        +"\n2 - (+ 15 до атаки)"
                                                        +"\n3 - (+ 9 до защити)"
                                                        +"\nВибір: ");
                                        bonus = in.readLine();
                                        switch(bonus){
                                            case "1":{
                                                player.setBonusHP(100);
                                                break;
                                            }
                                            case "2":{
                                                player.setBonusAttack(15);
                                                break;
                                            }
                                            case "3":{
                                                player.setBonusArmor(9);
                                                break;
                                            }
                                            default:{
                                                System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                                                continue;
                                            }
                                        }
                                        
                                        break;
                                    }
                                    level++;
                                    continue;
                                }
                                else{
                                    level = 1;
                                    player.normalCharacteristics();
                                    bot2.normalHP();
                                    System.out.println("\n" + bot2.getName() + " переміг...");
                                    System.out.print("Бажаєте зіграти ще раз?"
                                                   + "\n1 - Так"
                                                   + "\n0 - Повернутися в меню"
                                                   + "\nКоманда: ");
                                    input2 = in.readLine();
                                    switch(input2){
                                        case "0":{
                                            break;
                                        }
                                        case "1":{
                                            continue;
                                        }
                                        default:{
                                            System.out.println("Помилка! Неправильно введена команда. Вас перекинуто в меню\n");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 3:{
                                String input3;
                                Level3.Bot3 bot3 = new Level3.Bot3();
                                
                                player.showPlayerStatus();
                                bot3.showBotStatus();
                                System.out.println("Ви на 3-му рівні");
                                
                                while(true){
                                    System.out.print("Виберіть режим:"
                                                     + "\n0 - самостійний"
                                                     + "\n1 - автоматичний"
                                                     + "\nКоманда: ");

                                    input3 = in.readLine();
                                    
                                    switch(input3){
                                        case "0":{
                                            isWin = independentGame(player, bot3);
                                            break;
                                        }
                                        case "1":{
                                            isWin = autoGame(player,bot3);
                                            break;
                                        }
                                        default:{
                                            System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                
                                if(isWin){
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("\n"+player.getName()+" ПЕРЕМІГ");
                                    
                                    player.normalHP();
                                    player.showPlayerStatus();
                                    String bonus;

                                    while(true){
                                        System.out.print("\nЗа перемогу вам вручається один з призів:"
                                                        +"\n1 - (+ 120 до життя)"
                                                        +"\n2 - (+ 20 до атаки)"
                                                        +"\n3 - (+ 10 до защити)"
                                                        +"\nВибір: ");
                                        bonus = in.readLine();
                                        switch(bonus){
                                            case "1":{
                                                player.setBonusHP(120);
                                                break;
                                            }
                                            case "2":{
                                                player.setBonusAttack(20);
                                                break;
                                            }
                                            case "3":{
                                                player.setBonusArmor(10);
                                                break;
                                            }
                                            default:{
                                                System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                                                continue;
                                            }
                                        }
                                        
                                        break;
                                    }
                                    level++;
                                    continue;
                                }
                                else{
                                    level = 1;
                                    player.normalCharacteristics();
                                    bot3.normalHP();
                                    System.out.println("\n" + bot3.getName() + " переміг...");
                                    System.out.print("Бажаєте зіграти ще раз?"
                                                   + "\n1 - Так"
                                                   + "\n0 - Повернутися в меню"
                                                   + "\nКоманда: ");
                                    input3 = in.readLine();
                                    switch(input3){
                                        case "0":{
                                            break;
                                        }
                                        case "1":{
                                            continue;
                                        }
                                        default:{
                                            System.out.println("Помилка! Неправильно введена команда. Вас перекинуто в меню\n");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 4:{
                                String input4;
                                Level4.Bot4 bot4 = new Level4.Bot4();
                                
                                player.showPlayerStatus();
                                bot4.showBotStatus();
                                System.out.println("Ви на 4-му рівні");
                                
                                while(true){
                                    System.out.print("Виберіть режим:"
                                                     + "\n0 - самостійний"
                                                     + "\n1 - автоматичний"
                                                     + "\nКоманда: ");

                                    input4 = in.readLine();
                                    
                                    switch(input4){
                                        case "0":{
                                            isWin = independentGame(player, bot4);
                                            break;
                                        }
                                        case "1":{
                                            isWin = autoGame(player,bot4);
                                            break;
                                        }
                                        default:{
                                            System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                
                                if(isWin){
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("\n"+player.getName()+" ПЕРЕМІГ");
                                    
                                    player.normalHP();
                                    player.showPlayerStatus();
                                    String bonus;

                                    while(true){
                                        System.out.print("\nЗа перемогу вам вручається один з призів:"
                                                        +"\n1 - (+ 200 до життя)"
                                                        +"\n    (+ 5 до атаки)"
                                                        +"\n2 - (+ 20 до атаки)"
                                                        +"\n    (+ 70 до життя)"
                                                        +"\n3 - (+ 20 до защити)"
                                                        +"\n    (+ 5 до атаки)"
                                                        +"\n    (+ 30 до життя)"
                                                        +"\nВибір: ");
                                        bonus = in.readLine();
                                        switch(bonus){
                                            case "1":{
                                                player.setBonusHP(200);
                                                player.setBonusAttack(5);
                                                break;
                                            }
                                            case "2":{
                                                player.setBonusAttack(20);
                                                player.setBonusHP(70);
                                                break;
                                            }
                                            case "3":{
                                                player.setBonusArmor(20);
                                                player.setBonusAttack(5);
                                                player.setBonusHP(30);
                                                break;
                                            }
                                            default:{
                                                System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                                                continue;
                                            }
                                        }
                                        
                                        break;
                                    }
                                    level++;
                                    continue;
                                }
                                else{
                                    level = 1;
                                    player.normalCharacteristics();
                                    bot4.normalHP();
                                    System.out.println("\n" + bot4.getName() + " переміг...");
                                    System.out.print("Бажаєте зіграти ще раз?"
                                                   + "\n1 - Так"
                                                   + "\n0 - Повернутися в меню"
                                                   + "\nКоманда: ");
                                    input4 = in.readLine();
                                    switch(input4){
                                        case "0":{
                                            break;
                                        }
                                        case "1":{
                                            continue;
                                        }
                                        default:{
                                            System.out.println("Помилка! Неправильно введена команда. Вас перекинуто в меню\n");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                            case 5:{
                                String input5;
                                Level5.Bot5 bot5 = new Level5.Bot5();
                                
                                player.showPlayerStatus();
                                bot5.showBotStatus();
                                System.out.println("Ви на 5-му рівні");
                                
                                while(true){
                                    System.out.print("Виберіть режим:"
                                                     + "\n0 - самостійний"
                                                     + "\n1 - автоматичний"
                                                     + "\nКоманда: ");

                                    input5 = in.readLine();
                                    
                                    switch(input5){
                                        case "0":{
                                            isWin = independentGame(player, bot5);
                                            break;
                                        }
                                        case "1":{
                                            isWin = autoGame(player,bot5);
                                            break;
                                        }
                                        default:{
                                            System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                                            continue;
                                        }
                                    }
                                    break;
                                }
                                
                                if(isWin){
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("");
                                    System.out.println("\n"+player.getName()+" ПЕРЕМІГ");
                                    System.out.print("\n- - - ВІТАЮ - - -"
                                            + "\nВИ ПРОЙШЛИ ГРУ!"
                                            + "\n"
                                            + "\n"
                                            + "\nДля повернення в меню натисніть будь-яку клавішу, потім Enter");
                                    in.readLine();

                                    level = 1;
                                    break;
                                }
                                else{
                                    level = 1;
                                    player.normalCharacteristics();
                                    bot5.normalHP();
                                    System.out.println("\n" + bot5.getName() + " переміг...");
                                    System.out.print("Бажаєте зіграти ще раз?"
                                                   + "\n1 - Так"
                                                   + "\n0 - Повернутися в меню"
                                                   + "\nКоманда: ");
                                    input5 = in.readLine();
                                    switch(input5){
                                        case "0":{
                                            break;
                                        }
                                        case "1":{
                                            continue;
                                        }
                                        default:{
                                            System.out.println("Помилка! Неправильно введена команда. Вас перекинуто в меню\n");
                                            break;
                                        }
                                    }
                                }
                                break;
                            }
                        }
                        
                        break;
                    }
                    
                    break;
                }
                case "2":
                {
                    Player.Player p = new Player.Player();
                    System.out.println("\n- - - ПРО ГРУ - - -"
                                     + "\nВ грі потрібно пройти 5 рівнів."
                                     + "\nПеред кожним рівне у вас буде вибір режиму (автоматичний або самостійний)."
                                     + "\nНа наступний рівень можна перети після того, як переміг бота на даному рівні."
                                     + "\nЯкщо вас переміг бот, то ви будете змушені почати все спочатку.\n"
                                     + "\nВаші початкові параметри:\n"
                                     + "\n- Життя: " + p.getHP()
                                     + "\n- Защита: " + p.getArmor()
                                     + "\n- Атака: 0-" + p.getAttack()
                                     + "\n"
                                     + "\nАтака виконується випадковим чином, у заданих межах."
                                     + "\nВід атки віднімається защита, і атака стає меншою"
                                     + "\nПісля проходження рівнів, вам буде надаватися вибір одного із декількох бонусів."
                                     + "\n- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
                    
                    System.out.println("\nДля повернення в меню натисніть будь-яку клавішу, потім Enter");
                    in.readLine();
                    break;
                }
                case "3":
                {
                    System.out.println("\n- - - АВТОР - - -"
                                     + "\nСтудент групи КН-33"
                                     + "\nПриродничо-гуманітарного коледжу ДВНЗ \"УжНУ\""
                                     + "\nРосоха Максим Валентинович"
                                     + "\n- - - - - - - - - - - - - - - - - - - - - - - - -");
                    
                    System.out.println("\nДля повернення в меню натисніть будь-яку клавішу, потім Enter");
                    in.readLine();
                    break;               
                }
                default:
                {
                    System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                    break;
                }
            }
        }
    }
    
    //Для автоматичного режиму
    public static boolean autoGame(Player.Player player, Level1.Bot1 bot)
    {
        while(true){
            player.AttackBot(bot);
            if(bot.getHP() <= 0){return true;}
            
            bot.attackPlayer(player);
            if(player.getHP() <= 0){return false;}
        }
    }
    public static boolean autoGame(Player.Player player, Level2.Bot2 bot)
    {
        while(true){
            player.AttackBot(bot);
            if(bot.getHP() <= 0){return true;}
            
            bot.attackPlayer(player);
            if(player.getHP() <= 0){return false;}
        }
    }
    public static boolean autoGame(Player.Player player, Level3.Bot3 bot)
    {
        while(true){
            player.AttackBot(bot);
            if(bot.getHP() <= 0){return true;}
            
            bot.attackPlayer(player);
            if(player.getHP() <= 0){return false;}
        }
    }
    public static boolean autoGame(Player.Player player, Level4.Bot4 bot)
    {
        while(true){
            player.AttackBot(bot);
            if(bot.getHP() <= 0){return true;}
            
            bot.attackPlayer(player);
            if(player.getHP() <= 0){return false;}
        }
    }
    public static boolean autoGame(Player.Player player, Level5.Bot5 bot)
    {
        while(true){
            player.AttackBot(bot);
            if(bot.getHP() <= 0){return true;}
            
            bot.attackPlayer(player);
            if(player.getHP() <= 0){return false;}
        }
    }
    
    //Для самостійного режиму
    public static boolean independentGame(Player.Player player, Level1.Bot1 bot) throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(true){
            System.out.print("\nАтакувати " + bot.getName() + "?"
                           + "\n1 - Атакувати"
                           + "\n2 - Перейти в автоматичний режим"
                           + "\nКоманда: ");
            input = in.readLine();
            System.out.println("");
            switch(input){
                case "1":{
                    player.AttackBot(bot);
                    if(bot.getHP() <= 0){return true;}
                    bot.attackPlayer(player);
                    if(player.getHP() <= 0){return false;}
                    break;
                }
                case "2":{
                    return (autoGame(player, bot));
                }
                default:{
                    System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                    break;
                }
            }
        }
    }
    public static boolean independentGame(Player.Player player, Level2.Bot2 bot)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(true){
            System.out.print("\nАтакувати " + bot.getName() + "?"
                           + "\n1 - Атакувати"
                           + "\n2 - Перейти в автоматичний режим"
                           + "\nКоманда: ");
            input = in.readLine();
            System.out.println("");
            switch(input){
                case "1":{
                    player.AttackBot(bot);
                    if(bot.getHP() <= 0){return true;}
                    bot.attackPlayer(player);
                    if(player.getHP() <= 0){return false;}
                    break;
                }
                case "2":{
                    return (autoGame(player, bot));
                }
                default:{
                    System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                    break;
                }
            }
        }
    }
    public static boolean independentGame(Player.Player player, Level3.Bot3 bot)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(true){
            System.out.print("\nАтакувати " + bot.getName() + "?"
                           + "\n1 - Атакувати"
                           + "\n2 - Перейти в автоматичний режим"
                           + "\nКоманда: ");
            input = in.readLine();
            System.out.println("");
            switch(input){
                case "1":{
                    player.AttackBot(bot);
                    if(bot.getHP() <= 0){return true;}
                    bot.attackPlayer(player);
                    if(player.getHP() <= 0){return false;}
                    break;
                }
                case "2":{
                    return (autoGame(player, bot));
                }
                default:{
                    System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                    break;
                }
            }
        }
    }
    public static boolean independentGame(Player.Player player, Level4.Bot4 bot)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(true){
            System.out.print("\nАтакувати " + bot.getName() + "?"
                           + "\n1 - Атакувати"
                           + "\n2 - Перейти в автоматичний режим"
                           + "\nКоманда: ");
            input = in.readLine();
            System.out.println("");
            switch(input){
                case "1":{
                    player.AttackBot(bot);
                    if(bot.getHP() <= 0){return true;}
                    bot.attackPlayer(player);
                    if(player.getHP() <= 0){return false;}
                    break;
                }
                case "2":{
                    return (autoGame(player, bot));
                }
                default:{
                    System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                    break;
                }
            }
        }
    }
    public static boolean independentGame(Player.Player player, Level5.Bot5 bot)throws IOException
    {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        String input;
        while(true){
            System.out.print("\nАтакувати " + bot.getName() + "?"
                           + "\n1 - Атакувати"
                           + "\n2 - Перейти в автоматичний режим"
                           + "\nКоманда: ");
            input = in.readLine();
            System.out.println("");
            switch(input){
                case "1":{
                    player.AttackBot(bot);
                    if(bot.getHP() <= 0){return true;}
                    bot.attackPlayer(player);
                    if(player.getHP() <= 0){return false;}
                    break;
                }
                case "2":{
                    return (autoGame(player, bot));
                }
                default:{
                    System.out.println("Помилка! Неправильно введена команда, повторіть спробу\n");
                    break;
                }
            }
        }
    }
}