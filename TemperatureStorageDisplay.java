package br.com.gabriel.fatec_ipi_paoo_observer;

import java.util.LinkedList;

public class TemperatureStorageDisplay implements Observer {
	private  LinkedList<Double> temp ;
	private double total = 0;
	public TemperatureStorageDisplay() {
		temp = new LinkedList<Double>();
	}
	@Override
	public void update(double t, double h, double p) {
			if(temp.size()>=10) {
				temp.remove(0);
			}
			
			temp.add(t);
			
			
			
			if (temp.size() == 10) {
				for(Double d: temp) {
					total+= d;
					
				}
				System.out.println("-------Media das ultimas 10 temperaturas--------");
				System.out.printf("%.2f\n", total/10);
				total = 0;
			}
		}
	

}
