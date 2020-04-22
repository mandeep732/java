package april22;

import java.io.*;
import java.util.*;

class Info{
	int sno;
	String fname,lname;
	String phone, email,address;
	
	Info(String fname,String lname,String ph,String email,String address)
	{
		this.fname=fname;
		this.lname=lname;
		this.phone=ph;
		this.email=email;
		this.address=address;
	}
}

public class AddressBook {
	static final int LIMIT=1000;
	static final String FILE_PATH = "C:\\Users\\Mandeep\\Desktop\\address.txt";
	static Scanner scr;
	static ArrayList<Info> list;
	public static void main(String arg[]) throws Exception {
		scr = new Scanner(System.in);
		list = new ArrayList<>();
		
		loadFromFile();
		while(true)
		{
			System.out.println("_______________________________________________");
			System.out.println("\t\tAddress Book");
			System.out.println("0.Save and quit");
			System.out.println("1.Show address");
			System.out.println("2.Add new address");
			System.out.println("3.Remove address");
			System.out.println("4.Edit existing address");
			System.out.println("5.Search address");
						
			System.out.println("Enter operation no.:");
			
			int operation = scr.nextInt();
			switch(operation) {
			case 0: 
				saveToFile();
				System.exit(0);
				break;
			case 1: showAddress();
				break;
			case 2: addAddress();
				break;
			case 3: removeAddress();
				break;
			case 4: editAddress();
				break;
			case 5: searchAddress();
				break;
			default : System.out.println("Invalid opeartion");
			}
			System.out.println("_______________________________________________");
		}
	}
	public static void loadFromFile() throws Exception{
		FileReader fr = new FileReader(FILE_PATH);
		BufferedReader br = new BufferedReader(fr);
		String line ;
		while((line =br.readLine())!=null)
		{
			String data[]= line.split("\t");
			Info info = new Info(data[0],data[1],data[2],data[3],data[4]);
			list.add(info);
		}
		fr.close();
	}
	
	public static void saveToFile() throws Exception
	{
		FileWriter fw = new FileWriter(FILE_PATH);
		for(Info info: list)
		{
			String str = info.fname+"\t"+info.lname+"\t"+info.phone+"\t"+info.email+"\t"+info.address+"\n";
			fw.write(str);
		}
		fw.close();
		System.out.println("Data save successfully!");
	}
	
