package com.qgx.girl;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest
public class GirlApplicationTests {

	@Test
	public void t1(){
		QGX qgx = new QGX();
		qgx.setAge(1);
		qgx.setName("qgx");
		List<String> idList = new ArrayList<>();
		idList.add("abc");
		idList.add("cde");
		qgx.setIdList(idList);
		List<GirlEntity> girlList = new ArrayList<>();
		GirlEntity girlEntity1 = new GirlEntity();
		girlEntity1.setId(1);
		girlEntity1.setCupSize("A");
		girlList.add(girlEntity1);

		GirlEntity girlEntity2 = new GirlEntity();
		girlEntity2.setId(2);
		girlEntity2.setCupSize("B");
		girlList.add(girlEntity2);

		qgx.setGirlList(girlList);



		// 对象
		Gson gson = new GsonBuilder().enableComplexMapKeySerialization().create();
		String jsonString = gson.toJson(ResultMsg.success(qgx).getData());
		QGX2 qgxList = gson.fromJson(jsonString,QGX2.class);
		System.out.println(qgxList);

		//字符串
		Gson gson1 = new GsonBuilder().enableComplexMapKeySerialization().create();
		String jsonString1 = gson1.toJson(ResultMsg.success("ss").getData());
		Integer qgx1 = gson1.fromJson(jsonString1,Integer.class);
		System.out.println(qgx1);

		//集合
		Gson gson2 = new GsonBuilder().enableComplexMapKeySerialization().create();
		String jsonString2 = gson2.toJson(ResultMsg.success(girlList).getData());
		List<GirlEntity> qgx2 = gson.fromJson(jsonString2,List.class);
		System.out.println(qgx2);

	}


}
