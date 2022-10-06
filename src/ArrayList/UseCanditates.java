package ArrayList;

import java.util.ArrayList;

public class UseCanditates {
	public static void main(String[] args) {
		Canditates c1 = new Canditates(1,"ranjith","male","BE");
		Canditates c2 = new Canditates(2,"ram","male","BSE");
		Canditates c3 = new Canditates(3,"manju","female","EEE");
		Canditates c4 = new Canditates(4,"raj","male","EEE");
		Canditates c5 = new Canditates(5,"kavi","female","ECE");
		Canditates c6 = new Canditates(6,"rajni","male","EEE");
		ArrayList<Canditates>c = new ArrayList<>();
		c.add(c1);
		c.add(c2);
		c.add(c3);
		c.add(c4);
		c.add(c5);
		c.add(c6);
		
		System.out.println(c);
		
		/*for(int i=0;i<c.size();i++) {
			System.out.println(c.get(i));
		}*/
		/*for(Canditates i : c) {
			if(i.getGender().equalsIgnoreCase("female")) {
			System.out.println(i);*/
			}
		/*c.forEach(i->System.out.println(i));*/
		/*for(int i=0;i<c.size();i++) {
			if(c.get(i).getId()%2!=0) {
				System.out.println(c.get(i));
			}*/
		
		/*c.forEach(x-> {	
		if(x.getId()%2==0) {
			System.out.println(x);
		}
		});*/
		/*c.forEach(x-> {
			if(x.getId()%2!=0) {
				System.out.println(x);
			}*/
		
		/*ArrayList<Canditates>fc = new ArrayList<>();
		for(int j=0;j<c.size();j++) {
			if(c.get(j).getGender().equalsIgnoreCase("female")){
				fc.add(c.get(j));
				System.out.println(fc);
			}
		}*/
	

	}

		

		
		
	


