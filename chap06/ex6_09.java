package chap6;

import java.util.StringTokenizer;

public class ex6_09 {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("ȫ�浿/��ȭ/ȫ��/����/����", "/");
		while (st.hasMoreTokens())
			System.out.println(st.nextToken());
	}
}