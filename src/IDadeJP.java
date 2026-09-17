import java.util.Scanner;
public class IDadeJP {
    public static void main(String[] args) {

        double joao = 1.34;
        double pedro = 1.45;
        int anos = 0;

        while (joao <= pedro) {
            joao = joao + 0.025;
            pedro = pedro + 0.02;
            anos++;
        }

        System.out.println("João ficará mais alto que Pedro em " + anos + " anos.");
    }
}