public class Croiseur extends Vaisseau{
    private Integer placesCapacity;

    protected Croiseur(String name, String type, Double size, Integer placesCapacity) {
        super(name,type,size);
        this.placesCapacity = placesCapacity;
    }

    public String loadTroopers(Integer Number){
        if (Number > placesCapacity){
            return ("erreur : surcharge de l'appareil");

        }

        return ("Ce vaisseau charge " + Number + " Troopers");
    }

    public String deloadTroopers (Integer Number){
        return ("Ce vaisseau a acheminé " + Number + " Troopers");
    }




}
