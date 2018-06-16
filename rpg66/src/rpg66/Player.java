package rpg66;

public class Player {
    //[金錢,當前位置]
	int[] x = {1000,1};
	String name;
	Role[] role = new Role[10];
	//int[] rolec = new int [10];
	int rolecount;
	
	public Player(){
		addrole(0);
	}
	
	public Player(String name){
		this.name = name;
		addrole(0);
	}
	
	public void addrole(int n) {
		role[rolecount] = new Role(n);
		rolecount++;
	}
}
