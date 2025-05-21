package api.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

//출력되는 숫자와 날짜에 포맷을 적용할 수 있다.
//=> 지정한 패턴에 맞게 출력
public class FormatTest {
	public static void main(String[] args) {
		Calendar cal = new GregorianCalendar();
		//날짜출력
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		//날짜객체에 SimpleDateFormat에 정의한 패턴을 적용
		//SimpleDateFormat의 format메소드를 적용해서 패턴에 맞게 출력되도록 처리
		String data = sdf.format(cal.getTime());
		System.out.println("format을 적용한 날짜데이터=>"+data);
		
		//숫자출력
		DecimalFormat df = new DecimalFormat("#,###");
		System.out.println(df.format(123456789));
		
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		System.out.println(df2.format(123456789.12545));//소숫점은 반올림
		
		//숫자모양을 하고 있는 문자열에 포맷적용하기
		String decimaldata = "123456.785";
		System.out.println(Double.parseDouble(decimaldata));
		try {
			double num = (double)df2.parse(decimaldata);
			System.out.println(df2.format(num));
			System.out.println("parseDouble이용=>"+df2.format(Double.parseDouble(decimaldata)));
		}catch(ParseException e) {
			e.printStackTrace();
		}
		
	}
}




