package student;

import java.util.ArrayList;
import java.util.Scanner;

public class studentStyle {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();

      loop:  while (true) {
            System.out.println("-------");
            System.out.println("1.新增");
            System.out.println("2.删除");
            System.out.println("3.修改");
            System.out.println("4.查询");
            System.out.println("5.退出");
            System.out.println("请输入");
            Scanner sc = new Scanner(System.in);
            String choose = sc.next();
            switch (choose){
                case "1" -> addStudent(list);
                case "2" -> delStudent(list);
                case "3" -> editStudent(list);
                case "4" -> getStudent(list);
                case "5" -> {
                    System.out.println("退出");
                    break loop;
                    //停止虚拟机运行
//                    System.exit(0);
                }
            }
        }
    }

    //添加学生
    public static void addStudent(ArrayList<Student> list){
        System.out.println("添加");
        
    }
    //删除
    public static void delStudent(ArrayList<Student> list){
        System.out.println("删除");
    }
    //修改
    public static void editStudent(ArrayList<Student> list){
        System.out.println("修改");
    }
    //查询
    public static void getStudent(ArrayList<Student> list){
        System.out.println("删除");
        if (list.size() == 0){
            System.out.println("当前无学生信息");
            return;
        }

        for (int i = 0 ;i<list.size();i++){
            Student stu = list.get(i);
            System.out.println(stu.getId() + "\t" + stu.getName() + "\t" + stu.getAge() + "\t" + stu.getAddress());
        }
    }
}
