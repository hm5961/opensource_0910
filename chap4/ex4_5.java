package chap4;

public class ex4_5 {
	String title;
	String author;
	
	void show() { 
		System.out.println(title + " " + author); 
	}
	
	public ex4_5() 
	{
		this("", "");
		System.out.println("������ ȣ���");
	}
	
	public ex4_5(String title) {
		
		this(title, "���ڹ̻�");
	}
	
	public ex4_5(String title, String author) {
		
		this.title = title; this.author = author;
	}
	
	public static void main(String [] args) 
	{
		ex4_5 littlePrince = new ex4_5("�����", "�������丮");
		ex4_5 bible = new ex4_5("Bible");
		ex4_5 emptyBook = new ex4_5();
		bible.show();
	}
}
