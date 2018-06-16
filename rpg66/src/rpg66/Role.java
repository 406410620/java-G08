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
	int n;
	
	public Role(int n) {
		this.n = n;
		if(n==0) {//戰士
			name = "Soldier";
			grow = new int[]{100+10*soliderlevel+equipsp[1],25+2*soliderlevel+equipak[1],30+5*soliderlevel+equipsp[2]};
		}
		if(n==1) {//法師
			name = "warlock";
			grow = new int[]{50+2*level+equipsp[1],50+5*level+equipak[1],10+1*level+equipsp[2]};
		}
		
		if(n==2) {//坦克
			name = "\r\n" + 
					"Tank";
			grow = new int[]{150+15*level+equipsp[1],10+1*level+equipak[1],40+10*level+equipsp[2]};
		}
	}
	
	
	
	public void levelup() {
		level++;
		if(n==0) {//戰士
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