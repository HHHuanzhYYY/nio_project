/**
 * Copyright (c) 2017,TravelSky. 
 * All Rights Reserved.
 * TravelSky CONFIDENTIAL
 * 
 * Project Name:nio_project
 * Package Name:indi.hzy.util
 * File Name:Utility.java
 * Date:2017年2月21日 下午3:32:24
 * 
 */
package indi.hzy.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;


/**
 * ClassName: Utility <br/>
 * Description: TODO <br/>
 * Date: 2017年2月21日 下午3:32:24 <br/>
 * <br/>
 * 
 * @author HZY(邮箱)
 * 
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息<br/>
 * 
 */

public final class Utility<T extends Serializable> {

    public static <T> void write2File(final String dir, T t) {
        File file = new File(dir);
        
        try (FileOutputStream fos = new FileOutputStream(file);
             BufferedOutputStream bos = new BufferedOutputStream(fos);
             ObjectOutputStream oos = new ObjectOutputStream(bos)) {
            oos.writeObject(t);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void readAndTransfer(final String dir) {
        File file = new File(dir);
        
        try (FileInputStream fis = new FileInputStream(file)) {
            FileChannel fc = fis.getChannel();
            ByteBuffer bb = ByteBuffer.allocate(1024);
            
            SocketChannel sc = null;
            while (fc.read(bb) != -1) {
                
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
