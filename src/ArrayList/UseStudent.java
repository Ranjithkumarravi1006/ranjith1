package ArrayList;
import java.util.ArrayList;
public class UseStudent {
	public static void main(String[] args) {
		Student s1 = new Student("ranjit",1,"EEE","SBC");
		Student s2 = new Student("ram",2,"ECE","PANI");
		Student s3 = new Student("kumar",3,"B TECH","GOVT");
		Student s4 = new Student("Mani",4,"EEE","SBC");
		Student s5 = new Student("Raja",5,"IT","SBC");
		Student s6 = new Student("Rajesh",6,"CIVIL","SBC");
		
		ArrayList<Student>s=new ArrayList<>();
		
		s.add(s1);
		s.add(s2);
		s.add(s3);
		s.add(s4);
		s.add(s5);
		s.add(s6);
		
		   /* String min=s.get(0).getName();
		for(int i=0;i<s.size();i++) {
			if(s.get(i).getName().length()<min.length()) {
				min=s.get(i).getName();
			}
		}
		System.out.println(min);
	}*/
	/*String min=s.get(0).getName();
	for(Student c:s) {
		if(c.getName().length()<min.length()) {
			min=c.getName();
	}
	}
	System.out.println(min);
	/*}*/
		//String a=s.get(0).getName();
		s.forEach(x->  {
			if(x.getName().startsWith("r")){System.out.println(x.getName());
			}
		});
		
		//System.out.println(a);
	
		}
	}

