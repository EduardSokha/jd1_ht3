package by.htp.aggregation_composition.task3;

import by.htp.aggregation_composition.task3.entity.Area;
import by.htp.aggregation_composition.task3.entity.City;
import by.htp.aggregation_composition.task3.entity.Region;

public class Main {

	public static void main(String[] args) {

		Area baran = new Area();
		Area lach = new Area();
		Area ganc = new Area();
		Area osipov = new Area();
		Area berez = new Area();

		City baranovichi = new City("Baran", 179, baran);
		City lachovichi = new City("lachovichi", 1, lach);
		City gancevichi = new City("gancevichi", 7, ganc);
		City osipovichi = new City("osipovichi", 14, osipov);
		City bereza = new City("bereza", 9, berez);
		City zubr = new City("zubr", 23, lach);
		City terem = new City("terem", 6, ganc);

		Region brest = new Region("brest", 30, "vans");
		brest.addCity(baranovichi);
		brest.addCity(lachovichi);
		brest.addCity(bereza);

		Region gomel = new Region("gomel", 30, "gebe");
		gomel.addCity(gancevichi);
		gomel.addCity(osipovichi);

		Region grodno = new Region("grodno", 50, "va");
		grodno.addCity(zubr);
		grodno.addCity(terem);

		State belar = new State("bel");
		belar.addRegion(brest);
		belar.addRegion(gomel);
		belar.addRegion(grodno);

		System.out.println("num regions=" + belar.numRegions());

		System.out.println("total square=" + belar.square());

		System.out.println("total centers=" + belar.centers());

		System.out.println("capital-" + belar.getCapital());
	}

}
