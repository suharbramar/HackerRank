import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

class people{
    String id;
    String name;


    public people(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static people getSpecialName(people p){
        p.setName(p.getName().concat("xxx"));

        return p;
    }

    @Override
    public String toString() {
        return "people{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

public class JavaArrayList {

    public static List<people> getPeople(){
        return List.of(new people("1","a"),
                new people("2","b"),
                new people("3","c"));
    }

    public static void main(String[] args) throws IOException {
        List<people> myPeople = new ArrayList<>(getPeople());
        myPeople.forEach(System.out::println);
      //  myPeople.stream().filter(x -> x.getName().equalsIgnoreCase("a")).map(p -> people.getSpecialName(p)).forEach(System.out::println);

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String firstLineInput = bufferedReader.readLine().replaceAll("\\s+$", "");

        int n = Integer.parseInt(firstLineInput);

        ArrayList<List<Integer>> listInt = new ArrayList<>();
        for(int i =0 ; i < n; i++){
            List<Integer> dataInt = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());
            listInt.addAll(i, Collections.singleton(dataInt));
        }

        String secondLineInput = bufferedReader.readLine().replaceAll("\\s+$", "");

        int lengthQuery = Integer.parseInt(secondLineInput);
        int q1;
        int q2;

        String output;
        String a[];

        List<String> result = new ArrayList<>();
        for(int i =0 ; i < lengthQuery; i++){
            try{
                a = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                q1 = Integer.parseInt(a[0]);
                q2 = Integer.parseInt(a[1]);

                output = String.valueOf(listInt.get(q1 - 1).get(q2));

                result.add(output);
            }catch(IndexOutOfBoundsException e){
                result.add("ERROR!");
            }
        }
        result.forEach(System.out::println);
    }
}
