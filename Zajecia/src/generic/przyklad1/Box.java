package generic.przyklad1;

public class Box<Osa extends Zwierze> {

    Osa objectT;

    public Osa getT() { return objectT;}
    public void setT(Osa t) { this.objectT=t;}
}
