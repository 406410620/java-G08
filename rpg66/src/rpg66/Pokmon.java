package rpg66;
	import java.util.Random;
	public class Pokmon {
	        int MHP;//�Ǫ���q
	        int MATK;//�Ǫ��ˮ`
	        int MDEF;
	        int n;//�Ǫ�����
	        public Pokmon(int n){
	        	this.n =n;
	        	if(n==1) {
	        		MHP=30;
	        		MATK=50;
	        		MDEF=10;
	        	}else if(n==2) {
	        		MHP=500;
	        		MATK=100;
	        		MDEF=20;
	        	}else if(n==3) {
	        		MHP=900;
	        		MATK=150;
	        		MDEF=30;
	        	}
	        }
	        
	        
}
