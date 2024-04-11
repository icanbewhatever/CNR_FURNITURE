package com.cnr_furniture.mapper;

import com.cnr_furniture.domain.process.*;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface ProcessMapper {
    /** 날짜 조회 **/
    List<ProcessVO> selectProcess(ProcessDate processDate);

    /** 제품 정보 조회 **/
    List<ProcessItemVO> selectAllItems();

    /** 공정 정보 조회 **/
    List<ProcessInfoVO> selectPi();

    /** 계약 정보 조회 **/
    List<ProcessCtVO> selectProCt(ProcessDate processDate);

    /** 제조지시 등록 **/
    int insertProInstruction(ProcessVO processVO);
}