	private static ArrayList<Info> searchAddress() {
		System.out.println("1.Firstname\t2.Lastname\t3.Phone no.\t4.Email\t5.Addrees");
		System.out.println("Enter operation no. to search:");
		int operation = scr.nextInt();
		System.out.println("Enter pattern : ");
		String pattern = scr.next();
		
		ArrayList<Info> result = new ArrayList<>();
		switch(operation)
		{
		case 1:
			for(Info info: list)
			{
				if(info.fname.contains(pattern))
				{
					printInfo(info);
					result.add(info);
				}
			}
			break;
		case 2:
			for(Info info: list)
			{
				if(info.lname.contains(pattern))
				{
					printInfo(info);
					result.add(info);
				}
			}
			break;
		case 3:
			for(Info info: list)
			{
				if(info.phone.contains(pattern))
				{
					printInfo(info);
					result.add(info);
				}
			}
			break;
		case 4:
			for(Info info: list)
			{
				if(info.email.contains(pattern))
				{
					printInfo(info);
					result.add(info);
				}
			}
		case 5:
			for(Info info: list)
			{
				if(info.address.contains(pattern))
				{
					printInfo(info);
					result.add(info);
				}
			}
			
			break;
		default :System.out.println("Invalid operation");
			
		}
		
		return result;
	}
	private static void editAddress() {
		System.out.println("Search address to edit");
		ArrayList<Info> result = searchAddress();
		int resultSize = result.size();
		System.out.println("Did you went to edit "+resultSize+" addresses ?(y/n)");
		char c = scr.next().charAt(0);
		
		Info info,r;
		if(c=='y') {
			for(int i=0;i<list.size();i++)
			{
				info = list.get(i);
				for(int j=0;j<result.size();j++)
				{
					;
					r= result.get(j);
					if(r.fname.equals(info.fname) &&
							r.lname.equals(info.lname) &&
							r.phone.equals(info.phone) &&
							r.email.equals(info.email) &&
							r.address.equals(info.address)
							)
					{
						printInfo(r);
						int operation =-1;
						while(operation!=0)
						{
							System.out.println();
							System.out.println("Edit the following");
							System.out.println("0.exit\t1.Firstname\t2.Lastname\t3.Phone no.\t4.Email\t5.Addrees");
							System.out.println("Enter operation no. to edit:");
							operation = scr.nextInt();
							scr.nextLine();
							if(operation!=0)
							System.out.println("Enter new value : ");
							String str = scr.nextLine();
							switch(operation)
							{
							case 1 :
								info.fname=str;
								break;
							case 2 :
								info.lname=str;
								break;
							case 3 :
								info.phone=str;
								break;
							case 4 :
								info.email=str;
								break;
							case 5 :
								info.email=str;
								break;
							case 0 :
								operation=0;
								break;
							default: System.out.println("Invalid operation!");
							}
						}
						result.remove(j);
					}
				}
			}
		}
		
		
	}
	private static void removeAddress() {
		System.out.println("Search address to remove ");
		ArrayList<Info> result = searchAddress();
		int resultSize = result.size();
		System.out.println("Did you went to delete "+resultSize+" addresses ?(y/n)");
		char c = scr.next().charAt(0);
		
		Info info,r;
		if(c=='y')
		{
			for(int i=0;i<list.size();i++)
			{
				info = list.get(i);
				for(int j=0;j<result.size();j++)
				{
					r= result.get(j);
					if(r.fname.equals(info.fname) &&
							r.lname.equals(info.lname) &&
							r.phone.equals(info.phone) &&
							r.email.equals(info.email) &&
							r.address.equals(info.address)
							)
					{
						list.remove(i);
						result.remove(j);
					}
				}
			}
		}
		
		System.out.println(resultSize+" addresses removed succesfully!");
		
	}
	private static void addAddress() throws Exception {
		scr = new Scanner(System.in);
		
		String fname,lname,phone,email,address;
		System.out.println("Add new address");
		System.out.println("First name: ");
		fname = scr.nextLine();
		System.out.println("Last name: ");
		lname= scr.nextLine();
		System.out.println("phone no.: ");
		phone = scr.nextLine();
		System.out.println("email address: ");
		email= scr.nextLine();
		System.out.println("address: ");
		address=scr.nextLine();
		
		Info info = new Info(fname,lname,phone,email,address);
		list.add(info);
		System.out.println("Address is added to addressBook");
	}
	private static void showAddress() {
		System.out.println("1.Firstname\t2.Lastname\t3.Phone no.\t4.Email\t5.Addrees");
		System.out.println("Enter sort by:");
		
		int operation = scr.nextInt();
		switch(operation)
		{
		case 1:
			list.sort(new Comparator<Info>() {

				@Override
				public int compare(Info o1, Info o2) {
					return o1.fname.compareTo(o2.lname);
				}
				
			});
			break;
		case 2:
			list.sort(new Comparator<Info>() {

				@Override
				public int compare(Info o1, Info o2) {
					return o1.lname.compareTo(o2.lname);
				}
				
			});
			break;
		case 3:
			list.sort(new Comparator<Info>() {

				@Override
				public int compare(Info o1, Info o2) {
					return o1.phone.compareTo(o2.phone);
				}
				
			});
			break;
		case 4:
			list.sort(new Comparator<Info>() {
				@Override
				public int compare(Info o1, Info o2) {
					return o1.email.compareTo(o2.email);
				}
			});
			break;
		case 5:
			list.sort(new Comparator<Info>() {

				@Override
				public int compare(Info o1, Info o2) {
					return o1.address.compareTo(o2.address);
				}
				
			});
			break;
		default :System.out.println("Invalid operation");
		}
		
		for(Info info: list)
		{
			printInfo(info);
		}
		System.out.println("+--------------------------------------+");
	}
	
	public static void printInfo(Info info)
	{
		System.out.println("+--------------------------------------+");
		System.out.println("Name : "+info.fname+" "+info.lname);
		System.out.println("Phone no. :"+info.phone);
		System.out.println("Email :"+info.email);
		System.out.println("Address :"+info.address);
	}
}
