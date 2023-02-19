package practice;

class Appreg {
    String name;
    String emailid;
    int age;

    public Appreg(String name, String emailid,int age) {
        this.name = name;
        this.emailid = emailid;
        if (age>18){
            this.age=age;
        }else{
            System.out.println("Your age is less than 18+");
        }
    }

    public String getName() {
        return name;
    }
    public String getEmailid() {
        return emailid;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        this.name = name;
        this.name = name;
    }
    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }
    public void setAge(int age) {
       this.age=age;
    }
    void login(){
        if (age>18){
            System.out.println("Login sucessfull");
        }else {
            System.out.println("Login failed");
        }
    }
    void disp(){
        System.out.println("The name is: "+name+" The emai id is: "+emailid+" The age is: "+age);
    }
}
class MainClass{
    public static void main(String[] args) {
        System.out.println("Main Startwd");

        Appreg a = new Appreg("Suresh", "suresh@gmail.com",15);
        //a.setAge(15);
        a.disp();
        a.login();

        System.out.println("-----------------------");

       Appreg a1 = new Appreg("Ramesh", "ramu@gmail.com",20);
        a1.disp();
        a1.login();

        System.out.println("Main ended");
    }
}
/*Main Started
Your age is less than 18+
The name is: Suresh The email id is: suresh@gmail.com The age is: 0
Login failed
-----------------------
The name is: Ramesh The emai id is: ramu@gmail.com The age is: 20
Login sucessfull
Main ended*/