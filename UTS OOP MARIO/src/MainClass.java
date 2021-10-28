import java.util.Scanner;
import java.util.Vector;
import java.util.Date;
import java.util.Random;
public class MainClass {

	Scanner scan = new Scanner(System.in);
	Random rand = new Random(); 
	Vector<Player> p = new Vector<>();
	Vector<A>player1 = new Vector<>();
	Vector<B>player2 = new Vector<>();
	Vector<C>player3 = new Vector<>();

	private void menu(){
		int pilihan =0;
		do {
			Date date = new Date();
			System.out.println(date);
			System.out.println("Selamat Datang di Permainan Ular Tangga");
			System.out.println("==============================");
			System.out.println("1. Berdua aja (2P)");
			System.out.println("2. 2+1 Pemain (3P)");
			System.out.println("3. Lihat Pemenang??");
			System.out.println("4. Keluar Permainan");
			System.out.println(">>> ");
			pilihan = catchNumber();
			
			switch (pilihan) {
			case 1:
				daftar2P();
				break;
			case 2:
				daftar3P();
				break;
			case 3:
				if(player1.isEmpty()){
					System.out.println("Tidak ada Pemain...");
					System.out.println("");
					System.out.print("Tekan enter berikutnya...");
					scan.nextLine();
					break;}
				if(player3.isEmpty()){
				view();
				break;}
				else{
					view3P();}
				break;
			case 4:
				exit();
				System.out.println("Terima Kasih Sudah Bermain...");
				System.out.println("Permainan Dibuat Oleh: Nicholas Mario Tanamas");
				System.out.println("NIM: 2301898512");
				System.out.println("est. 2020");
				break;
			default:
				break;
			}
		} while (pilihan != 4);
	}
	
		private void pemain1(){
			String name,id;
			Random randAngka = new Random();
			Random rand = new Random();
			char hasilRandom4 = (char) (randAngka.nextInt(25)+'A');
			char hasilRandom5 = (char) (randAngka.nextInt(25)+'A');
			
			id = hasilRandom4 + "-" + hasilRandom5;
			id= id + randAngka.nextInt(10);
			id = id + randAngka.nextInt(10);
			id = id + randAngka.nextInt(10);

				do {
					System.out.println("Tuliskan Inisial Kamu Sebagai Pemain Pertama [2-3 karakter]: ");
					name = scan.nextLine();
				} while (name.length() < 2 || name.length() > 3);
			
			int lama = 0,baru = 0;
			int ronde=25;
			for(int y = 0; y<ronde;y++){
				int dadu = rand.nextInt(6)+1;
				baru = lama + dadu;
				
					if(baru == 25){	
						baru = 40;}
					
					if(baru == 63){
						baru = 78;}
					
					if(baru == 83){
						baru = 97;}
					
					if(baru == 13){
						baru = 7;}
					
					if(baru == 50){
						baru = 38;}
					
					if(baru == 95){
						baru = 76;}
					if(baru > 100){
						baru = 100 - (baru-100);}
					
				player1.add(new A(name,id,lama,dadu,baru));
				lama= baru;
				}	
		}
		private void pemain2(){
			String name,id;
			Random randAngka = new Random();
			Random rand = new Random();
			char hasilRandom4 = (char) (randAngka.nextInt(25)+'A');
			char hasilRandom5 = (char) (randAngka.nextInt(25)+'A');
			
			id = hasilRandom4 + "-" + hasilRandom5 ;
			id= id + randAngka.nextInt(10);
			id = id + randAngka.nextInt(10);
			id = id + randAngka.nextInt(10);

				do {
					System.out.println("Tuliskan Inisial Kamu Sebagai Pemain Kedua [2-3 karakter]: ");
					name = scan.nextLine();
				} while (name.length() < 2 || name.length() > 3);
			
			int lama = 0,baru = 0;
			int ronde=25;
			for(int y = 0; y<ronde;y++){
				int dadu = rand.nextInt(6)+1;
				baru = lama + dadu;
				
					if(baru == 25){
						baru = 40;}
					if(baru == 63){
						baru = 78;}
					if(baru == 83){
						baru = 97;}
					if(baru == 13){
						baru = 7;}
					if(baru == 50){
						baru = 38;}
					if(baru == 95){
						baru = 76;}
					if(baru > 100){
						baru = 100 - (baru-100);}
					
			
				player2.add(new B(name,id,lama,dadu,baru));
			lama = baru;
			}
			}
		private void pemain3(){
			String name,id;
			Random randAngka = new Random();
			Random rand = new Random();
			char hasilRandom4 = (char) (randAngka.nextInt(25)+'A');
			char hasilRandom5 = (char) (randAngka.nextInt(25)+'A');
			
			id = hasilRandom4 + "-" + hasilRandom5 ;
			id= id + randAngka.nextInt(10);
			id = id + randAngka.nextInt(10);
			id = id + randAngka.nextInt(10);

				do {
					System.out.println("Tuliskan Inisial Kamu Sebagai Pemain Ketiga [2-3 karakter]: ");
					name = scan.nextLine();
				} while (name.length() < 2 || name.length() > 3);
			
			int lama = 0,baru = 0;
			int ronde=25;
			for(int y = 0; y<ronde;y++){
				int dadu = rand.nextInt(6)+1;
				baru = lama + dadu;
				
					if(baru == 25){
						baru = 40;}
					if(baru == 63){
						baru = 78;}
					if(baru == 83){
						baru = 97;}
					if(baru == 13){
						baru = 7;}
					if(baru == 50){
						baru = 38;}
					if(baru == 95){
						baru = 76;}
					if(baru > 100){
						baru = 100 - (baru-100);}
					
			
				player3.add(new C(name,id,lama,dadu,baru));
				lama=baru;}}
		
