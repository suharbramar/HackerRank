public class JavaRemoveSpace {
    public static void main(String args[]){
        String s = "   budi santoso   ";
        String result = s.replaceAll("\\s+$", "");
        System.out.println(s);
        System.out.println(result.trim());
    }
}
