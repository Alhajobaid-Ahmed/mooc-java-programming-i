
public class Cube {
    private int hxn;
    
    public Cube (int edgeL) {
        this.hxn = edgeL;
    }
    
    public int volume() {
        return this.hxn *this.hxn * this.hxn;
    }
    
    @Override
    public String toString() {
        return "The length of the edge is " + this.hxn + " and the volume " + volume() ;
    }
}
