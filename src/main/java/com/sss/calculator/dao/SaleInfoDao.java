package com.sss.calculator.dao;

import com.sss.calculator.model.SaleInfo;
import com.sss.calculator.model.SaleInfoExample;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public interface SaleInfoDao {

    int countByExample(SaleInfoExample example);

    int deleteByExample(SaleInfoExample example);

    int insert(SaleInfo record);

    int insertSelective(SaleInfo record);

    ArrayList<SaleInfo> selectByExample(SaleInfoExample example);

    int updateByExampleSelective(@Param("record") SaleInfo record, @Param("example") SaleInfoExample example);

    int updateByExample(@Param("record") SaleInfo record, @Param("example") SaleInfoExample example);

    @Select("SELECT\n" +
            "\tINFO.\"YEAR\",\n" +
            "\tINFO.\"MONTH\",\n" +
            "\t\"SUM\" (INFO.TOTAL_ORDER_SIZE) TOTAL_ORDER_SIZE,\n" +
            "\t\"SUM\" (INFO.YEAR_TARGET_SIZE) YEAR_TARGET_SIZE,\n" +
            "\t\"SUM\" (INFO.TOTAL_ORDER_MONEY) TOTAL_ORDER_MONEY,\n" +
            "\t\"SUM\" (INFO.YEAR_TARGET_MONEY) YEAR_TARGET_MONEY,\n" +
            "\t\"SUM\" (CURRENT_MONTH_SIZE) CURRENT_MONTH_SIZE,\n" +
            "\t\"SUM\" (INFO.MONTH_TARGET_SIZE) MONTH_TARGET_SIZE,\n" +
            "\t\"SUM\" (INFO.CURRENT_MONTH_MONEY) CURRENT_MONTH_MONEY,\n" +
            "\t\"SUM\" (INFO.MONTH_TARGET_MONEY) MONTH_TARGET_MONEY,\n" +
            "\t\"SUM\" (INFO.TOTAL_OUTPUT_SIZE) TOTAL_OUTPUT_SIZE,\n" +
            "\t\"SUM\" (INFO.PRICE_PER_TON) PRICE_PER_TON,\n" +
            "\t\"SUM\" (INFO.TOTAL_OUTPUT_MONEY) TOTAL_OUTPUT_MONEY,\n" +
            "\t\"SUM\" (INFO.TOTAL_RETURN_MONEY) TOTAL_RETURN_MONEY,\n" +
            "\t\"SUM\" (\n" +
            "\t\tINFO.CURRENT_MONTH_OUTPUT_SIZE\n" +
            "\t) CURRENT_MONTH_OUTPUT_SIZE,\n" +
            "\t\"SUM\" (\n" +
            "\t\tINFO.CURRENT_MONTH_OUTPUT_MONEY\n" +
            "\t) CURRENT_MONTH_OUTPUT_MONEY\n" +
            "FROM\n" +
            "\tERP_SD_T_SALE_INFO info\n" +
            "LEFT JOIN ERP_HR_DF_EMPLOYEE emp ON INFO.EMPLOYEE_NO = EMP.EMPLOYEE_NO\n" +
            "WHERE\n" +
            "\t(INFO.EMPLOYEE_NO = #{id}\n" +
            "\tAND INFO.\"YEAR\" = #{year}\n" +
            "AND INFO.\"MONTH\" = #{month})\n" +
            "or (EMP.DIRECT_SUPERVISOR_ID = #{id}\n" +
            "AND INFO.\"YEAR\" = #{year}\n" +
            "AND INFO.\"MONTH\" = #{month})\n" +
            "GROUP BY\n" +
            "\tINFO.\"YEAR\",\n" +
            "\tINFO.\"MONTH\"")
    ArrayList<HashMap<String,Object>> findMid(@Param("year") Integer year, @Param("month") String month, @Param("id") String id);

    //查询年订单销售量
    @Select("SELECT\n" +
            "\t\"ROUND\" (\"SUM\"(UAC.\"sales\"), 2) 年累计销量\n" +
            "FROM\n" +
            "\tERP_SD_V_USERS_ACTUALSALES UAC\n" +
            "LEFT JOIN ERP_SD_V_USERS_TARGETSALES UTA ON UAC.\"id\" = UTA.\"ID\"\n" +
            "AND UAC.\"year\" = UTA.\"year\"\n" +
            "AND UAC.\"month\" = UTA.\"month\"\n" +
            "WHERE\n" +
            "\tUAC.\"year\" = #{year}\n" +
            "AND UAC.\"month\" BETWEEN 01\n" +
            "AND #{month}\n" +
            "AND UAC.\"id\" = #{id}")
    String findTotalOrderSize(@Param("year") Integer year,@Param("month") Integer month, @Param("id") String id);

    //查询年订单销售额
    @Select("SELECT\n" +
            "\t\"ROUND\" (\"SUM\"(UAC.\"salesvalue\"), 2) 年订单销售额\n" +
            "FROM\n" +
            "\tERP_SD_V_USERS_ACTUALSALES UAC\n" +
            "LEFT JOIN ERP_SD_V_USERS_TARGETSALES_V UTA ON UAC.\"id\" = UTA.\"人员编号\"\n" +
            "AND UAC.\"year\" = UTA.\"年\"\n" +
            "AND UAC.\"month\" = UTA.\"月\"\n" +
            "WHERE\n" +
            "\tUAC.\"year\" = #{year}\n" +
            "AND UAC.\"month\" BETWEEN 1\n" +
            "AND #{month}\n" +
            "AND UAC.\"id\" = #{id}")
    String findTotalOrderMoney(@Param("year") Integer year, @Param("month") Integer month,@Param("id") String id);

    //查询月累计订单量
    @Select("SELECT\n" +
            "\t\"ROUND\"(\"SUM\" (UAC.\"sales\"), 2) 月订单销售量\n" +
            "FROM\n" +
            "\tERP_SD_V_USERS_ACTUALSALES UAC\n" +
            "LEFT JOIN ERP_SD_V_USERS_TARGETSALES UTA ON UAC.\"id\" = UTA.\"ID\"\n" +
            "AND UAC.\"year\" = UTA.\"year\"\n" +
            "AND UAC.\"month\" = UTA.\"month\" \n" +
            "where \n" +
            " UAC.\"year\" = #{year} AND UAC.\"month\"=#{month} AND UAC.\"id\"=#{id}\n")
    String findCurrentMonthSize(@Param("year") Integer year, @Param("month") String month, @Param("id") String id);

    //查询月累计订单额
    @Select("SELECT\n" +
            "\t\"ROUND\"(\"SUM\" (UAC.\"salesvalue\"), 2) 月订单销售额\n" +
            "FROM\n" +
            "\tERP_SD_V_USERS_ACTUALSALES UAC\n" +
            "LEFT JOIN ERP_SD_V_USERS_TARGETSALES_V UTA ON UAC.\"id\" = UTA.\"人员编号\"\n" +
            "AND UAC.\"year\" = UTA.\"年\"\n" +
            "AND UAC.\"month\" = UTA.\"月\"\n" +
            "where \n" +
            "UAC.\"year\" =#{year} and \n" +
            "UAC.\"id\" = #{id} and  UAC.\"month\" =#{month}\n")
    String findCurrentMonthMoney(@Param("year") Integer year, @Param("month") String month, @Param("id") String id);

    //查询年累计出库量
    @Select("SELECT\n" +
            "\t\"ROUND\" (\n" +
            "\t\tSUM (\n" +
            "\t\t\tCASE\n" +
            "\t\t\tWHEN 销退量 IS NOT NULL THEN\n" +
            "\t\t\t\t出货数量 - 销退量\n" +
            "\t\t\tELSE\n" +
            "\t\t\t\t出货数量\n" +
            "\t\t\tEND\n" +
            "\t\t) / 1000,\n" +
            "\t\t2\n" +
            "\t) 年累计出库量\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\t人员编号,\n" +
            "\t\t\tSUM (含税金额) 含税金额,\n" +
            "\t\t\tSUM (出货数量) 出货数量,\n" +
            "\t\t\t年,\n" +
            "\t\t\t月\n" +
            "\t\tFROM\n" +
            "\t\t\t(\n" +
            "\t\t\t\tSELECT\n" +
            "\t\t\t\t\tCASE\n" +
            "\t\t\t\tWHEN TQ.OEB910 = 'M' THEN\n" +
            "\t\t\t\t\tTQ.TA_OGB07\n" +
            "\t\t\t\tELSE\n" +
            "\t\t\t\t\tTQ.OGB912\n" +
            "\t\t\t\tEND 出货数量,\n" +
            "\t\t\t\tTQ.OGA14 人员编号,\n" +
            "\t\t\t\ttq.OGB13 单价,\n" +
            "\t\t\t\ttq.OEB14T 含税金额,\n" +
            "\t\t\t\ttq.OGA01 出货单号,\n" +
            "\t\t\t\ttq.OGB03 项次,\n" +
            "\t\t\t\t\"TO_CHAR\" (tq.oga02, 'yyyy') 年,\n" +
            "\t\t\t\t\"TO_CHAR\" (tq.oga02, 'mm') 月\n" +
            "\t\t\tFROM\n" +
            "\t\t\t\tERP_SD_O_TQRXAM tq\n" +
            "\t\t\tWHERE\n" +
            "\t\t\t\ttq.OGA15 NOT IN (\n" +
            "\t\t\t\t\t'041',\n" +
            "\t\t\t\t\t'SY041',\n" +
            "\t\t\t\t\t'051',\n" +
            "\t\t\t\t\t'042',\n" +
            "\t\t\t\t\t'SY042',\n" +
            "\t\t\t\t\t'022',\n" +
            "\t\t\t\t\t'SY062'\n" +
            "\t\t\t\t)\n" +
            "\t\t\t) --where 年=2018 and 月=10 \n" +
            "\t\tGROUP BY\n" +
            "\t\t\t人员编号,\n" +
            "\t\t\t年,\n" +
            "\t\t\t月\n" +
            "\t\tORDER BY\n" +
            "\t\t\t人员编号\n" +
            "\t) 出库\n" +
            "LEFT JOIN (\n" +
            "\tSELECT\n" +
            "\t\toha14,\n" +
            "\t\tSUM (ohb912 * ogb13) 销退额,\n" +
            "\t\tSUM (ohb912) 销退量,\n" +
            "\t\tTO_CHAR (OHA02, 'yyyy') 年,\n" +
            "\t\tTO_CHAR (OHA02, 'mm') 月\n" +
            "\tFROM\n" +
            "\t\t(\n" +
            "\t\t\tSELECT\n" +
            "\t\t\t\t*\n" +
            "\t\t\tFROM\n" +
            "\t\t\t\tERP_SD_O_PINBACK_DETAIL PINB\n" +
            "\t\t\tLEFT JOIN ERP_SD_O_PINBACK PIN ON PINB.ohb01 = PIN.oha01\n" +
            "\t\t\tAND PINB.ohb31 = PIN.oha16\n" +
            "\t\t\tLEFT JOIN ERP_SD_O_DELIVERYRECORD_DETAIL DELI ON DELI.OGB01 = PINB.ohb31\n" +
            "\t\t\tAND DELI.ogb03 = PINB.ohb32\n" +
            "\t\t\tWHERE\n" +
            "\t\t\t\tPIN.OHA04 NOT IN ('SY', 'SS', 'SH')\n" +
            "\t\t\tAND PIN.oha15 NOT IN (\n" +
            "\t\t\t\t'041',\n" +
            "\t\t\t\t'SY041',\n" +
            "\t\t\t\t'051',\n" +
            "\t\t\t\t'042',\n" +
            "\t\t\t\t'SY042',\n" +
            "\t\t\t\t'022',\n" +
            "\t\t\t\t'SY062'\n" +
            "\t\t\t)\n" +
            "\t\t) --WHERE TO_CHAR(OHA02,'yyyy') = 2018 and TO_CHAR(OHA02,'mm') = 10 \n" +
            "\tGROUP BY\n" +
            "\t\toha14,\n" +
            "\t\tTO_CHAR (OHA02, 'yyyy'),\n" +
            "\t\tTO_CHAR (OHA02, 'mm')\n" +
            ") 销退 ON 出库.\"人员编号\" = 销退.oha14\n" +
            "AND \"出库\".\"年\" = \"销退\".\"年\"\n" +
            "AND \"出库\".\"月\" = \"销退\".\"月\"\n" +
            "WHERE\n" +
            "\t1 = 1\n" +
            "AND 出库.年 = #{year}\n" +
            "AND 出库.月 BETWEEN 1\n" +
            "AND #{month}\n" +
            "AND \"出库\".\"人员编号\" = #{id}")
    String findTotalOutputSize(@Param("year") Integer year, @Param("month") Integer month,@Param("id") String id);

    //查询当月出库量
    @Select("SELECT\n" +
            "\t\"ROUND\" (\n" +
            "\t\tSUM (\n" +
            "\t\t\tCASE\n" +
            "\t\t\tWHEN 销退量 IS NOT NULL THEN\n" +
            "\t\t\t\t出货数量 - 销退量\n" +
            "\t\t\tELSE\n" +
            "\t\t\t\t出货数量\n" +
            "\t\t\tEND\n" +
            "\t\t),\n" +
            "\t\t2\n" +
            "\t) 年累计出库量\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\t人员编号,\n" +
            "\t\t\tSUM (含税金额) 含税金额,\n" +
            "\t\t\tSUM (出货数量) 出货数量,\n" +
            "\t\t\t年,\n" +
            "\t\t\t月\n" +
            "\t\tFROM\n" +
            "\t\t\t(\n" +
            "\t\t\t\tSELECT\n" +
            "\t\t\t\t\tDM.dept_no,\n" +
            "\t\t\t\t\tDM.dept_name,\n" +
            "\t\t\t\t\tCASE\n" +
            "\t\t\t\tWHEN TQ.OEB910 = 'M' THEN\n" +
            "\t\t\t\t\tTQ.TA_OGB07\n" +
            "\t\t\t\tELSE\n" +
            "\t\t\t\t\tTQ.OGB912\n" +
            "\t\t\t\tEND 出货数量,\n" +
            "\t\t\t\tTQ.OGA14 人员编号,\n" +
            "\t\t\t\ttq.OGB13 单价,\n" +
            "\t\t\t\ttq.OEB14T 含税金额,\n" +
            "\t\t\t\ttq.OGA01 出货单号,\n" +
            "\t\t\t\ttq.OGB03 项次,\n" +
            "\t\t\t\t\"TO_CHAR\" (tq.oga02, 'yyyy') 年,\n" +
            "\t\t\t\t\"TO_CHAR\" (tq.oga02, 'mm') 月\n" +
            "\t\t\tFROM\n" +
            "\t\t\t\tERP_SD_O_TQRXAM tq\n" +
            "\t\t\tLEFT JOIN erp_hr_m_dept_middle dm ON TQ.gem02 = DM.dept_names\n" +
            "\t\t\tWHERE\n" +
            "\t\t\t\ttq.OGA15 NOT IN (\n" +
            "\t\t\t\t\t'041',\n" +
            "\t\t\t\t\t'SY041',\n" +
            "\t\t\t\t\t'051',\n" +
            "\t\t\t\t\t'042',\n" +
            "\t\t\t\t\t'SY042',\n" +
            "\t\t\t\t\t'022',\n" +
            "\t\t\t\t\t'SY062'\n" +
            "\t\t\t\t)\n" +
            "\t\t\t)\n" +
            "\t\tGROUP BY\n" +
            "\t\t\t人员编号,\n" +
            "\t\t\t年,\n" +
            "\t\t\t月\n" +
            "\t\tORDER BY\n" +
            "\t\t\t人员编号\n" +
            "\t) 出库\n" +
            "LEFT JOIN (\n" +
            "\tSELECT\n" +
            "\t\toha14,\n" +
            "\t\tSUM (ohb912 * ogb13) 销退额,\n" +
            "\t\tSUM (ohb912) 销退量,\n" +
            "\t\tTO_CHAR (OHA02, 'yyyy') 年,\n" +
            "\t\tTO_CHAR (OHA02, 'mm') 月\n" +
            "\tFROM\n" +
            "\t\t(\n" +
            "\t\t\tSELECT\n" +
            "\t\t\t\t*\n" +
            "\t\t\tFROM\n" +
            "\t\t\t\tERP_SD_O_PINBACK_DETAIL PINB\n" +
            "\t\t\tLEFT JOIN ERP_SD_O_PINBACK PIN ON PINB.ohb01 = PIN.oha01\n" +
            "\t\t\tAND PINB.ohb31 = PIN.oha16\n" +
            "\t\t\tLEFT JOIN ERP_SD_O_DELIVERYRECORD_DETAIL DELI ON DELI.OGB01 = PINB.ohb31\n" +
            "\t\t\tAND DELI.ogb03 = PINB.ohb32\n" +
            "\t\t\tWHERE\n" +
            "\t\t\t\tPIN.OHA04 NOT IN ('SY', 'SS', 'SH')\n" +
            "\t\t\tAND PIN.oha15 NOT IN (\n" +
            "\t\t\t\t'041',\n" +
            "\t\t\t\t'SY041',\n" +
            "\t\t\t\t'051',\n" +
            "\t\t\t\t'042',\n" +
            "\t\t\t\t'SY042',\n" +
            "\t\t\t\t'022',\n" +
            "\t\t\t\t'SY062'\n" +
            "\t\t\t)\n" +
            "\t\t)\n" +
            "\tGROUP BY\n" +
            "\t\toha14,\n" +
            "\t\tTO_CHAR (OHA02, 'yyyy'),\n" +
            "\t\tTO_CHAR (OHA02, 'mm')\n" +
            ") 销退 ON 出库.\"人员编号\" = 销退.oha14\n" +
            "AND \"出库\".\"年\" = \"销退\".\"年\"\n" +
            "AND \"出库\".\"月\" = \"销退\".\"月\"\n" +
            "WHERE\n" +
            "\t\"出库\".\"年\" = #{year}\n" +
            "AND 出库.\"人员编号\" =#{id}\n" +
            "AND \"出库\".\"月\" =#{month}\n" +
            "\n")
    String findCurrentMonthOutputSize(@Param("year") Integer year, @Param("month") String month, @Param("id") String id);

    //查询年累计出库额
    @Select("SELECT\n" +
            "\t\"ROUND\"(SUM (\n" +
            "\t\tCASE\n" +
            "\t\tWHEN 销退额 IS NOT NULL THEN\n" +
            "\t\t\t含税金额 - 销退额\n" +
            "\t\tELSE\n" +
            "\t\t\t含税金额\n" +
            "\t\tEND\n" +
            "\t) / 10000,2) 年累计出库额\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\t人员编号,\n" +
            "\t\t\tSUM (含税金额) 含税金额,\n" +
            "\t\t\tSUM (出货数量) 出货数量,\n" +
            "\t\t\t年,\n" +
            "\t\t\t月\n" +
            "\t\tFROM\n" +
            "\t\t\t(\n" +
            "\t\t\t\tSELECT\n" +
            "\t\t\t\t\tCASE\n" +
            "\t\t\t\tWHEN TQ.OEB910 = 'M' THEN\n" +
            "\t\t\t\t\tTQ.TA_OGB07\n" +
            "\t\t\t\tELSE\n" +
            "\t\t\t\t\tTQ.OGB912\n" +
            "\t\t\t\tEND 出货数量,\n" +
            "\t\t\t\tTQ.OGA14 人员编号,\n" +
            "\t\t\t\ttq.OGB13 单价,\n" +
            "\t\t\t\ttq.OEB14T 含税金额,\n" +
            "\t\t\t\ttq.OGA01 出货单号,\n" +
            "\t\t\t\ttq.OGB03 项次,\n" +
            "\t\t\t\t\"TO_CHAR\" (tq.oga02, 'yyyy') 年,\n" +
            "\t\t\t\t\"TO_CHAR\" (tq.oga02, 'mm') 月\n" +
            "\t\t\tFROM\n" +
            "\t\t\t\tERP_SD_O_TQRXAM tq\n" +
            "\t\t\tWHERE\n" +
            "\t\t\t\ttq.OGA15 NOT IN (\n" +
            "\t\t\t\t\t'041',\n" +
            "\t\t\t\t\t'SY041',\n" +
            "\t\t\t\t\t'051',\n" +
            "\t\t\t\t\t'042',\n" +
            "\t\t\t\t\t'SY042',\n" +
            "\t\t\t\t\t'022',\n" +
            "\t\t\t\t\t'SY062'\n" +
            "\t\t\t\t)\n" +
            "\t\t\t) --where 年=2018 and 月=10 \n" +
            "\t\tGROUP BY\n" +
            "\t\t\t人员编号,\n" +
            "\t\t\t年,\n" +
            "\t\t\t月\n" +
            "\t\tORDER BY\n" +
            "\t\t\t人员编号\n" +
            "\t) 出库\n" +
            "LEFT JOIN (\n" +
            "\tSELECT\n" +
            "\t\toha14,\n" +
            "\t\tSUM (ohb912 * ogb13) 销退额,\n" +
            "\t\tSUM (ohb912) 销退量,\n" +
            "\t\tTO_CHAR (OHA02, 'yyyy') 年,\n" +
            "\t\tTO_CHAR (OHA02, 'mm') 月\n" +
            "\tFROM\n" +
            "\t\t(\n" +
            "\t\t\tSELECT\n" +
            "\t\t\t\t*\n" +
            "\t\t\tFROM\n" +
            "\t\t\t\tERP_SD_O_PINBACK_DETAIL PINB\n" +
            "\t\t\tLEFT JOIN ERP_SD_O_PINBACK PIN ON PINB.ohb01 = PIN.oha01\n" +
            "\t\t\tAND PINB.ohb31 = PIN.oha16\n" +
            "\t\t\tLEFT JOIN ERP_SD_O_DELIVERYRECORD_DETAIL DELI ON DELI.OGB01 = PINB.ohb31\n" +
            "\t\t\tAND DELI.ogb03 = PINB.ohb32\n" +
            "\t\t\tWHERE\n" +
            "\t\t\t\tPIN.OHA04 NOT IN ('SY', 'SS', 'SH')\n" +
            "\t\t\tAND PIN.oha15 NOT IN (\n" +
            "\t\t\t\t'041',\n" +
            "\t\t\t\t'SY041',\n" +
            "\t\t\t\t'051',\n" +
            "\t\t\t\t'042',\n" +
            "\t\t\t\t'SY042',\n" +
            "\t\t\t\t'022',\n" +
            "\t\t\t\t'SY062'\n" +
            "\t\t\t)\n" +
            "\t\t) --WHERE TO_CHAR(OHA02,'yyyy') = 2018 and TO_CHAR(OHA02,'mm') = 10 \n" +
            "\tGROUP BY\n" +
            "\t\toha14,\n" +
            "\t\tTO_CHAR (OHA02, 'yyyy'),\n" +
            "\t\tTO_CHAR (OHA02, 'mm')\n" +
            ") 销退 ON 出库.\"人员编号\" = 销退.oha14\n" +
            "AND \"出库\".\"年\" = \"销退\".\"年\"\n" +
            "AND \"出库\".\"月\" = \"销退\".\"月\"\n" +
            "WHERE\n" +
            "\t1 = 1\n" +
            "AND 出库.年 = #{year}\n" +
            "AND 出库.月 BETWEEN 1\n" +
            "AND #{month}\n" +
            "AND \"出库\".\"人员编号\" = #{id}\n" +
            "\n")
    String findTotalOutputMoney(@Param("year") Integer year,@Param("month") Integer month, @Param("id") String id);

    //查询当月出库额
    @Select("SELECT\n" +
            "\t\"ROUND\" (\n" +
            "\t\tSUM (\n" +
            "\t\t\tCASE\n" +
            "\t\t\tWHEN 销退额 IS NOT NULL THEN\n" +
            "\t\t\t\t含税金额 - 销退额\n" +
            "\t\t\tELSE\n" +
            "\t\t\t\t含税金额\n" +
            "\t\t\tEND\n" +
            "\t\t),\n" +
            "\t\t2\n" +
            "\t) 年累计出库额\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\t人员编号,\n" +
            "\t\t\tSUM (含税金额) 含税金额,\n" +
            "\t\t\tSUM (出货数量) 出货数量,\n" +
            "\t\t\t年,\n" +
            "\t\t\t月\n" +
            "\t\tFROM\n" +
            "\t\t\t(\n" +
            "\t\t\t\tSELECT\n" +
            "\t\t\t\t\tDM.dept_no,\n" +
            "\t\t\t\t\tDM.dept_name,\n" +
            "\t\t\t\t\tCASE\n" +
            "\t\t\t\tWHEN TQ.OEB910 = 'M' THEN\n" +
            "\t\t\t\t\tTQ.TA_OGB07\n" +
            "\t\t\t\tELSE\n" +
            "\t\t\t\t\tTQ.OGB912\n" +
            "\t\t\t\tEND 出货数量,\n" +
            "\t\t\t\tTQ.OGA14 人员编号,\n" +
            "\t\t\t\ttq.OGB13 单价,\n" +
            "\t\t\t\ttq.OEB14T 含税金额,\n" +
            "\t\t\t\ttq.OGA01 出货单号,\n" +
            "\t\t\t\ttq.OGB03 项次,\n" +
            "\t\t\t\t\"TO_CHAR\" (tq.oga02, 'yyyy') 年,\n" +
            "\t\t\t\t\"TO_CHAR\" (tq.oga02, 'mm') 月\n" +
            "\t\t\tFROM\n" +
            "\t\t\t\tERP_SD_O_TQRXAM tq\n" +
            "\t\t\tLEFT JOIN erp_hr_m_dept_middle dm ON TQ.gem02 = DM.dept_names\n" +
            "\t\t\tWHERE\n" +
            "\t\t\t\ttq.OGA15 NOT IN (\n" +
            "\t\t\t\t\t'041',\n" +
            "\t\t\t\t\t'SY041',\n" +
            "\t\t\t\t\t'051',\n" +
            "\t\t\t\t\t'042',\n" +
            "\t\t\t\t\t'SY042',\n" +
            "\t\t\t\t\t'022',\n" +
            "\t\t\t\t\t'SY062'\n" +
            "\t\t\t\t)\n" +
            "\t\t\t)\n" +
            "\t\tGROUP BY\n" +
            "\t\t\t人员编号,\n" +
            "\t\t\t年,\n" +
            "\t\t\t月\n" +
            "\t\tORDER BY\n" +
            "\t\t\t人员编号\n" +
            "\t) 出库\n" +
            "LEFT JOIN (\n" +
            "\tSELECT\n" +
            "\t\toha14,\n" +
            "\t\tSUM (ohb912 * ogb13) 销退额,\n" +
            "\t\tSUM (ohb912) 销退量,\n" +
            "\t\tTO_CHAR (OHA02, 'yyyy') 年,\n" +
            "\t\tTO_CHAR (OHA02, 'mm') 月\n" +
            "\tFROM\n" +
            "\t\t(\n" +
            "\t\t\tSELECT\n" +
            "\t\t\t\t*\n" +
            "\t\t\tFROM\n" +
            "\t\t\t\tERP_SD_O_PINBACK_DETAIL PINB\n" +
            "\t\t\tLEFT JOIN ERP_SD_O_PINBACK PIN ON PINB.ohb01 = PIN.oha01\n" +
            "\t\t\tAND PINB.ohb31 = PIN.oha16\n" +
            "\t\t\tLEFT JOIN ERP_SD_O_DELIVERYRECORD_DETAIL DELI ON DELI.OGB01 = PINB.ohb31\n" +
            "\t\t\tAND DELI.ogb03 = PINB.ohb32\n" +
            "\t\t\tWHERE\n" +
            "\t\t\t\tPIN.OHA04 NOT IN ('SY', 'SS', 'SH')\n" +
            "\t\t\tAND PIN.oha15 NOT IN (\n" +
            "\t\t\t\t'041',\n" +
            "\t\t\t\t'SY041',\n" +
            "\t\t\t\t'051',\n" +
            "\t\t\t\t'042',\n" +
            "\t\t\t\t'SY042',\n" +
            "\t\t\t\t'022',\n" +
            "\t\t\t\t'SY062'\n" +
            "\t\t\t)\n" +
            "\t\t)\n" +
            "\tGROUP BY\n" +
            "\t\toha14,\n" +
            "\t\tTO_CHAR (OHA02, 'yyyy'),\n" +
            "\t\tTO_CHAR (OHA02, 'mm')\n" +
            ") 销退 ON 出库.\"人员编号\" = 销退.oha14\n" +
            "AND \"出库\".\"年\" = \"销退\".\"年\"\n" +
            "AND \"出库\".\"月\" = \"销退\".\"月\"\n" +
            "WHERE\n" +
            "\t\"出库\".\"年\" = #{year}\n" +
            "AND 出库.\"人员编号\" = #{id}\n" +
            "AND \"出库\".\"月\" = #{month}\n" +
            "\n")
    String findCurrentMonthOutputMoney(@Param("year") Integer year, @Param("month") String month, @Param("id") String id);

    //查询累计加价
    @Select("SELECT\n" +
            "\t\"ROUND\" (\n" +
            "\t\t\"SUM\" (abc.\"累计加价\"),\n" +
            "\t\t2\n" +
            "\t) 累计加价\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\tTO_CHAR (ord.oea02, 'yyyy') 年,\n" +
            "\t\t\tTO_CHAR (ord.oea02, 'mm') 月,\n" +
            "\t\t\t\"SUM\" (ORDS.ta_oeb065) 累计加价,\n" +
            "\t\t\tORD.oea15 部门编号,\n" +
            "\t\t\tdep.leaderid\n" +
            "\t\tFROM\n" +
            "\t\t\tERP_SD_O_ORDERS_DETAIL ords\n" +
            "\t\tRIGHT JOIN ERP_SD_O_ORDERS ord ON ORDS.OEB01 = ORD.OEA01\n" +
            "\t\tLEFT JOIN ERP_SD_O_DEPARTMENT dep ON ORD.oea15 = dep.GEM01\n" +
            "\t\tGROUP BY\n" +
            "\t\t\tTO_CHAR (ord.oea02, 'yyyy'),\n" +
            "\t\t\tTO_CHAR (ord.oea02, 'mm'),\n" +
            "\t\t\tORD.oea15,\n" +
            "\t\t\tdep.leaderid\n" +
            "\t) abc\n" +
            "WHERE\n" +
            "\tABC.\"年\" = #{year}\n" +
            "AND ABC.\"月\" BETWEEN 1\n" +
            "AND #{month}\n" +
            "AND ABC.LEADERID = #{id}")
    String findTotalPrice(@Param("year") Integer year, @Param("month") Integer month,@Param("id") String id);

    //年度目标量
    @Select("SELECT\n" +
            "\t\"SUM\" (tar.Target) 总和\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\tP .USERCODE,\n" +
            "\t\t\tP . YEAR,\n" +
            "\t\t\tP .Target,\n" +
            "\t\t\tP . MONTH,\n" +
            "\t\t\tP . CATEGORY\n" +
            "\t\tFROM\n" +
            "\t\t\t(\n" +
            "\t\t\t\tSELECT\n" +
            "\t\t\t\t\tMS.USERCODE,\n" +
            "\t\t\t\t\tMS.\"YEAR\",\n" +
            "\t\t\t\t\tMS.\"CATEGORY\",\n" +
            "\t\t\t\t\tMS.JANTARGET \"01\",\n" +
            "\t\t\t\t\tMS.FEBTARGET \"02\",\n" +
            "\t\t\t\t\tMS.MARTARGET \"03\",\n" +
            "\t\t\t\t\tMS.APRTARGET \"04\",\n" +
            "\t\t\t\t\tms.MAYTARGET \"05\",\n" +
            "\t\t\t\t\tMS.JUNTARGET \"06\",\n" +
            "\t\t\t\t\tMS.JULTARGET \"07\",\n" +
            "\t\t\t\t\tMS.AUGTARGET \"08\",\n" +
            "\t\t\t\t\tMS.SEPTARGET \"09\",\n" +
            "\t\t\t\t\tMS.OCTTARGET \"10\",\n" +
            "\t\t\t\t\tMS.NOVTARGET \"11\",\n" +
            "\t\t\t\t\tMS.DECTARGET \"12\"\n" +
            "\t\t\t\tFROM\n" +
            "\t\t\t\t\tERP_SD_DF_SALESGOALS MS\n" +
            "\t\t\t) T UNPIVOT (\n" +
            "\t\t\t\tTarget FOR MONTH IN (\n" +
            "\t\t\t\t\t\"01\",\n" +
            "\t\t\t\t\t\"02\",\n" +
            "\t\t\t\t\t\"03\",\n" +
            "\t\t\t\t\t\"04\",\n" +
            "\t\t\t\t\t\"05\",\n" +
            "\t\t\t\t\t\"06\",\n" +
            "\t\t\t\t\t\"07\",\n" +
            "\t\t\t\t\t\"08\",\n" +
            "\t\t\t\t\t\"09\",\n" +
            "\t\t\t\t\t\"10\",\n" +
            "\t\t\t\t\t\"11\",\n" +
            "\t\t\t\t\t\"12\"\n" +
            "\t\t\t\t)\n" +
            "\t\t\t) P\n" +
            "\t) tar\n" +
            "WHERE\n" +
            "\ttar.usercode =#{id}\n" +
            "AND tar. YEAR =#{year}\n" +
            "AND tar. CATEGORY = '目标销售量'\n")
    String findYearTargetSize(@Param("year") Integer year, @Param("id") String id);

    //月度目标量
    @Select("SELECT\n" +
            "\t\"SUM\" (tar.Target) 总和\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\tP .USERCODE,\n" +
            "\t\t\tP . YEAR,\n" +
            "\t\t\tP .Target,\n" +
            "\t\t\tP . MONTH,\n" +
            "\t\t\tP . CATEGORY\n" +
            "\t\tFROM\n" +
            "\t\t\t(\n" +
            "\t\t\t\tSELECT\n" +
            "\t\t\t\t\tMS.USERCODE,\n" +
            "\t\t\t\t\tMS.\"YEAR\",\n" +
            "\t\t\t\t\tMS.\"CATEGORY\",\n" +
            "\t\t\t\t\tMS.JANTARGET \"01\",\n" +
            "\t\t\t\t\tMS.FEBTARGET \"02\",\n" +
            "\t\t\t\t\tMS.MARTARGET \"03\",\n" +
            "\t\t\t\t\tMS.APRTARGET \"04\",\n" +
            "\t\t\t\t\tms.MAYTARGET \"05\",\n" +
            "\t\t\t\t\tMS.JUNTARGET \"06\",\n" +
            "\t\t\t\t\tMS.JULTARGET \"07\",\n" +
            "\t\t\t\t\tMS.AUGTARGET \"08\",\n" +
            "\t\t\t\t\tMS.SEPTARGET \"09\",\n" +
            "\t\t\t\t\tMS.OCTTARGET \"10\",\n" +
            "\t\t\t\t\tMS.NOVTARGET \"11\",\n" +
            "\t\t\t\t\tMS.DECTARGET \"12\"\n" +
            "\t\t\t\tFROM\n" +
            "\t\t\t\t\tERP_SD_DF_SALESGOALS MS\n" +
            "\t\t\t) T UNPIVOT (\n" +
            "\t\t\t\tTarget FOR MONTH IN (\n" +
            "\t\t\t\t\t\"01\",\n" +
            "\t\t\t\t\t\"02\",\n" +
            "\t\t\t\t\t\"03\",\n" +
            "\t\t\t\t\t\"04\",\n" +
            "\t\t\t\t\t\"05\",\n" +
            "\t\t\t\t\t\"06\",\n" +
            "\t\t\t\t\t\"07\",\n" +
            "\t\t\t\t\t\"08\",\n" +
            "\t\t\t\t\t\"09\",\n" +
            "\t\t\t\t\t\"10\",\n" +
            "\t\t\t\t\t\"11\",\n" +
            "\t\t\t\t\t\"12\"\n" +
            "\t\t\t\t)\n" +
            "\t\t\t) P\n" +
            "\t) tar\n" +
            "WHERE\n" +
            "\ttar.usercode = #{id}\n" +
            "AND tar. YEAR = #{year}\n" +
            "AND TAR. MONTH = #{month}\n" +
            "AND tar. CATEGORY = '目标销售量'\n")
    String findMonthTargetSize(@Param("year") Integer year, @Param("month") String month, @Param("id") String id);

    //年度目标额
    @Select("SELECT\n" +
            "\t\"SUM\" (tar.Target) 总和\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\tP .USERCODE,\n" +
            "\t\t\tP . YEAR,\n" +
            "\t\t\tP .Target,\n" +
            "\t\t\tP . MONTH,\n" +
            "\t\t\tP . CATEGORY\n" +
            "\t\tFROM\n" +
            "\t\t\t(\n" +
            "\t\t\t\tSELECT\n" +
            "\t\t\t\t\tMS.USERCODE,\n" +
            "\t\t\t\t\tMS.\"YEAR\",\n" +
            "\t\t\t\t\tMS.\"CATEGORY\",\n" +
            "\t\t\t\t\tMS.JANTARGET \"01\",\n" +
            "\t\t\t\t\tMS.FEBTARGET \"02\",\n" +
            "\t\t\t\t\tMS.MARTARGET \"03\",\n" +
            "\t\t\t\t\tMS.APRTARGET \"04\",\n" +
            "\t\t\t\t\tms.MAYTARGET \"05\",\n" +
            "\t\t\t\t\tMS.JUNTARGET \"06\",\n" +
            "\t\t\t\t\tMS.JULTARGET \"07\",\n" +
            "\t\t\t\t\tMS.AUGTARGET \"08\",\n" +
            "\t\t\t\t\tMS.SEPTARGET \"09\",\n" +
            "\t\t\t\t\tMS.OCTTARGET \"10\",\n" +
            "\t\t\t\t\tMS.NOVTARGET \"11\",\n" +
            "\t\t\t\t\tMS.DECTARGET \"12\"\n" +
            "\t\t\t\tFROM\n" +
            "\t\t\t\t\tERP_SD_DF_SALESGOALS MS\n" +
            "\t\t\t) T UNPIVOT (\n" +
            "\t\t\t\tTarget FOR MONTH IN (\n" +
            "\t\t\t\t\t\"01\",\n" +
            "\t\t\t\t\t\"02\",\n" +
            "\t\t\t\t\t\"03\",\n" +
            "\t\t\t\t\t\"04\",\n" +
            "\t\t\t\t\t\"05\",\n" +
            "\t\t\t\t\t\"06\",\n" +
            "\t\t\t\t\t\"07\",\n" +
            "\t\t\t\t\t\"08\",\n" +
            "\t\t\t\t\t\"09\",\n" +
            "\t\t\t\t\t\"10\",\n" +
            "\t\t\t\t\t\"11\",\n" +
            "\t\t\t\t\t\"12\"\n" +
            "\t\t\t\t)\n" +
            "\t\t\t) P\n" +
            "\t) tar\n" +
            "WHERE\n" +
            "\ttar.usercode = #{id}\n" +
            "AND tar. YEAR = #{year}\n" +
            "AND tar. CATEGORY = '目标销售额'\n")
    String findYearTargetMoney(@Param("year") Integer year, @Param("id") String id);

    //月度目标额
    @Select("SELECT\n" +
            "\t\"SUM\" (tar.Target) 总和\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\tP .USERCODE,\n" +
            "\t\t\tP . YEAR,\n" +
            "\t\t\tP .Target,\n" +
            "\t\t\tP . MONTH,\n" +
            "\t\t\tP . CATEGORY\n" +
            "\t\tFROM\n" +
            "\t\t\t(\n" +
            "\t\t\t\tSELECT\n" +
            "\t\t\t\t\tMS.USERCODE,\n" +
            "\t\t\t\t\tMS.\"YEAR\",\n" +
            "\t\t\t\t\tMS.\"CATEGORY\",\n" +
            "\t\t\t\t\tMS.JANTARGET \"01\",\n" +
            "\t\t\t\t\tMS.FEBTARGET \"02\",\n" +
            "\t\t\t\t\tMS.MARTARGET \"03\",\n" +
            "\t\t\t\t\tMS.APRTARGET \"04\",\n" +
            "\t\t\t\t\tms.MAYTARGET \"05\",\n" +
            "\t\t\t\t\tMS.JUNTARGET \"06\",\n" +
            "\t\t\t\t\tMS.JULTARGET \"07\",\n" +
            "\t\t\t\t\tMS.AUGTARGET \"08\",\n" +
            "\t\t\t\t\tMS.SEPTARGET \"09\",\n" +
            "\t\t\t\t\tMS.OCTTARGET \"10\",\n" +
            "\t\t\t\t\tMS.NOVTARGET \"11\",\n" +
            "\t\t\t\t\tMS.DECTARGET \"12\"\n" +
            "\t\t\t\tFROM\n" +
            "\t\t\t\t\tERP_SD_DF_SALESGOALS MS\n" +
            "\t\t\t) T UNPIVOT (\n" +
            "\t\t\t\tTarget FOR MONTH IN (\n" +
            "\t\t\t\t\t\"01\",\n" +
            "\t\t\t\t\t\"02\",\n" +
            "\t\t\t\t\t\"03\",\n" +
            "\t\t\t\t\t\"04\",\n" +
            "\t\t\t\t\t\"05\",\n" +
            "\t\t\t\t\t\"06\",\n" +
            "\t\t\t\t\t\"07\",\n" +
            "\t\t\t\t\t\"08\",\n" +
            "\t\t\t\t\t\"09\",\n" +
            "\t\t\t\t\t\"10\",\n" +
            "\t\t\t\t\t\"11\",\n" +
            "\t\t\t\t\t\"12\"\n" +
            "\t\t\t\t)\n" +
            "\t\t\t) P\n" +
            "\t) tar\n" +
            "WHERE\n" +
            "\ttar.usercode = #{id}\n" +
            "AND tar. YEAR = #{year}\n" +
            "AND TAR. MONTH = #{month}\n" +
            "AND tar. CATEGORY = '目标销售额'\n")
    String findMonthTargetMoney(@Param("year") Integer year, @Param("month") String month, @Param("id") String id);

    //累计回款
    //SELECT
    //	SUM (回款)
    //FROM
    //	(
    //		SELECT
    //			客户厂商编号,
    //			"SUM" (本币金额) 回款
    //		FROM
    //			(
    //				SELECT
    //					客户厂商编号,
    //					本币金额
    //				FROM
    //					(
    //						SELECT
    //							POST.nmg18 客户厂商编号,
    //							"SUM" (POSTD.npk09) 本币金额
    //						FROM
    //							ERP_SD_O_DEPOSITPAYMENT post
    //						LEFT JOIN ERP_SD_O_DEPOSITPAYMENT_DETAIL postd ON POST.NMG00 = POSTD.NPK00
    //						WHERE
    //							"TO_CHAR" (POST.nmg01, 'yyyy') = 2018
    //						AND "TO_CHAR" (POST.nmg01, 'mm') = 05
    //						GROUP BY
    //							POST.nmg18
    //					)
    //				UNION ALL
    //					(
    //						SELECT
    //							NOTE.nmh11 客户编号,
    //							"SUM" (NOTE.nmh32) 本币金额
    //						FROM
    //							ERP_SD_O_NOTERECEIVABLE note
    //						WHERE
    //							"TO_CHAR" (NOTE.nmh04, 'yyyy') = 2018
    //						AND "TO_CHAR" (NOTE.nmh04, 'mm') = 05
    //						GROUP BY
    //							NOTE.nmh11
    //					)
    //			)
    //		WHERE
    //			客户厂商编号 IS NOT NULL
    //		GROUP BY
    //			客户厂商编号
    //	) A
    //LEFT JOIN ERP_SD_O_CUSTOMER cu ON CU.OCC01 = A .客户厂商编号
    //WHERE
    //	OCC04 = '1796'
    //GROUP BY
    //	OCC04
    @Select("SELECT\n" +
            "\tSUM (回款)\n" +
            "FROM\n" +
            "\t(\n" +
            "\t\tSELECT\n" +
            "\t\t\t客户厂商编号,\n" +
            "\t\t\t\"SUM\" (本币金额) 回款\n" +
            "\t\tFROM\n" +
            "\t\t\t(\n" +
            "\t\t\t\tSELECT\n" +
            "\t\t\t\t\t客户厂商编号,\n" +
            "\t\t\t\t\t本币金额\n" +
            "\t\t\t\tFROM\n" +
            "\t\t\t\t\t(\n" +
            "\t\t\t\t\t\tSELECT\n" +
            "\t\t\t\t\t\t\tPOST.nmg18 客户厂商编号,\n" +
            "\t\t\t\t\t\t\t\"SUM\" (POSTD.npk09) 本币金额\n" +
            "\t\t\t\t\t\tFROM\n" +
            "\t\t\t\t\t\t\tERP_SD_O_DEPOSITPAYMENT post\n" +
            "\t\t\t\t\t\tLEFT JOIN ERP_SD_O_DEPOSITPAYMENT_DETAIL postd ON POST.NMG00 = POSTD.NPK00\n" +
            "\t\t\t\t\t\tWHERE\n" +
            "\t\t\t\t\t\t\t\"TO_CHAR\" (POST.nmg01, 'yyyy') = #{year}\n" +
            "\t\t\t\t\t\tAND \"TO_CHAR\" (POST.nmg01, 'mm') = #{month}\n" +
            "\t\t\t\t\t\tGROUP BY\n" +
            "\t\t\t\t\t\t\tPOST.nmg18\n" +
            "\t\t\t\t\t)\n" +
            "\t\t\t\tUNION ALL\n" +
            "\t\t\t\t\t(\n" +
            "\t\t\t\t\t\tSELECT\n" +
            "\t\t\t\t\t\t\tNOTE.nmh11 客户编号,\n" +
            "\t\t\t\t\t\t\t\"SUM\" (NOTE.nmh32) 本币金额\n" +
            "\t\t\t\t\t\tFROM\n" +
            "\t\t\t\t\t\t\tERP_SD_O_NOTERECEIVABLE note\n" +
            "\t\t\t\t\t\tWHERE\n" +
            "\t\t\t\t\t\t\t\"TO_CHAR\" (NOTE.nmh04, 'yyyy') = #{year}\n" +
            "\t\t\t\t\t\tAND \"TO_CHAR\" (NOTE.nmh04, 'mm') = #{month}\n" +
            "\t\t\t\t\t\tGROUP BY\n" +
            "\t\t\t\t\t\t\tNOTE.nmh11\n" +
            "\t\t\t\t\t)\n" +
            "\t\t\t)\n" +
            "\t\tWHERE\n" +
            "\t\t\t客户厂商编号 IS NOT NULL\n" +
            "\t\tGROUP BY\n" +
            "\t\t\t客户厂商编号\n" +
            "\t) A\n" +
            "LEFT JOIN ERP_SD_O_CUSTOMER cu ON CU.OCC01 = A .客户厂商编号\n" +
            "WHERE\n" +
            "\tOCC04 = #{id}\n" +
            "GROUP BY\n" +
            "\tOCC04")
    String findTotalReturnMoney(@Param("year") Integer year,@Param("month") Integer month, @Param("id") String id);

    //定时更新或插入

    @Insert("MERGE INTO ERP_SD_T_SALE_INFO si\n" +
            "    USING\n" +
            "    (\n" +
            "    select\n" +
            "      #{record.id,jdbcType=VARCHAR} id,\n" +
            "      #{record.year,jdbcType=VARCHAR} year,\n" +
            "      #{record.month,jdbcType=VARCHAR} month,\n" +
            "      #{record.employeeNo,jdbcType=VARCHAR} employeeNo,\n" +
            "      #{record.department,jdbcType=VARCHAR} department,\n" +
            "      #{record.post,jdbcType=VARCHAR} post,\n" +
            "      #{record.postLevel,jdbcType=VARCHAR} postLevel,\n" +
            "      #{record.totalOrderSize,jdbcType=DECIMAL} totalOrderSize,\n" +
            "      #{record.yearTargetSize,jdbcType=DECIMAL} yearTargetSize,\n" +
            "      #{record.totalOrderMoney,jdbcType=DECIMAL} totalOrderMoney,\n" +
            "      #{record.yearTargetMoney,jdbcType=DECIMAL} yearTargetMoney,\n" +
            "      #{record.currentMonthSize,jdbcType=DECIMAL} currentMonthSize,\n" +
            "      #{record.monthTargetSize,jdbcType=DECIMAL} monthTargetSize,\n" +
            "      #{record.currentMonthMoney,jdbcType=DECIMAL} currentMonthMoney,\n" +
            "      #{record.monthTargetMoney,jdbcType=DECIMAL} monthTargetMoney,\n" +
            "      #{record.totalOutputSize,jdbcType=DECIMAL} totalOutputSize,\n" +
            "      #{record.pricePerTon,jdbcType=DECIMAL} pricePerTon,\n" +
            "      #{record.totalOutputMoney,jdbcType=DECIMAL} totalOutputMoney,\n" +
            "      #{record.totalReturnMoney,jdbcType=DECIMAL} totalReturnMoney,\n" +
            "      #{record.currentMonthOutputSize,jdbcType=DECIMAL} currentMonthOutputSize,\n" +
            "      #{record.currentMonthOutputMoney,jdbcType=DECIMAL} currentMonthOutputMoney\n" +
            "      FROM DUAL\n" +
            "    ) T1\n" +
            "    ON (T1.year=si.YEAR AND T1.month = si.MONTH AND T1.employeeNo = si.employee_no)\n" +
            "      WHEN MATCHED THEN\n" +
            "          UPDATE SET\n" +
            "\t\t\t\t\tsi.department = T1.department,\n" +
            "\t\t\t\t\tsi.post = T1.post,\n" +
            "\t\t\t\t\tsi.post_level = T1.postLevel,\n" +
            "          si.total_order_size = T1.totalOrderSize,\n" +
            "\t\t\t\t\tsi.year_target_size = T1.yearTargetSize,\n" +
            "\t\t\t\t\tsi.total_order_money = T1.totalOrderMoney,\n" +
            "\t\t\t\t\tsi.year_target_money = T1.yearTargetMoney,\n" +
            "          si.current_month_size = T1.currentMonthSize,\n" +
            "\t\t\t\t\tsi.month_target_size = T1.monthTargetSize,\n" +
            "\t\t\t\t\tsi.current_month_money = T1.currentMonthMoney,\n" +
            "\t\t\t\t\tsi.month_target_money = T1.monthTargetMoney,\n" +
            "          si.total_output_size = T1.totalOutputSize,\n" +
            "\t\t\t\t\tsi.price_per_ton = T1.pricePerTon,\n" +
            "\t\t\t\t\tsi.total_output_money = T1.totalOutputMoney,\n" +
            "\t\t\t\t\tsi.total_return_money = T1.totalReturnMoney,\n" +
            "          si.current_month_output_size = T1.currentMonthOutputSize,\n" +
            "\t\t\t\t\tsi.current_month_output_money = T1.currentMonthOutputMoney\n" +
            "      WHEN NOT MATCHED THEN\n" +
            "\t\t\t\t\tinsert (YEAR, MONTH, \n" +
            "\t\t\t\t\t\tEMPLOYEE_NO, DEPARTMENT, POST, \n" +
            "\t\t\t\t\t\tPOST_LEVEL, TOTAL_ORDER_SIZE, YEAR_TARGET_SIZE, \n" +
            "\t\t\t\t\t\tTOTAL_ORDER_MONEY, YEAR_TARGET_MONEY, CURRENT_MONTH_SIZE, \n" +
            "\t\t\t\t\t\tMONTH_TARGET_SIZE, CURRENT_MONTH_MONEY, MONTH_TARGET_MONEY, \n" +
            "\t\t\t\t\t\tTOTAL_OUTPUT_SIZE, PRICE_PER_TON, TOTAL_OUTPUT_MONEY, \n" +
            "\t\t\t\t\t\tTOTAL_RETURN_MONEY, CURRENT_MONTH_OUTPUT_SIZE, \n" +
            "\t\t\t\t\t\tCURRENT_MONTH_OUTPUT_MONEY)\n" +
            "\t\t\t\t\tvalues (T1.year, T1.month, \n" +
            "\t\t\t\t\t\tT1.employeeNo, T1.department, T1.post, \n" +
            "\t\t\t\t\t\tT1.postLevel, T1.totalOrderSize, T1.yearTargetSize, \n" +
            "\t\t\t\t\t\tT1.totalOrderMoney, T1.yearTargetMoney, T1.currentMonthSize, \n" +
            "\t\t\t\t\t\tT1.monthTargetSize, T1.currentMonthMoney, T1.monthTargetMoney, \n" +
            "\t\t\t\t\t\tT1.totalOutputSize, T1.pricePerTon, T1.totalOutputMoney, \n" +
            "\t\t\t\t\t\tT1.totalReturnMoney, T1.currentMonthOutputSize, \n" +
            "\t\t\t\t\t\tT1.currentMonthOutputMoney)")
    int timeUpdateOrInsert(@Param("record") SaleInfo record);
}