	private void daftar2P() {
		if (!(player1.isEmpty())){
			System.out.println("Pemain sudah terisi");
			System.out.println("");
			System.out.print("Tekan enter berikutnya...");
			scan.nextLine();}
		
		if (player1.isEmpty()){
		String option = "";
		
		while(true) {
			System.out.println("Kamu bermain berdua saja?");
			System.out.println("Ya/Tidak [Case Sensitive]: ");
				option = scan.nextLine();
				if(option.equals("Ya")){
					
				pemain1();
				System.out.println("Sukses Mengisi Pemain Pertama...");
				System.out.println("");
				System.out.print("Tekan enter untuk selanjutnya...");
				scan.nextLine();
				
				pemain2();
				System.out.println("Sukses Mengisi Nama Pemain Kedua...");
				System.out.println("Ingin Melihat Pemenangnya??");
				System.out.println("");
				System.out.print("Tekan enter berikutnya...");
				scan.nextLine();
		
				break;}
			
			if(option.equals("Tidak")){
				break;}}}
	}
		
	private void daftar3P() {
		if (!(player1.isEmpty())){
			System.out.println("Pemain sudah terisi");
			System.out.println("");
			System.out.print("Tekan enter berikutnya...");
			scan.nextLine();}
		
		if (player1.isEmpty()){
			
	
		String option = "";

	while(true){
		System.out.println("Kamu bermain bertiga saja?");
		System.out.println("Ya/Tidak [Case Sensitive]: ");
			option = scan.nextLine();
			if(option.equals("Ya")){
				pemain1();
				System.out.println("Sukses Mengisi Pemain Pertama...");
				System.out.println("");
				System.out.print("Tekan enter untuk selanjutnya...");
				scan.nextLine();
				
				pemain2();
				System.out.println("Sukses Mengisi Nama Pemain Kedua...");
				System.out.println("");
				System.out.print("Tekan enter untuk selanjutnya...");
				scan.nextLine();
				
				pemain3();
				System.out.println("Sukses Mengisi Nama Pemain Ketiga...");
				System.out.println("Ingin Melihat Pemenangnya??");
				System.out.println("");
				System.out.print("Tekan enter berikutnya...");
				scan.nextLine();

				break;}
			
			if(option.equals("Tidak")){
				break;}}}
		
	
	}
	

