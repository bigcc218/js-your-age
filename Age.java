import java.util.Scanner;
public class Age{
	public static void main(String[] args){
		//新建标准输入
		Scanner sc = new Scanner(System.in);
		
		
		//功能：计算出你的年龄
		/*
		获取当前年份将变量“m1”
		获取你的出生年份将变量"m2"
		将计算结果变量设为"m3"
		友好性提示
		*/
		
		
		//获取信息
		System.out.print("请录入当前年份：");
		int m1 = sc.nextInt();
		System.out.print("请录入你的出生日期：");
		int m2 = sc.nextInt();
		
		
		//开始计算
		int m3 = m1-m2;
		
		
		//输出结果给用户
		System.out.println("您的年龄为："+m3);
	}
}