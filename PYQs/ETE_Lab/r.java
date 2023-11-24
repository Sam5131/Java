import java.util.*;

class Student {
    Scanner sc = new Scanner(System.in);
    int id, reg_no;
    String name;
    int marks[] = new int[6];

    void get_info() {
        System.out.println("Enter the id:");
        this.id = sc.nextInt();
        System.out.println("Enter the reg number:");
        this.reg_no = sc.nextInt();
        System.out.println("Enter the marks:");
        for (int i = 0; i < 6; i++) {
            this.marks[i] = sc.nextInt();
        }
        sc.nextLine();
        System.out.println("Enter the name");
        this.name = sc.nextLine();
    }
}

class attendance extends Student {
    Scanner sc = new Scanner(System.in);
    int attendance;

    void attendance_info() {
        System.out.println("Enter the attendance:");
        this.attendance = sc.nextInt();
    }
}

class exam extends attendance {
    int marks1[] = new int[6];
    int marks2[] = new int[6];
    int marks3[] = new int[6];
    Scanner sc = new Scanner(System.in);

    void first_sessional() {
        if (attendance >= 75) {
            System.out.println("Enter first sessional marks:");
            for (int i = 0; i < 6; i++) {
                marks1[i] = sc.nextInt();
            }
        }
    }

    void second_sessional() {
        if (attendance >= 75) {
            System.out.println("Enter second sessional marks:");
            for (int i = 0; i < 6; i++) {
                marks2[i] = sc.nextInt();
            }
        }
    }

    void end_term() {
        if (attendance >= 75) {
            System.out.println("Enter end sessional marks:");
            for (int i = 0; i < 6; i++) {
                marks3[i] = sc.nextInt();
            }
        }
    }
}

class result extends exam {
    double per;

    void cal_per() {
        for (int i = 0; i < 6; i++) {
            this.per = ((marks1[i]) + (marks2[i]) + (marks3[i]))/100;
        }
    }

    void display() {
        System.out.println("The percentage is:" + per);
    }
}

class r {
    public static void main(String args[]) {
        result r = new result();
        r.get_info();
        r.attendance_info();
        r.first_sessional();
        r.second_sessional();
        r.end_term();
        r.cal_per();
        r.display();
    }
}
