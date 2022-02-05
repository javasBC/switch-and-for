import java.util.Scanner;

public class ifExce {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String firsName = scr.nextLine();
        String middleName = scr.next();
        System.out.println("hii :" + firsName + " m n = " + middleName);
        System.out.println("hi \\n i love sushi ");
        System.out.println("c:\\users\\hothaifa\\downloads");
        System.out.println("hii :" + firsName);
        System.out.print("please enter the first number : ");
        int x = scr.nextInt();
        System.out.print("please enter the second number : ");
        int y = scr.nextInt();
        System.out.println(x + "  " + y);
        if (x > y) {
            System.out.println(x);
        } else {
            System.out.println(y);
        }

        //input x, y, z (float)
        //        print count positive
        //print count negative
        //print count zeros

        float x1, y1, z;
        System.out.println("please enter a number");
        x1 = scr.nextFloat();
        System.out.println("please enter a number");
        y1 = scr.nextFloat();
        System.out.println("please enter a number");
        z = scr.nextFloat();
        int posCounter = 0, negCounter = 0;
        if (x1 > 0)
            posCounter++;
        else if (x1 < 0)
            negCounter++;
        if (y1 > 0)
            posCounter++;
        else if (y1 < 0)
            negCounter++;
        if (z > 0)
            posCounter++;
        else if (z < 0)
            negCounter++;

        System.out.println("POSITIVES: " + posCounter + "  NEGATIVES: " +
                "" + negCounter + "  Zeros" + (3 - posCounter - negCounter));


        // leap year : is the year with 366 days it comes 1 every 4 years
        // write a code that receive a year from the user (int)
        // and print if its LEAP YEAR or not
        //if the year divided by 100 we need to check if its divides by 400


        int year = scr.nextInt();
        if ((year %4==0 && year%100 !=0) || year%400==0)
            System.out.println("leap year !!!!");
        if (year%100==0 && year%400==0 ) {
            System.out.println("leap year !!!!");
        }
        else if (year%4==0 && year%100!=0)
            System.out.println("leap year !!!!");
        else
            System.out.println("just another year ");
        char c = scr.next().charAt(0);


        // how to check the day by the number ?
        System.out.println("please enter the day number");
        int day=scr.nextInt();
        if (day == 1)
            System.out.println("Sunday");
        else if (day == 2)
            System.out.println("Monday");
        else if (day == 3)
            System.out.println("Tuesday");
        else if (day == 4)
            System.out.println("wednesday");
        else if (day == 5)
            System.out.println("thursday");
        else if (day == 6)
            System.out.println("friday");
        else if (day == 7)
            System.out.println("saturday");
        else
            System.out.println("invalid input");//(0 ... n-1)


        switch (Math.abs(day) % 7) {
            case 1:
                System.out.println("sunday");
                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wednesday");
                break;
            case 5:
                System.out.println("thursday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 0:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid input");
        }


        //2
        //תבנו מחשבון !המחשבון מקבל מספר
        //אופיראטור ומספר ומחשב את התצאה הנכונה
        //DOUBLE
        char e = scr.next().charAt(0);


        System.out.println("please enter a number operator and another number (with spaces) ");
        double x2 = scr.nextDouble();
        char op = scr.next().charAt(0);
        double y2 = scr.nextDouble();
        switch (op) {
            case '+':
                System.out.println("x+y = " + (x2 + y2));
                break;
            case '-':
                System.out.println("x-y = " + (x2 - y2));
                break;
            case '*':
                System.out.println("x*y = " + (x2 * y2));
                break;
            case '/':
                if (y2 == 0) {
                    System.out.println("can not divide by zero");
                } else {
                    System.out.println("x/y = " + (x2 / y2));
                }
                break;
            default:
                System.out.println("invalid input");
        }


        //3
        //חיששוב הלוואה באישור מיידי :::
        // קבל מהלקוח סכום משכורת חודשית+דירוג אשראי +גיל +וותק בבנק
        // סכום ההלוואה מחושב בצורה הבאה :
        // אם הדירוג מעל כולל7 אז :(גיל הלקוח *דירוג אשראי*משכורת) /(וותק)
        //אם הדירוג מתחת ל 7 ועד 3 : (גיל הלקוח * משכורת) /(דיררוג*וותק)
        // אם הדירוג מתחת ל 3כולל אז לכתוב הודעה שלא ניתן לקחת הלוואה


        System.out.println("please enter your salary ");
        double salary = scr.nextDouble();
        System.out.println("please enter your credit score  (0-10)");
        int credit = scr.nextInt();
        System.out.println("please enter your age  (21-120)");
        double age = scr.nextDouble();
        System.out.println("please enter your seniority (0-99)");
        double seniority = scr.nextDouble();
        double loan = 0;
        if (seniority >= 1) {
            if (credit >= 7) {
                loan = age * salary * credit / seniority;
            } else if (credit > 3) {
                loan = (age * salary) / (seniority * credit);
            }
        }
        System.out.println("the loan that you can receive is " + loan);


        /*System.out.println("please enter your salary");
        double salary = scanner.nextDouble();
        System.out.println("please enter your rating");
        int rating = scanner.nextInt();
        System.out.println("please enter your age");
        double age = scanner.nextDouble();
        System.out.println("please enter your seniority");
        double seniority = scanner.nextDouble();*/

        switch (credit) {
            case 7, 8, 9, 10:
                System.out.println("the loan is: " + ((age * credit * salary) / seniority));
                break;
            case 4, 5, 6:
                System.out.println("the loan is: " + ((age * salary) / (credit * seniority)));
                break;
            case 0, 1, 2, 3:
                System.out.println("cant get loan");
            default:
                System.out.println("invalid input");
        }


    }

}
