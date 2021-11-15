public class Student {
    int rollno;
    String name;
    int contactno;
    int totalmarks;

    Student(int rollno,String name,int contactno,int totalmarks){
        this.rollno=rollno;
        this.name=name;
        this.contactno=contactno;
        this.totalmarks=totalmarks;


    }
    void display(){
        System.out.println("rollno is ==> "+rollno+"name is ==> "+  name   + "   contactno is "+   contactno  +"  total marks is==>"+totalmarks);
    }
}