	private void view(){
		int y=0;
		int ronde =25;
		System.out.println("============================================================================================================================");
			System.out.println("- HISTORI PERMAINAN ANTARA PEMAIN DAN PEMENANGNYA -");
			System.out.println("============================================================================================================================");
			System.out.println("DAFTAR PEMAIN:");
			System.out.println("----------------------------");
			System.out.println("NAMA PEMAIN PERTAMA: "+""+player1.get(y).getName());
			System.out.println("");
			System.out.println("NAMA PEMAIN KEDUA: "+""+player2.get(y).getName());
			System.out.println("");
			System.out.println("ID PEMAIN PERTAMA: "+""+player1.get(y).getId());
			System.out.println("");
			System.out.println("ID PEMAIN KEDUA: "+""+player2.get(y).getId());
			System.out.println("");
				System.out.println("===============================================================================");
				System.out.printf("%-7s%-2s%15s%15s%25s%15s\n","","","PLAYER 1: "+player1.get(y).getName(),
						"|","PLAYER 2: " +player2.get(y).getName(),"|");
				System.out.println("===============================================================================");
				System.out.printf("%-7s%-2s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s\n","Ronde","|","Lama","|","Dadu","|","Baru","|","Ronde","|","Lama","|","Dadu","|","Baru","|");
				System.out.println("===============================================================================");
					
				for(int l=0;l<ronde;l++){
					System.out.printf("%-7s%-2s%5s%5s%5s%5s%5s%5s",""+(l+1),"|",""+player1.get(l).getLama(),"|",
							""+player1.get(l).getDadu(),"|",""+player1.get(l).getBaru(),"|");
					System.out.printf("%5s%5s%5s%5s%5s%5s%5s%5s",""+(l+1),"|",""+player2.get(l).getLama(),"|",
							""+player2.get(l).getDadu(),"|",""+player2.get(l).getBaru(),"|");
					
						
					if(player1.get(l).getBaru()==100){
						System.out.println("");
						System.out.println("===============================================================================");
						System.out.println("PEMENANG: Pemain Pertama - "+""+player1.get(l).getName());
						System.out.println("ID: "+""+player1.get(l).getId());
						System.out.println("MENANG DALAM RONDE KE - "+""+(l+1));
						System.out.println("Dengan Total Langkah: "+""+player1.get(l).getBaru());
						System.out.println("===============================================================================");
						System.out.println("Kembali ke Halaman Utama?");
						scan.nextLine();
						menu();}
					
					if(player2.get(l).getBaru()==100){
						System.out.println("");
						System.out.println("===============================================================================");
						System.out.println("PEMENANG: Pemain Kedua - "+""+player2.get(l).getName());
						System.out.println("ID: "+""+player2.get(l).getId());
						System.out.println("MENANG DALAM RONDE KE - "+""+(l+1));
						System.out.println("Dengan Total Langkah: "+""+player2.get(l).getBaru());
						System.out.println("===============================================================================");
						System.out.println("Kembali ke Halaman Utama?");
						scan.nextLine();
						menu();}
					
					scan.nextLine();
					System.out.println("-------------------------------------------------------------------------------");
				}
				System.out.println("===============================================================================");
				

					if(player1.get(24).getBaru() == player2.get(24).getBaru()){
						System.out.println("SERI HAHAHAHA...");
						System.out.println("===============================================================================");
						System.out.println("Kembali ke Halaman Utama?");
						scan.nextLine();
						menu();}
					
					
					else if(player1.get(24).getBaru() > player2.get(24).getBaru()){
						System.out.println("PEMENANG: Pemain Pertama - "+""+player1.get(24).getName());
						System.out.println("ID: "+""+player1.get(24).getId());
						System.out.println("Dengan Total Langkah: "+""+player1.get(24).getBaru());
						System.out.println("===============================================================================");
						System.out.println("Kembali ke Halaman Utama?");
						scan.nextLine();
						menu();}
					
					else if(player1.get(24).getBaru() < player2.get(24).getBaru()){
						System.out.println("PEMENANG: Pemain Kedua - "+""+player2.get(24).getName());
						System.out.println("ID: "+""+player2.get(24).getId());
						System.out.println("Dengan Total Langkah: "+""+player2.get(24).getBaru());
						System.out.println("===============================================================================");
						System.out.println("Kembali ke Halaman Utama?");
						scan.nextLine();
						menu();}
	}

