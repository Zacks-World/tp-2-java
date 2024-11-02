//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Ingenieur ingenieur=new Ingenieur("EL GUAZZAR","Zakaria","elguazzar@gmail.com","0621167802",20000,"DevOps");
        Manager manager=new Manager("EL GUAZZAR","Ayoub","ayoub@gmail.com","0621161202",20000,"RH");
        System.out.println(ingenieur.toString());
        System.out.println(manager.toString());
    }
}