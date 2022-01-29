package collectionframework;

import java.util.ArrayList;

public class Marksheet extends Marksheettest {
	public static void main(String[] args) {
		ArrayList I = new ArrayList();
		Marksheet m1 = new Marksheet();
		I.add(m1);
		Marksheet m2 = new Marksheet();
		I.add(m2);
		I.contains(m2);
		I.remove(m2);
		
		Object o = null;
		if (o==null) {
			return;
		}
		if (!(o instanceof Marksheet )) return;{
			
		}
		Marksheet other = (Marksheet) o;
		return this.getRollno().equals(other.getRollno());
		
		public int {
			return Rollno.hashcode();
		}
	}
	
}
