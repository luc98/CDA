package Packag;

import java.util.ArrayList;

public class Salas {
		private int[]butacas;
		private ArrayList<entradas> listaDeEntradas;
		private int[]precios;
		
		public Salas() 
		{
			listaDeEntradas= new ArrayList<entradas>();
			butacas=new int[20];
			precios= new int[3];
			precios[0]=15;
			precios[1]=20;
			precios[2]=18;
			
		
		}
		public boolean aceptarEntrada( entradas entr) {
			/*int butacasvendidas;
			if(butacasvendidas<=19) {
				
				for(int i=0 ;i<cantidad;i++) {
					butacas[i]=precio;
					
				}
				butacasvendidas=butacasvendidas + cantidad;
				return true;
			}*/
			if(listaDeEntradas.size()<20) {
				listaDeEntradas.add(entr);
				return true;
              }
			
			return false;
		}
		public int recaudacion() {
			int recaudacion=0;
			for(int i=0;i<listaDeEntradas.size();i++) {
				recaudacion= recaudacion+listaDeEntradas.get(i).getNprecio();
			}
			return recaudacion;
		}
		public String ButacasCompradasYLibres() {
			int entradasvendidas=0;
			int entradaslibres=0;
			entradasvendidas= listaDeEntradas.size();
			entradaslibres=20-entradasvendidas;
				return"entradas vendidas: "+entradasvendidas+"/ entradas libres: "+entradaslibres;
		}
		public int ButacasLibres() {
			int entradasvendidas=0;
			int entradaslibres=0;
			entradasvendidas= listaDeEntradas.size();
			entradaslibres=20-entradasvendidas;
			return entradaslibres;
		}
		
		
		

}
