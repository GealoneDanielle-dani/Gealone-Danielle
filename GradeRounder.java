public class GradeRounder {
    public static void main(String[] args) {
        double rawGrade = 89.66;

        int castedGrade = (int) rawGrade;

        System.out.println("Original double grade: " + rawGrade);
        System.out.println("casted int grade: " + castedGrade);
    }
}