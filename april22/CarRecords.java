package april22;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Car{
	int year;
	String make,name,plateNo;
	
	Car(String make,String name,String plateNo,int year)
	{
		this.make=make;
		this.name=name;
		this.plateNo=plateNo;
		this.year=year;
	}
}
public class CarRecords {
	public static final String FILE_PATH="C:\\Users\\Mandeep\\Desktop";
	public static ArrayList<Car> list;
	public static void main(String[] args) throws IOException {
		Scanner scr = new Scanner(System.in);
		String fileName;
		System.out.println("File name to load info: ");
		fileName = scr.next();
		
		
		list = new ArrayList<Car>();
		loadData(fileName);
		sortData();
		printData();
	}
	private static void printData() {
		for(Car car :list)
		{
			System.out.println(car.year+" "+car.make+" "+car.name+" ("+car.plateNo+")");
		}
		
	}
	private static void sortData() {
		list.sort(new Comparator<Car>() {
			public int compare(Car c1,Car c2) {
				return c1.year-c2.year;
			}
		});
		System.out.println("Dara Sorted.");
	}
	private static void loadData(String fileName) throws IOException {
		FileReader fr = new FileReader(FILE_PATH+"\\"+fileName);
		BufferedReader br = new BufferedReader(fr);
		
		String line;
		
		while((line = br.readLine())!=null)
		{
			String read[]= line.split("\t");
			list.add(new Car(read[0],read[1],read[2],Integer.parseInt(read[3])));
		}
		
		System.out.println("Data loaded.");
	}
}
