public class FullNameBuilder {
    public static void main(String[] args) {
        String firstName = "Danielle";
        String middleInitial = "F";
        String lastName = "Gealone";

        String fullname = firstName + " " + middleInitial + ". " + lastName;
        int letterCount = firstName.length() + middleInitial.length() + lastName.length();

        System.out.println("Full Name: " + fullname);
        System.out.println(fullname + " has " + letterCount + " letters in her full name.");
    }
}
