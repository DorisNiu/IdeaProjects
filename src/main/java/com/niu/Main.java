package com.niu;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static byte[] data= {2, 3, 4, 5, 0, 60, 70, 117, 65, 85, 3, 5, -120, 17, -128, 25, -65, 20, 17, -36, -1, 18, 20, 45, 51, 5, -120, 18, -128, 25, -65, 18, 25, -83, -1, 48, 32, 52, 53, 5, -120, 19, -128, 25, -83, 20, 7, 114, -1, 48, -118, 45, 49, 0, 0, 0, 0, 0, 18, 61, 25, -80, -1, 122, 91, 70, 66, 5, -120, 19, -128, 25, -83, 20, 7, 114, -1, 48, -126, 45, 50, 0, 0, 0, 0, 0, 18, -31, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    private static List<TagPojo18> tags = new ArrayList();

    public static void main(String[] args) {
//        byte[] data_2 = {};
//        String str = byteTransToString(data_2, data_2.length);
//        //数据长度
//        int dataNum = Integer.parseInt(str.substring(20,22),16);
//        //DevID
//        int DevID = Integer.parseInt(str.substring(12,16),16);
//        //DevSN
//        int DevSN = Integer.parseInt(str.substring(18,20),16);
//
//        List<TagPojo18> tagPojo18sList = tagType18(str);
//        for (TagPojo18 pojo18 : tagPojo18sList) {
//            System.out.println(pojo18.getTagId());
//        }
        int flag = 0;
        while (true) {
            flag++;
//            if(flag == 3){
//                break;
//            }
            System.out.println(flag);
        }




    }

    private static String byteTransToString(byte[] bits, int len) {
        StringBuffer sb = new StringBuffer();
        byte bit = 0;
        for (int i = 0; i < len; i++) {
            bit = bits[i];
            sb.append(Integer.toHexString((bit & 0xF0) >> 4));
            sb.append(Integer.toHexString(bit & 0xF));
        }
        return sb.toString().toUpperCase();
    }

    private static List<TagPojo18> tagType18(String str) {
        // String str = byteTransToString(data, data.length);
        //数据长度
        int dataLength = Integer.parseInt(str.substring(20,22),16);
        //DevID
        int DevID = Integer.parseInt(str.substring(12,16),16);
        //DevSN
        int DevSN = Integer.parseInt(str.substring(18,20),16);

        for (int i = 0; i < dataLength; i++) {
            //起始位置 28ｘ+22 =ｙ  x：第几个标签   y，标签起始头下标
            int location = 28*i + 22;
            //tagID
            int tagID = Integer.parseInt(str.substring(location,location+6),16);
//            System.out.println(tagID);
            //tagStatus
            int tagStatus = Integer.parseInt(str.substring(location+6,location+8),16);
//            System.out.println(tagStatus);
            //antenna1ID
            int antenna1ID = Integer.parseInt(str.substring(location+8,location+12),16);
//            System.out.println(antenna1ID);
            //antenna1Rssi
            int antenna1Rssi = Integer.parseInt(str.substring(location+12,location+14),16);
//            System.out.println(antenna1Rssi);
            //antenna2ID
            int antenna2ID = Integer.parseInt(str.substring(location+14,location+18),16);
//            System.out.println(antenna2ID);
            //antenna2Rssi
            int antenna2Rssi = Integer.parseInt(str.substring(location+18,location+20),16);
//            System.out.println(antenna2Rssi);
            //antennaSN
            int antennaSN = Integer.parseInt(str.substring(location+20,location+22),16);
//            System.out.println(antennaSN);
            //tagSN
            int tagSN = Integer.parseInt(str.substring(location+22,location+24),16);
//            System.out.println(tagSN);
            //masterRssi
            int masterRssi = Integer.parseInt(str.substring(location+24,location+26),16);
//            System.out.println(masterRssi);
            //slaveRssi
            int slaveRssi = Integer.parseInt(str.substring(location+26,location+28),16);
//            System.out.println(slaveRssi);

            TagPojo18 tp18 = new TagPojo18(tagID);
            tp18.setAntenna1Id(antenna1ID);
            tp18.setAntenna1Rssi(antenna1Rssi);
            tp18.setAntenna2Id(antenna2ID);
            tp18.setAntenna2Rssi(antenna2Rssi);
            tp18.setAntennaSN(antennaSN);
            tp18.setTagSN(tagSN);
            tp18.setMasterRssi(masterRssi);
            tp18.setSlaveRssi(slaveRssi);
            tp18.setStatus(tagStatus);
            tp18.setDeviceId(DevID);
            tp18.setDeviceSN(DevSN);

            tags.add(tp18);
        }
        return tags;
    }

    /*
     * 校验
     */
    private static boolean verify(String str) {
        int vv = Integer.parseInt(str.substring(str.length() - 2, str.length()), 16);
        int cv = 0;
        for (int i = 0; i < str.length() - 2; i += 2) {
            cv += Integer.parseInt(str.substring(i, i + 2), 16);
        }
        cv &= 255;
        if (vv == cv) {
            return true;
        }
        return false;
    }

}
