package com.udacity.vehicles.client.prices;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.AutoConfigureJsonTesters;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@AutoConfigureJsonTesters
public class PriceClientTest {
    @Autowired
    private PriceClient priceClient;

    @Test
    public void searchOnIdReturnsExpectedResults() {
        String priceString = priceClient.getPrice(1L);
        Assert.assertEquals("USD 25000.0", priceString);
    }

}
