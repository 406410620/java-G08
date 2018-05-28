package rpg66;

import java.util.Random;

public class Thing {
	int n=0;
	Random rand = new Random();
	public Thing() {
		
		
		
	}
	
	public int choose(int n) {
		int x=0;
		switch(n) {
			case 1://陷阱  trap
				
				x = rand.nextInt();
				switch(x) {
					case 1:
						break;
				}
				break;
			case 2://怪物
				break;
			case 3://等級上升
				break;
			case 4://獲得金錢
				break;
			case 5://血量上升
				break;
			case 6://攻擊上升
				break;
			case 7://防禦上升
				break;
			case 8://屬性上升
				break;
			case 9://獲得寶箱
				break;
			case 10://旅館
				break;
		}
		return 0;
	}
	
}