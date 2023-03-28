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
			System.out.println("�����ϴ�.");
		else
			System.out.println(work + "�Դϴ�.");
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
		System.out.print("��¥(1~" + Days + ")?");
		int day = scanner.nextInt();
		day--;
		if(day < 0 || day >= Days) {
			System.out.println("��¥ �߸� �Է��Ͽ����ϴ�.");
			return;
		}
		if(days[day].get() != null) {
			System.out.print("�� ���� �̹� �ֽ��ϴ�.");
			return;
		}
		System.out.print("����(��ĭ�����Է�)?");
		String work = scanner.next();
		
		days[day].set(work); 
	}
	
	public void view() {
		System.out.print("��¥(1~30)?");
		int day1 = scanner.nextInt();
		System.out.print(day1 + "���� �� ���� ");
		days[day1].show();
	}
	
	 public void finish() {
	      System.out.println("���α׷��� �����մϴ�.");
	 }
}

public class ex03 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		MonthSchedule ms = new MonthSchedule(30);
		System.out.println("�̹��� ������ ���� ���α׷�.");
		while(true) {
			System.out.print("�� ��(�Է�:1, ����:2, ������:3) >>");
			int menu = scanner.nextInt();
			switch(menu) {
			case 1: ms.input(); break;
			case 2: ms.view(); break;
			case 3: ms.finish(); return;
			default: System.out.println("�߸��Է��Ͽ����ϴ�.");
			}
			System.out.println();
		}
	}
}
