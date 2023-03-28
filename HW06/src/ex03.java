import java.util.Scanner;

class Day {
	private String work;
	
	public void set(String work) { 
		this.work = work;
	}
	
	public String get() { 
		return work;
	}
	
	public void show() {
		if(work == null)
			System.out.println("없습니다.");
		else
			System.out.println(work + "입니다.");
	}
}

class MonthSchedule {
	private int Days;
	private Day[] days;
	private Scanner scanner;
	
	public MonthSchedule(int Days) {
		this.Days = Days;
		this.days = new Day [Days];
		for(int i = 0; i < Days; i++)
			days[i]=new Day();
		scanner = new Scanner(System.in);
	}
	
	public void input() {
		System.out.print("날짜(1~" + Days + ")?");
		int day = scanner.nextInt();
		day--;
		if(day < 0 || day >= Days) {
			System.out.println("날짜 잘못 입력하였습니다.");
			return;
		}
		if(days[day].get() != null) {
			System.out.print("할 일이 이미 있습니다.");
			return;
		}
		System.out.print("할일(빈칸없이입력)?");
		String work = scanner.next();
		
		days[day].set(work); 
	}
	
	public void view() {
		System.out.print("날짜(1~30)?");
		int day1 = scanner.nextInt();
		System.out.print(day1 + "일의 할 일은 ");
		days[day1].show();
	}
	
	 public void finish() {
	      System.out.println("프로그램을 종료합니다.");
	 }
}

public class ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MonthSchedule ms = new MonthSchedule(30);
		System.out.println("이번달 스케쥴 관리 프로그램.");
		while(true) {
			System.out.print("할 일(입력:1, 보기:2, 끝내기:3) >>");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1: ms.input(); break;
			case 2: ms.view(); break;
			case 3: ms.finish(); return;
			default: System.out.println("잘못입력하였습니다.");
			}
			System.out.println();
		}
	}
}
