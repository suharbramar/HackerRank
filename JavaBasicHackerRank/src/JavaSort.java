import java.util.*;

class Students{
    int id;
    String fname;
    double cgpa;
    public Students(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }
}

public class JavaSort{
    //USING COMPARE LOGIC
    static final Comparator<Students> SENIORITY_ORDER =
            new Comparator<Students>() {
                public int compare(Students e1, Students e2) {
                    int flag = 0;
                       if(e1.getCgpa() < e2.getCgpa()){
                           flag = 1;
                       }else if(e1.getCgpa() > e2.getCgpa()){
                           flag = -1;
                       }else{
                           if(e1.getFname().compareTo(e2.getFname()) < 0){
                             flag = -1;
                           }else if(e1.getFname().compareTo(e2.getFname()) > 0){
                               flag = 1;
                           }else{
                               if(e1.getId() < e1.getId()){
                                   flag = -1;
                               }else{
                                   flag = 1;
                               }
                           }
                       }

                       return flag;
                }
            };
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());

        List<Students> studentList = new ArrayList<Students>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Students st = new Students(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }

        //USING COMPARE LOGIC
        //Collections.sort(studentList,SENIORITY_ORDER);

        //USING JAVA 8
        Collections.sort(studentList, Comparator.comparing(Students::getCgpa).reversed()
                .thenComparing(Students::getFname)
        .thenComparing(Students::getId));


        for(Students st: studentList){
            System.out.println(st.getFname());
        }
    }
}