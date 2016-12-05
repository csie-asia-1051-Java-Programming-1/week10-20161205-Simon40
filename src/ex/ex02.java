package ex;
/*
 * Topic: 輸入所使用的度數，換算夏月及非夏月之電費金額。
 * Date: 2016/12/05
 * Author: 105021060 陳俊仁
 */
import java.util.Scanner;
public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scn=new Scanner(System.in);
        float n=scn.nextInt();
        float j=0,k=0;
        if(n>0&&n<=120){
        	float a=n*2.1f;        	
        	System.out.println(a);
        }else{
        	j=120*2.10f;
        	k=120*2.10f;
        	if(n>120&&n<331){
        		float b=j+n*3.02f;
        		float c=k+n*2.68f;
        		System.out.println(b);
        		System.out.println(c);
        	}else{
        		j=j+210*3.02f;
        		k=k+210*2.68f;
        		if(n>330&&n<501){
        			float d=j+(n-330)*4.39f;
        			float e=k+(n-330)*3.61f;
        			System.out.println(d);
            		System.out.println(e);
        		}else{
        			j=j+170*4.39f;
        			k=k+170*3.61f;
        			if(n>500&&n<701){
        				float f=j+(n-500)*4.97f;
        				float g=k+(n-500)*4.01f;
        				System.out.println(f);
                		System.out.println(g);
        			}else{
        				j=j+200*4.97f;
        				k=k+200*4.01f;
        				if(n>700){
        					float h=j+(n-700)*5.63f;
        					float i=k+(n-700)*4.5f;
        					System.out.println(h);
        	        		System.out.println(i);
        				}
        			}
        		}
        	}
        }
	}

}
