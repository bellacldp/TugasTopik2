package no2;

public class GameCharacter {
    private String nama;
    private int Lifepoint, attackHitPoint, attackKickPoint;

    public GameCharacter(String nama, int attackHitPoint, int attackKickPoint){
        this.nama = nama;
        this.Lifepoint = 100;
        this.attackHitPoint = attackHitPoint;
        this.attackKickPoint = attackKickPoint;
    }

    public String getNama(){ return nama; }

    public int getLifepoint() { return Lifepoint; }

    public void hit(GameCharacter karB){
        karB.Lifepoint = karB.Lifepoint - this.attackHitPoint;
    }

    public void kick(GameCharacter karB){
        karB.Lifepoint = karB.Lifepoint - this.attackKickPoint;
    }
}
