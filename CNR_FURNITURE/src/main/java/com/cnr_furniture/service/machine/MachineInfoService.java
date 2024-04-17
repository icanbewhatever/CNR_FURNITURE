package com.cnr_furniture.service.machine;

import com.cnr_furniture.domain.Machine.MachineAddVO;
import com.cnr_furniture.domain.Machine.MachineVO;
import com.cnr_furniture.domain.Machine.MachineWorkVO;
import com.cnr_furniture.domain.Machine.SearchMachineVO;

import java.util.List;

public interface MachineInfoService {

    // 설비정보 리스트
    List<MachineVO> getMachineList(SearchMachineVO searchMachineVO);

    // 설비 등록
    int insertMachine(MachineAddVO machineAddVO);

    // 설비 등록 (작동 테이블)
    int insertMachine2(MachineAddVO machineAddVO);

    // 마지막 설비 한 개만 가져오기
    MachineVO getMachineOne();

    // 설비 위치 수정
    int updateMachinePosition(MachineAddVO machineAddVO);

    // 설비 가동 현황 리스트
    List<MachineWorkVO> mcWorkList(SearchMachineVO searchMachineVO);
}
