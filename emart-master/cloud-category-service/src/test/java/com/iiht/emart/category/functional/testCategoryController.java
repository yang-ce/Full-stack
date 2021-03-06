package com.iiht.emart.category.functional;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.embedded.LocalServerPort;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import com.iiht.emart.category.CategoryApplication;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = CategoryApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class testCategoryController {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate restTemplate;

	private MockMvc mvc;

    @Before
    public void setUp() throws Exception {
        String url = String.format("http://localhost:%d/", port);
        System.out.println(String.format("port is : [%d]", port));
        this.base = new URL(url);
    }

	@Test
    public void case001TestFindAllCategory() throws Exception {

        ResponseEntity<String> response = this.restTemplate.getForEntity(
                this.base.toString() + "/api/category", String.class, "");
        Assert.assertEquals(response.getStatusCodeValue(), 200);
        Assert.assertEquals(response.getBody(), "[{\"id\":1,\"categoryName\":\"Mobile\",\"briefDetails\":\"Communication tools\"}"
        		+ ",{\"id\":2,\"categoryName\":\"Ipad\",\"briefDetails\":\"Play tool\"}]");

    }

	@Test
    public void case002TestFindById() throws Exception {

        ResponseEntity<String> response = this.restTemplate.getForEntity(
                this.base.toString() + "/api/category/2", String.class, "");
        Assert.assertEquals(response.getStatusCodeValue(), 200);
        Assert.assertEquals(response.getBody(), "{\"id\":2,\"categoryName\":\"Ipad\",\"briefDetails\":\"Play tool\"}");

    }

	@Test
    public void case003TestCreate() throws Exception {

		RestTemplate template = new RestTemplate();
		MultiValueMap<String, Object> paramMap = new LinkedMultiValueMap<String, Object>();
		paramMap.add("id", "14");
		paramMap.add("categoryName", "Food");
		paramMap.add("briefDetails", "Can eat");
		String  response = template.postForObject(this.base.toString() + "/api/category", paramMap, String.class);
        Assert.assertEquals(response, "{\"id\":14,\"categoryName\":\"Food\",\"briefDetails\":\"Can eat\"}");

    }

	@Test
    public void case004TestDelete() throws Exception {

		restTemplate.delete(this.base.toString() + "/api/category/14");


    }

}
