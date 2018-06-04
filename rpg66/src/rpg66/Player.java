package rpg66;

public class Player {
    //[金錢,當前位置]
	int[] x = {1000,1};
	String name;
	Role[] role = new Role[10];
	int[] rolec = new int [10];
	
	int rolecount;
	
	public Player(){
		rolec[0] = 10;
	}
	
	public Player(String name){
		
	}
	
	public void addrole(int n) {
		role[rolecount++] = new Role(n);
	}
	
	
}
