package rpg66;

import java.util.Random;

import javax.swing.JFrame;

public class Thing {
	int n=0;
	int[] x = new int[110];
	Random rand = new Random();
	Buyrole y = new Buyrole();
	Boolean rolestore=false;
	int pn;
	Pokmon pokmon = new Pokmon(pn);	
	public Thing() {
		x[109]=12;
		for(int i=0;i<20;i++) {
			if(x[i]==0) {
				x[i]=rand.nextInt(9)+3;
			}
		}
		for(int i=20;i<110;i++) {
			if(x[i]==0) {
				x[i]=rand.nextInt(11)+1;
			}
		}
	}
	
	public int choose(Player player) {
		n=x[player.x[1]-1];
		rolestore=false;
		upsixsixdata updata = new upsixsixdata();
		switch(n) {
			case 1://����  trap
				switch(rand.nextInt(3)+1) {
					case 1://���^��
						player.x[1]-=rand.nextInt(3)+1;
						break;
					case 2://-hp
						for(int i=0;i<player.rolecount;i++) {
							player.role[i].grow[0]-=rand.nextInt(15)+1;
						}
						break;
					case 3:
						player.x[1]=1;//�^����I
						break;
				}
				break;
			case 2://�Ǫ�
				pn = rand.nextInt(101)+1;
				if(pn<=70) {
					pn=1;
				}else if(pn<=100){
					pn=2;
				}else {
					pn=3;
				}
				pokmon = new Pokmon(pn);	
				while(true) {
					for(int i=0;i<player.rolecount;i++) {
						pokmon.MHP-=player.role[i].grow[1]-pokmon.MDEF;
					}
					if(pokmon.MHP<=0) {
						System.out.print("win p");
						break;
					}
					if(player.role[player.rolecount-1].grow[0]>0) {
						player.role[player.rolecount-1].grow[0]-=pokmon.MATK-player.role[player.rolecount-1].grow[2];
					}
					if(player.role[player.rolecount-1].grow[0]<=0) {
						player.rolecount--;
					}
					if(player.role[0].grow[0]<=0) {
						System.out.print("lose p");
						//player.x[1]=1;
						break;
					}
				}
				break;
			case 3://���ŤW��
				for(int i=0;i<player.rolecount;i++) {
					player.role[i].levelup();
				}
				break;
			case 4://��o����
				player.x[0]+=rand.nextInt(1000)+1000;
				try {
                    updata.money_update(player.x[0]);
                } catch (ClassNotFoundException e) {

                    e.printStackTrace();
                }
				break;
			case 5://��q�W��
				for(int i=0;i<player.rolecount;i++) {
					player.role[i].grow[0]+=rand.nextInt(10)+1;
				}
				break;
			case 6://�����W��
				for(int i=0;i<player.rolecount;i++) {
					player.role[i].grow[1]+=rand.nextInt(6)+1;
				}
				break;
			case 7://���m�W��
				for(int i=0;i<player.rolecount;i++) {
					player.role[i].grow[2]+=rand.nextInt(4)+1;
				}
				break;
			case 8://�ݩʤW�ɡA3�ӳ��W��
				for(int i=0;i<player.rolecount;i++) {
					player.role[i].grow[0]+=5;
					player.role[i].grow[1]+=3;
					player.role[i].grow[2]+=2;
				}
				break;
			case 9://��o�_�c
				switch(rand.nextInt(8)+1) {
					case 1://����
						switch(rand.nextInt(3)+1) {
						case 1://���^��
							player.x[1]-=rand.nextInt(3)+1;
							break;
						case 2://-hp
							for(int i=0;i<player.rolecount;i++) {
								player.role[i].grow[0]-=rand.nextInt(15)+1;
							}
							break;
						case 3://�^���I
							player.x[1]=1;
							break;
						}
						break;
					case 2://�Ǫ�
						pn = rand.nextInt(2)+1;
						pokmon = new Pokmon(pn);	
						while(true) {
							for(int i=0;i<player.rolecount;i++) {
								pokmon.MHP-=player.role[i].grow[1]-pokmon.MDEF;
							}
							if(pokmon.MHP<=0) {
								System.out.print("win p");
								break;
							}
							if(player.role[player.rolecount-1].grow[0]>0) {
								player.role[player.rolecount-1].grow[0]-=pokmon.MATK-player.role[player.rolecount-1].grow[2];
							}
							if(player.role[player.rolecount-1].grow[0]<=0) {
								player.rolecount--;
							}
							if(player.role[0].grow[0]<=0) {
								System.out.print("lose p");
								//player.x[1]=1;
								break;
							}
						}
						break;
					case 3://levelup
						for(int i=0;i<player.rolecount;i++) {
							player.role[i].levelup();
						}
						break;
					case 4://��o����
						player.x[0]+=rand.nextInt(1000)+1000;
						try {
		                    updata.money_update(player.x[0]);
		                } catch (ClassNotFoundException e) {

		                    e.printStackTrace();
		                }
						break;
					case 5://��q�W��
						for(int i=0;i<player.rolecount;i++) {
							player.role[i].grow[0]+=rand.nextInt(10)+1;
						}
						break;
					case 6://�����W��
						for(int i=0;i<player.rolecount;i++) {
							player.role[i].grow[1]+=rand.nextInt(6)+1;
						}
						break;
					case 7://���m�W��
						for(int i=0;i<player.rolecount;i++) {
							player.role[i].grow[2]+=rand.nextInt(4)+1;
						}
						break;
					case 8://�ݩʤW�ɡA3�ӳ��W��
						for(int i=0;i<player.rolecount;i++) {
							player.role[i].grow[0]+=5;
							player.role[i].grow[1]+=3;
							player.role[i].grow[2]+=2;
						}
						break;
				}
				break;
			case 10://���]
				for(int i=0;i<player.rolecount;i++) {
					player.role[i].grow[0]+=player.role[i].grow[0]*0.25;
				}
				break;
			case 11://�R����
				rolestore=true;
				break;
			case 12:
				pn=3;
				pokmon = new Pokmon(pn);	
				while(true) {
					for(int i=0;i<player.rolecount;i++) {
						pokmon.MHP-=player.role[i].grow[1]-pokmon.MDEF;
					}
					if(pokmon.MHP<=0) {
						System.out.print("win p");
						break;
					}
					if(player.role[player.rolecount-1].grow[0]>0) {
						player.role[player.rolecount-1].grow[0]-=pokmon.MATK-player.role[player.rolecount-1].grow[2];
					}
					if(player.role[player.rolecount-1].grow[0]<=0) {
						player.rolecount--;
					}
					if(player.role[0].grow[0]<=0) {
						System.out.print("lose p");
						//player.x[1]=1;
						break;
					}
				}
				break;
		}
		return 0;
	}
	
}