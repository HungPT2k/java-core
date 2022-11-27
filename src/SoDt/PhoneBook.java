package SoDt;
import java.util.*;
import java.util.Collections;
public class PhoneBook implements ChucNang{
	private final List<PhoneNumber> list;
    private Scanner sc=new Scanner(System.in);
    public PhoneBook(){
    	list =new ArrayList<>();
    }
    @Override
	public void them(PhoneNumber o){
		this.list.add(o);

	}
	@Override
	public void timtheomavung(){
		System.out.print("Nhap ma vung:");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getmavung()==n){
				System.out.println(list.get(i));
			}
		}
	}
	@Override
	public void lietketrongnuoc(){
		System.out.println("Cac so dien thoai trong nuoc la:");
		for(int i=0;i<list.size();i++){
			String st=list.get(i).toString();
			if(st.charAt(0)=='0'){
				System.out.println(st);
			}
		}
	}
	@Override
	public void lietkequocte(){
		System.out.println("Cac so dien thoai quoc te la:");
		for(int i=0;i<list.size();i++){
			String st=list.get(i).toString();
			if(st.charAt(0)!='0'){
				System.out.println(st);
			}
		}
	}
	@Override
	public void lietke(){
		System.out.println("Cac so dien thoai la:");
		for(int i=0;i<list.size();i++){
			
				System.out.println(list.get(i));
			
		}
	}
	@Override
	public void tinhtongtheovung(){
		long tong=0;
		System.out.print("Nhap ma vung:");
		int n=sc.nextInt();
		sc.nextLine();
		for(int i=0;i<list.size();i++){
			if(list.get(i).getmavung()==n){
				tong=tong+list.get(i).getsdtnoivung();
			}
		}
		System.out.print("Tong so dien thoai cua vung la: "+tong);
		System.out.println();
	}
	@Override
	public void timtheoduoi(){
		System.out.print("Nhap duoi sdt can tim:");
		String s=sc.nextLine();
		System.out.println("Cac so dien thoai can tim la:");
		for(int i=0;i<list.size();i++){
			String st=Integer.toString(list.get(i).getsdtnoivung());
			if(st.endsWith(s)){
				System.out.println(list.get(i));
			}
		}
	}
	@Override
	public void sapxep(){
		System.out.println("Cac so dien thoai sau khi duoc sap xep la:");
		Collections.sort(list);
		for(int i=0;i<list.size();i++){
			
				System.out.println(list.get(i));
			
		}
	}
}