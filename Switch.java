import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        System.out.println("Below are the serial numbers corresponding to volume of shapes");
        System.out.println(" 1. Volume of Cone \n 2. Volume of Cylinder \n 3. Volume of Sphere");
        System.out.println("Enter a corresponding number: ");
        Scanner sc = new Scanner(System.in);
        int ch = sc.nextInt();
        switch(ch){
            case 1: 
            System.out.println("Volume of cone");
            System.out.println("Enter radius of cone");
            float r = sc.nextFloat();
            System.out.println("Enter height of cone");
            float h = sc.nextFloat();
            double volume_cone = 3.14 * r * r * (h/3);
            System.out.println("The volume of cone is: " + volume_cone);
            break;

            case 2:
            
            System.out.println("Volume of Cylinder");
            System.out.println("Enter radius of cylinder");
            float rad = sc.nextFloat();
            System.out.println("Enter height of cylinder");
            float hei = sc.nextFloat();
            double volume_cylinder = 3.14 * rad * rad * hei;
            System.out.println("The volume of cone is: " + volume_cylinder);
            break;

            case 3:
            System.out.println("Volume of sphere");
            System.out.println("Enter radius of sphere");
            float radius = sc.nextFloat();
            double volume_sphere = (4/3)*3.14 * radius * radius * radius;
            System.out.println("The volume of cone is: " + volume_sphere);
            break;

            default:
                System.out.println("Entered the wrong choice");
        }
    }
}
