abstract class Item{
		private String uid;
		private String title;
		private int no_of_copies;

		
		 public String getUid() {
    		return uid;
  				}
  		public void setUid(String newUid){
  			this.uid = newUid;
  		}
  		public int getNoOfCopies() {
    		return no_of_copies;
  				}
  		public void setNoOfCopies(int newNoOfCopies){
  			this.no_of_copies = newNoOfCopies;
  		}
  		public String getTitle() {
    		return title;
  				}
  		public void setTitle(String newTitle){
  			this.title = newTitle;
  		}
 		
  	}	
  		
  		
  		


abstract class WrittenItem extends Item{
	private String author;
	public String getAuthor() {
    			return author;
  			}
  	 public void setAuthor(String newAuthor){
  			this.author = newAuthor;
  		}

}

abstract class MediaItem extends Item{
	private int runtime;
	public int getRuntime(){
		return runtime;
	}
	public int setRuntime(int newRuntime){
		return this.runtime = newRuntime;
	}

}

class Book extends WrittenItem{

}
class JornelPaper extends WrittenItem{
	private String yr_publish;
	public String getYr_publish() {
    		return yr_publish;
  				}
  	public void setYr_publish(String newYr_publish){
  			this.yr_publish = newYr_publish;
  		}
}

class Video extends MediaItem{
	private String director;
	private String genre;
	private String yr_released;

	public String getDirector(){
  			return director;
		} 

  	public void setDirector(String newDirector){
  			this.director = newDirector;
  		} 
  	public String getGenre(){
  			return genre;
  		}
  	public void setGenre(String newGenre){
  			this.genre = newGenre;
  		} 
  	public String getYr_released(){
  			return yr_released;
  		}
  	public void setYr_released(String newYr_released){
  			this.yr_released = newYr_released;
  		}
}
class CDs extends MediaItem{
	private String artist;
	private String genre;

	public String getArtist(){
  			return artist;
  		}
  	public void setArtist(String newArtist){
  			this.artist = newArtist;
  		}
	
	public String getGenre(){
  			return genre;
  		}
  	public void setGenre(String newGenre){
  			this.genre= newGenre;
  		}

}
class Library{
	public static void main(String[] args) {
		CDs cd = new CDs();
		cd.setArtist("Apurva");
		System.out.println(cd.getArtist());
	}
}


