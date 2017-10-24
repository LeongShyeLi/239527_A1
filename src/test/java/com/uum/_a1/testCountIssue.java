package com.uum._a1;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;

public class testCountIssue {

    @Test
    public void CountIssue() throws IOException {
        int countmainmethod = 0;
        int countIssue = countFiles.CountIssueInFolder(countmainmethod);
        Assert.assertEquals(3, countIssue);
    }
}
