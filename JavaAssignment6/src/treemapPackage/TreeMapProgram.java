package treemapPackage;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import treemapPackage.Contact;
import treemapPackage.Contact.Gender;
public class TreeMapProgram {

	public static void main(String[] args) {
		Long key1=Long.valueOf(897799999);
		Long key2=Long.valueOf(657686935);
		Long key3=Long.valueOf(889353258);
		Long key4=Long.valueOf(908565654);
		Contact c1=new Contact((long)897799999,"mohan", "mohan@gmail",Gender.valueOf("male"));
		Contact c2=new Contact((long)657686935,"shyam", "sm@gmail",Gender.valueOf("male"));
		Contact c3=new Contact((long)889353258,"radha", "rd@gmail",Gender.valueOf("female"));
		Contact c4=new Contact((long)908565654,"laxmi", "lx@gmail",Gender.valueOf("female"));
		Map<Long,Contact> map=new TreeMap<>(Collections.reverseOrder());
		map.put(key1, c1);
		map.put(key2, c2);
		map.put(key3, c3);
		map.put(key4, c4);
		Set<Entry<Long,Contact>> entrySet =map.entrySet();
		Iterator<Entry<Long,Contact>> iterator = entrySet.iterator();
		while(iterator.hasNext())
		{
			Map.Entry<Long,Contact> entry = (Map.Entry<Long, Contact>)iterator.next();
			Long k= entry.getKey();
			Contact c = entry.getValue();
			System.out.println(k);
			System.out.println(c);
		}
		
	}
	
}