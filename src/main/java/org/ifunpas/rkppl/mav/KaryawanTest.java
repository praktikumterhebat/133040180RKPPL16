/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ifunpas.rkppl.mav;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * @author SB-604-11
 */
public class KaryawanTest {
    private static Karyawan kw;
    
    @Before
    public void start(){
        kw = new Karyawan();
    }
    @Test
    public void testUm(){
        assertTrue(kw.cekU(21));
    }
    
    @Test
    public void testUm2(){
        assertFalse(kw.cekU(-21));
    }
    
    @Test
    public void NullFalse(){
        kw.setNama("Tomi");
        assertNotNull("seharusnya tidak null", kw.getNama());
    }
    
    @Test
    public void NullTrue(){
        kw.setNama(null);
        assertNull("seharusnyanull", kw.getNama());
    }
    
//    public static void main(String[] args){
//        KaryawanTest k = new KaryawanTest();
//        
//    }
}
