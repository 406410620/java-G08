package rpg66;

public class Player {
    //[金錢,當前位置]
	int[] x = {1000,0};
	String name;
	Role[] role = new Role[10];
	int[] roleee = new int [10];
	
	int rolecount;
	
	public Player(){
		roleee[0] = 10;
	}
	
	public Player(String name,Role role){
		
	}
	
	public void addrole(int n) {
		role[rolecount++] = new Role(n);
	}
	
}
