package SoDt;
import java.util.*;
public class IntlPhoneNumber extends PhoneNumber implements SDT{
	private int maquocgia;
	public IntlPhoneNumber(int maquocgia,int mavung,int sdtnoivung){
		super(mavung,sdtnoivung);
		this.maquocgia=maquocgia;
	}
	public void setmaquocgia(int maquocgia){
		this.maquocgia=maquocgia;
	}
	public int getmaquocgia(){
		return this.maquocgia;
	}
	@Override 
	public String getSDT(){
		return Integer.toString(this.maquocgia)+'-'+Integer.toString(super.getmavung())+'-'+Integer.toString(super.getsdtnoivung());
	}
	@Override
	public String toString(){
		return getSDT();
	}
}