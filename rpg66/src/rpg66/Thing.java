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
			case 1://����  trap
				
				x = rand.nextInt();
				switch(x) {
					case 1:
						break;
				}
				break;
			case 2://�Ǫ�
				break;
			case 3://���ŤW��
				break;
			case 4://��o����
				break;
			case 5://��q�W��
				break;
			case 6://�����W��
				break;
			case 7://���m�W��
				break;
			case 8://�ݩʤW��
				break;
			case 9://��o�_�c
				break;
			case 10://���]
				break;
		}
		return 0;
	}
	
}