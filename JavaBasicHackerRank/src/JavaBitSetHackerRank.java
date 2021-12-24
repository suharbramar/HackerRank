import java.util.BitSet;
import java.util.Scanner;

public class JavaBitSetHackerRank {

    BitSet b1;
    BitSet b2;

    public JavaBitSetHackerRank(int n){
        this.b1 = new BitSet(n);
        this.b2 = new BitSet(n);
    }

    public BitSet getBitSet(int chooseBitSet){
        return chooseBitSet == 1 ? this.b1 : this.b2;
    }

    public String toString(){
        return b1.cardinality()+" "+b2.cardinality();
    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        JavaBitSetHackerRank bitSet = new JavaBitSetHackerRank(n);

        int testcases = m;
        while(testcases > 0){
            String operator = input.next();
            int value_1 = input.nextInt();
            int value_2 = input.nextInt();

            switch (operator){
                case "AND" :  bitSet.getBitSet(value_1).and(bitSet.getBitSet(value_2));break;
                case "OR"  :  bitSet.getBitSet(value_1).or(bitSet.getBitSet(value_2));break;
                case "XOR" :  bitSet.getBitSet(value_1).xor(bitSet.getBitSet(value_2));break;
                case "SET" :  bitSet.getBitSet(value_1).set(value_2);break;
                case "FLIP" :  bitSet.getBitSet(value_1).flip(value_2);break;
                default: System.out.println("Wrong operator..");break;
            }
            System.out.println(bitSet);
          testcases--;
        }
    }
}
