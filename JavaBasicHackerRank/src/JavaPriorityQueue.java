import java.util.*;

class MyStudent{
    private int id;
    private String name;
    private double cgpa;

    public MyStudent(int id, String name, double cgpa){
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

}

class Priorities{

    public List<MyStudent> getStudents(List<String> evt){

        List<MyStudent> myList = new ArrayList<>();
        PriorityQueue<MyStudent> pq = new
                PriorityQueue<MyStudent>(new StudentComparator());

        for(String input : evt){
            try{
                String[] data = new String[4];
                data = input.split("\\s");
                if(data.length>1)
                {
                    String nama = data[1];
                    double cgpa = Double.parseDouble(data[2]);
                    int id = Integer.parseInt(data[3]);

                    pq.add(new MyStudent(id, nama, cgpa));
                }
                else
                {
                    pq.poll();
                }

            }catch(NullPointerException e){
                continue;
            }

        }

        while(!pq.isEmpty()){
            myList.add(pq.poll());
        }


        return myList;
    }

}

class StudentComparator implements Comparator<MyStudent>{
    // Overriding compare()method of Comparator
    // for descending order of cgpa
    public int compare(MyStudent s1, MyStudent s2) {
        if(s1.getCgpa() == s2.getCgpa())
        {
            if(s1.getName().compareTo(s2.getName()) == 0)
            {
                if(s1.getId() == s2.getId())
                    return 0;
                else if (s1.getId() > s2.getId())
                    return 1;
                else
                    return -1;
            }
            else
                return s1.getName().compareTo(s2.getName());
        }
        else if(s1.getCgpa() > s2.getCgpa()){
            return -1;
        }else{
            return 1;
        }
    }

}

public class JavaPriorityQueue {

        private final static Scanner scan = new Scanner(System.in);
        private final static Priorities priorities = new Priorities();

        public static void main(String[] args) {
            int totalEvents = Integer.parseInt(scan.nextLine());
            List<String> events = new ArrayList<>();


            while (totalEvents-- > 0) {
                String event = scan.nextLine();
                events.add(event);
            }


            List<MyStudent> students = priorities.getStudents(events);

            if (students.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                for (MyStudent st: students) {
                    System.out.println(st.getName());
                }
            }
        }


}
