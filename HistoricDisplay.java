package br.com.gabriel.fatec_ipi_paoo_observer;

import java.util.LinkedList;

public class HistoricDisplay implements Observer {
	private  LinkedList<Double> temp ;
	public HistoricDisplay() {
		temp = new LinkedList<Double>();
	}
	@Override
	public void update(double t, double h, double p) {
		if(temp.size()>=10) {
			temp.remove(0);
		}
		
		temp.add(t);
		
		
		if (temp.size() == 10) {
			System.out.println("------10 ultimas temperaturas--------");
			for(Double d: temp) {
				System.out.printf("%.2f\n", d);
			}
		}
	}
	

}


