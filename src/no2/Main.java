package no2;

public class Main {

    static GameCharacter raiden = new GameCharacter("Raiden",10, 20);
    static GameCharacter subZero = new GameCharacter("Sub-Zero",5, 25);

    static void viewLifepoint(){
        System.out.println("<=================>");
        System.out.println("Raiden HP" + raiden.getLifepoint());
        System.out.println("Sub-Zero HP" + subZero.getLifepoint());
        System.out.println("<=================>");
    }

    static void winner(){
        if (raiden.getLifepoint() > subZero.getLifepoint()){
            System.out.println("Raiden Win");
        } else if (raiden.getLifepoint() < subZero.getLifepoint()){
            System.out.println("Sub-Zero Win");
        } else {
            System.out.println("Draw");
        }
    }

    public static void main(String args[]){
        System.out.println("Round Start!!!");
        System.out.println("==================");
        System.out.println("Raiden Kick");
        raiden.kick(subZero);
        System.out.println("Sub-Zero Kick");
        subZero.kick(raiden);
        System.out.println("Sub-Zero 3x Hit");
        for (int i=0; i<3; i++){
            subZero.hit(raiden);
        }
        System.out.println("Raiden 4x kick");
        for (int i=0; i<4; i++){
            raiden.kick(subZero);
        }
        viewLifepoint();
        winner();
    }
}
