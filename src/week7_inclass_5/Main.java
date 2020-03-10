package week7_inclass_5;

public class Main {

    public static void main(String[] args) {
	Package package1 = new Package(32, 'T');
	InsuredPackage insured_package1 = new InsuredPackage(32, 'T');
	package1.print_details();
	System.out.println("");
	insured_package1.print_details();
    }
}
