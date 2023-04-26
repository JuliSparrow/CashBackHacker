package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemainLess() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(100, service.remain(900));
    }

    @Test
    public void testRemainEqual() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(0, service.remain(1000));
    }

    @Test
    public void testRemainMore() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(200, service.remain(2800));
    }

    @Test
    public void testRemainInputZero() {
        CashbackHackService service = new CashbackHackService();
        Assert.assertEquals(1000, service.remain(0));
    }
}