import java.util.*;

public class JavaBitSet {
    public static void main(String args[]){
        BitSet bs1 = new BitSet();
        BitSet bs2 = new BitSet();

        bs1.set(0);
        bs1.set(0);
        bs1.set(1);
        bs1.set(1);

        bs2.set(4);
        bs2.set(6);
        bs2.set(5);
        bs2.set(2);
        bs2.set(2);
        bs2.set(3);

        //cardinality -> cek sum distinct number ini bit set
        System.out.println("bs1  : " + bs1.cardinality());
        System.out.println("bs2  : " + bs2.cardinality());
    }
}
