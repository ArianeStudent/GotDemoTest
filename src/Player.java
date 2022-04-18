
public class Player  {
	private static final Player playlist = null;
	//attributes
	private int capacity = 10;      
    private String[] data = new String[capacity];
    private int f = 0;      
    private int size = 0;
   
    //default constructor
    	public Player(){

    	}
    
    	 public void enqueue (String music){
    	        if (size != capacity ){
    	            int index = (f+size) % capacity;
    	            data[index] = music;
    	            size++;
    	        }
    	        else {
    	            enqueue(music);
    	        }
    	    }
    	 
    	 
		    int j = 10;
		    public void next(){
		        int i = (j + 1) % capacity;
		        int index = i;
		        j++;

		        System.out.println(data[index]);
		    }

		    public void previous(){
		        int i = (j -1) % capacity;
		        int index = i;
		        j--;

		        System.out.println(data[index]);
		    }
		    
		    
		    private void setPlaylist(Player playlist) {
				// TODO Auto-generated method stub
				
			}
		public static void main(String[] args) {
			
			 
			 Player player = new Player();
			
			 player.enqueue("As Long As You Love Me");
			 player.enqueue("All or Nothing");
			 player.enqueue("If I Let You Go");
			 player.enqueue("I Want It That Way");
			 player.enqueue("When You Say Nothing At ALL");
			 player.enqueue("Swear It Again");
			 player.enqueue("Truly Madly Deeply");
			 player.enqueue("Tearing Up My Heart");
			 player.enqueue("Loving Me For A reason");
			 
			player.setPlaylist(playlist);
			player.next();
			player.next();
			player.previous();
			player.previous();
			player.previous();
			player.previous();
			

		}

		

		
	
		
}


		
	
		



