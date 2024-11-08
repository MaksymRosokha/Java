package pr.classes;

public class Student {
    
    public Student(String fullName, int course, String group, String creditbookNumber, int mark)
    {
        if((mark > 0 && mark <= 5) && (course > 0 && course <= 5))
        {
            this.fullName = fullName;
            this.course = course;
            this.group = group;
            this.creditbookNumber = creditbookNumber;
            this.mark = mark;
            
            listOfStudents += "ПІБ: " + this.fullName + "\nКурс: " + this.course + "\nГрупа: " + this.group + "\nНомер залікової книжки: " + this.creditbookNumber + "\nОцінка: " + this.mark + "\n\n";
            
            System.out.println("Студент успішно добавлений!");
        }
        else
        {
            System.out.println("Курс і оцінка повинні бути в межах від 1 до 5! Студент не добавлений.");
            return;
        }
        
        if(theBestStudent_mark < this.mark)
        {
            theBestStudent_fullName = this.fullName;
            theBestStudent_course = this.course;
            theBestStudent_group = this.group;
            theBestStudent_creditbookNumber = this.creditbookNumber;
            theBestStudent_mark = this.mark;
        }
        
        countStudents++;
    }
    
   private String fullName;
   private int course;
   private String group;
   private String creditbookNumber;
   private int mark;
   
   private static String theBestStudent_fullName;
   private static int theBestStudent_course;
   private static String theBestStudent_group;
   private static String theBestStudent_creditbookNumber;
   private static int theBestStudent_mark = 0;
   
   private static int countStudents = 0;
   private static String listOfStudents = "";
   
   public static String getTheBestStudent()
   {
       if(countStudents == 0)
       {
           return ("Покищо немає студентів");
       }
       return ("Найуспішніший студент:\nПІБ: " + theBestStudent_fullName + "\nКурс: " + theBestStudent_course + "\nГрупа: " + theBestStudent_group + "\nНомер залікової книжки: " + theBestStudent_creditbookNumber + "\nОцінка: " + theBestStudent_mark);
   }
   
   public static String getListOfStudents()
   {
       if(countStudents == 0)
       {
           return ("Покищо немає студентів");
       }
       return ("Список студентів:\n" +listOfStudents);
   }
   
   public static int getCountStudents()
   {
       return countStudents;
   }
   
   public static void removeAllStudents()
   {
       listOfStudents = "";
       countStudents = 0;
       System.out.println("Студенти успішно видалені!");
   }
}
