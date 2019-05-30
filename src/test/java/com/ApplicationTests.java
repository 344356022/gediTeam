package com;

import com.entity.CmfzAdmin;
import com.service.CmfzAdminService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

	@Autowired
	private CmfzAdminService cmfzAdminService;

	@Test
	public void contextLoads() {
		System.out.println("hello world");
	}

	@Test
	public void test1(){
        List<CmfzAdmin> cmfzAdmins = cmfzAdminService.selectAll();
        for (CmfzAdmin cmfzAdmin : cmfzAdmins) {

            System.out.println(cmfzAdmin);

        }
    }


}
