import java.util.*;
class gcase{
    public static void main(String args[]){
        Scanner n=new Scanner(System.in);
        int day=n.nextInt();
        switch(day)
        {
            case 0:
                System.out.println("sunday");
                break;
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            default:
                System.out.println("enter valid number");
                break;
        }

    }
}