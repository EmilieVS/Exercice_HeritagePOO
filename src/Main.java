//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Croiseur acclamator = new Croiseur("Acclamator","Croiseur", 752.0,700);
        System.out.println(acclamator.getData());

        Croiseur acclamator2 = new Croiseur("Acclamator2","Croiseur", 752.0,165);
        System.out.println(acclamator2.getData());

 Intercepteur xWing = new Intercepteur("X-wing","Intercepteur",12.5,2);
        System.out.println(xWing.getData());
        System.out.println(xWing.showAbility(xWing));
        System.out.println(acclamator.loadTroopers(500));
        System.out.println(xWing.shoot(6));



    }
}