	private void view3P(){
		int y=0;
		int ronde =25;
			System.out.println("============================================================================================================================");
			System.out.println("- HISTORI PERMAINAN ANTARA PEMAIN DAN PEMENANGNYA -");
			System.out.println("============================================================================================================================");
			System.out.println("DAFTAR PEMAIN:");
			System.out.println("----------------------------");
			System.out.println("NAMA PEMAIN PERTAMA: "+""+player1.get(y).getName());
			System.out.println("");
			System.out.println("NAMA PEMAIN KEDUA: "+""+player2.get(y).getName());
			System.out.println("");
			System.out.println("NAMA PEMAIN KETIGA: "+""+player3.get(y).getName());
			System.out.println("");
			System.out.println("ID PEMAIN PERTAMA: "+""+player1.get(y).getId());
			System.out.println("");
			System.out.println("ID PEMAIN KEDUA: "+""+player2.get(y).getId());
			System.out.println("");
			System.out.println("ID PEMAIN KETIGA: "+""+player3.get(y).getId());
			System.out.println("");
				System.out.println("=======================================================================================================================");
				System.out.printf("%-7s%-2s%15s%15s%25s%15s%25s%15s\n","","","PLAYER 1: "+player1.get(y).getName(),
						"|","PLAYER 2: " +player2.get(y).getName(),"|","PLAYER 3: " +player3.get(y).getName(),"|");
				System.out.println("=======================================================================================================================");
				System.out.printf("%-7s%-2s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s%5s\n","Ronde","|","Lama","|","Dadu","|","Baru","|",
						"Ronde","|","Lama","|","Dadu","|","Baru","|","Ronde","|","Lama","|","Dadu","|","Baru","|");
				System.out.println("=======================================================================================================================");
					
				for(int l=0;l<ronde;l++){
					System.out.printf("%-7s%-2s%5s%5s%5s%5s%5s%5s",""+(l+1),"|",""+player1.get(l).getLama(),"|",
							""+player1.get(l).getDadu(),"|",""+player1.get(l).getBaru(),"|");
					System.out.printf("%5s%5s%5s%5s%5s%5s%5s%5s",""+(l+1),"|",""+player2.get(l).getLama(),"|",
							""+player2.get(l).getDadu(),"|",""+player2.get(l).getBaru(),"|");
					System.out.printf("%5s%5s%5s%5s%5s%5s%5s%5s",""+(l+1),"|",""+player3.get(l).getLama(),"|",
							""+player3.get(l).getDadu(),"|",""+player3.get(l).getBaru(),"|");
						
					if(player1.get(l).getBaru()==100){
						System.out.println("");
						System.out.println("=======================================================================================================================");
						System.out.println("PEMENANG: Pemain Pertama - "+""+player1.get(l).getName());
						System.out.println("ID: "+""+player1.get(l).getId());
						System.out.println("MENANG DALAM RONDE KE - "+""+(l+1));
						System.out.println("Dengan Total Langkah: "+""+player1.get(l).getBaru());
						System.out.println("=======================================================================================================================");
						System.out.println("Kembali ke Halaman Utama?");
						scan.nextLine();
						menu();}
					
					if(player2.get(l).getBaru()==100){
						System.out.println("");
						System.out.println("=======================================================================================================================");
						System.out.println("PEMENANG: Pemain Kedua - "+""+player2.get(l).getName());
						System.out.println("ID: "+""+player2.get(l).getId());
						System.out.println("MENANG DALAM RONDE KE - "+""+(l+1));
						System.out.println("Dengan Total Langkah: "+""+player2.get(l).getBaru());
						System.out.println("=======================================================================================================================");
						System.out.println("Kembali ke Halaman Utama?");
						scan.nextLine();
						menu();}
					
					if(player3.get(l).getBaru()==100){
						System.out.println("");
						System.out.println("=======================================================================================================================");
						System.out.println("PEMENANG: Pemain Ketiga - "+""+player3.get(l).getName());
						System.out.println("ID: "+""+player3.get(l).getId());
						System.out.println("MENANG DALAM RONDE KE - "+""+(l+1));
						System.out.println("Dengan Total Langkah: "+""+player3.get(l).getBaru());
						System.out.println("=======================================================================================================================");
						System.out.println("Kembali ke Halaman Utama?");
						scan.nextLine();
						menu();}
					
					scan.nextLine();
					System.out.println("-----------------------------------------------------------------------------------------------------------------------");
				}
				System.out.println("=======================================================================================================================");
				

					if(player1.get(24).getBaru() == player2.get(24).getBaru()||
						player1.get(24).getBaru() == player3.get(24).getBaru()||
						player2.get(24).getBaru() == player3.get(24).getBaru()){
						System.out.println("SERI HAHAHAHA...");
						System.out.println("=======================================================================================================================");
						System.out.println("Kembali ke Halaman Utama?");
						scan.nextLine();
						menu();}
					
//					RUMUS A,B,C
//					---------------------------------------------------------------------------
//					PEMENANG ORANG PERTAMA
//					A > B > C
//					A > C > B
//							
//					PEMENANG ORANG KEDUA
//					B > A > C
//					B > C > A
//						
//					PEMENANG ORANG KETIGA
//					C > A > B
//					C > B > A
//					
//					SERI
//					A = B < C
//					A = C < B
//					A = B = C
					
					if(player1.get(24).getBaru()  > player2.get(24).getBaru() ) {
						if(player1.get(24).getBaru() > player3.get(24).getBaru()) {
							System.out.println("PEMENANG: Pemain Pertama - "+""+player1.get(24).getName());
							System.out.println("ID: "+""+player1.get(24).getId());
							System.out.println("Dengan Total Langkah: "+""+player1.get(24).getBaru());
							System.out.println("=======================================================================================================================");
							System.out.println("Kembali ke Halaman Utama?");
							scan.nextLine();
							menu();}
						else if(player1.get(24).getBaru() < player3.get(24).getBaru()) {
							System.out.println("PEMENANG: Pemain Ketiga - "+""+player3.get(24).getName());
							System.out.println("ID: "+""+player3.get(24).getId());
							System.out.println("Dengan Total Langkah: "+""+player3.get(24).getBaru());
							System.out.println("=======================================================================================================================");
							System.out.println("Kembali ke Halaman Utama?");
							scan.nextLine();
							menu();}
					}
					
					if(player2.get(24).getBaru() > player1.get(24).getBaru()) {
						if(player2.get(24).getBaru() > player3.get(24).getBaru()) {
							System.out.println("PEMENANG: Pemain Kedua - "+""+player3.get(24).getName());
							System.out.println("ID: "+""+player2.get(24).getId());
							System.out.println("Dengan Total Langkah: "+""+player2.get(24).getBaru());
							System.out.println("=======================================================================================================================");
							System.out.println("Kembali ke Halaman Utama?");
							scan.nextLine();
							menu();}
						
						else if(player2.get(24).getBaru() < player3.get(24).getBaru()) {
							System.out.println("PEMENANG: Pemain Ketiga - "+""+player3.get(24).getName());
							System.out.println("ID: "+""+player3.get(24).getId());
							System.out.println("=======================================================================================================================");
							System.out.println("Kembali ke Halaman Utama?");
							scan.nextLine();
							menu();}
						}
	}
	private int catchNumber() {
		// TODO Auto-generated method stub
		int a;
		try {
			a = scan.nextInt();
		} catch (Exception e) {
			// TODO: handle exception
			a = -1;
			System.out.println("Hanya Input Angka saja !!");
			System.out.println("");
		} 
		scan.nextLine();
		return a;
	}
	private void exit() {
		
			p.clear();
			player1.clear();
			player2.clear();
			player3.clear();
}
	public MainClass(){
		menu();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MainClass();
	}

}
