public class Vaisseau {

    String name;
    String type;
    Double size;

    public Vaisseau (String name, String type, Double size){
    this.name = name;
    this.type = type ;
    this.size = size;
    }

    public String getData(){
        return ("Ce vaisseau est un "+ name +". C'est un "+ type +" et il fait " + size + " mètres");
    }

    public String showAbility(Vaisseau vaisseau) {
        if (vaisseau instanceof Croiseur) {
            return ("Ce vaisseau transporte des troupes");
        }
        else if (vaisseau instanceof Intercepteur) {
            return ("Ce vaisseau peut tirer jusqu'à deux fois par canon");
        }
        return "Vaisseau non référencé : accès refusé";
    }

    // ATTENTION !!!! Ne pas dupliquer les informations ! Le type = la classe donc il vaut mieux coder
    // une méthode getType(), qui retournera le type via une string.

}
