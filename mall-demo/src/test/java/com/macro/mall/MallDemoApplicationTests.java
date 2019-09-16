package com.macro.mall;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.macro.mall.model.PmsProduct;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * refer doc: https://spring.io/blog/2016/04/15/testing-improvements-in-spring-boot-1-4
 *
 * SpringRunner is the new name for SpringJUnit4ClassRunner
 * @SpringBootTest is saying “bootstrap with Spring Boot’s support”
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment= SpringBootTest.WebEnvironment.DEFINED_PORT)

public class MallDemoApplicationTests {

	private static final Logger LOG = LoggerFactory.getLogger(MallDemoApplicationTests.class);

	@Test
	public void contextLoads() {
	}

	@Test
	public void testLogStash() throws Exception {
		ObjectMapper mapper = new ObjectMapper();
		PmsProduct product = new PmsProduct();
		product.setId(1L);
		product.setName("RedMi");
		product.setBrandName("XiaoMi");
		LOG.info(mapper.writeValueAsString(product));
		LOG.error(mapper.writeValueAsString(product));
	}

}
