package cn.wk.test;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author: WangKun
 * @Description:
 * @Date: Created in 2017/12/14 下午4:24
 * @ProjectName: SpringBootTest2
 * @Version: 1.0.0
 */
public class Main2 {

	@Test
	public void test() {
		String time = String.valueOf(Integer.valueOf(new SimpleDateFormat("yyyyMMdd").format(new Date())) - 1);
		System.out.println(time);
	}
}
