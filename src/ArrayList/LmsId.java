package ArrayList;

import java.util.ArrayList;

public class LmsId {
	public static void main(String[] args) {
		ArrayList<Integer>id = new ArrayList<>();
		id.add(875);
		id.add(645);
		id.add(653);
		id.add(877);
		id.add(878);
		id.set(2, 777);
		id.add(555);
		System.out.println(id.remove(4));
		////System.out.println(id);
		//System.out.println(id.get(4));
		//System.out.println(id.size());
		
	
	/*for (int i=0;i<id.size();i++) {
		System.out.println(id.get(i));
	}*/
		/*for(Integer i :id) {
			System.out.println(i);
			
		}*/
		/*id.forEach(i->System.out.println(i));*/

}
}
