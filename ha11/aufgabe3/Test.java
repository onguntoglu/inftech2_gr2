public class Test {
    public static void main(String[] args) {
		// read the students
		String file = "studenten.dat";
		Student[] student = Parser.readStudenten(file);
	
		AVLTree<Student> baum = new AVLTree<Student>(); 
		for(int i = 0; i<student.length; i++){
			baum.insert(student[i].matnr, student[i]);
		}
	
		baum.print();
		
		System.out.println("Delete student with Matr.No." + student[3].matnr);
		baum.delete(student[3].matnr);
		baum.print();
		System.out.println("Delete student with Matr.No." + student[5].matnr);
		baum.delete(student[5].matnr);
		baum.print();
		// try to delete student that doesn't exists in the tree
		System.out.println("Delete student with Matr.No. 111111: \n");
		baum.delete(111111);
		baum.print();
	}
}
