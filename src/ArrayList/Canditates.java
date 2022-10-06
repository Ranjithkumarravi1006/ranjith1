package ArrayList;


public class Canditates {
	
		
		private int id;
		private String name;
		private String gender;
		private String degree;
		
		public void setId( int id) {
			this.id =id;
		}
		public int getId() {
			return id;
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getName() {
			return name;
		}
		public void setGenter(String gender) {
			this.gender=gender;
		}
		public String getGender() {
			return gender;
		}
		public void setDegree(String degree) {
			this.degree=degree;
		}
		public String getDegree() {
			return degree;
			
		}
		
		public Canditates(int  id,String name,String gender,String degree) {
			this.id=id;
			this.name=name;
			this.gender=gender;
			this.degree=degree;
		}
		public String toString () {
			return id+" "+name+" "+gender+" "+degree;
			
		
		
	}

}
