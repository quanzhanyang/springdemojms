package com.oldquan.springdemojms.demo;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/**
 * @author : zhanyang.quan
 * @description :
 * @create : 2019/8/6  17:01
 */
public class Demo01 {
    public static void main(String[] args) {
       Map map= new HashMap();
        map.put("shouldPay","should_pay");
        map.put("payableFee","should_pay");
        map.put("payable","agent_fee");
        map.put("unitPrice","univalence_agent");
        map.put("auditDeduction","other_fee");
        map.put("auditWithhold","audit_withhold");
//        map.put("auditDeduction","audit_withhold");
        map.put("checkChargeback","other_fee");
        map.put("checkChargeback","check_chargeback");
        map.put("reimburseNum","report_amount");
        System.out.println(map);
    }

}
