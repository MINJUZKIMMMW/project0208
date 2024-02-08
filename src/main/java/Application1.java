import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
//
//        System.out.println("=======Robot 생성=======");
//        Robot robot = new Robot();
//        robot.walk();
//        robot.smile();
//        robot.scream();
//
//        System.out.println("=========Black 생성======");
//        Black black = new Black();
//        black.walk();
//        black.smile();
//        black.scream();
//
//        System.out.println("=========White 생성=======");
//        White white = new White();
//        white.walk();
//        white.smile();
//        white.scream();
//
//        Robot a1 = new Black();
//        Robot a2 = new White();
//
//        System.out.println("========동적바인딩 확인==========");
//        a1.walk();
//        a2.smile();
//
//        System.out.println("========클래스타입 형변환 확인=====");
//        ((Black) a1).walk();
//        ((White) a2).scream();
//
//        System.out.println("instanceof확인=======");
//        System.out.println("a1이 White 타입인지 확인" + (a1 instanceof White));
//        System.out.println("a1이 Black 타입인지 확인" + (a2 instanceof Black));
//        System.out.println("a1이 Robot 타입인지 확인" + (a1 instanceof Robot));
//
//        if (a1 instanceof White) {
//            ((White) a1).walk();
//        }
//        if (a1 instanceof Black) {
//            ((Black) a1).smile();
//        }

        Robot robot1 = new Robot();
        Black black = new Black();
        White white = new White();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("시작");
            System.out.println("1.흑인로봇 걷게하기");
            System.out.println("2.흑인로봇 웃게하기");
            System.out.println("3.흑인로봇 놀래키기");
            System.out.println("4.백인로봇 걷게하기");
            System.out.println("5.백인로봇 웃게하기");
            System.out.println("6.백인로봇 놀래키기");
            System.out.println("7.프로그램 종료하기");
            int no = sc.nextInt();

            switch (no) {
                case 1:
                    black.walk();
                    break;
                case 2:
                    black.smile();
                    break;
                case 3:
                    black.scream();
                    break;
                case 4:
                    white.walk();
                    break;
                case 5:
                    white.smile();
                    break;
                case 6:
                    white.scream();
                    break;
                case 7:
                    System.out.println("프로그램을 종료합니다.");
                default:
                    System.out.println("잘못된 번호를 선택하셨습니다.");


            }

            if (no == 7) {
                break;

            }
        }
    }
}

