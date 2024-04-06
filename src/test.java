import java.util.Scanner;

public class test {
    public static void main(String[] args) {

         // switch = kiểm tra xem 1 biến có = 1 tập giá trị
        String day = "Friday";
        switch (day)
        {
            case "Sunday" : System.out.println("It is Sunday");break;
            case "Monday" : System.out.println("It is Monday");break;
            case "Tuesday" : System.out.println("It is Sunday");break;
            case "Wednesday" : System.out.println("It is thứ 4");break;
            case "Thursday" : System.out.println("It is thứ 5");break;
            case "Gayday" : System.out.println("Shit");break;
            case "Friday" : System.out.println("It is Friday");break;

            default : System.out.println("You are stupid"); // nếu không có case nào xảy ra
        }

        // if else if else && || ! // giống C++

        Scanner scanner = new Scanner(System.in);
        System.out.println("Chơi hay không ? Bấm q hoặc Q để quit");
        String response = scanner.next(); // char
        if(response.equals("q") || response.equals("Q"))  System.out.println("M đã cút");
        else System.out.println("Chơi thôi");

        // while // giống C++
        String name = "";
        while(name.isBlank())
        {
            System.out.println("Enter name :");
            name = scanner.next();
        }
        System.out.println("Hello Bro");

        // for // giống C++
        for(int i=0;i<10;i++) System.out.println(i);
        final double PI = 3.13422; // giống const trong C++
        // method // giống function trong C++
    }
}
