package gamesettest;
import java.util.Random;
public class gameset {
	public static void main(String[] args) {
		int HP=0;//玩家血量
		int ATK=0;//玩家傷害
		int ATK2=0;//武器傷害
        int ARM=0;//護甲
        
        int MHP;//怪物血量
        int MATK;//怪物傷害
        
        int TRAP;//陷阱傷害
        Random rand = new Random();//陷阱隨機傷害
        
        while(){//踩在怪物或陷阱格子上時
        		ATK=ATK+ATK2;//玩家裝備武器時的傷害
        	if() {//遇到小怪物時(再設定)
        		MHP=30;
        		MATK=10;
        		if() {//攻擊玩家
        			HP=HP-MATK;
        		}
        		if() {//受到玩家攻擊
        			MHP=MHP-ATK;
        		}
        		if(MHP=0){
        			//win
        		}
        	}
        	if() {//遇到普通怪物時(再設定)
        		MHP=60;
        		MATK=40;
        		if() {//攻擊玩家
        			HP=HP-MATK;
        		}
        		if(){//受到玩家攻擊
        			MHP=MHP-ATK;
        			}
        		if(MHP=0){
        			//win
        		}
        	}
        	if() {//遇到強怪物時(再設定)
        		MHP=100;
        		MATK=80;
        		if() {//攻擊玩家
        			HP=HP-MATK;
        		}
        		if() {//受到玩家攻擊
        			MHP=MHP-ATK;
        		}
        		if(MHP=0){
        			//win
        		}
        	}
        	if() {//踩到陷阱時
        		int TRAP = rand.nextInt(50);
        		HP=HP-TRAP;//陷阱傷害
        	}
        }
	}
}
