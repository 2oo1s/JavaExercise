class Song {
	String title;
    String artist;     
    int year;
    String country;
    
    public Song(String tit, String name, int num, String nat) {
    	title = tit;
        artist = name;
        year = num;
        country = nat;
    }
    
    public void show() {
        System.out.println(year+"�� "+country+" ������ "+artist+"�� �θ� "+title);
    }
}

public class ex02 {
	public static void main(String[] args) {
		Song mySong = new Song("Dancing Queen", "ABBA", 1978, "������");
		mySong.show();
	}
}