package com.kodewala.array;

public class GamingPC {
		
		int installed;
		String Computers;
		
		public GamingPC(int installed, String Computers) {
			super();
			this.installed = installed;
			this.Computers = Computers;
		}
		
		public static void main(String[] args) {
			
			GamingPC play1 = new GamingPC(12 , " 4 Users");
			GamingPC play2= new GamingPC(19 , " 5 Users ");
			GamingPC play3= new GamingPC(34 , " 6 Usres");
			GamingPC play4= new GamingPC(20 , " 7 Usres");
			
			GamingPC players[] =  new GamingPC[4];
			
			players[0] = play1;
			players[1] = play2;
			players[2] = play3;
			players[3] = play4;
			
			//for(int i = 0; i<players.length; i++) {
				//System.out.println(players[i].installed + " , " + players[i].Computers);
			for(int i = 0; i < players.length; i++) {
				System.out.println(players[i].installed +" , "+ players[i].Computers);
			
		}
		
	}
}



