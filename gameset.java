package gamesettest;
import java.util.Random;
public class gameset {
	public static void main(String[] args) {
		int HP=0;//���a��q
		int ATK=0;//���a�ˮ`
		int ATK2=0;//�Z���ˮ`
        int ARM=0;//�@��
        
        int MHP;//�Ǫ���q
        int MATK;//�Ǫ��ˮ`
        
        int TRAP;//�����ˮ`
        Random rand = new Random();//�����H���ˮ`
        
        while(){//��b�Ǫ��γ�����l�W��
        		ATK=ATK+ATK2;//���a�˳ƪZ���ɪ��ˮ`
        	if() {//�J��p�Ǫ���(�A�]�w)
        		MHP=30;
        		MATK=10;
        		if() {//�������a
        			HP=HP-MATK;
        		}
        		if() {//���쪱�a����
        			MHP=MHP-ATK;
        		}
        		if(MHP=0){
        			//win
        		}
        	}
        	if() {//�J�촶�q�Ǫ���(�A�]�w)
        		MHP=60;
        		MATK=40;
        		if() {//�������a
        			HP=HP-MATK;
        		}
        		if(){//���쪱�a����
        			MHP=MHP-ATK;
        			}
        		if(MHP=0){
        			//win
        		}
        	}
        	if() {//�J��j�Ǫ���(�A�]�w)
        		MHP=100;
        		MATK=80;
        		if() {//�������a
        			HP=HP-MATK;
        		}
        		if() {//���쪱�a����
        			MHP=MHP-ATK;
        		}
        		if(MHP=0){
        			//win
        		}
        	}
        	if() {//��쳴����
        		int TRAP = rand.nextInt(50);
        		HP=HP-TRAP;//�����ˮ`
        	}
        }
	}
}
