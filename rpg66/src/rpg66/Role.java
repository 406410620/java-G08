package rpg66;

public class Role {
	//�W�� = ����
	//�W�� [�Z��,����]
    //�W��  [��q+��q����X����,����+��������X����,���m+���m����X����]
	int soliderlevel=1;
	int [] soliderak = {0,0};//[���L�˳�,�����O]
	int [] solidersp = {0,0,0};//[���L�˳�,��q,���m]
	int [] solidergrow = {100+10*soliderlevel+solidersp[1],25+2*soliderlevel+soliderak[1],30+5*soliderlevel+solidersp[2]};
	
	String name; 
	int level=1;
	int[] equipak = {0,0};//[���L�˳�,�����O]
	int[] equipsp = {0,0,0};//[���L�˳�,��q,���m]
	int[] grow;
	int n;
	
	public Role(int n) {
		this.n = n;
		if(n==0) {//�Ԥh
			name = "Soldier";
			grow = new int[]{100+10*soliderlevel+equipsp[1],25+2*soliderlevel+equipak[1],30+5*soliderlevel+equipsp[2]};
		}
		if(n==1) {//�k�v
			name = "warlock";
			grow = new int[]{50+2*level+equipsp[1],50+5*level+equipak[1],10+1*level+equipsp[2]};
		}
		
		if(n==2) {//�Z�J
			name = "\r\n" + 
					"Tank";
			grow = new int[]{150+15*level+equipsp[1],10+1*level+equipak[1],40+10*level+equipsp[2]};
		}
	}
	
	
	
	public void levelup() {
		level++;
		if(n==0) {//�Ԥh
			grow[0]+=10;
			grow[1]+=2;
			grow[2]+=5;
		}
		if(n==1) {
			grow[0]+=2;
			grow[1]+=5;
			grow[2]+=1;
		}
		
		if(n==2) {
			grow[0]+=15;
			grow[1]+=1;
			grow[2]+=10;
		}
	}
	
}