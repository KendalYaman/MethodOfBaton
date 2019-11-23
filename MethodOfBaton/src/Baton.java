
public class Baton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		//Basic table
		char tableCaractere[] = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O'
				,'P','Q','R','S','T','U','V','W','X','Y','Z'};		
	    
		
		//Rotor N(x) 
		char tableNx[] = {'B','D','F','H','J','L','C','P','R','T','X','V','Z','N','Y'
				,'E','I','W','G','A','K','M','U','S','Q','O'};
		
		//Ciphertext
		char Ciphertext[] = {'H','T','X','J','X','X','O','D','K','F','K','H','M','V'
				,'N','R','L','A','R','B','Q','D','O','J','W','A','L'};
		
		//Plaintext
		char Plaintext [] = {'F','O','R','A','R','E','A','S','O','N','E','V','E'
				,'R','Y','T','H','I','N','G','H','A','P','P','E','N','S'};
		
		int pos;
		
		int k;
		for(int j = 0 ; j < 26 ; j++) {
			
			System.out.println("Position starting of: " + tableCaractere[j]);
			
			for(int i = 0 ; i < 27 ; i++) {//For Plaintext
				k = (j+i+1) % 26;
				pos = getPosition(Plaintext[i]);
				
				pos = getPosition(tableNx[(pos+k)%26] );
				
				System.out.print("-" + tableCaractere[(((pos - k)+26) % 26)]);
				
			}
			System.out.println("");
			
			for(int i = 0 ; i < 27 ; i++) {//For Ciphertext
				k = (j+i+1) % 26;
				pos = getPosition(Ciphertext[i]);
				
				pos = getPosition(tableNx[(pos+k)%26] );
				
				System.out.print("-" + tableCaractere[(((pos - k)+26) % 26)]);
				
			}
			System.out.println("");
			System.out.println("");
		}
		
		
		
		//int pos = getPosition('F');
		
		
		/*System.out.println("-> " + tableNx[pos+1]);
		pos = getPosition(tableNx[pos+1]);
		System.out.println("-> " + tableCaractere[pos-1]);
		
		
		
		
		pos = getPosition('O');
		
		
		System.out.println("-> " + tableNx[pos+2]);
		pos = getPosition(tableNx[pos+2]);
		System.out.println("-> " + tableCaractere[pos-2]);*/
		
	}
	
	static public int getPosition(char c) {
		
	int temp = (int)c;
	int temp_integer = 64; //for upper case
	return (temp-temp_integer-1);
	}
	

}
