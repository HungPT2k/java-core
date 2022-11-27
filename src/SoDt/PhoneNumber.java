package SoDt;
import java.util.*;
public class PhoneNumber implements Comparable<PhoneNumber>{
	private int mavung,sdtnoivung;
	public PhoneNumber(){

	}
	public PhoneNumber(int mavung,int sdtnoivung){
		this.mavung=mavung;
		this.sdtnoivung=sdtnoivung;
	}
	public void setmavung(int mavung){
		this.mavung=mavung;
	}
	public int getmavung(){
		return this.mavung;
	}
	public void setsdtnoivung(int sdtnoivung){
		this.sdtnoivung=sdtnoivung;
	}
	public int getsdtnoivung(){
		return this.sdtnoivung;
	}
	public String toString(){
		return "0"+Integer.toString(this.mavung)+'-'+Integer.toString(this.sdtnoivung);
	}
	@Override
	public int compareTo(PhoneNumber o){
		if(this.sdtnoivung>o.getsdtnoivung()){
			return 1;
		}
		else{
			return -1;
		}
	}
}