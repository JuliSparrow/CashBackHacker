package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLess() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(900), 100);
    }

    @Test
    public void testRemainEqual() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(1000), 0);
    }

    @Test
    public void testRemainMore() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(2800), 200);
    }

    @Test
    public void testRemainInputZero() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(service.remain(0), 1000);
    }

}