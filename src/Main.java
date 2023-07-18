public class Main {
    public static void main(String[] args) {
Car car=new Car("black: ","Tayota corolla");
House house=new House("white: ","City.house");
Phone phone=new Phone("white: ","Samsung");
User user=new User(car,phone,house);
        System.out.println("car name: "+user.getCar().getName()+"| color: "+user.getCar().getColor());
        System.out.println("house name: "+user.getHouse().getName()+"| color: "+user.getHouse().getColor());
        System.out.println("phone name: "+user.getPhone().getName()+"| color: "+user.getPhone().getColor());






















//      Student student=new Student("Aidai","Ysmailova","student");
//  Teacher teacher=new Teacher("Bakyt","Latibov","teacher");
//      System.out.println(teacher.getName()+" "+teacher.getLastname()+"   "+teacher.getKto());
//      System.out.println(student.getName()+" "+student.getLastname()+" " + student.getKto());
//      String sname1= student.getName();
//      String sl1=student.getLastname();
//      String k1=student.getKto();
//
//      student.setName(teacher.getName());
//      student.setLastname(teacher.getLastname());
//      student.setKto(teacher.getKto());
//
//      teacher.setName(sname1);
//      teacher.setLastname(sl1);
//      teacher.setKto(k1);
//
//
//      System.out.println("Teacher: "+teacher.getName()+" "+teacher.getLastname()+"   "+teacher.getKto());
//      System.out.println(student.getName()+" "+student.getLastname()+" " + student.getKto());
    }}