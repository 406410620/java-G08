package rpg66;

public class Role {
	//名稱 = 等級
	//名稱 [武器,防具]
    //名稱  [血量+血量成長X等級,攻擊+攻擊成長X等級,防禦+防禦成長X等級]
	int soliderlevel=1;
	int [] soliderak = {0,0};//[有無裝備,攻擊力]
	int [] solidersp = {0,0,0};//[有無裝備,血量,防禦]
	int [] solidergrow = {100+10*soliderlevel+solidersp[1],25+2*soliderlevel+soliderak[1],30+5*soliderlevel+solidersp[2]};
	
	String name; 
	int level=1;
	int[] equipak = {0,0};//[有無裝備,攻擊力]
	int[] equipsp = {0,0,0};//[有無裝備,血量,防禦]
	int[] grow;
	
	public Role(int n) {
		if(n==0) {//戰士
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