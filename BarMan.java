package mojitos;

import java.util.ArrayList;

public class BarMan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Mojito> mojitos = new ArrayList<Mojito>();
		//float lima, float lima_natural, float sucre, float gaseosa,float menta, float ron
		Mojito m1 = new Mojito(0.015, 0.25, 1.0, 0.03, 4.0, 0.05);
		m1.setPoints(9);
		Mojito m2= new Mojito(0.025, 0.5, 1.0, 0.03, 4.0, 0.07);
		m2.setPoints(7);
		Mojito m3 = new Mojito(0.05, 0.05, 1.0, 0.03, 4.0, 0.05);
		m3.setPoints(5);
		mojitos.add(m1);
		mojitos.add(m2);
		mojitos.add(m3);
		Mojito perfect = perfectMojito(mojitos);
		perfect.print();
	}
	
	public static Mojito perfectMojito(ArrayList<Mojito> array){
		Mojito m = new Mojito(0, 0, 0, 0, 0, 0);
		double p_ron=0, p_gaseosa=0, p_lima=0, p_lima_natural=0, p_sucre=0, p_menta=0 ;
		for (int i=0; i<array.size(); i++){
			int points = array.get(i).getPoints();
			p_ron+=((array.get(i).getRon()*points)/10);
			p_gaseosa+=((array.get(i).getGaseosa())*points/10);
			p_lima=((array.get(i).getLima()*points)/10);
			p_lima_natural=((array.get(i).getLima_natural()*points)/10);
			p_sucre=((array.get(i).getSucre()*points)/10);
			p_menta=((array.get(i).getMenta()*points)/10);
		}
		p_ron= p_ron/array.size();
		m.setRon(p_ron);
		p_gaseosa= p_gaseosa/array.size();
		m.setGaseosa(p_gaseosa);
		p_lima= p_lima/array.size();
		m.setLima(p_lima);
		p_lima_natural= p_lima_natural/array.size();
		m.setLima_natural(p_lima_natural);
		p_sucre= p_sucre/array.size();
		m.setSucre(p_sucre);
		p_menta= p_menta/array.size();
		m.setMenta(p_menta);
		return m;
	}

}
