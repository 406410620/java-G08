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
	
	public Role(int n) {
		if(n==0) {//�Ԥh
			grow = new int[]{100+10*soliderlevel+equipsp[1],25+2*soliderlevel+equipak[1],30+5*soliderlevel+equipsp[2]};
		}
		if(n==1) {
			
		}
		
		if(n==2) {
			
		}
	}
	
	public void levelup() {
		level++;
	}
	
}