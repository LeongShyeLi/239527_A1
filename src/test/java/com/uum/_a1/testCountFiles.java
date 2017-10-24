//Semester: #A171
//Course: #STIW3054
//Group: #A
//Task: #Assignment1
//Matrik: #239527
//Name: #LeongShyeLi

package com.uum._a1;

import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;


public class testCountFiles {
    
    @Test
    public void CountFileInFolder() throws IOException{
       int count=0;
       int countJavaFile = countFiles.CountFileInFolder(count);
        Assert.assertEquals(4, countJavaFile);
        

        
    }
}
