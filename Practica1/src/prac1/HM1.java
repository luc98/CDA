package prac1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

//armar un hashmap que guarde un arraylist y String
	//armar hashmap()
	//

public class HM1 {
		public static void main(String[] args) {
			Persona p1=new Persona("Lucas",21);
			Persona p2=new Persona("Wilson",20);
			Persona p3=new Persona("Kevin",17);
			Persona p4=new Persona("jsv",24);
			
			HashMap <String, Persona> map = new HashMap <String,Persona> ();
			map.put("Alumno1", p1);
			map.put("Alumno1", p2);
			map.put("Alumno1", p3);
			map.put("Alumno1", p4);
			
		
	//	map.forEach(k,v)--> System.out.println("item : "+ k+"Contenido: "+v);;
			
			
			/*
			for (Entry<String, Persona> maps : map.entrySet()) {
				System.out.println("key : " + maps.getKey() + " contenido : " + maps.getValue().toString());
				System.out.println();
			}
		*/		
			}
			
		}
	
	
	
	
