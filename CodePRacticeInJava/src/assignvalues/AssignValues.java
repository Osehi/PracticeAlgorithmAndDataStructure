package assignvalues;

public class AssignValues {
    public static void main(String[] args) {
        String month = "June";
        changeString(month);
        System.out.println("The value of month is "+ month);
    }

    static void changeString(String monthone){
        String newMonth = "April";
        newMonth = monthone;
    }
}
