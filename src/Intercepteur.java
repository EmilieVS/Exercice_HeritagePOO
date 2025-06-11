public class Intercepteur extends Vaisseau{
    Integer canon;

    public Intercepteur (String name, String type, Double size, Integer canon){
        super(name,type,size);
        this.canon = canon;
    }

    public String shoot(Integer number){
        if(number > 2){
            return ("Plus de munition: rechargez !");
        }

        return ("Tire " + number + " fois");
    }

    public String reload(){
        return ("Recharge les munitions");
    }



}
