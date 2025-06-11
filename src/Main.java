//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Croiseur Acclamator = new Croiseur("Acclamator","Croiseur", 752.0,700);
        System.out.println(Acclamator.getData());

        Croiseur Acclamator2 = new Croiseur("Acclamator2","Croiseur", 752.0,165);
        System.out.println(Acclamator2.getData());

 Intercepteur Xwing = new Intercepteur("X-wing","Intercepteur",12.5,2);
        System.out.println(Xwing.getData());
        System.out.println(Xwing.showAbility(Xwing));
        System.out.println(Acclamator.loadTroopers(500));
        System.out.println(Xwing.shoot(6));



    }
}