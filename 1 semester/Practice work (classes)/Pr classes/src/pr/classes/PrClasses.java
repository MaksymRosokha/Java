package pr.classes;
import java.io.*;

public class PrClasses {

    public static void main(String[] args) throws IOException {
        BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
        
        String input;
        
        while(true)
        {
            System.out.println("\n- - - ВВЕДІТЬ КОМАНДУ - - -\n"
                               + "0 - Вихід\n"
                               + "1 - Добавити студента\n"
                               + "2 - Кількість всіх студентів\n"
                               + "3 - Список всіх студентів\n"
                               + "4 - Найуспішніший студент\n"
                               + "5 - Видалити всіх студентів\n"
                               + "- - - - - - - - - - - - - - - -");
            
            System.out.print("Команда: ");
            input = in.readLine();
            System.out.println("");
            switch(input)
            {
                case "0":
                {
                    System.out.println("Допобачення");
                    return;
                }
                
                case "1":
                {
                    int input2 = -1;
                    
                        while(true){
                            int mark = 0;
                            int course = 0;
                            System.out.print("Введіть ПІБ: ");
                            String fullName = in.readLine();
                            
                            System.out.print("Введіть курс (від 1 до 5): ");
                            try{
                                course = Integer.parseInt(in.readLine());
                            }
                            catch(Exception ex){ 
                                System.out.println("Неправильно введений курс, повторіть спробу! Студент не добавлений.");
                                continue;
                            }

                            System.out.print("Введіть групу: ");
                            String group = in.readLine();
                            
                            System.out.print("Введіть номер залікової книжки: ");
                            String creditbookNumber = in.readLine();
                            
                            System.out.print("Введіть оцінку (від 1 до 5): ");
                            try{
                                mark = Integer.parseInt(in.readLine());
                            }
                            catch(Exception ex){ 
                                System.out.println("Неправильно введена оцінка, повторіть спробу! Студент не добавлений.");
                                continue;
                            }
                            
                            Student student = new Student(fullName, course, group, creditbookNumber, mark);
                            
                            
                            while(true){
                                System.out.print("\n0 - Повернутися до меню\n"
                                               + "1 - Добавити ще одного студента\n"
                                               + "Команда: ");
                                try{
                                    input2 = Integer.parseInt(in.readLine());
                                }
                                catch(Exception ex){
                                    input2 = -1;
                                }

                                if(input2 == 0 || input2 == 1)
                                {
                                    break;
                                }

                                else
                                {
                                    System.out.println("Неправильно введена команда, спробуйте ще раз!");
                                }
                            }
                            
                            if(input2 == 0){break;}
                            else{continue;}
                        }
                        break;      
                }
                
                case "2":
                {
                    System.out.println("Кількість студентів: " + Student.getCountStudents());
                    
                    while(true){
                        int input3 = -1;
                        System.out.println("Введіть 0 щоб повернутися до меню ");
                        System.out.print("Команда: ");
                        try{
                            input3 = Integer.parseInt(in.readLine());
                        }
                        catch(Exception ex){
                            System.out.println("Неправильно введена команда, спробуйте ще раз!");
                            continue;
                        }
                        
                        if(input3 == 0){
                            break;
                        }
                        else{
                            System.out.println("Неправильно введена команда, спробуйте ще раз!");
                        }
                    }
                    break;
                }
                
                case "3":
                {
                    System.out.println(Student.getListOfStudents());
                    
                    while(true){
                        int input4 = -1;
                        System.out.println("Введіть 0 щоб повернутися до меню ");
                        System.out.print("Команда: ");
                        try{
                            input4 = Integer.parseInt(in.readLine());
                        }
                        catch(Exception ex){
                            System.out.println("Неправильно введена команда, спробуйте ще раз!");
                            continue;
                        }
                        
                        if(input4 == 0){
                            break;
                        }
                        else{
                            System.out.println("Неправильно введена команда, спробуйте ще раз!");
                        }
                    }
                    
                    break;
                }
                
                case "4":
                {
                    System.out.println(Student.getTheBestStudent());
                    
                    while(true){
                        int input5 = -1;
                        System.out.println("Введіть 0 щоб повернутися до меню ");
                        System.out.print("Команда: ");
                        try{
                            input5 = Integer.parseInt(in.readLine());
                        }
                        catch(Exception ex){
                            System.out.println("Неправильно введена команда, спробуйте ще раз!");
                            continue;
                        }
                        
                        if(input5 == 0){
                            break;
                        }
                        else{
                            System.out.println("Неправильно введена команда, спробуйте ще раз!");
                        }
                    }
                    
                    break;
                }
                
                case "5":
                {
                    Student.removeAllStudents();
                    
                    while(true){
                        int input6 = -1;
                        System.out.println("Введіть 0 щоб повернутися до меню ");
                        System.out.print("Команда: ");
                        try{
                            input6 = Integer.parseInt(in.readLine());
                        }
                        catch(Exception ex){
                            System.out.println("Неправильно введена команда, спробуйте ще раз!");
                            continue;
                        }
                        
                        if(input6 == 0){
                            break;
                        }
                        else{
                            System.out.println("Неправильно введена команда, спробуйте ще раз!");
                        }
                    }
                    
                    break;
                }
                
                default:
                {
                    System.out.println("Неправильно введена команда, спробуйте ще раз!");
                    break;
                }
            }
        }
    }
}
