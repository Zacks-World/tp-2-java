//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Application {
    public static void main(String[] args) {
        Adherent adherent=new Adherent("El Guazzar","Zakaria","elguazzar@gmail.com","0621167895",25,1);
        Auteur  auteur=new Auteur("El Guazzar","Ayoub","ayoub@gmail.com","0621767955",29,1232);
        Livre livre=new Livre("JAVA",12345,auteur);
        System.out.println(adherent.Afficher());
        System.out.print(livre.Afficher());
    }
}