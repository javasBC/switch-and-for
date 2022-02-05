import java.util.Scanner;

public class forSt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;

        for (int i=0;i<5;i++){
            int input= scanner.nextInt();
            sum+=input;
            sum+=scanner.nextInt();
        }

        System.out.println("the sum is : "+sum);

        //1
        // כתוב תוכנית שקולטת 5 מספרים מהמשתמש בלולאה ומדפיסה את
        // הממוצע של כל המספרים

        double avg=0;
        int itr=5;
        for (int i=0; i<itr;i++){
            avg+=scanner.nextDouble();
        }
        avg/=5;
        System.out.println("the average is :"+avg);


        //2
        // כתוב תוכנית שתקבל מהלקוח מספר הפעמים שהוא רוצה להכניס קלט
        // כתבו FOR שתרוץ מ 0 עד המספר שלהקוח הזין תבקשו ממנו מספר חדש כל פעם
        // הדפיסו את המכפלה של כל המספרים
        System.out.println("how many number do you want to multiply ");
        int loop=scanner.nextInt();
        double makhpila=1;
        if (loop>0) {
            for (int i = 0; i < loop; i++) {
                System.out.println("please enter number");
                makhpila *= scanner.nextDouble();
            }
            System.out.println("makhplia hie :" + makhpila);
        }


        //3
        // תכתבו תוכנית שקולטת מספר מהלקוח ומדפיסה את העצרת של הפספר שהכניס
        // 6!= 1*2*3*4*5*6

        System.out.println("please enter the number  ");
        int number=Math.abs(scanner.nextInt());
        long fac=1l;
        for (int t=number;t>1;t--){ //(number --- 1)
            fac*=t;
        }
        System.out.println(fac);


        //4
        // הדפיסו את הערכים ה 10 הראשונים מסדרת פיבונאצי
        // 0 1 1 2 3 5 8 13 21 34
        int n = 10, firtTerm = 0, secondTerm = 1;
        int temp;
        System.out.println("fibonacci series till the " + n + "term");
        for (int i = 1; i <= n; i++) {
            System.out.print(firtTerm + " , ");
            temp = firtTerm + secondTerm;
            firtTerm = secondTerm;
            secondTerm = temp;
        }
        //052661801


    }
}
